package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.Window;

/* JADX INFO: renamed from: X.0dqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065860dqK {
    public static void LIZ(Window window, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Build.MANUFACTURER);
        sbLIZ.append('-');
        sbLIZ.append(Build.MODEL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!TextUtils.equals("vivo-V1821A", strLIZIZ) && !TextUtils.equals("vivo-V1821T", strLIZIZ)) {
            window.setLayout(-1, i);
        } else {
            window.setLayout(-1, -2);
        }
    }
}
