package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ooz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630990Ooz implements InterfaceC111300bX {
    public final Aweme LL;
    public final Music LLILLJJLI;
    public final List<UncertMusicOwnerInfo> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C630990Ooz)) {
            return false;
        }
        C630990Ooz c630990Ooz = (C630990Ooz) obj;
        return Intrinsics.LJFF(this.LL, c630990Ooz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c630990Ooz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c630990Ooz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c630990Ooz.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c630990Ooz.LLILZIL) && this.LLILZLL == c630990Ooz.LLILZLL && this.LLIZ == c630990Ooz.LLIZ && this.LLIZLLLIL == c630990Ooz.LLIZLLLIL && this.LLJ == c630990Ooz.LLJ;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        Music music = this.LLILLJJLI;
        return ((((((((((((((iHashCode + (music != null ? music.hashCode() : 0)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistProfileAssemHierarchyData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", music=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", artistProfileList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showFollowButton=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", artistLabel=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", behindTheSongVideoType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isFromCredits=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C630990Ooz(Aweme aweme, Music music, List<UncertMusicOwnerInfo> list, String str, String str2, boolean z, int i, int i2, boolean z2) {
        this.LL = aweme;
        this.LLILLJJLI = music;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = z2;
    }
}
