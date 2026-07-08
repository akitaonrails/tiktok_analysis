package X;

import android.view.KeyEvent;

/* JADX INFO: renamed from: X.0Hgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447500Hgi {
    public static String LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poll_option_input_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZ(int i, KeyEvent keyEvent) {
        if (i == 0 || i == 2 || i == 4 || i == 5 || i == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
            return true;
        }
        return false;
    }
}
