package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$refresh$1", f = "UserCardListViewModel.kt", l = {538}, m = "invokeSuspend")
public final class C1072490e11 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public UserCardListViewModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ UserCardListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072490e11(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1072490e11> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = userCardListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072490e11(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UserCardListViewModel userCardListViewModel;
        C1DEV c1dev;
        C1C7U.LIZ("UserCardListViewModel@982.refresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                userCardListViewModel = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            userCardListViewModel = this.LLILZ;
            c1dev = userCardListViewModel.LLJILLL;
            this.LL = c1dev;
            this.LLILLJJLI = userCardListViewModel;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardListViewModel@982.refresh$1");
                return objLJFF;
            }
        }
        try {
            int size = userCardListViewModel.yQ2().size();
            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
            String str = userCardListViewModel.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refresh if empty, ");
            sbLIZ.append(size);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1264320j0Q.getClass();
            C1264320j0Q.LIZLLL(str, strLIZIZ);
            if (size > 0) {
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("UserCardListViewModel@982.refresh$1");
                return unit;
            }
            userCardListViewModel.manualListRefresh();
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("UserCardListViewModel@982.refresh$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
