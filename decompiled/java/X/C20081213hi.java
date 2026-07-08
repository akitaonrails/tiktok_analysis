package X;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: X.13hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20081213hi {
    public static AutofillId LIZIZ(View view) {
        return view.getAutofillId();
    }

    public static int LIZJ(View view) {
        return view.getImportantForAutofill();
    }

    public static int LIZLLL(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean LJ(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean LJFF(View view) {
        return view.isFocusedByDefault();
    }

    public static boolean LJI(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean LJII(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static boolean LJIIIZ(View view) {
        return view.restoreDefaultFocus();
    }

    public static void LJIIJ(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void LJIIJJI(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void LJIIL(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void LJIILIIL(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void LJIILJJIL(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void LJIILL(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static void LIZ(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static View LJIIIIZZ(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }
}
