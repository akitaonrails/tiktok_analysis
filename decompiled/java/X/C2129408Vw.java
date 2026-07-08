package X;

import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl$end$1", f = "PerformanceServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2129408Vw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PerformanceServiceImpl LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SparseArray<C20680915wF> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2129408Vw(PerformanceServiceImpl performanceServiceImpl, int i, SparseArray<C20680915wF> sparseArray, Map<String, Object> map, boolean z, InterfaceC1364105Vn<? super C2129408Vw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = performanceServiceImpl;
        this.LLILLJJLI = i;
        this.LLILLL = sparseArray;
        this.LLILZ = map;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2129408Vw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PerformanceServiceImpl@f204.end$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            PerformanceServiceImpl performanceServiceImpl = this.LL;
            int i = this.LLILLJJLI;
            SparseArray<C20680915wF> sparseArray = this.LLILLL;
            Map<String, Object> map = this.LLILZ;
            boolean z = this.LLILZIL;
            performanceServiceImpl.getClass();
            PerformanceServiceImpl.LJ(i, sparseArray, map, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!((Boolean) C1935007i0.LIZ.getValue()).booleanValue()) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("PrfImpl", "report err", th);
            } else {
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PerformanceServiceImpl@f204.end$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
