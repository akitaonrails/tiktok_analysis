package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.story.feed.immersive.component.post.StoryImmersiveInteractInfoAreaComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RBS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RBS {
    public static final View LIZ(StoryImmersiveInteractInfoAreaComponent storyImmersiveInteractInfoAreaComponent, C0RBR c0rbr, ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = viewGroup.getContext();
        C1558520qew.LJIIL(storyImmersiveInteractInfoAreaComponent);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.X5(new ViewGroup.MarginLayoutParams(-1, -2), frameLayout);
        frameLayout.setId(R.id.ki1);
        C786410Ut5.LJLZ(8, frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            viewGroup.getContext();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0rbr.LIZ)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0rbr.LIZIZ)));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0rbr.LIZJ)));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0rbr.LIZLLL)));
            marginLayoutParams.setMarginStart(iLIZIZ);
            marginLayoutParams.topMargin = iLIZIZ3;
            marginLayoutParams.setMarginEnd(iLIZIZ2);
            marginLayoutParams.bottomMargin = iLIZIZ4;
        }
        viewGroup.addView(frameLayout);
        return frameLayout;
    }
}
