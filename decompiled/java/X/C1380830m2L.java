package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380830m2L implements InterfaceC2753014t {
    public final int LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380830m2L)) {
            return false;
        }
        C1380830m2L c1380830m2L = (C1380830m2L) obj;
        return this.LL == c1380830m2L.LL && Intrinsics.LJFF(this.LLILLJJLI, c1380830m2L.LLILLJJLI) && this.LLILLL == c1380830m2L.LLILLL && this.LLILZ == c1380830m2L.LLILZ && this.LLILZIL == c1380830m2L.LLILZIL && this.LLILZLL == c1380830m2L.LLILZLL && this.LLIZ == c1380830m2L.LLIZ && this.LLIZLLLIL == c1380830m2L.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1380830m2L.LLJ) && Intrinsics.LJFF(this.LLJI, c1380830m2L.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1380830m2L.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31;
        String str = this.LLJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJI;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "DownloadAbilityConfigProperty(isServerWatermark=" + this.LL + ", downloadUrl=" + this.LLILLJJLI + ", startDownload=" + this.LLILLL + ", endDownload=" + this.LLILZ + ", packageSize=" + this.LLILZIL + ", downloadResult=" + this.LLILZLL + ", retryFailed=" + this.LLIZ + ", retryCount=" + this.LLIZLLLIL + ", errorCode=" + this.LLJ + ", errorMsg=" + this.LLJI + ", sourceId=" + this.LLJIJIL + ')';
    }

    public C1380830m2L(int i, String str, long j, long j2, long j3, int i2, int i3, int i4, String str2, String str3, String str4) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
    }
}
