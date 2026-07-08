package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.127m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197044127m implements InterfaceC111300bX {
    public final List<ExternalMusicInfo> LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final Map<String, String> LLJI;
    public final C630790Oof LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C197044127m)) {
            return false;
        }
        C197044127m c197044127m = (C197044127m) obj;
        return Intrinsics.LJFF(this.LL, c197044127m.LL) && this.LLILLJJLI == c197044127m.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c197044127m.LLILLL) && Intrinsics.LJFF(this.LLILZ, c197044127m.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c197044127m.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c197044127m.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c197044127m.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c197044127m.LLIZLLLIL) && this.LLJ == c197044127m.LLJ && Intrinsics.LJFF(this.LLJI, c197044127m.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c197044127m.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31;
        Map<String, String> map = this.LLJI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C630790Oof c630790Oof = this.LLJIJIL;
        return iHashCode2 + (c630790Oof != null ? c630790Oof.hashCode() : 0);
    }

    public final String toString() {
        return "ChooseThirdMusicData(musicInfoList=" + this.LL + ", isExclusiveResso=" + this.LLILLJJLI + ", processId=" + this.LLILLL + ", musicId=" + this.LLILZ + ", groupId=" + this.LLILZIL + ", requestId=" + this.LLILZLL + ", showType=" + this.LLIZ + ", musicFrom=" + this.LLIZLLLIL + ", enterFrom=" + this.LLJ + ", logExtraMap=" + this.LLJI + ", simpleMusicData=" + this.LLJIJIL + ')';
    }

    public C197044127m(List<ExternalMusicInfo> list, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Map<String, String> map, C630790Oof c630790Oof) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = i;
        this.LLJI = map;
        this.LLJIJIL = c630790Oof;
    }
}
