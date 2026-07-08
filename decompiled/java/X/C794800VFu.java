package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794800VFu {
    public static String LIZ;

    public static String LIZ() {
        try {
            AbstractC794590VEz abstractC794590VEzLIZ = LIZ != null ? C794670VFh.LIZ("test", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, new C794780VFs(LIZ), null) : C794670VFh.LIZ("test", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, new C794790VFt(C794830VFx.LIZIZ()), null);
            abstractC794590VEzLIZ.start();
            C794740VFo c794740VFoLIZJ = abstractC794590VEzLIZ.LIZJ();
            String strLIZIZ = c794740VFoLIZJ.LIZIZ();
            c794740VFoLIZJ.LJI();
            return strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }
}
