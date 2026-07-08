package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332870D3d implements Serializable {
    public final List<String> avatarUrls;
    public final boolean isExpanded;
    public final String sentiment;
    public final String sourceCountText;
    public final String summary;
    public final List<C332550D1x> tags;

    public final C332870D3d copy(String str, String str2, List<C332550D1x> list, String str3, List<String> list2, boolean z) {
        return new C332870D3d(str, str2, list, str3, list2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332870D3d)) {
            return false;
        }
        C332870D3d c332870D3d = (C332870D3d) obj;
        return Intrinsics.LJFF(this.summary, c332870D3d.summary) && Intrinsics.LJFF(this.sentiment, c332870D3d.sentiment) && Intrinsics.LJFF(this.tags, c332870D3d.tags) && Intrinsics.LJFF(this.sourceCountText, c332870D3d.sourceCountText) && Intrinsics.LJFF(this.avatarUrls, c332870D3d.avatarUrls) && this.isExpanded == c332870D3d.isExpanded;
    }

    public int hashCode() {
        String str = this.summary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sentiment;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.tags.hashCode()) * 31;
        String str3 = this.sourceCountText;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.avatarUrls.hashCode()) * 31) + C786410Ut5.Z2(this.isExpanded);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiOverviewState(summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", sentiment=");
        sbLIZ.append(this.sentiment);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(", sourceCountText=");
        sbLIZ.append(this.sourceCountText);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.avatarUrls);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.isExpanded);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public C332870D3d(String str, String str2, List<C332550D1x> list, String str3, List<String> list2, boolean z) {
        this.summary = str;
        this.sentiment = str2;
        this.tags = list;
        this.sourceCountText = str3;
        this.avatarUrls = list2;
        this.isExpanded = z;
    }
}
