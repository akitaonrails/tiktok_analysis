package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907140zjE {
    public static final C1907140zjE LIZ = new C1907140zjE();
    public static final int LIZIZ = C341940Daq.LIZ(3.0d);
    public static final int LIZJ;

    static {
        C341940Daq.LIZ(56.0d);
        C341940Daq.LIZ(26.0d);
        C341940Daq.LIZ(24.0d);
        LIZJ = C341940Daq.LIZ(24.0d);
    }

    public static void LIZIZ(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.bkw);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    public static void LIZ(C0HX6 c0hx6, Context context, UrlModel urlModel, int i, boolean z) {
        if (urlModel == null) {
            return;
        }
        C427870Gq9 c427870Gq9 = (C427870Gq9) c0hx6.findViewById(R.id.bkw);
        if (c427870Gq9 == null) {
            c427870Gq9 = new C427870Gq9(context);
        }
        if (!z && c427870Gq9.getId() == R.id.bkw) {
            C786410Ut5.LLLLJI(c427870Gq9, 0);
            return;
        }
        int i2 = LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 8388693;
        int i3 = LIZIZ;
        int i4 = -i3;
        layoutParams.setMarginEnd(i4);
        layoutParams.bottomMargin = i4;
        c427870Gq9.setPadding(i3, i3, i3, i3);
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.agm);
        if (drawableLIZIZ != null) {
            drawableLIZIZ.mutate().setTint(i);
            c427870Gq9.setBackground(drawableLIZIZ);
        }
        C1910480zoc c1910480zoc = C1910480zoc.LIZ;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        c1331670kl3LJIIIIZZ.LIZLLL(EnumC1906770zid.ACTIVITY.getIconSceneTag());
        c1910480zoc.getClass();
        C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
        c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C786410Ut5.LLLLJI(c427870Gq9, 0);
        c427870Gq9.setId(R.id.bkw);
        if (c0hx6.indexOfChild(c427870Gq9) == -1) {
            c0hx6.addView(c427870Gq9, layoutParams);
        }
    }
}
