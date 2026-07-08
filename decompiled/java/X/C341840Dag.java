package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.BatchFollowResponse;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Dag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM$batchUnfollowAuthor$5", f = "ManageFollowVM.kt", l = {252}, m = "invokeSuspend")
public final class C341840Dag extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Set<SimpleUser> LLILLL;
    public final /* synthetic */ ManageFollowVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341840Dag(Set<SimpleUser> set, ManageFollowVM manageFollowVM, InterfaceC1364105Vn<? super C341840Dag> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = set;
        this.LLILZ = manageFollowVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C341840Dag c341840Dag = new C341840Dag(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c341840Dag.LLILLJJLI = obj;
        return c341840Dag;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLIZ = obj;
        C1C7U.LIZ("ManageFollowVM@5a85.batchUnfollowAuthor$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                ManageFollowVM manageFollowVM = this.LLILZ;
                Set<SimpleUser> set = this.LLILLL;
                C341870Daj c341870Daj = (C341870Daj) manageFollowVM.LLILLJJLI.getValue().getOperator();
                String strLJJLIIIJ = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(160), 30);
                Integer numLJ = C2286608xc.LJ(0);
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(161), 30);
                Long lLJFF = C2286608xc.LJFF(System.currentTimeMillis());
                Boolean boolValueOf = Boolean.valueOf(C0XF5.LIZIZ());
                this.LL = 1;
                InterfaceC341860Dai interfaceC341860Dai = (InterfaceC341860Dai) c341870Daj.LL.getValue();
                if (interfaceC341860Dai != null) {
                    objLIZ = interfaceC341860Dai.LIZ(strLJJLIIIJ, numLJ, strLJJLIIIJ2, lLJFF, boolValueOf, this);
                    if (objLIZ != C099R.LJFF()) {
                        objLIZ = (BatchFollowResponse) objLIZ;
                    }
                } else {
                    objLIZ = null;
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ManageFollowVM@5a85.batchUnfollowAuthor$5");
                    return objLJFF;
                }
            }
            c098200Yq = (BatchFollowResponse) objLIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        this.LLILLL.clear();
        this.LLILZ.setState(new AwS583S0100000_4(this.LLILLL, (Set<SimpleUser>) 203));
        this.LLILZ.vQ2(true, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageFollowVM@5a85.batchUnfollowAuthor$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
