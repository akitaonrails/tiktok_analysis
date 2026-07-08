package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332800D2w implements Serializable {
    public final boolean availableForSale;
    public final boolean exists;
    public final String value;

    public final C332800D2w copy(String str, boolean z, boolean z2) {
        return new C332800D2w(str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332800D2w)) {
            return false;
        }
        C332800D2w c332800D2w = (C332800D2w) obj;
        return Intrinsics.LJFF(this.value, c332800D2w.value) && this.availableForSale == c332800D2w.availableForSale && this.exists == c332800D2w.exists;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + C786410Ut5.Z2(this.availableForSale)) * 31) + C786410Ut5.Z2(this.exists);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSkuOptionValueState(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", availableForSale=");
        sbLIZ.append(this.availableForSale);
        sbLIZ.append(", exists=");
        sbLIZ.append(this.exists);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332800D2w(String str, boolean z, boolean z2) {
        this.value = str;
        this.availableForSale = z;
        this.exists = z2;
    }
}
