package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0y7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845140y7E implements InterfaceC1848190yC9 {
    public static final C1845140y7E LIZ = new C1845140y7E();
    public static final WeakHashMap<View, WeakReference<Object>> LIZIZ = new WeakHashMap<>();

    @Override // X.InterfaceC1848190yC9
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLZ(View view) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZ(C1847620yBE c1847620yBE) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZIL(View view) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZIL(C1847620yBE c1847620yBE) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZILL(Activity activity, Dialog dialog) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZLI(C1847620yBE c1847620yBE) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZL(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            LIZ.getClass();
            LIZIZ.put(decorView, new WeakReference<>(activity));
        }
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZ(Activity activity, Dialog dialog) {
        View decorView;
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            LIZ.getClass();
            LIZIZ.put(decorView, new WeakReference<>(dialog));
        }
    }
}
