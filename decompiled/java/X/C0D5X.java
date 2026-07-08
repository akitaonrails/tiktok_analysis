package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5X implements Serializable {
    public final boolean changed;
    public final LinkedHashMap<String, String> selectedSkuOptions;
    public final String selectedVariantId;
    public final String sessionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5X)) {
            return false;
        }
        C0D5X c0d5x = (C0D5X) obj;
        return Intrinsics.LJFF(this.sessionId, c0d5x.sessionId) && Intrinsics.LJFF(this.selectedSkuOptions, c0d5x.selectedSkuOptions) && Intrinsics.LJFF(this.selectedVariantId, c0d5x.selectedVariantId) && this.changed == c0d5x.changed;
    }

    public int hashCode() {
        int iHashCode = ((this.sessionId.hashCode() * 31) + this.selectedSkuOptions.hashCode()) * 31;
        String str = this.selectedVariantId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.changed);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPayload(sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(", selectedSkuOptions=");
        sbLIZ.append(this.selectedSkuOptions);
        sbLIZ.append(", selectedVariantId=");
        sbLIZ.append(this.selectedVariantId);
        sbLIZ.append(", changed=");
        sbLIZ.append(this.changed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5X(String str, LinkedHashMap<String, String> linkedHashMap, String str2, boolean z) {
        this.sessionId = str;
        this.selectedSkuOptions = linkedHashMap;
        this.selectedVariantId = str2;
        this.changed = z;
    }
}
