package X;

import java.util.List;

/* JADX INFO: renamed from: X.00EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EJ {
    public final List<C1180004jW> LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfficialData(itemList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EJ() {
        this(C13BV.INSTANCE, true, 1L);
    }

    public C00EJ(List<C1180004jW> list, boolean z, long j) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
