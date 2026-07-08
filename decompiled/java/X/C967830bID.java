package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967830bID {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final List<C1283230jUv> LIZLLL;
    public final List<C967810bIB> LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicStateModel(channelId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateVersion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", userStates=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shareBgStickerId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", backgroundUrl=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", wallpaperUrl=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C967830bID(long j, long j2, String str, List<C1283230jUv> list, List<C967810bIB> list2, String str2, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
    }
}
