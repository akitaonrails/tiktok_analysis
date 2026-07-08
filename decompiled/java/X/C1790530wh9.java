package X;

import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import java.util.List;

/* JADX INFO: renamed from: X.0wh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790530wh9 {
    public final String LIZ;
    public long LIZIZ;
    public final List<BubbleRecord> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleRecordInfo(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", records=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1790530wh9(String str, long j, List<BubbleRecord> list) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = list;
    }
}
