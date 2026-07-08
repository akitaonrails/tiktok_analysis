package X;

import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Leq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548260Leq {
    public final List<InputBlock> LIZ;
    public final List<MediaModel> LIZIZ;
    public final List<Pair<MentionDataItem, MentionDataItem>> LIZJ;
    public final List<MentionDataItem> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C548260Leq)) {
            return false;
        }
        C548260Leq c548260Leq = (C548260Leq) obj;
        return Intrinsics.LJFF(this.LIZ, c548260Leq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c548260Leq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c548260Leq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c548260Leq.LIZLLL) && this.LJ == c548260Leq.LJ && this.LJFF == c548260Leq.LJFF && Intrinsics.LJFF(this.LJI, c548260Leq.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        List<Pair<MentionDataItem, MentionDataItem>> list = this.LIZJ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MentionDataItem> list2 = this.LIZLLL;
        int iHashCode3 = (((((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        List<String> list3 = this.LJI;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerationData(inputBlocks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", medias=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cameoSwitchInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentMentionUsers=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isFollow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", btnEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", actorsSelectList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C548260Leq(List list, List list2, List list3, List list4, List list5, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = list5;
    }
}
