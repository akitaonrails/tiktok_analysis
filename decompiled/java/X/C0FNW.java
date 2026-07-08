package X;

import Y.ACListenerS140S0100000_5;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FNW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNW {
    public static final C0FNW LIZ = new C0FNW();

    public static void LIZ(C19614411oc c19614411oc, LinearLayout linearLayout, Function0 function0) {
        C426750GoL.LJIIIZ(linearLayout, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, false, 16);
        TuxIconView tuxIconView = new TuxIconView(c19614411oc.getContext(), null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_x_mark_circle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
        C786410Ut5.x5(tuxIconView, 0.88f);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
        tuxIconView.setId(R.id.bgi);
        tuxIconView.setImageDrawable(tuxIconDrawableLIZ);
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        layoutParams.gravity = 8388661;
        C786410Ut5.M6(tuxIconView, layoutParams);
        C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(function0, 11));
        tuxIconView.setElevation(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)));
        c19614411oc.addView(tuxIconView);
    }
}
