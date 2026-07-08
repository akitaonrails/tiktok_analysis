package X;

import Y.ARunnableS8S0500000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0RFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692850RFr {
    public int LIZ;
    public int LIZIZ;

    public static void LIZ(int i, int i2, View view) {
        FrameLayout.LayoutParams layoutParams;
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
            return;
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = i;
        C786410Ut5.W5(view, marginLayoutParams);
        C786410Ut5.Ab(view, 0.0f);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
    }

    public final void LIZIZ(Context context, Aweme aweme, ViewGroup viewGroup, View view, SmartImageView smartImageView) {
        if (context != null && aweme != null && aweme.getVideo() != null && viewGroup != null && view != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS8S0500000_11(aweme, this, view, smartImageView, viewGroup, 2));
        }
    }
}
