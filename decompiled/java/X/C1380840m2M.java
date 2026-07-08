package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380840m2M implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final HashMap<String, String> LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final long LLIZ;
    public final int LLIZLLLIL;
    public final Integer LLJ;
    public final String LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380840m2M)) {
            return false;
        }
        C1380840m2M c1380840m2M = (C1380840m2M) obj;
        return Intrinsics.LJFF(this.LL, c1380840m2M.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1380840m2M.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1380840m2M.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380840m2M.LLILZ) && this.LLILZIL == c1380840m2M.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1380840m2M.LLILZLL) && this.LLIZ == c1380840m2M.LLIZ && this.LLIZLLLIL == c1380840m2M.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1380840m2M.LLJ) && Intrinsics.LJFF(this.LLJI, c1380840m2M.LLJI) && this.LLJIJIL == c1380840m2M.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1380840m2M.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HashMap<String, String> map = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31;
        Integer num = this.LLJ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLJI;
        return ((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "DownloadChainConfigProperty(fromGroupID=" + this.LL + ", newsId=" + this.LLILLJJLI + ", inboxLogExtraMap=" + this.LLILLL + ", downloadActionType=" + this.LLILZ + ", downloadWithoutWatermark=" + this.LLILZIL + ", isDownloading=" + this.LLILZLL + ", duration=" + this.LLIZ + ", isSuccess=" + this.LLIZLLLIL + ", errorCode=" + this.LLJ + ", errorDesc=" + this.LLJI + ", status=" + this.LLJIJIL + ", sourceId=" + this.LLJILJIL + ')';
    }

    public C1380840m2M(String str, String str2, HashMap<String, String> map, String str3, boolean z, String str4, long j, int i, Integer num, String str5, int i2, String str6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = str4;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
        this.LLJ = num;
        this.LLJI = str5;
        this.LLJIJIL = i2;
        this.LLJILJIL = str6;
    }
}
