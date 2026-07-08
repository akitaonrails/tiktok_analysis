package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7814033k extends AbstractC756202xM {
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final Integer LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7814033k)) {
            return false;
        }
        C7814033k c7814033k = (C7814033k) obj;
        return Intrinsics.LJFF(this.LLILZLL, c7814033k.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c7814033k.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c7814033k.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c7814033k.LLJ) && Intrinsics.LJFF(this.LLJI, c7814033k.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c7814033k.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c7814033k.LLJILJIL);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.LLJILJIL;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaOneStepAddNoteVO(sellerId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", addTitleText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", editTitleText=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", emptyText=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", panelTitle=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", btmIndex=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C7814033k) && Intrinsics.LJFF(((C7814033k) interfaceC1891350zJl).LLILZLL, this.LLILZLL)) {
            return true;
        }
        return false;
    }

    public C7814033k(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = num;
    }
}
