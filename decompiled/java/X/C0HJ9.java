package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJ9 {
    public static final void LIZ(View view) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        view.setBackground(c384050F3z.LIZ(context));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        }
        C786410Ut5.W5(view, layoutParams);
        view.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        view.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    public static final void LIZIZ(C197039127h c197039127h) {
        c197039127h.LJJLI(false);
        c197039127h.setBackgroundRadius(6);
        LIZ(c197039127h);
        c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        LIZJ(c197039127h);
    }

    public static final void LIZJ(View view) {
        C426750GoL.LJIIL(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
    }
}
