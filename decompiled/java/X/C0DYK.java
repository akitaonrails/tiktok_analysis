package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DYK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DYK {
    public static final /* synthetic */ int LIZ = 0;

    public static TuxIconDrawable LIZIZ(Context context, Aweme aweme) {
        int i;
        Integer numValueOf;
        if (context == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (aweme != null && aweme.getUserDigg() == 1) {
            i = R.raw.icon_like_fill;
        } else {
            i = R.raw.icon_like_bold;
        }
        c419910GdJ.LIZ = i;
        if (aweme != null && aweme.getUserDigg() == 1) {
            numValueOf = Integer.valueOf(R.attr.a04);
        } else {
            numValueOf = Integer.valueOf(R.attr.ee);
        }
        c419910GdJ.LJ = numValueOf;
        float f = 14;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        return c419910GdJ.LIZ(context);
    }

    public static Drawable LIZ(Context context, Aweme aweme, int i) {
        if (context == null) {
            return null;
        }
        if (aweme.getUserDigg() == 1) {
            return C800330VaR.LIZIZ(context, R.drawable.d4g);
        }
        return C800330VaR.LIZIZ(context, i);
    }
}
