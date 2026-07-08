package X;

/* JADX INFO: renamed from: X.10rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19376610rM {
    public static final double LIZ(double d) {
        if (d <= 0.0031308d) {
            return d * 12.92d;
        }
        return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }
}
