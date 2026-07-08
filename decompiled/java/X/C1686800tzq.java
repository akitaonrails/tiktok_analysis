package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0tzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1686800tzq implements InterfaceC1686790tzp {
    @Override // X.InterfaceC1686790tzp
    public void LIZIZ(int i, int i2, View view) {
    }

    @Override // X.InterfaceC1686790tzp
    public final void LIZ(Rect rect, View view) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // X.InterfaceC1686790tzp
    public final void LIZJ(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
