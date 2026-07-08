package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.1Dxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272981Dxw {
    public final View LIZ;
    public final View LIZIZ;
    public final C2273001Dxy LIZJ;
    public final C2273001Dxy LIZLLL;
    public int LJ;
    public boolean LJFF;

    public static void LIZ(C2273001Dxy c2273001Dxy) {
        Rect rect = new Rect();
        if (!c2273001Dxy.LIZ.getLocalVisibleRect(rect)) {
            c2273001Dxy.LIZIZ = 0.0f;
            return;
        }
        float fHeight = rect.height();
        int height = c2273001Dxy.LIZ.getHeight();
        if (height < 1) {
            height = 1;
        }
        c2273001Dxy.LIZIZ = fHeight / height;
    }

    public C2272981Dxw(View view, View view2) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = new C2273001Dxy(view);
        this.LIZLLL = new C2273001Dxy(view2);
    }
}
