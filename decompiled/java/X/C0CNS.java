package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CNS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNS {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0CNT());

    public static boolean LIZIZ() {
        return (Keva.getRepo("plugin_repo").getInt("reinstall_check_result", -1) == 1 || Keva.getRepo("plugin_repo").getInt("reinstall_check_result", -1) == -1) && LIZ();
    }

    public static boolean LIZ() {
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return false;
        }
        C01GW c01gw = LIZ;
        return (((Number) c01gw.getValue()).intValue() == 0 || ((Number) c01gw.getValue()).intValue() == 1) ? false : true;
    }
}
