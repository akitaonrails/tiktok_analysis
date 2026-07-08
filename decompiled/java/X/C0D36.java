package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D36, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D36 implements Serializable {
    public final C0D37 returnSection;
    public final String sectionTitle;
    public final C332770D2t shippingSection;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D36)) {
            return false;
        }
        C0D36 c0d36 = (C0D36) obj;
        return Intrinsics.LJFF(this.sectionTitle, c0d36.sectionTitle) && Intrinsics.LJFF(this.shippingSection, c0d36.shippingSection) && Intrinsics.LJFF(this.returnSection, c0d36.returnSection);
    }

    public int hashCode() {
        int iHashCode = this.sectionTitle.hashCode() * 31;
        C332770D2t c332770D2t = this.shippingSection;
        int iHashCode2 = (iHashCode + (c332770D2t == null ? 0 : c332770D2t.hashCode())) * 31;
        C0D37 c0d37 = this.returnSection;
        return iHashCode2 + (c0d37 != null ? c0d37.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLogisticsState(sectionTitle=");
        sbLIZ.append(this.sectionTitle);
        sbLIZ.append(", shippingSection=");
        sbLIZ.append(this.shippingSection);
        sbLIZ.append(", returnSection=");
        sbLIZ.append(this.returnSection);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D36(String str, C332770D2t c332770D2t, C0D37 c0d37) {
        this.sectionTitle = str;
        this.shippingSection = c332770D2t;
        this.returnSection = c0d37;
    }
}
