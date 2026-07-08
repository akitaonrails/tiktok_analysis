package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361140EDw {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final Drawable LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;

    public /* synthetic */ C361140EDw(boolean z, int i, boolean z2, TuxIconDrawable tuxIconDrawable, String str, int i2, int i3) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? R.drawable.bpm : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? null : tuxIconDrawable, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0, (i3 & 64) != 0 ? R.drawable.bpl : i2);
    }

    public C361140EDw(boolean z, int i, boolean z2, Drawable drawable, String str, boolean z3, int i2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = drawable;
        this.LJ = str;
        this.LJFF = z3;
        this.LJI = i2;
    }
}
