package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0JAF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAF {
    public static View LIZ(int i, ViewGroup viewGroup) {
        View viewLIZ;
        C0JAD c0jad;
        Set<Integer> set;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C0JAD) && (set = (c0jad = (C0JAD) childAt).LLILLL) != null) {
                if (((HashSet) set).contains(Integer.valueOf(i))) {
                    return c0jad.LIZIZ(true).findViewById(i);
                }
            }
            if ((childAt instanceof ViewGroup) && (viewLIZ = LIZ(i, (ViewGroup) childAt)) != null) {
                return viewLIZ;
            }
        }
        return null;
    }

    public static <T extends View> T LIZIZ(View view, View view2, int i) {
        if (view instanceof C0JAD) {
            view = (T) ((C0JAD) view).LIZIZ(true);
        }
        return (view == null && i != -1 && (view2 instanceof ViewGroup)) ? (T) LIZ(i, (ViewGroup) view2) : (T) view;
    }
}
