package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C723402s4 extends AbstractC756202xM {
    public final String LLILZLL;
    public final C798803Ac LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C723402s4)) {
            return false;
        }
        C723402s4 c723402s4 = (C723402s4) obj;
        return Intrinsics.LJFF(this.LLILZLL, c723402s4.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c723402s4.LLIZ);
    }

    public final int hashCode() {
        return (this.LLILZLL.hashCode() * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaOneStepGiftSkuVO(uniqueId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", giftSkuInfo=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C723402s4) && Intrinsics.LJFF(((C723402s4) interfaceC1891350zJl).LLILZLL, this.LLILZLL)) {
            return true;
        }
        return false;
    }

    public C723402s4(String str, C798803Ac c798803Ac) {
        this.LLILZLL = str;
        this.LLIZ = c798803Ac;
    }
}
