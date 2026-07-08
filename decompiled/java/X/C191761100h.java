package X;

/* JADX INFO: renamed from: X.100h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191761100h {
    public static final C191761100h LIZ = new C191761100h();

    public static boolean LIZ() {
        int iLIZIZ = C1888220zEi.LIZIZ.LIZIZ();
        return iLIZIZ == EnumC1490680otW.VULNERABLE.getValue() || iLIZIZ == EnumC1490680otW.WHITE_LIST.getValue();
    }

    public static boolean LIZIZ() {
        int iLIZIZ = C1888220zEi.LIZIZ.LIZIZ();
        if (iLIZIZ == EnumC1490680otW.VULNERABLE.getValue()) {
            return C191757100d.LIZIZ.LIZLLL();
        }
        if (iLIZIZ == EnumC1490680otW.WHITE_LIST.getValue()) {
            return C191765100l.LIZIZ.LIZIZ();
        }
        return false;
    }
}
