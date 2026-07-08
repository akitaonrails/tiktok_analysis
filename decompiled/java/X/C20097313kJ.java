package X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.13kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20097313kJ {
    public static void LIZJ(View view) {
        view.requestApplyInsets();
    }

    public static WindowInsets LIZ(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets LIZIZ(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }
}
