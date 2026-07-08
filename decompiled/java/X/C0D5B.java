package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5B {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5B)) {
            return false;
        }
        C0D5B c0d5b = (C0D5B) obj;
        return Intrinsics.LJFF(this.LIZ, c0d5b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d5b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d5b.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d5b.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d5b.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyCheckoutConfig(merchantDomain=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variantId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", agentProfileUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fraudHeaders=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5B(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
    }
}
