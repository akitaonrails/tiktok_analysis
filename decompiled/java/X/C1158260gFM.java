package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158260gFM implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final Aweme LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158260gFM)) {
            return false;
        }
        C1158260gFM c1158260gFM = (C1158260gFM) obj;
        return Intrinsics.LJFF(this.LL, c1158260gFM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158260gFM.LLILLJJLI) && this.LLILLL == c1158260gFM.LLILLL && Intrinsics.LJFF(this.LLILZ, c1158260gFM.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1158260gFM.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Aweme aweme = this.LLILZIL;
        return iHashCode2 + (aweme != null ? aweme.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistChoosePanelHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFromPublish=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedPlaylistId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158260gFM(Aweme aweme, String str, String str2, String str3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = str3;
        this.LLILZIL = aweme;
    }
}
