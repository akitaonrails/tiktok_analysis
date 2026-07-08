package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712690ufb implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712690ufb)) {
            return false;
        }
        C1712690ufb c1712690ufb = (C1712690ufb) obj;
        return Intrinsics.LJFF(this.LL, c1712690ufb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1712690ufb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712690ufb.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712690ufb.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1712690ufb.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1712690ufb.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1712690ufb.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1712690ufb.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1712690ufb.LLJ) && Intrinsics.LJFF(this.LLJI, c1712690ufb.LLJI) && this.LLJIJIL == c1712690ufb.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1712690ufb.LLJILJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "RefundMethodCellItem(title=" + this.LL + ", suffixInfo=" + this.LLILLJJLI + ", invalidReason=" + this.LLILLL + ", iconUrl=" + this.LLILZ + ", darkModeIconUrl=" + this.LLILZIL + ", refundDecisionType=" + this.LLILZLL + ", originalPaymentMethodId=" + this.LLIZ + ", originalPaymentMethod=" + this.LLIZLLLIL + ", targetPaymentMethodId=" + this.LLJ + ", targetPaymentMethod=" + this.LLJI + ", methodRank=" + this.LLJIJIL + ", optionName=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1712690ufb)) {
            return false;
        }
        C1712690ufb c1712690ufb = (C1712690ufb) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1712690ufb.LL) || !Intrinsics.LJFF(this.LLILLJJLI, c1712690ufb.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1712690ufb.LLILLL) || !Intrinsics.LJFF(this.LLILZ, c1712690ufb.LLILZ) || !Intrinsics.LJFF(this.LLILZIL, c1712690ufb.LLILZIL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1712690ufb(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = str10;
        this.LLJIJIL = i;
        this.LLJILJIL = str11;
    }
}
