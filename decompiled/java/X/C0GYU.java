package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GYU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYU implements Serializable {
    public final Integer maskColor;
    public final Integer progressColor;
    public final Integer textColor;
    public final Integer trackColor;

    public C0GYU() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0GYU)) {
            return false;
        }
        C0GYU c0gyu = (C0GYU) obj;
        return Intrinsics.LJFF(this.maskColor, c0gyu.maskColor) && Intrinsics.LJFF(this.trackColor, c0gyu.trackColor) && Intrinsics.LJFF(this.progressColor, c0gyu.progressColor) && Intrinsics.LJFF(this.textColor, c0gyu.textColor);
    }

    public int hashCode() {
        Integer num = this.maskColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.trackColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.progressColor;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.textColor;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CircleLoadingViewConfig(maskColor=");
        sbLIZ.append(this.maskColor);
        sbLIZ.append(", trackColor=");
        sbLIZ.append(this.trackColor);
        sbLIZ.append(", progressColor=");
        sbLIZ.append(this.progressColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0GYU(Integer num, Integer num2, Integer num3, Integer num4) {
        this.maskColor = num;
        this.trackColor = num2;
        this.progressColor = num3;
        this.textColor = num4;
    }
}
