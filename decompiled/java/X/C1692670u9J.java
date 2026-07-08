package X;

import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0u9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692670u9J {
    public static final int LIZ(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }
}
