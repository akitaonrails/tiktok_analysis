package X;

import android.view.Window;

/* JADX INFO: renamed from: X.0tZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670690tZr implements InterfaceC1668320tW2 {
    public Window LIZ;

    @Override // X.InterfaceC1668320tW2
    public final void LIZIZ() {
        Window window = this.LIZ;
        if (window == null || window.getAttributes().windowAnimations == -1) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // X.InterfaceC1668320tW2
    public final void LIZ(float f) {
        Window window = this.LIZ;
        if (window != null) {
            window.setDimAmount(f);
        }
    }
}
