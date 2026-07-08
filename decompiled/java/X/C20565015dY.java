package X;

/* JADX INFO: renamed from: X.15dY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565015dY {
    public static final boolean LIZ(C20565415dc c20565415dc, C20565515dd c20565515dd) {
        double dMax = Math.max(c20565415dc.LIZJ.getRectLeft(c20565415dc.LIZIZ.LIZ), c20565515dd.LIZIZ.LIZ);
        double dMax2 = Math.max(c20565415dc.LIZJ.getRectTop(c20565415dc.LIZIZ.LIZIZ), c20565515dd.LIZIZ.LIZIZ);
        double dMax3 = Math.max(0.0d, Math.min(c20565415dc.LIZJ.getRectRight(c20565415dc.LIZIZ.LIZJ), c20565515dd.LIZIZ.LIZJ) - dMax) * Math.max(0.0d, Math.min(c20565415dc.LIZJ.getRectBottom(c20565415dc.LIZIZ.LIZLLL), c20565515dd.LIZIZ.LIZLLL) - dMax2);
        if (Math.abs(dMax3 - 0.0d) >= 1.0E-5d && dMax3 > 0.0d) {
            return true;
        }
        return false;
    }
}
