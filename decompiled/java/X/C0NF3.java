package X;

import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0NF3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NF3 {
    public final C590350NDl LIZ;
    public final List<HistoryVideoInfoStruct> LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Input(idx:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", br:");
        sbLIZ.append(this.LIZ.LJFF);
        sbLIZ.append(", dur:");
        sbLIZ.append(this.LIZ.LIZIZ());
        sbLIZ.append(", hists:");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NF3(int i, C590350NDl c590350NDl, List list) {
        this.LIZ = c590350NDl;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
