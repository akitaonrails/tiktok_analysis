package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.more.repository.ShareMoreContactsRepository$updateContacts$1", f = "ShareMoreContactsRepository.kt", l = {569}, m = "invokeSuspend")
public final class C05LF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05LF(List<? extends IMContact> list, InterfaceC1364105Vn<? super C05LF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        Object objLJII = obj;
        C1C7U.LIZ("ShareMoreContactsRepository@8b41.updateContacts$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJII);
            if (!C05LH.LIZ(C05LG.MORE_PANEL)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.updateContacts$1");
                return unit;
            }
            List<IMContact> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                IMContact iMContact2 = iMContact;
                if ((iMContact2 instanceof IMUser) && (uid = iMContact2.getUid()) != null && uid.length() != 0) {
                    arrayList.add(iMContact);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String uid2 = ((BaseContact) it2.next()).getUid();
                if (uid2 == null) {
                    uid2 = "";
                }
                arrayList2.add(uid2);
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList2);
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            this.LL = 1;
            objLJII = interfaceC1725106pFLIZ.LJII("im_share", listLJJJJI, this, false, false, false);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.updateContacts$1");
                return objLJFF;
            }
        }
        if ((!((List) objLJII).isEmpty()) && objLJII != null) {
            C05LH.LIZ = SystemClock.elapsedRealtime();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.updateContacts$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
