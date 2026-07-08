package X;

import com.ss.android.vesdk.VEWaterMarkPosition;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0wTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781970wTL implements Serializable {
    public VEWaterMarkPosition position;
    public int xOffset;
    public int yOffset;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaterMarkPositionConfig{xOffset=");
        sbLIZ.append(this.xOffset);
        sbLIZ.append(", yOffset=");
        sbLIZ.append(this.yOffset);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
