package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03DO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DO {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZ(ViewGroup viewGroup, Integer num) {
        int iIntValue;
        ViewGroup.LayoutParams layoutParams;
        Context context = viewGroup.getContext();
        View view = new View(context);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        view.setTag("repost_line_tag");
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        view.setBackground(c384050F3z.LIZ(context));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZIZ, iIntValue);
            layoutParams2.setMarginEnd(iLIZIZ2);
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iLIZIZ, iIntValue);
            layoutParams3.gravity = 8388659;
            layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
            layoutParams = layoutParams3;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iLIZIZ, iIntValue);
            marginLayoutParams.setMarginEnd(iLIZIZ2);
            layoutParams = marginLayoutParams;
        }
        C786410Ut5.W5(view, layoutParams);
        return view;
    }
}
