package X;

import java.util.List;

/* JADX INFO: renamed from: X.00Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C049000Fs {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSatisfactionSurveyExtraData(isSatisfactionSurveyShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", relatedAid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", relatedAidList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C049000Fs(String str, List list, int i) {
        str = (i & 2) != 0 ? "" : str;
        list = (i & 4) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
