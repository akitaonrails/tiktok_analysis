package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Zsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913730Zsx {
    public final String LIZ;
    public final String LIZIZ;
    public final List<Long> LIZJ;
    public final C900560ZUo LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteUserCacheWrapper(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uidList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inviteEventInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", joinGroupSource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C913730Zsx() {
        this("", "", C13BV.INSTANCE, null, null);
    }

    public C913730Zsx(String str, String str2, List<Long> list, C900560ZUo c900560ZUo, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = c900560ZUo;
        this.LJ = str3;
    }
}
