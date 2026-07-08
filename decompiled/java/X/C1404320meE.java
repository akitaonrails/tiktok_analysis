package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0meE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404320meE {
    public final Map<String, String> LIZ = new HashMap();
    public final StringBuilder LIZIZ = new StringBuilder();
    public boolean LIZJ = true;

    public final void LIZ(float f, String str) {
        Map<String, String> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(f);
        sbLIZ.append("");
        ((HashMap) map).put(str, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(f);
        sbLIZ2.append("");
        LIZLLL(str, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZIZ(int i, String str) {
        Map<String, String> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        ((HashMap) map).put(str, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append("");
        LIZLLL(str, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZJ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, str2);
        LIZLLL(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        if (!this.LIZJ) {
            this.LIZIZ.append(",");
        }
        this.LIZIZ.append("\"");
        this.LIZIZ.append(str);
        this.LIZIZ.append("\"");
        this.LIZIZ.append(":");
        this.LIZIZ.append("\"");
        this.LIZIZ.append(str2);
        this.LIZIZ.append("\"");
        if (this.LIZJ) {
            this.LIZJ = false;
        }
    }
}
