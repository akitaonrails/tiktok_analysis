package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ej9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372570Ej9 {
    public static final int LIZ(int i) {
        return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void LIZIZ(View view, Function0 function0) {
        C0T6I.LIZ(view, new C5179020b(16L, view, function0, 2));
    }

    public static final void LIZJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i != -5) {
            layoutParams.width = i;
        }
        if (i2 != -5) {
            layoutParams.height = i2;
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
