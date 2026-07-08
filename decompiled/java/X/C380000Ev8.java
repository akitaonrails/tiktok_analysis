package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ev8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380000Ev8 {
    public View LIZ;
    public TuxIconView LIZIZ;

    public C380000Ev8(Context context) {
    }

    public static Drawable LIZ(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C0EGK.LIZ(20);
        c419910GdJ.LIZJ = C0EGK.LIZ(20);
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.eg);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C0EGK.LIZ(28);
        c384050F3z.LJI = C0EGK.LIZ(28);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }
}
