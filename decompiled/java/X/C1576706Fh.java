package X;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.06Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576706Fh {
    public final String LIZ;
    public final String LIZIZ;
    public final C06H2 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final Map<String, String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelData(clickFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inlineMessageScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", invitationPanelSource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", clickOpenStreakPanelTimestamp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", campaignId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", petPanelAdditionalParams=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1576706Fh(String str, String str2, C06H2 c06h2, String str3, String str4, Long l, String str5, String str6, int i) {
        String string;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        l = (i & 32) != 0 ? null : l;
        if ((i & 128) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        str5 = (i & 256) != 0 ? null : str5;
        str6 = (i & 512) != 0 ? null : str6;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c06h2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = l;
        this.LJI = null;
        this.LJII = string;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
    }
}
