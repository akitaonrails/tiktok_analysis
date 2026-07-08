package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520440Kb4 extends FrameLayout {
    public final LiveIconView LL;

    public C520440Kb4(Context context) {
        super(context, null, 0);
        LiveIconView liveIconView = new LiveIconView(context, null);
        this.LL = liveIconView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C497740JfY.LIZLLL(R.attr.exj, context));
        setBackground(gradientDrawable);
        addView(liveIconView, new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f), 17));
        liveIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        liveIconView.setIconTintAttr(R.attr.exs);
        setPlaying(false);
    }

    public final void setPlaying(boolean z) {
        int i;
        LiveIconView liveIconView = this.LL;
        if (z) {
            i = R.attr.e6l;
        } else {
            i = R.attr.e9g;
        }
        liveIconView.setIconAttr(i);
    }
}
