package X;

import com.bytedance.crash.monitor.k;

/* JADX INFO: renamed from: X.0Vdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802300Vdc {
    public static long LIZ = 8000;
    public static long LIZIZ = 500;
    public static boolean LIZJ;
    public static InterfaceC802390Vdl LIZLLL = new InterfaceC802390Vdl() { // from class: X.0Vdg
    };
    public static boolean LJ = true;
    public static boolean LJFF = true;

    public static boolean LIZ() {
        return LIZJ && LIZIZ();
    }

    public static boolean LIZIZ() {
        String strLIZIZ;
        C802790VeP c802790VeP = k.LIZ;
        return (c802790VeP == null || (strLIZIZ = c802790VeP.LIZIZ()) == null || !strLIZIZ.contains("test_crash")) ? false : true;
    }
}
