package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343420DdE {
    public static final C197039127h LIZ(Context context) {
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        c197039127h.setText(context.getString(2131831723));
        c197039127h.setButtonVariant(2);
        c197039127h.setTuxFont(61);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 81);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.J6(c197039127h, layoutParams);
        c197039127h.setForeground(new StateListDrawable());
        return c197039127h;
    }

    public static final TuxTextView LIZIZ(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setTextColor(LIZJ(R.attr.zi, context));
        tuxTextView.setTuxFont(61);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        return tuxTextView;
    }

    public static final int LIZJ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
