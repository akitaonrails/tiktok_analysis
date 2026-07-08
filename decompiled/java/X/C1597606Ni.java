package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597606Ni {
    public static final View LIZ(int i, Context context, Function0 function0, Function0 function02) {
        ViewGroup viewGroup;
        FrameLayout frameLayout = new FrameLayout(context);
        View view = (View) function0.invoke();
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, i));
        frameLayout.addView(view);
        View view2 = (View) function02.invoke();
        ViewParent parent = view2.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view2, viewGroup);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = i;
        C786410Ut5.W5(view2, layoutParams);
        frameLayout.addView(view2);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
