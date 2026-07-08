package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import java.util.List;

/* JADX INFO: renamed from: X.0i4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228710i4z {
    public final List<GroupAccessCriteriaCollection> LIZ;
    public final int LIZIZ;
    public final GroupAccessCriteriaCollection LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicGroupCreationPreCheckParam(metaInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initBusinessTypeInt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initAccessCriteriaCollection=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", whoCanJoinTextStr=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1228710i4z(List<GroupAccessCriteriaCollection> list, int i, GroupAccessCriteriaCollection groupAccessCriteriaCollection, String str) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = groupAccessCriteriaCollection;
        this.LIZLLL = str;
    }
}
