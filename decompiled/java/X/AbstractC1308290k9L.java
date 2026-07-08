package X;

/* JADX INFO: renamed from: X.0k9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1308290k9L extends AbstractC1308040k8w {
    public static Object LIZIZ(Object obj) {
        Number number;
        if ((obj instanceof Number) && (number = (Number) obj) != null) {
            return Double.valueOf(number.doubleValue());
        }
        return obj;
    }

    public static double LIZJ(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static int LIZLLL(Object obj) {
        return ((Number) obj).intValue();
    }
}
