package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o73, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460630o73 {
    public static C1460640o74 LIZ(Context context, C1460620o72 c1460620o72) {
        FrameLayout.LayoutParams layoutParams;
        C1460640o74 c1460640o74 = new C1460640o74(context);
        int i = c1460620o72.LIZ;
        int i2 = 8;
        SmartImageView smartImageView = null;
        if (i == 24) {
            C786410Ut5.LJLLLLLL(8, c1460640o74.findViewById(R.id.cw2));
            c1460640o74.getChildAt(0).getLayoutParams().width = (int) C0JAI.LIZ(20.0f, context);
            c1460640o74.getChildAt(0).getLayoutParams().height = (int) C0JAI.LIZ(1.0f, context);
            ViewGroup.LayoutParams layoutParams2 = c1460640o74.getChildAt(0).getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 1;
            }
            c1460640o74.getChildAt(0).setBackgroundResource(R.drawable.a9l);
            return c1460640o74;
        }
        if (i == 25 || (((Number) C0BWD.LIZ.getValue()).intValue() > 0 && c1460620o72.LIZ == 1200)) {
            ViewStub viewStub = c1460640o74.LLILZIL;
            if (viewStub == null) {
                viewStub = null;
            }
            C786410Ut5.LJLLLL(viewStub);
            c1460640o74.LLILZLL = (C0FJM) c1460640o74.findViewById(R.id.tzs);
        }
        String str = c1460620o72.LIZLLL;
        if (str != null && str.length() != 0) {
            c1460640o74.setText(str);
        } else {
            c1460640o74.setText(c1460620o72.LIZJ);
        }
        if (c1460620o72.LJ == -1) {
            c1460640o74.setIcon(c1460620o72.LIZIZ);
        } else {
            ViewGroup.LayoutParams iconLayoutParams = c1460640o74.getIconLayoutParams();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZJ = iconLayoutParams.height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c419910GdJ.LIZIZ = iconLayoutParams.width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c419910GdJ.LIZ = c1460620o72.LJ;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c1460640o74.setIcon(c419910GdJ.LIZ(context));
            c1460640o74.setIconPadding(C1460640o74.LLIZLLLIL);
        }
        if (c1460620o72.LJI) {
            i2 = 0;
        }
        TuxIconView tuxIconView = c1460640o74.LLILLL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        if (tuxIconView.getVisibility() != i2) {
            TuxIconView tuxIconView2 = c1460640o74.LLILLL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        }
        SmartImageView smartImageView2 = c1460640o74.LLILZ;
        if (smartImageView2 != null) {
            smartImageView = smartImageView2;
        }
        C786410Ut5.LLFF(0, smartImageView);
        Function1<C1459730o5b, Unit> function1 = c1460620o72.LJFF;
        if (function1 != null) {
            c1460640o74.LLIZ = function1;
        }
        return c1460640o74;
    }
}
