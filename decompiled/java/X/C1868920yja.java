package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868920yja {
    public final Integer LIZ;
    public final ECMixMallGradientColor LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868920yja)) {
            return false;
        }
        C1868920yja c1868920yja = (C1868920yja) obj;
        return Intrinsics.LJFF(this.LIZ, c1868920yja.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868920yja.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ECMixMallGradientColor eCMixMallGradientColor = this.LIZIZ;
        return iHashCode + (eCMixMallGradientColor != null ? eCMixMallGradientColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallDynamicStyleBackgroundVisual(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gradient=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868920yja(ECMixMallGradientColor eCMixMallGradientColor, Integer num) {
        this.LIZ = num;
        this.LIZIZ = eCMixMallGradientColor;
    }
}
