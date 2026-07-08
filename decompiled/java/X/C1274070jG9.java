package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0jG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274070jG9 {
    public C1274060jG8 LIZ;

    public final void LIZ(String str, Throwable th) {
        String strLIZIZ;
        if (this.LIZ != null) {
            if (TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttls_exception__");
                sbLIZ.append(th.getMessage());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ttls_exception__");
                sbLIZ2.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1CC2.LIZIZ(strLIZIZ, th, null);
        }
    }
}
