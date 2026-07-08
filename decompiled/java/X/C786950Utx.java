package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Utx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786950Utx {
    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("webextension_")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("webextension_");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
