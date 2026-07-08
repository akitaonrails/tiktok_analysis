package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551680LkM {
    public final List<DownloadItemResult> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551680LkM)) {
            return false;
        }
        C551680LkM c551680LkM = (C551680LkM) obj;
        return Intrinsics.LJFF(this.LIZ, c551680LkM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551680LkM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c551680LkM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c551680LkM.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VOfflineProcessingPostProcessingInput(downloadItemList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateResourceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateImg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551680LkM(List<DownloadItemResult> list, String str, String str2, String str3) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
