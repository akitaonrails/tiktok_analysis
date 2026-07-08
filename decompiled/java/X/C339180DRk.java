package X;

import Y.ARunnableS37S0300000_4;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339180DRk {
    public static final C339180DRk LIZ = new C339180DRk();

    public static void LIZ(TuxTextView tuxTextView, TuxTextView tuxTextView2, String str) {
        if (tuxTextView2 == null) {
            return;
        }
        if (!C123100dR.LIZ(str)) {
            if (tuxTextView != null) {
                C339190DRl.LIZIZ(tuxTextView);
            }
            C339190DRl.LIZIZ(tuxTextView2);
        } else {
            if (tuxTextView != null) {
                C339190DRl.LIZLLL(tuxTextView);
            }
            tuxTextView2.setMaxLines(1);
            tuxTextView2.setText(str);
            C339190DRl.LIZLLL(tuxTextView2);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView2, new ARunnableS37S0300000_4(tuxTextView2, tuxTextView2, tuxTextView, 13));
        }
    }
}
