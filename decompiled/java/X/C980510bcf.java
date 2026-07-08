package X;

/* JADX INFO: renamed from: X.0bcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980510bcf {
    public static EnumC980460bca LIZ(Long l) {
        if (l != null) {
            if (l.longValue() == 1) {
                return EnumC980460bca.ON;
            }
            if (l.longValue() == 2) {
                return EnumC980460bca.OFF;
            }
        }
        return EnumC980460bca.UNKNOWN;
    }
}
