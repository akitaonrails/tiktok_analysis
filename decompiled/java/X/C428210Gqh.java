package X;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428210Gqh {
    public static final C428210Gqh LIZ = new C428210Gqh();

    public static TuxIconView LIZ(Context context) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int i = 0;
        if (((Number) C07BC.LIZ.getValue()).intValue() == 1) {
            iLIZIZ = C428220Gqi.LIZ;
            iLIZIZ3 = C428220Gqi.LIZJ;
            i = C428220Gqi.LIZIZ;
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams.addRule(10);
        layoutParams.addRule(21);
        layoutParams.topMargin = iLIZIZ3;
        layoutParams.setMarginEnd(iLIZIZ3);
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), 16);
        C786410Ut5.M6(tuxIconView, layoutParams);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZIZ = iLIZIZ2;
        c419910GdJ.LIZJ = iLIZIZ2;
        tuxIconView.setTuxIcon(c419910GdJ);
        return tuxIconView;
    }

    public static C419890GdH LIZIZ(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_story_star;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
        return new C419890GdH(tuxIconDrawableLIZ, 2);
    }
}
