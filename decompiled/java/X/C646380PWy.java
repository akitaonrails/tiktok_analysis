package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646380PWy implements C0PWT {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final Boolean LLILZIL;
    public final String LLILZLL;
    public final Integer LLIZ;
    public final C0PL2 LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final GlobalDoodleConfig LLJIJIL;
    public final long LLJILJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C646380PWy() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646380PWy)) {
            return false;
        }
        C646380PWy c646380PWy = (C646380PWy) obj;
        return Intrinsics.LJFF(this.LL, c646380PWy.LL) && this.LLILLJJLI == c646380PWy.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c646380PWy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c646380PWy.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c646380PWy.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c646380PWy.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c646380PWy.LLIZ) && this.LLIZLLLIL == c646380PWy.LLIZLLLIL && this.LLJ == c646380PWy.LLJ && this.LLJI == c646380PWy.LLJI && Intrinsics.LJFF(this.LLJIJIL, c646380PWy.LLJIJIL) && this.LLJILJIL == c646380PWy.LLJILJIL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C0PL2 c0pl2 = this.LLIZLLLIL;
        int iHashCode7 = (((((iHashCode6 + (c0pl2 == null ? 0 : c0pl2.hashCode())) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        GlobalDoodleConfig globalDoodleConfig = this.LLJIJIL;
        return ((iHashCode7 + (globalDoodleConfig != null ? globalDoodleConfig.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLJILJIL);
    }

    public final String toString() {
        return "UpdateSearchItemAction(implId=" + this.LL + ", originType=" + this.LLILLJJLI + ", enterFrom=" + this.LLILLL + ", rankInList=" + this.LLILZ + ", isInMixSearch=" + this.LLILZIL + ", docId=" + this.LLILZLL + ", universalRank=" + this.LLIZ + ", insertType=" + this.LLIZLLLIL + ", mixFeedId=" + this.LLJ + ", isInNullifyCardList=" + this.LLJI + ", globalDoodleConfig=" + this.LLJIJIL + ", startSearchTime=" + this.LLJILJIL + ')';
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C646380PWy.class), AFwS293S0000000_10.get$arr$(71));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C646380PWy(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, C0PL2 c0pl2, int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? "" : str, 0, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? -1 : num, (i2 & 16) != 0 ? Boolean.FALSE : bool, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? null : num2, (i2 & 128) == 0 ? c0pl2 : null, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? false : z, null, 0L);
    }

    public C646380PWy(String str, int i, String str2, Integer num, Boolean bool, String str3, Integer num2, C0PL2 c0pl2, int i2, boolean z, GlobalDoodleConfig globalDoodleConfig, long j) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = bool;
        this.LLILZLL = str3;
        this.LLIZ = num2;
        this.LLIZLLLIL = c0pl2;
        this.LLJ = i2;
        this.LLJI = z;
        this.LLJIJIL = globalDoodleConfig;
        this.LLJILJIL = j;
    }
}
