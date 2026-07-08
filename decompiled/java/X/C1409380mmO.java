package X;

import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import java.util.List;

/* JADX INFO: renamed from: X.0mmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409380mmO {
    public final List<InspirationItemData> LIZ;
    public final List<InspirationItemData> LIZIZ;
    public final List<String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationDataResult(ideaInspirations=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleInspirations=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", labels=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409380mmO(List<InspirationItemData> list, List<InspirationItemData> list2, List<String> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
