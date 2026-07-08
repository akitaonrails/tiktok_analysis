package X;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.07lJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1955507lJ {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static String LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (TextUtils.isEmpty(str3)) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str3);
        sbLIZ2.append(";");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
