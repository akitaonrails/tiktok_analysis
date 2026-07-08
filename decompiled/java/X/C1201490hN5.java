package X;

import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0hN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201490hN5 {
    public final GradientDrawable.Orientation LIZ;
    public final int[] LIZIZ;
    public final float[] LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GradientWithBraces(orientation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colors=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", positions=");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1201490hN5(GradientDrawable.Orientation orientation, int[] iArr, float[] fArr) {
        this.LIZ = orientation;
        this.LIZIZ = iArr;
        this.LIZJ = fArr;
    }
}
