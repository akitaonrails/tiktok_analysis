package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0fc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133910fc5 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isOffline();
        }
        return false;
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_receiving_");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queue_");
        sbLIZ.append(str);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queue_");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJFF(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_receiving_");
        sbLIZ.append(str);
        C1138230fj3.LIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tray_");
        sbLIZ.append(str);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJII(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tray_");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LJIIIIZZ(String str, String str2) {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || !iHostAppContext.isOffline()) {
            C1131800fYg.LIZ.getClass();
            if (C781880Ulm.LIZLLL || C1101370elb.LIZ.LJIILJJIL("live_gift_overload_downgrade_tracking_enable")) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_receiving_");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queue_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gift_receiving_");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ2), str2, th);
    }
}
