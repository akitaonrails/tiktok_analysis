package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;

/* JADX INFO: renamed from: X.0LoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554160LoM {
    public final List<MentionDataItem> LIZ;
    public final List<MentionDataItem> LIZIZ;

    public C554160LoM() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        return false;
    }

    public final int hashCode() {
        List<MentionDataItem> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MentionDataItem> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionListCellUIState(enableList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C554160LoM(List<MentionDataItem> list, List<MentionDataItem> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    public static C554160LoM LIZ(C554160LoM c554160LoM, List list, List list2, int i) {
        if ((i & 1) != 0) {
            list = c554160LoM.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c554160LoM.LIZIZ;
        }
        c554160LoM.getClass();
        return new C554160LoM(list, list2);
    }
}
