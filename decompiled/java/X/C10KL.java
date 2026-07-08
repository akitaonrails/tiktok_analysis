package X;

import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.10KL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KL {
    public final TuxTextView LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public final C10KM LJ;
    public final /* synthetic */ C10KK LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Piece:[container:");
        sbLIZ.append(this.LIZ.hashCode());
        sbLIZ.append(", display:\"");
        sbLIZ.append(LIZ(this.LIZJ));
        sbLIZ.append("\", text:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", last:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", width:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", type:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ(int i) {
        if (i < 0) {
            return "...";
        }
        if (i <= this.LIZIZ.length() - 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.substring(0, i + 1));
            sbLIZ.append("...");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.LIZIZ;
    }

    public final float LIZIZ(float f) {
        float fMeasureText;
        float f2 = this.LIZLLL;
        if (this.LIZJ < 0) {
            return 0.0f;
        }
        do {
            int i = this.LIZJ;
            if (i >= 0) {
                int i2 = i - 1;
                this.LIZJ = i2;
                fMeasureText = this.LJFF.LIZJ.getPaint().measureText(LIZ(i2));
                this.LIZLLL = fMeasureText;
            } else {
                return f2 - this.LIZLLL;
            }
        } while (fMeasureText > f2 - f);
        return f2 - fMeasureText;
    }

    public C10KL(C10KK c10kk, TuxTextView tuxTextView, String str, int i, float f, C10KM c10km) {
        this.LJFF = c10kk;
        this.LIZ = tuxTextView;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = c10km;
    }
}
