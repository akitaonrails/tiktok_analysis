package X;

import android.graphics.RectF;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450860nrI {
    public Pair<Float, Float> LIZ;
    public final RectF LIZIZ = new RectF();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1450860nrI.class.getSimpleName());
        sbLIZ.append('#');
        sbLIZ.append(hashCode());
        sbLIZ.append(",videoRectSize:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",dstRect:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
