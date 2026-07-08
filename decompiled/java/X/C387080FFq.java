package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387080FFq {
    public final int LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float[] LJFF;
    public final int LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;

    public C387080FFq(Context context) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        float fLIZJ = C12ES.LIZJ(1.0f, context);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        float fLIZJ2 = C12ES.LIZJ(1.0f, context);
        float fLIZJ3 = C12ES.LIZJ(12.0f, context);
        float[] fArr = {C12ES.LIZJ(6.0f, context), C12ES.LIZJ(6.0f, context)};
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zk, context);
        int iIntValue3 = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        float fLIZJ4 = C12ES.LIZJ(1.0f, context);
        float fLIZJ5 = C12ES.LIZJ(8.0f, context);
        float fLIZJ6 = C12ES.LIZJ(8.0f, context);
        float fLIZJ7 = C12ES.LIZJ(2.0f, context);
        this.LIZ = iIntValue;
        this.LIZIZ = fLIZJ;
        this.LIZJ = iIntValue2;
        this.LIZLLL = fLIZJ2;
        this.LJ = fLIZJ3;
        this.LJFF = fArr;
        this.LJI = iIntValue3;
        this.LJII = fLIZJ4;
        this.LJIIIIZZ = fLIZJ5;
        this.LJIIIZ = true;
        this.LJIIJ = 251658240;
        this.LJIIJJI = fLIZJ6;
        this.LJIIL = fLIZJ7;
    }
}
