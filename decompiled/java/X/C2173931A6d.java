package X;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.1A6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173931A6d {
    public static final int LIZ = Color.argb(230, 255, 255, 255);
    public static final int LIZIZ = Color.argb(128, 27, 27, 27);

    public static void LIZ(ComponentActivity componentActivity) {
        InterfaceC2173981A6i c2173911A6b;
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(16);
        C2173961A6g c2173961A6g = new C2173961A6g(0, 0, aFwS274S0000000_30);
        C2173961A6g c2173961A6g2 = new C2173961A6g(LIZ, LIZIZ, aFwS274S0000000_30);
        View decorView = componentActivity.getWindow().getDecorView();
        boolean zBooleanValue = ((Boolean) aFwS274S0000000_30.invoke(decorView.getResources())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) aFwS274S0000000_30.invoke(decorView.getResources())).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c2173911A6b = new C2173901A6a() { // from class: X.1A6f
                @Override // X.C2173941A6e, X.C2173971A6h, X.InterfaceC2173981A6i
                public void LIZ(Window window) {
                    window.getAttributes().layoutInDisplayCutoutMode = 3;
                }
            };
        } else if (i >= 29) {
            c2173911A6b = new C2173901A6a();
        } else if (i >= 28) {
            c2173911A6b = new C2173941A6e();
        } else if (i >= 26) {
            c2173911A6b = new C2173911A6b();
        } else {
            c2173911A6b = new C2173971A6h() { // from class: X.1A6c
                @Override // X.InterfaceC2173981A6i
                public void LIZIZ(C2173961A6g c2173961A6g3, C2173961A6g c2173961A6g4, Window window, View view, boolean z, boolean z2) {
                    int i2;
                    C0DRA.LIZ(window, false);
                    if (z) {
                        i2 = c2173961A6g3.LIZIZ;
                    } else {
                        i2 = c2173961A6g3.LIZ;
                    }
                    window.setStatusBarColor(i2);
                    window.setNavigationBarColor(c2173961A6g4.LIZIZ);
                    new C1A6V(window, view).LIZJ(!z);
                }
            };
        }
        c2173911A6b.LIZIZ(c2173961A6g, c2173961A6g2, componentActivity.getWindow(), decorView, zBooleanValue, zBooleanValue2);
        c2173911A6b.LIZ(componentActivity.getWindow());
    }
}
