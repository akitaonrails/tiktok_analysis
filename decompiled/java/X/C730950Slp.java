package X;

import Y.ARunnableS111S0100000_11;
import android.view.View;

/* JADX INFO: renamed from: X.0Slp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730950Slp {
    public static void LIZ(View view) {
        if (view == null) {
            return;
        }
        view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS111S0100000_11(view, 133)).start();
    }
}
