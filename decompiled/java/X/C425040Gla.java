package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425040Gla {
    public static final View LIZ(View view, Function1<? super View, Boolean> function1) {
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = LIZ(viewGroup.getChildAt(i), function1);
                if (viewLIZ != null) {
                    return viewLIZ;
                }
            }
            return null;
        }
        return null;
    }
}
