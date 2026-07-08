package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031A extends AbstractC756202xM {
    public final C7768031q LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL = "payment_methods";
    public final String LLJ = "us_payment_methods_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031A)) {
            return false;
        }
        C031A c031a = (C031A) obj;
        return Intrinsics.LJFF(this.LLILZLL, c031a.LLILZLL) && this.LLIZ == c031a.LLIZ;
    }

    public final int hashCode() {
        return (this.LLILZLL.hashCode() * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPaymentInfoListVO(paymentInfoListVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isInExpressCheckout=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJ;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C031A.class, interfaceC1891350zJl.getClass());
    }

    public C031A(C7768031q c7768031q, boolean z) {
        this.LLILZLL = c7768031q;
        this.LLIZ = z;
    }
}
