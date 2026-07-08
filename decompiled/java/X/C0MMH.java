package X;

import com.ss.android.ugc.aweme.canvas.CanvasBackground;

/* JADX INFO: renamed from: X.0MMH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMH {
    public final String LIZ;
    public final CanvasBackground LIZIZ;
    public final String LIZJ;

    public C0MMH(String str, String str2, int i) {
        CanvasBackground canvasBackgroundLIZ;
        if ((i & 2) != 0) {
            CanvasBackground.Companion.getClass();
            canvasBackgroundLIZ = C567420MNg.LIZ(-16777216);
        } else {
            canvasBackgroundLIZ = null;
        }
        str2 = (i & 4) != 0 ? "" : str2;
        this.LIZ = str;
        this.LIZIZ = canvasBackgroundLIZ;
        this.LIZJ = str2;
    }
}
