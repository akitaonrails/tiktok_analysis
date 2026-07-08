package X;

/* JADX INFO: renamed from: X.10rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19376710rN {
    public static final double LIZ(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }
}
