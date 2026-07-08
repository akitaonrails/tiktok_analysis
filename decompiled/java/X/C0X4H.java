package X;

import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0X4H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4H {
    public static boolean LIZIZ;
    public static C0X4J LIZJ;
    public static final C0X4H LIZ = new C0X4H();
    public static final C0X4G LIZLLL = new C0X4G();
    public static final C0X4F LJ = new C0X4F();

    public static void LIZ(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query, source=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C0X4J c0x4j = LIZJ;
        if (c0x4j != null) {
            c0x4j.LJJJJJ(i);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoginStateChange: ");
        sbLIZ.append(c486550J6f.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = c486550J6f.LIZ;
        if (i2 == 0) {
            LJ.LLILLJJLI = true;
        } else {
            if (i2 != 1) {
                return;
            }
            LIZLLL.LLILLL = true;
        }
    }
}
