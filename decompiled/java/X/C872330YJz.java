package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0YJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872330YJz {
    public final int LIZ;
    public final int LIZIZ;
    public final Map<String, Object> LIZJ;
    public final C0YFV LIZLLL;
    public final long LJ;
    public C0YK7 LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetMsgByUserRequest(inbox=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pullReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", etParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cursorType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tracker=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C872330YJz(int i, int i2, Map<String, ? extends Object> map, C0YFV c0yfv, long j, C0YK7 c0yk7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = map;
        this.LIZLLL = c0yfv;
        this.LJ = j;
        this.LJFF = c0yk7;
    }
}
