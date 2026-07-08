package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836920xty implements InterfaceC2753014t {
    public final long LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final Long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1836920xty)) {
            return false;
        }
        C1836920xty c1836920xty = (C1836920xty) obj;
        return this.LL == c1836920xty.LL && this.LLILLJJLI == c1836920xty.LLILLJJLI && this.LLILLL == c1836920xty.LLILLL && Intrinsics.LJFF(this.LLILZ, c1836920xty.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1836920xty.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1836920xty.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1836920xty.LLIZ) && this.LLIZLLLIL == c1836920xty.LLIZLLLIL && this.LLJ == c1836920xty.LLJ && this.LLJI == c1836920xty.LLJI && this.LLJIJIL == c1836920xty.LLJIJIL;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31;
        Long l = this.LLILZ;
        return ((((((((((((((iY2 + (l == null ? 0 : l.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL;
    }

    public final String toString() {
        return "PcsCourseDetailSource(courseId=" + this.LL + ", anchorID=" + this.LLILLJJLI + ", userID=" + this.LLILLL + ", roomID=" + this.LLILZ + ", secAnchorID=" + this.LLILZIL + ", enterFrom=" + this.LLILZLL + ", showEntrance=" + this.LLIZ + ", isFullScreenPage=" + this.LLIZLLLIL + ", hasPurchased=" + this.LLJ + ", isSingleSku=" + this.LLJI + ", fragmentHashCode=" + this.LLJIJIL + ')';
    }

    public C1836920xty(long j, long j2, long j3, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = l;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
        this.LLJIJIL = i;
    }
}
