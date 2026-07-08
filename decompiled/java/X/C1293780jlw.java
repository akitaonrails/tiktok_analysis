package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293780jlw {
    public final List<C1294460jn2> LIZ;
    public PointF LIZIZ;
    public boolean LIZJ;

    public C1293780jlw() {
        this.LIZ = new ArrayList();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapeData{numCurves=");
        sbLIZ.append(((ArrayList) this.LIZ).size());
        sbLIZ.append("closed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(float f, float f2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new PointF();
        }
        this.LIZIZ.set(f, f2);
    }

    public C1293780jlw(PointF pointF, boolean z, List<C1294460jn2> list) {
        this.LIZIZ = pointF;
        this.LIZJ = z;
        this.LIZ = new ArrayList(list);
    }
}
