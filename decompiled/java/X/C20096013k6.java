package X;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: X.13k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20096013k6 {
    public static int LIZ(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence LIZIZ(View view) {
        return view.getStateDescription();
    }

    public static C1A6V LIZJ(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C1A6V(windowInsetsController);
        }
        return null;
    }

    public static boolean LIZLLL(View view) {
        return view.isImportantForContentCapture();
    }

    public static void LJ(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    public static void LJFF(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
