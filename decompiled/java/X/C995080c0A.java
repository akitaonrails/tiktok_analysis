package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0c0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995080c0A {
    public final List<C10KL> LIZ;
    public final float LIZIZ;

    public C995080c0A() {
        throw null;
    }

    public final float LIZ() {
        Iterator<C10KL> it2 = this.LIZ.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            d += (double) it2.next().LIZLLL;
        }
        return (float) d;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Line(");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("):[");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995080c0A(float f) {
        this.LIZ = new ArrayList();
        this.LIZIZ = f;
    }
}
