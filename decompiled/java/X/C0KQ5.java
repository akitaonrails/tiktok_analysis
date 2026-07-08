package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQ5 implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KQ5)) {
            return false;
        }
        C0KQ5 c0kq5 = (C0KQ5) obj;
        return Intrinsics.LJFF(this.LL, c0kq5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0kq5.LLILLJJLI) && this.LLILLL == c0kq5.LLILLL && this.LLILZ == c0kq5.LLILZ && this.LLILZIL == c0kq5.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0kq5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0kq5.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0kq5.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0kq5.LLJ) && Intrinsics.LJFF(this.LLJI, c0kq5.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0kq5.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0kq5.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0kq5.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0kq5.LLJILLL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode();
    }

    public final String toString() {
        return "CalendlyMeetingDmSource(title=" + this.LL + ", userName=" + this.LLILLJJLI + ", duration=" + this.LLILLL + ", startTimestamp=" + this.LLILZ + ", endTimestamp=" + this.LLILZIL + ", contactNumber=" + this.LLILZLL + ", email=" + this.LLIZ + ", eventId=" + this.LLIZLLLIL + ", fromUserId=" + this.LLJ + ", toUserId=" + this.LLJI + ", userType=" + this.LLJIJIL + ", skuId=" + this.LLJILJIL + ", eventTemplateId=" + this.LLJILJILJ + ", showEntrance=" + this.LLJILLL + ')';
    }

    public C0KQ5(String str, String str2, long j, long j2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
        this.LLJILLL = str11;
    }
}
