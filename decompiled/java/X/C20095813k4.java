package X;

import android.view.KeyEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: renamed from: X.13k4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20095813k4 {
    public static CharSequence LIZIZ(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean LIZJ(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean LIZLLL(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void LIZ(View view, final InterfaceC20096113k7 interfaceC20096113k7) {
        C830530Wi3 c830530Wi3 = (C830530Wi3) view.getTag(R.id.x2i);
        if (c830530Wi3 == null) {
            c830530Wi3 = new C830530Wi3();
            view.setTag(R.id.x2i, c830530Wi3);
        }
        Objects.requireNonNull(interfaceC20096113k7);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: X.13k5
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC20096113k7.LIZ();
            }
        };
        c830530Wi3.put(interfaceC20096113k7, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static void LJFF(View view, InterfaceC20096113k7 interfaceC20096113k7) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C830530Wi3 c830530Wi3 = (C830530Wi3) view.getTag(R.id.x2i);
        if (c830530Wi3 != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c830530Wi3.get(interfaceC20096113k7)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T LJI(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void LJII(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void LJIIIIZZ(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void LJIIIZ(View view, C20096213k8 c20096213k8) {
        view.setAutofillId(null);
    }

    public static void LJIIJ(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
