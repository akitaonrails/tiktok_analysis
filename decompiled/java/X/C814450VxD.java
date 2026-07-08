package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0VxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814450VxD {
    public static void LIZ(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bundle must contain ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
