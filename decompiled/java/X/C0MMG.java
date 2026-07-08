package X;

import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MMG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMG {
    public final String LIZ;
    public final CanvasBackground LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0MMG(String str, CanvasBackground canvasBackground, String str2, int i) {
        int iIntValue;
        if ((i & 2) != 0) {
            C567420MNg c567420MNg = CanvasBackground.Companion;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bn, C0CHQ.LIZ);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            c567420MNg.getClass();
            canvasBackground = C567420MNg.LIZ(iIntValue);
        }
        this(str, canvasBackground, (i & 4) != 0 ? "" : str2, (String) null);
    }

    public static C0MMG LIZ(C0MMG c0mmg, CanvasBackground canvasBackground, String str, int i) {
        String str2;
        String str3 = null;
        if ((i & 1) != 0) {
            str2 = c0mmg.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            canvasBackground = c0mmg.LIZIZ;
        }
        if ((i & 4) != 0) {
            str3 = c0mmg.LIZJ;
        }
        if ((i & 8) != 0) {
            str = c0mmg.LIZLLL;
        }
        c0mmg.getClass();
        return new C0MMG(str2, canvasBackground, str3, str);
    }

    public C0MMG(String str, CanvasBackground canvasBackground, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = canvasBackground;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
