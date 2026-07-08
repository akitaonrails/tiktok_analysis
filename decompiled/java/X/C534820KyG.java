package X;

import java.util.List;

/* JADX INFO: renamed from: X.0KyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534820KyG {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final List<String> LJ;
    public final Integer LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request(requestLocalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestLocal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestRemote=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", localMediaIds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aiType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C534820KyG(int i, boolean z, boolean z2, int i2, List list, Integer num, int i3) {
        i = (i3 & 1) != 0 ? -1 : i;
        z = (i3 & 2) != 0 ? true : z;
        z2 = (i3 & 4) != 0 ? true : z2;
        i2 = (i3 & 8) != 0 ? 3 : i2;
        list = (i3 & 16) != 0 ? C13BV.INSTANCE : list;
        num = (i3 & 32) != 0 ? null : num;
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = list;
        this.LJFF = num;
        if (!list.isEmpty() && !z) {
            "localMediaIds is not empty, requestLocal must be true".toString();
            throw new IllegalArgumentException("localMediaIds is not empty, requestLocal must be true");
        }
    }
}
