package X;

import Y.ACListenerS127S0200000_25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638250sjX {
    public final ViewGroup LIZ;
    public final C1638260sjY LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final FrameLayout LJ;
    public TextView LJFF;
    public final View LJI;
    public boolean LJII;
    public Integer LJIIIIZZ;

    public final void LIZ(boolean z) {
        float f;
        this.LJII = z;
        this.LJI.setEnabled(z);
        ImageView imageView = this.LIZLLL;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.V4(imageView, f);
        TextView textView = this.LJFF;
        if (textView != null) {
            if (!z) {
                f2 = 0.5f;
            }
            C786410Ut5.S4(f2, textView);
        }
    }

    public C1638250sjX(ViewGroup viewGroup, C1638260sjY c1638260sjY, boolean z) {
        int i;
        this.LIZ = viewGroup;
        this.LIZIZ = c1638260sjY;
        Keva.getRepo("compliance_dialog_confirmed");
        this.LJII = true;
        TextView textView = null;
        C1638270sjZ c1638270sjZ = new C1638270sjZ(null);
        this.LJIIIIZZ = 2131845839;
        Function1<? super C1638270sjZ, Unit> function1 = c1638260sjY.LJIIJJI;
        if (function1 != null) {
            function1.invoke(c1638270sjZ);
        }
        Context context = viewGroup.getContext();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cy2, viewGroup, true);
        this.LJI = viewTd;
        View viewFindViewById = viewTd.findViewById(R.id.lao);
        this.LIZJ = viewFindViewById;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.lkw);
        this.LIZLLL = imageView;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.i6d);
        this.LJ = frameLayout;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.zq4);
        if (textView2 != null) {
            Function1<? super TextView, Unit> function12 = c1638270sjZ.LIZ;
            if (function12 != null) {
                function12.invoke(textView2);
            }
            textView = textView2;
        }
        this.LJFF = textView;
        boolean z2 = c1638260sjY.LJFF;
        if (textView != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIL(textView, i);
        }
        viewFindViewById.setFocusable(true);
        viewFindViewById.setContentDescription(context.getString(2131846599));
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        viewFindViewById.getLayoutParams().width = c1638260sjY.LIZJ;
        C377000EqI.LIZ(viewFindViewById);
        C377000EqI.LIZ(imageView);
        frameLayout.setBackgroundResource(c1638260sjY.LJIIJ);
        Pair<Integer, Integer> pair = c1638260sjY.LIZLLL;
        if (pair != null) {
            imageView.getLayoutParams().width = pair.getFirst().intValue();
            imageView.getLayoutParams().height = pair.getSecond().intValue();
        }
        Pair<Integer, Integer> pair2 = c1638260sjY.LJ;
        if (pair2 != null) {
            frameLayout.getLayoutParams().width = pair2.getFirst().intValue();
            frameLayout.getLayoutParams().height = pair2.getSecond().intValue();
        }
        C786410Ut5.O7(frameLayout, new ACListenerS127S0200000_25(this, context, 6));
        Drawable drawable = c1638260sjY.LJIIL;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            int iLIZJ = C11VU.LIZJ(2.0d, context);
            int iLIZJ2 = C11VU.LIZJ(1.0d, context);
            imageView.setPadding(iLIZJ2, iLIZJ, iLIZJ2, iLIZJ);
        } else {
            imageView.setImageResource(c1638260sjY.LJIIIZ);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        int i2 = c1638260sjY.LIZ;
        if (i2 > 0) {
            marginLayoutParams.topMargin = i2;
        }
        int i3 = c1638260sjY.LIZIZ;
        if (i3 > 0) {
            marginLayoutParams.rightMargin = i3;
        }
        marginLayoutParams.topMargin += ScreenUtils.getStatusBarHeight(context);
        LIZ(z);
    }
}
