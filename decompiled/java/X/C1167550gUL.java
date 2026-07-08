package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167550gUL implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final UrlModel LLILZIL;
    public final long LLILZLL;
    public int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final ShareInfo LLJI;
    public final Boolean LLJIJIL;

    public C1167550gUL() {
        this(null, null, "", "playlist_edit_page", null, 0L, 0, null, null, null, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167550gUL)) {
            return false;
        }
        C1167550gUL c1167550gUL = (C1167550gUL) obj;
        return Intrinsics.LJFF(this.LL, c1167550gUL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1167550gUL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1167550gUL.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1167550gUL.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1167550gUL.LLILZIL) && this.LLILZLL == c1167550gUL.LLILZLL && this.LLIZ == c1167550gUL.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1167550gUL.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1167550gUL.LLJ) && Intrinsics.LJFF(this.LLJI, c1167550gUL.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1167550gUL.LLJIJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        UrlModel urlModel = this.LLILZIL;
        int iHashCode3 = (((((iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + this.LLIZ) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ShareInfo shareInfo = this.LLJI;
        int iHashCode6 = (iHashCode5 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        Boolean bool = this.LLJIJIL;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EditPlaylistHierarchyData(playlistId=" + this.LL + ", playlistName=" + this.LLILLJJLI + ", enterMethod=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", cover=" + this.LLILZIL + ", partCount=" + this.LLILZLL + ", mixLabel=" + this.LLIZ + ", uid=" + this.LLIZLLLIL + ", secUid=" + this.LLJ + ", shareInfo=" + this.LLJI + ", isFromLiveReplay=" + this.LLJIJIL + ')';
    }

    public C1167550gUL(String str, String str2, String str3, String str4, UrlModel urlModel, long j, int i, String str5, String str6, ShareInfo shareInfo, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = urlModel;
        this.LLILZLL = j;
        this.LLIZ = i;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = shareInfo;
        this.LLJIJIL = bool;
    }
}
