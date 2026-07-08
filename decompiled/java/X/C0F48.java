package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0F48, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F48 extends FrameLayout {
    public final TuxIconView LL;

    public C0F48(Context context) {
        super(context, null, 0);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LL = tuxIconView;
        setClickable(true);
        setFocusable(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LIZ(28), LIZ(62));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        setContentDescription(context.getString(2131822364));
        tuxIconView.setClickable(false);
        tuxIconView.setFocusable(false);
        tuxIconView.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(LIZ(24), LIZ(24));
        layoutParams2.gravity = 8388659;
        layoutParams2.topMargin = LIZ(19);
        addView(tuxIconView, layoutParams2);
    }

    public final int LIZ(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
