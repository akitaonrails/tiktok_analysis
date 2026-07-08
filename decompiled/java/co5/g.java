package co5;

import X.C2188811AlT;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes34.dex */
public final class g {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Bitmap LIZ;
    public String LIZIZ;
    public Bitmap LIZJ;
    public String LIZLLL;
    public Bitmap LJ;
    public String LJFF;
    public Bitmap LJI;
    public Bitmap LJII;
    public String LJIIIIZZ;

    public g() {
        this(null, 511);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoOcrResult {");
        sbLIZ.append("originalImage: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append("cardNumber: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append("cardNumberImage: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append("expirationDate: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append("expirationDateImage: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ");
        sbLIZ.append("holderName: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("holderNameImage: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append("cardImage: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append("originalCardNumber: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public g(Bitmap bitmap, int i) {
        this.LIZ = (i & 1) != 0 ? null : bitmap;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }
}
