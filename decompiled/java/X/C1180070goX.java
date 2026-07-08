package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0goX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180070goX {
    public static final C1189360h3W LIZ(C1189360h3W c1189360h3W, Context context, int i, int i2, int i3, int i4) {
        if (C296700Bk4.LIZ()) {
            return c1189360h3W;
        }
        c1189360h3W.LIZ.LJIILJJIL = 0;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LJII = i;
        c384050F3z.LJI = i2;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c1189360h3W.LJFF(c384050F3z.LIZ(context));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_image_broken_fill;
        c419910GdJ.LIZIZ = i3;
        c419910GdJ.LIZJ = i4;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a03);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z2.LJII = i;
        c384050F3z2.LJI = i2;
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c1189360h3W.LIZ.LJIL(new C1189390h3Z(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(context))));
        return c1189360h3W;
    }
}
