package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426210GnT {
    public static final OvershootInterpolator LIZ = new OvershootInterpolator();
    public static final Interpolator LIZIZ = C1619980sG4.LJIILIIL();

    public static Drawable LIZ(Context context) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        return c384050F3z.LIZ(context);
    }
}
