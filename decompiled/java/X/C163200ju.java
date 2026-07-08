package X;

/* JADX INFO: renamed from: X.00ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163200ju {
    public static final long LIZ(Object obj) {
        if (obj instanceof String) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) obj);
            if (lLJIILIIL != null) {
                return lLJIILIIL.longValue();
            }
            return 0L;
        }
        if (obj instanceof Float) {
            return (long) ((Number) obj).floatValue();
        }
        if (obj instanceof Double) {
            return (long) ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }
}
