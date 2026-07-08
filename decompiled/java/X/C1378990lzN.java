package X;

import android.view.View;

/* JADX INFO: renamed from: X.0lzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378990lzN {
    public static final void LIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5) {
        if (view != null) {
            view.setOutlineProvider(new C1379000lzO(f, f2, f3, f4, f5));
            view.setClipToOutline(true);
        }
    }

    public static /* synthetic */ void LIZIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5, int i) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        LIZ(view, f, f2, f3, f4, f5);
    }
}
