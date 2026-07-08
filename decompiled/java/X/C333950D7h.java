package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333950D7h<T> extends AbstractC333960D7i<T> {
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C333950D7h) && Intrinsics.LJFF(this.LIZIZ, ((C333950D7h) obj).LIZIZ);
    }

    public final int hashCode() {
        T t = this.LIZIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C333950D7h(CheckoutSession checkoutSession) {
        this.LIZIZ = checkoutSession;
    }
}
