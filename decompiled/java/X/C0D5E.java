package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5E {
    public final Context LIZ;
    public final CheckoutIntent LIZIZ;
    public final C332710D2n LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5E)) {
            return false;
        }
        C0D5E c0d5e = (C0D5E) obj;
        return Intrinsics.LJFF(this.LIZ, c0d5e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d5e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d5e.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d5e.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutStartParams(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkoutIntent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entryContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5E(Context context, CheckoutIntent checkoutIntent, C332710D2n c332710D2n) {
        String str = checkoutIntent.source;
        str = str == null ? "" : str;
        this.LIZ = context;
        this.LIZIZ = checkoutIntent;
        this.LIZJ = c332710D2n;
        this.LIZLLL = str;
    }
}
