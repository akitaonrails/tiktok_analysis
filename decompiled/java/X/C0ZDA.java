package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0ZDA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDA {
    public final String LIZ;
    public final String LIZIZ;
    public final C894980Z9c LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Map<String, String> LJII;
    public final Map<String, String> LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendNudgeEventTrackData(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interactionEventTrackData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activeStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inboxSearchPosition=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", inboxSearchCellType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inboxSearchTabName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", chatRoomSendMessageEventTrackingParams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", chatRoomSendMessageEventTrackingParamsV2=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZDA(String str, String str2, C894980Z9c c894980Z9c, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        c894980Z9c = (i & 4) != 0 ? null : c894980Z9c;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        map = (i & 128) != 0 ? null : map;
        map2 = (i & 256) != 0 ? null : map2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c894980Z9c;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = map;
        this.LJIIIIZZ = map2;
    }
}
