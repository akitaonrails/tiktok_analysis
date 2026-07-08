package X;

/* JADX INFO: renamed from: X.00jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163100jt {
    public static final /* synthetic */ int LIZ = 0;

    public static Number LIZ(Number number, Object obj) {
        if (!(obj instanceof Number)) {
            return number;
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(number.intValue());
        }
        if (obj instanceof Long) {
            return Long.valueOf(number.longValue());
        }
        if (!(obj instanceof Float)) {
            return number;
        }
        return Float.valueOf(number.floatValue());
    }
}
