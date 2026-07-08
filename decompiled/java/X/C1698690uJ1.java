package X;

import android.text.TextUtils;
import java.util.UUID;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0uJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698690uJ1 {
    public final C1698770uJ9 LIZ;

    public C1698690uJ1(C1698770uJ9 c1698770uJ9) {
        this.LIZ = c1698770uJ9;
    }

    public final void LIZ(String str) {
        String lowerCase;
        int iIndexOf;
        if (!TextUtils.isEmpty(this.LIZ.LIZIZ)) {
            C1698770uJ9 c1698770uJ9 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VVSessionIdRefactor] initSessionId: caller:");
            sbLIZ.append(str);
            sbLIZ.append(",sessionId already initialized: ");
            sbLIZ.append(this.LIZ.LIZIZ);
            c1698770uJ9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1698510uIj c1698510uIj = this.LIZ.LIZ;
        String strSubstring = null;
        if (c1698510uIj != null) {
            lowerCase = c1698510uIj.LJIILL();
        } else {
            lowerCase = null;
        }
        if (TextUtils.isEmpty(lowerCase)) {
            String str2 = this.LIZ.LIZIZ;
            if (!TextUtils.isEmpty(str2) && (iIndexOf = str2.indexOf(46)) > 0) {
                strSubstring = str2.substring(0, iIndexOf);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                lowerCase = strSubstring;
            } else {
                lowerCase = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1698770uJ9 c1698770uJ92 = this.LIZ;
        int iHashCode = c1698770uJ92.hashCode();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(lowerCase);
        sbLIZ2.append(e3.d);
        sbLIZ2.append(jCurrentTimeMillis);
        sbLIZ2.append(e3.d);
        sbLIZ2.append(iHashCode);
        c1698770uJ92.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C1698770uJ9 c1698770uJ93 = this.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[VVSessionIdRefactor] initSessionId: caller:");
        sbLIZ3.append(str);
        sbLIZ3.append(", liveVVSessionId:");
        sbLIZ3.append(this.LIZ.LIZIZ);
        c1698770uJ93.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
