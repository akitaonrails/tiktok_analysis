package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293350jlF {
    public final List<C1293660jlk> LIZ;
    public PointF LIZIZ;
    public boolean LIZJ;

    public C1293350jlF() {
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

    public C1293350jlF(PointF pointF, boolean z, List<C1293660jlk> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = pointF;
        this.LIZJ = z;
        arrayList.addAll(list);
    }
}
