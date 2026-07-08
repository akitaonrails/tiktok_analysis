package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461000I5y implements InterfaceC1587906Jp {
    public final C460810I5f LL;
    public final C0I67 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461000I5y)) {
            return false;
        }
        C461000I5y c461000I5y = (C461000I5y) obj;
        return Intrinsics.LJFF(this.LL, c461000I5y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c461000I5y.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuoteAreaItem(quotedItemUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", storyReactionUIState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C461000I5y(C460810I5f c460810I5f, C0I67 c0i67) {
        this.LL = c460810I5f;
        this.LLILLJJLI = c0i67;
    }
}
