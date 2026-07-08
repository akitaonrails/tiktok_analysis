package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332860D3c implements Serializable {
    public final String code;
    public final String description;
    public final String id;
    public final boolean isClaimed;
    public final boolean isExpanded;
    public final String title;
    public final Integer type;

    public final C332860D3c copy(String str, String str2, String str3, String str4, Integer num, boolean z, boolean z2) {
        return new C332860D3c(str, str2, str3, str4, num, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332860D3c)) {
            return false;
        }
        C332860D3c c332860D3c = (C332860D3c) obj;
        return Intrinsics.LJFF(this.id, c332860D3c.id) && Intrinsics.LJFF(this.code, c332860D3c.code) && Intrinsics.LJFF(this.title, c332860D3c.title) && Intrinsics.LJFF(this.description, c332860D3c.description) && Intrinsics.LJFF(this.type, c332860D3c.type) && this.isClaimed == c332860D3c.isClaimed && this.isExpanded == c332860D3c.isExpanded;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.code.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Integer num = this.type;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isClaimed)) * 31) + C786410Ut5.Z2(this.isExpanded);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpCouponState(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isClaimed=");
        sbLIZ.append(this.isClaimed);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.isExpanded);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isClaimed() {
        return this.isClaimed;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public C332860D3c(String str, String str2, String str3, String str4, Integer num, boolean z, boolean z2) {
        this.id = str;
        this.code = str2;
        this.title = str3;
        this.description = str4;
        this.type = num;
        this.isClaimed = z;
        this.isExpanded = z2;
    }
}
