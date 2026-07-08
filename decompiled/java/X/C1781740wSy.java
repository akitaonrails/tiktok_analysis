package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781740wSy implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
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
        if (!(obj instanceof C1781740wSy)) {
            return false;
        }
        C1781740wSy c1781740wSy = (C1781740wSy) obj;
        return Intrinsics.LJFF(this.LL, c1781740wSy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1781740wSy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781740wSy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781740wSy.LLILZ) && this.LLILZIL == c1781740wSy.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1781740wSy.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1781740wSy.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1781740wSy.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1781740wSy.LLJ) && Intrinsics.LJFF(this.LLJI, c1781740wSy.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1781740wSy.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1781740wSy.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1781740wSy.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1781740wSy.LLJILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJILLL;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "SourceSheetUIItem(content=" + this.LL + ", imageUrl=" + this.LLILLJJLI + ", videoId=" + this.LLILLL + ", commentId=" + this.LLILZ + ", createTime=" + this.LLILZIL + ", schema=" + this.LLILZLL + ", type=" + this.LLIZ + ", conversationId=" + this.LLIZLLLIL + ", msgId=" + this.LLJ + ", enterFrom=" + this.LLJI + ", chatType=" + this.LLJIJIL + ", isSelf=" + this.LLJILJIL + ", replyMessageId=" + this.LLJILJILJ + ", toUserId=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1781740wSy(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = j;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = str12;
        this.LLJILLL = str13;
    }
}
