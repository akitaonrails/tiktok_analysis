package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712720ufe implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712720ufe)) {
            return false;
        }
        C1712720ufe c1712720ufe = (C1712720ufe) obj;
        return Intrinsics.LJFF(this.LL, c1712720ufe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1712720ufe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712720ufe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712720ufe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1712720ufe.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefundOptionTagCellItem(textName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", darkTextColor=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", darkModeBackgroundColor=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1712720ufe)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1712720ufe) interfaceC1891350zJl).LL);
    }

    public C1712720ufe(String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }
}
