package X;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0QY3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QY3 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C0QYD LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public GradientDrawable.Orientation LIZLLL;
    public int[] LJ;
    public float[] LJFF;
    public int LJI;
    public int LJII;

    public C0QY3(C0QYD c0qyd, String str, Integer num, int i) {
        GradientDrawable.Orientation orientation;
        int[] iArr;
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        } else {
            orientation = null;
        }
        if ((i & 16) != 0) {
            iArr = new int[0];
        } else {
            iArr = null;
        }
        float[] fArr = (i & 32) != 0 ? new float[0] : null;
        this.LIZ = c0qyd;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = orientation;
        this.LJ = iArr;
        this.LJFF = fArr;
        this.LJI = 0;
        this.LJII = 0;
    }
}
