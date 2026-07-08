package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03DL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DL extends FrameLayout {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));

    public C03DL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C03DM c03dm = new C03DM();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        int i = LL;
        c384050F3z.LIZJ = Float.valueOf(i);
        setBackground(c384050F3z.LIZ(context));
        TuxIconView tuxIconView = c03dm.LIZ;
        if (tuxIconView == null) {
            tuxIconView = new TuxIconView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
        addView(tuxIconView);
    }
}
