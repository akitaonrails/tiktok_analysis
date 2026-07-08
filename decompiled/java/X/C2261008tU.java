package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.08tU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2261008tU {
    public static final Map<View, Set<String>> LIZ = Collections.synchronizedMap(new WeakHashMap());

    public static void LIZ(View view) {
        LIZ.remove(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZ(viewGroup.getChildAt(i));
            }
        }
    }
}
