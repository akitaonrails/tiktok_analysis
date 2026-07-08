package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420610GeR {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZIZ(Context context, boolean z, boolean z2) {
        int i;
        View view = new View(context);
        if (z2) {
            i = 6;
        } else if (z) {
            i = 13;
        } else {
            i = 12;
        }
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), -1));
        return view;
    }

    public static View LIZ(Context context, int i, int i2, int i3, Function0 function0) {
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.cc2, null);
        FrameLayout frameLayout = (FrameLayout) viewLJLLJ.findViewById(R.id.y_3);
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.y_4);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.y_5);
        if (tuxTextView != null) {
            tuxTextView.setMinTextSize(10.0f);
        }
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
            tuxIconView.setTintColorRes(R.attr.ee);
            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
            tuxIconView.invalidate();
        }
        if (frameLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(i2);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
            frameLayout.setBackground(c384050F3z.LIZ(context));
        }
        if (tuxTextView != null) {
            tuxTextView.setText(i3);
        }
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS141S0100000_6(function0, 171));
        }
        return viewLJLLJ;
    }
}
