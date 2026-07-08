package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0DQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338900DQi {
    public static void LIZ(int i, Activity activity) {
        activity.getWindow().addFlags(67108864);
        View view = new View(activity);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C497820Jfg.LIZJ(activity)));
        view.setBackgroundColor(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
    }
}
