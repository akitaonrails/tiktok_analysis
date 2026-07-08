package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;

/* JADX INFO: renamed from: X.0i1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226790i1t {
    public final GroupCompositeType LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceCheckRes(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canCreate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1226790i1t(GroupCompositeType groupCompositeType, boolean z, String str) {
        this.LIZ = groupCompositeType;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
