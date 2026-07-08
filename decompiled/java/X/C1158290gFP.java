package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0gFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158290gFP {
    public final boolean LIZ;
    public final Map<Integer, C1776490wKV> LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookFetchListLocalParams(onlyNeedRecommendedBooks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstLevelFetchListStateInfoMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fetchAllListSuccessAndRecommendListNotEmpty=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158290gFP(boolean z, Map<Integer, C1776490wKV> map, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = map;
        this.LIZJ = z2;
    }
}
