package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMemberUtil$fetchUserInfo$2", f = "GroupMemberUtil.kt", l = {509, 515}, m = "invokeSuspend")
public final class C05QP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1462005nu> LLILLJJLI;
    public final /* synthetic */ AbstractC2252651DEx LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QP(List<C1462005nu> list, AbstractC2252651DEx abstractC2252651DEx, String str, InterfaceC1364105Vn<? super C05QP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = abstractC2252651DEx;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<C1462005nu> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (C1462005nu c1462005nu : list) {
                if (C05QS.LIZ(c1462005nu) == null) {
                    arrayList.add(c1462005nu);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0YAE member = ((C1462005nu) it2.next()).getMember();
                if (member != null) {
                    string = C2286608xc.LJFF(member.getUid()).toString();
                } else {
                    string = null;
                }
                arrayList2.add(string);
            }
            if (arrayList2.isEmpty()) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
                return unit2;
            }
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            this.LL = 1;
            if (c1bgsLJ.LJIILIIL("im_chat_group", arrayList2, this, true, true, false) == objLJFF) {
                C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
                return objLJFF;
            }
        }
        AbstractC2252651DEx abstractC2252651DEx = this.LLILLL;
        C05QQ c05qq = new C05QQ(this.LLILZ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2252651DEx, c05qq) == objLJFF) {
            C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
