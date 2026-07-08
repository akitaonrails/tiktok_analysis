package X;

import android.graphics.Color;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.157B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157B {
    public static final int LIZ(float f) {
        return Color.argb((int) (f * 255), 0, 0, 0);
    }

    public static final void LIZIZ(TuxIconView tuxIconView, boolean z) {
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_rec_align_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_rec_align;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.zl);
        tuxIconView.setTuxIcon(c419910GdJ2);
    }
}
