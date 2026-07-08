package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03DJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DJ extends FrameLayout {
    public C03DJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(12));
        setBackground(c384050F3z.LIZ(context));
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams2.gravity = 17;
        C786410Ut5.W5(view, layoutParams2);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a02);
        c384050F3z2.LIZJ = Float.valueOf(Float.MAX_VALUE);
        view.setBackground(c384050F3z2.LIZ(context));
        addView(view);
    }
}
