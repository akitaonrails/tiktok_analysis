package X;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WVG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WVG {
    public static Uri LIZ(Bundle bundle, String str) {
        if (Intrinsics.LJFF(str, "oauth")) {
            return C0W7Q.LIZ(C0WVB.LIZIZ(), "oauth/authorize", bundle);
        }
        String strLIZIZ = C0WVB.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.D2());
        sbLIZ.append("/dialog/");
        sbLIZ.append(str);
        return C0W7Q.LIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), bundle);
    }
}
