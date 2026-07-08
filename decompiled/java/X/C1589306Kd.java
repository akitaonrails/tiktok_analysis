package X;

import com.bytedance.pumbaa.hybrid.governance.router.settings.GlobalSeclinkModel;

/* JADX INFO: renamed from: X.06Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1589306Kd {
    public static GlobalSeclinkModel LIZ;
    public static long LIZIZ = System.currentTimeMillis();

    public static final GlobalSeclinkModel LIZ() {
        if (LIZ == null || System.currentTimeMillis() - LIZIZ > 3600000) {
            GlobalSeclinkModel globalSeclinkModel = LIZ;
            if (globalSeclinkModel == null) {
                globalSeclinkModel = new GlobalSeclinkModel(null, null);
            }
            LIZ = (GlobalSeclinkModel) C821960WMg.LIZ(GlobalSeclinkModel.class, "boston_global_seclink", globalSeclinkModel);
            LIZIZ = System.currentTimeMillis();
        }
        return LIZ;
    }
}
