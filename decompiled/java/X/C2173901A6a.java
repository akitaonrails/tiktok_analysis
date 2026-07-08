package X;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.1A6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2173901A6a extends C2173941A6e {
    @Override // X.C2173911A6b, X.InterfaceC2173981A6i
    public void LIZIZ(C2173961A6g c2173961A6g, C2173961A6g c2173961A6g2, Window window, View view, boolean z, boolean z2) {
        C0DRA.LIZ(window, false);
        c2173961A6g.getClass();
        window.setStatusBarColor(0);
        c2173961A6g2.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C1A6V c1a6v = new C1A6V(window, view);
        c1a6v.LIZJ(!z);
        c1a6v.LIZIZ(true ^ z2);
    }
}
