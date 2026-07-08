package X;

/* JADX INFO: renamed from: X.0yo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871750yo9 {
    public static Long LIZ(C1871750yo9 c1871750yo9, InterfaceC1107590evd interfaceC1107590evd, String str) {
        c1871750yo9.getClass();
        int i = C1323970kYd.LIZ[interfaceC1107590evd.get(str).getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Long.valueOf((long) interfaceC1107590evd.getDouble(str));
        }
        return Long.valueOf(interfaceC1107590evd.getInt(str));
    }
}
