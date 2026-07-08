package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0m4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM$loadSearchData$1", f = "EditShareVM.kt", l = {245}, m = "invokeSuspend")
public final class C1382460m4y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContactSelectVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382460m4y(ContactSelectVM contactSelectVM, InterfaceC1364105Vn<? super C1382460m4y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contactSelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1382460m4y(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AbstractC595720NYc> listLIZJ;
        InterfaceC897330ZId interfaceC897330ZId;
        boolean z;
        C1C7U.LIZ("ContactSelectVM@ce1.loadSearchData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LLILLJJLI.LIZIZ();
            C1382450m4x c1382450m4x = this.LLILLJJLI.LLJILJILJ;
            this.LL = 1;
            List<IMUser> listLJIJJ = c1382450m4x.LIZJ.LJIJJ();
            ArrayList arrayList = new ArrayList();
            for (IMUser iMUser : listLJIJJ) {
                if (!Intrinsics.LJFF(iMUser.getUid(), c1382450m4x.LIZLLL)) {
                    arrayList.add(iMUser);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((IMUser) obj2).getShareStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList2.add(obj2);
                }
            }
            C0IBF[] c0ibfArr = C891610YyN.LIZ;
            List<? extends BaseContact> listLIZIZ = C891610YyN.LIZIZ(arrayList2, false, c1382450m4x.LIZ);
            C1231704rr c1231704rr = c1382450m4x.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("raw muf list size ");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(", after filter share status size ");
            sbLIZ.append(arrayList2.size());
            sbLIZ.append(", after filter camera permission size ");
            sbLIZ.append(((ArrayList) listLIZIZ).size());
            C2188811AlT.LIZIZ(sbLIZ);
            c1231704rr.LIZIZ();
            C1382470m4z c1382470m4z = c1382450m4x.LIZIZ;
            c1382470m4z.getClass();
            IActiveStatusObserverProducer.LIZ.getClass();
            IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
            if (iActiveStatusObserverProducerLIZ != null && (listLIZJ = iActiveStatusObserverProducerLIZ.LIZJ(listLIZIZ)) != null && (interfaceC897330ZId = c1382470m4z.LIZIZ) != null) {
                interfaceC897330ZId.LJFF(listLIZJ);
            }
            synchronized (c1382450m4x.LJFF) {
                try {
                    ((ArrayList) c1382450m4x.LJI).addAll(listLIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1382450m4x.LIZIZ();
            C23118094a.LJI(getContext());
            c1382450m4x.LIZ();
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("ContactSelectVM@ce1.loadSearchData$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILLJJLI.LIZIZ();
        String str = this.LLILLJJLI.LLILLL;
        if (str.length() > 0) {
            z2 = true;
        }
        if (z2) {
            this.LLILLJJLI.LLILLJJLI.LIZIZ();
            this.LLILLJJLI.LJJZZIII(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectVM@ce1.loadSearchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
