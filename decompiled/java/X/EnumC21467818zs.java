package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.18zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21467818zs {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final C21467718zr Companion = new C21467718zr();

    public static final EnumC21467818zs from(int i) {
        Companion.getClass();
        return C21467718zr.LIZIZ(i);
    }

    public static EnumC21467818zs valueOf(String str) {
        return (EnumC21467818zs) C08FF.LIZ(EnumC21467818zs.class, str);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        int i = C21467918zt.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C786410Ut5.LJLLLLLL(4, view);
                        return;
                    }
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == null) {
                viewGroup.addView(view);
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent2) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(view, viewGroup2);
    }
}
