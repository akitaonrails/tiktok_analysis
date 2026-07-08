package X;

/* JADX INFO: renamed from: X.0NjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601990NjJ {
    public static final Long LIZ(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIILIIL((String) obj);
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Number) obj).intValue());
        }
        return null;
    }
}
