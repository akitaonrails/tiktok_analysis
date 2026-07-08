package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718420uoq implements InterfaceC111300bX {
    public final EnumC1717460unI LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final Boolean LLJI = null;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718420uoq)) {
            return false;
        }
        C1718420uoq c1718420uoq = (C1718420uoq) obj;
        return this.LL == c1718420uoq.LL && Intrinsics.LJFF(this.LLILLJJLI, c1718420uoq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718420uoq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1718420uoq.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1718420uoq.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718420uoq.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1718420uoq.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1718420uoq.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1718420uoq.LLJ) && Intrinsics.LJFF(this.LLJI, c1718420uoq.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1718420uoq.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        Boolean bool = this.LLJI;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "PinChangeData(pinSetMode=" + this.LL + ", previousPageId=" + this.LLILLJJLI + ", host=" + this.LLILLL + ", sessionId=" + this.LLILZ + ", productCode=" + this.LLILZIL + ", eventParam=" + this.LLILZLL + ", merchantId=" + this.LLIZ + ", merchantUserId=" + this.LLIZLLLIL + ", enterFrom=" + this.LLJ + ", disableHintMsg=" + this.LLJI + ", theme=" + this.LLJIJIL + ')';
    }

    public C1718420uoq(EnumC1717460unI enumC1717460unI, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.LL = enumC1717460unI;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJIJIL = str9;
    }
}
