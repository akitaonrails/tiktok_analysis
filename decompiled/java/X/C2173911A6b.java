package X;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.1A6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2173911A6b extends C2173971A6h {
    @Override // X.InterfaceC2173981A6i
    public void LIZIZ(C2173961A6g c2173961A6g, C2173961A6g c2173961A6g2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        C0DRA.LIZ(window, false);
        if (z) {
            i = c2173961A6g.LIZIZ;
        } else {
            i = c2173961A6g.LIZ;
        }
        window.setStatusBarColor(i);
        if (z2) {
            i2 = c2173961A6g2.LIZIZ;
        } else {
            i2 = c2173961A6g2.LIZ;
        }
        window.setNavigationBarColor(i2);
        C1A6V c1a6v = new C1A6V(window, view);
        c1a6v.LIZJ(!z);
        c1a6v.LIZIZ(!z2);
    }
}
