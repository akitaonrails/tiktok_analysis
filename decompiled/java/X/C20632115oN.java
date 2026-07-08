package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: X.15oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20632115oN {
    public static final ViewGroup.MarginLayoutParams LIZIZ;
    public final LinearLayoutManager LIZ;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        LIZIZ = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C20632115oN(LinearLayoutManager linearLayoutManager) {
        this.LIZ = linearLayoutManager;
    }

    public static boolean LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (LIZ(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
