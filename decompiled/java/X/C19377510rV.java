package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.10rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19377510rV extends C19377310rT<Integer> {
    public final int LIZJ;
    public final int LIZLLL;
    public int LJ;
    public int LJFF;

    public final void LIZJ() {
        ((ArrayList) this.LIZIZ).clear();
        this.LJ = 0;
        this.LJFF = 0;
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("largeCount = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lowerCount = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", size=");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        sbLIZ.append(", list=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(int i) {
        ((ArrayList) this.LIZIZ).add(Integer.valueOf(i));
        if (i > this.LIZLLL) {
            this.LJ++;
        } else {
            this.LJFF++;
        }
        if (((ArrayList) this.LIZIZ).size() > this.LIZJ) {
            if (((Number) ListProtector.get(this.LIZIZ, 0)).intValue() > this.LIZLLL) {
                this.LJ--;
            } else {
                this.LJFF--;
            }
            ListProtector.remove(this.LIZIZ, 0);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C19377510rV(int i, int i2) {
        super(i);
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
