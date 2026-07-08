package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0waT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786390waT {
    public static final C1786390waT LIZ = new C1786390waT();

    public static void LIZ(C1749280vcc c1749280vcc, Context context) {
        View viewFindViewWithTag = c1749280vcc.findViewWithTag("creator_ranking_fallback_loading");
        if (viewFindViewWithTag != null) {
            c1749280vcc.LIZIZ(viewFindViewWithTag);
        } else {
            C16FZ c16fz = new C16FZ(context, null);
            c16fz.setTag("creator_ranking_fallback_loading");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
            c16fz.setLayoutParams(layoutParams);
            c1749280vcc.LIZIZ(c16fz);
        }
        c1749280vcc.setLayoutVariant(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1749280vcc r11, android.content.Context r12, X.C1785870wZd r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1786390waT.LIZIZ(X.0vcc, android.content.Context, X.0wZd, kotlin.jvm.functions.Function1):void");
    }
}
