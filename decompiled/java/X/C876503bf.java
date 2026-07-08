package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876503bf {
    public final InterfaceC497601wk LIZ;
    public final ListPaymentMethodRequest LIZIZ;
    public final InterfaceC877803bs LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876503bf)) {
            return false;
        }
        C876503bf c876503bf = (C876503bf) obj;
        return Intrinsics.LJFF(this.LIZ, c876503bf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c876503bf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c876503bf.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemotePageContext(scope=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadingDialogCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C876503bf(InterfaceC497601wk interfaceC497601wk, ListPaymentMethodRequest listPaymentMethodRequest, InterfaceC877803bs interfaceC877803bs) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = listPaymentMethodRequest;
        this.LIZJ = interfaceC877803bs;
    }
}
