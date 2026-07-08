package X;

import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447520Hgk implements InterfaceC447510Hgj {
    public final String LIZ;
    public final String LIZIZ;
    public final SearchPinnedMusicList LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447520Hgk)) {
            return false;
        }
        C447520Hgk c447520Hgk = (C447520Hgk) obj;
        return Intrinsics.LJFF(this.LIZ, c447520Hgk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c447520Hgk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c447520Hgk.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchPinnedMusicList searchPinnedMusicList = this.LIZJ;
        return iHashCode2 + (searchPinnedMusicList != null ? searchPinnedMusicList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMusicCommonData(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pinnedMusicList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447520Hgk(String str, String str2, SearchPinnedMusicList searchPinnedMusicList) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = searchPinnedMusicList;
    }
}
