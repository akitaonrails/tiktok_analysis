package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MixMallUtils$cleanMallPreloadView$2", f = "MixMallUtils.kt", l = {}, m = "invokeSuspend")
public final class C2226408nu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public C2226408nu(InterfaceC1364105Vn<? super C2226408nu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2226408nu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C1C7U.LIZ("MixMallUtils@2261.cleanMallPreloadView$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LIZIZ("", "ec_mmk_preload", null);
            objLJ = Unit.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objLJ = C2286608xc.LJ(Log.e("MixMallUtils", "clean preload view failed", e));
        }
        C1C7U.LIZIZ("MixMallUtils@2261.cleanMallPreloadView$2");
        return objLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return new C2226408nu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
