package X;

/* JADX INFO: renamed from: X.0CjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321740CjM {
    public static final C08I7<String, C321220CiW> LIZ = new C08I7<>(10);

    public static C321220CiW LIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.LIZIZ(str);
    }

    public static void LIZIZ(String str, boolean z) {
        C321220CiW c321220CiWLIZ = LIZ(str);
        if (c321220CiWLIZ != null) {
            C321220CiW c321220CiWLIZ2 = C321220CiW.LIZ(c321220CiWLIZ, z, false, 0, 0, 29);
            if (str != null) {
                LIZ.LIZLLL(str, c321220CiWLIZ2);
            }
        }
    }
}
