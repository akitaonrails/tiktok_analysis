package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.packagelist.v1.GetPackageListV1UseCase$getIapBackUpPackageAsync$1", f = "GetPackageListV1UseCase.kt", l = {65}, m = "invokeSuspend")
public final class C1567670qth extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C1804420x3Y LLILLL;
    public final /* synthetic */ C1804310x3N LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567670qth(List<String> list, C1804420x3Y c1804420x3Y, C1804310x3N c1804310x3N, InterfaceC1364105Vn<? super C1567670qth> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1804420x3Y;
        this.LLILZ = c1804310x3N;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1567670qth(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPackageListV1UseCase@738d.getIapBackUpPackageAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1567680qti c1567680qti = new C1567680qti(true, this.LLILLJJLI);
                InterfaceC1804470x3d interfaceC1804470x3d = this.LLILZ.LJI;
                this.LL = 1;
                obj = interfaceC1804470x3d.LJ(c1567680qti, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GetPackageListV1UseCase@738d.getIapBackUpPackageAsync$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GetPackageListV1UseCase@738d.getIapBackUpPackageAsync$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GetPackageListV1UseCase@738d.getIapBackUpPackageAsync$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
