package X;

import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445720Hdq implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final MixListResponse LLILZIL;

    public C445720Hdq() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C445720Hdq)) {
            return false;
        }
        C445720Hdq c445720Hdq = (C445720Hdq) obj;
        return Intrinsics.LJFF(this.LL, c445720Hdq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c445720Hdq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c445720Hdq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c445720Hdq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c445720Hdq.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        MixListResponse mixListResponse = this.LLILZIL;
        return iHashCode2 + (mixListResponse != null ? mixListResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManagePlaylistHierarchyData(uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mixListResponse=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C445720Hdq(String str, String str2, String str3, MixListResponse mixListResponse, int i) {
        String str4;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            str4 = "playlist_manage_page";
        } else {
            str4 = null;
        }
        str3 = (i & 8) != 0 ? "" : str3;
        mixListResponse = (i & 16) != 0 ? null : mixListResponse;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str4;
        this.LLILZ = str3;
        this.LLILZIL = mixListResponse;
    }
}
