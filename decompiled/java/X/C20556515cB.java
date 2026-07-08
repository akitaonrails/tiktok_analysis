package X;

import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;

/* JADX INFO: renamed from: X.15cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556515cB {
    public final C20556415cA LIZ;
    public final OcrLocation LIZIZ;

    static {
        new C0RG6("video_StickerLocation");
    }

    public final double LIZ() {
        return (this.LIZIZ.yMax * this.LIZ.LIZLLL()) + this.LIZ.LJ() + this.LIZ.LJIILIIL;
    }

    public final double LIZIZ() {
        double d = this.LIZIZ.xMax;
        C20556415cA c20556415cA = this.LIZ;
        double d2 = c20556415cA.LJIIL;
        c20556415cA.getClass();
        return (d * d2) + ((((double) 1) - d2) / ((double) 2)) + 0.0d;
    }

    public final double LIZJ() {
        double d = this.LIZIZ.xMin;
        C20556415cA c20556415cA = this.LIZ;
        double d2 = c20556415cA.LJIIL;
        c20556415cA.getClass();
        return (d * d2) + ((((double) 1) - d2) / ((double) 2)) + 0.0d;
    }

    public final boolean LJ() {
        C20556415cA c20556415cA = this.LIZ;
        if (((double) ((Rect) ListProtector.get(c20556415cA.LJIIIZ, 1)).left) / ((double) c20556415cA.LJFF) >= LIZIZ()) {
            return false;
        }
        C20556415cA c20556415cA2 = this.LIZ;
        return ((double) ((Rect) ListProtector.get(c20556415cA2.LJIIIZ, 1)).top) / ((double) c20556415cA2.LJ) < LIZ();
    }

    public final boolean LJFF() {
        double dLIZLLL = (this.LIZIZ.yMin * this.LIZ.LIZLLL()) + this.LIZ.LJ();
        C20556415cA c20556415cA = this.LIZ;
        return dLIZLLL + c20556415cA.LJIILIIL < ((double) ((Rect) ListProtector.get(c20556415cA.LJIIIZ, 0)).bottom) / ((double) c20556415cA.LJ);
    }

    public final boolean LJIIIIZZ() {
        C20556415cA c20556415cA = this.LIZ;
        if (((Rect) ListProtector.get(c20556415cA.LJIIIZ, 2)).width() == 0 || ((Rect) ListProtector.get(c20556415cA.LJIIIZ, 2)).height() == 0) {
            return false;
        }
        double dLIZJ = LIZJ();
        C20556415cA c20556415cA2 = this.LIZ;
        if (dLIZJ >= ((double) ((Rect) ListProtector.get(c20556415cA2.LJIIIZ, 2)).right) / ((double) c20556415cA2.LJFF)) {
            return false;
        }
        C20556415cA c20556415cA3 = this.LIZ;
        return ((double) ((Rect) ListProtector.get(c20556415cA3.LJIIIZ, 2)).top) / ((double) c20556415cA3.LJ) < LIZ();
    }

    public final boolean LJI() {
        return LIZJ() < 0.0d || 1.0d < LIZIZ();
    }

    public final boolean LJII() {
        double dLIZJ = LIZJ();
        C20556415cA c20556415cA = this.LIZ;
        if (dLIZJ >= ((double) ((Rect) ListProtector.get(c20556415cA.LJIIIZ, 3)).right) / ((double) c20556415cA.LJFF)) {
            return false;
        }
        C20556415cA c20556415cA2 = this.LIZ;
        return ((double) ((Rect) ListProtector.get(c20556415cA2.LJIIIZ, 3)).top) / ((double) c20556415cA2.LJ) < LIZ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n [StickerLocation] start ");
        sbLIZ.append(LIZJ());
        sbLIZ.append(", top ");
        sbLIZ.append((this.LIZIZ.yMin * this.LIZ.LIZLLL()) + this.LIZ.LJ() + this.LIZ.LJIILIIL);
        sbLIZ.append(", end ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", bottom ");
        sbLIZ.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20556515cB(C20556415cA c20556415cA, OcrLocation ocrLocation) {
        this.LIZ = c20556415cA;
        this.LIZIZ = ocrLocation;
    }

    public static double LIZLLL(C20556515cB c20556515cB, double d, double d2, double d3, double d4, int i) {
        double d5 = d2;
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        if ((i & 2) != 0) {
            d5 = 0.0d;
        }
        double d6 = 1.0d;
        if ((i & 4) != 0) {
            d3 = 1.0d;
        }
        if ((i & 8) == 0) {
            d6 = d4;
        }
        OcrLocation ocrLocation = c20556515cB.LIZIZ;
        double d7 = ocrLocation.yMin;
        C20556415cA c20556415cA = c20556515cB.LIZ;
        double d8 = c20556415cA.LJIILIIL;
        double d9 = 2;
        double d10 = 1;
        double dMin = (((d5 * d9) - (d8 * d9)) - d10) / ((d7 * d9) - d10);
        double d11 = (((d6 * d9) - (d8 * d9)) - d10) / ((ocrLocation.yMax * d9) - d10);
        int i2 = 0;
        double d12 = ocrLocation.xMin;
        c20556415cA.getClass();
        double d13 = 0.0d * d9;
        double d14 = c20556515cB.LIZIZ.xMax;
        c20556515cB.LIZ.getClass();
        double[] dArr = {d11, (((d * d9) - d13) - d10) / ((d12 * d9) - d10), (((d3 * d9) - d13) - d10) / ((d9 * d14) - d10)};
        do {
            dMin = Math.min(dMin, dArr[i2]);
            i2++;
        } while (i2 < 3);
        return dMin;
    }
}
