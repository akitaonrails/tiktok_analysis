package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7H {
    public static final C0D7H LJFF = new C0D7H(0);
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C0D7H() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D7H)) {
            return false;
        }
        C0D7H c0d7h = (C0D7H) obj;
        return Intrinsics.LJFF(this.LIZ, c0d7h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d7h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d7h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d7h.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d7h.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyCheckoutDefaults(instrumentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", instrumentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fulfillmentMethodType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultHandlerId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", defaultCredentialType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D7H(int i) {
        this.LIZ = "instrument_1";
        this.LIZIZ = "card";
        this.LIZJ = "shipping";
        this.LIZLLL = "shopify.card";
        this.LJ = "shopify_token";
    }
}
