package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0xD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810340xD6 {
    public final long LIZ;
    public final long LIZIZ;
    public final List<RankTabInfo> LIZJ;
    public final boolean LIZLLL;
    public final RankTypeV2 LJ;
    public final RankTypeV2 LJFF;
    public final EnumC1811400xEo LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("anchorId=");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("; ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("roomId=");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append("; ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tabSize=");
        List<RankTabInfo> list = this.LIZJ;
        sbLIZ4.append(list != null ? list.size() : -1);
        sbLIZ4.append("; ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("first show rank type=");
        sbLIZ5.append(this.LJFF);
        sbLIZ5.append("; ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("groupType=");
        sbLIZ6.append(this.LJI);
        sbLIZ6.append(' ');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ6));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1810340xD6(long j, long j2, List<RankTabInfo> list, boolean z, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, EnumC1811400xEo enumC1811400xEo) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = z;
        this.LJ = rankTypeV2;
        this.LJFF = rankTypeV22;
        this.LJI = enumC1811400xEo;
    }
}
