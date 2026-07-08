package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.10rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19377410rU extends C19377310rT<Long> {
    public final int LIZJ;
    public final long LIZLLL;
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
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(long j) {
        ((ArrayList) this.LIZIZ).add(Long.valueOf(j));
        if (j > this.LIZLLL) {
            this.LJ++;
        } else {
            this.LJFF++;
        }
        if (((ArrayList) this.LIZIZ).size() > this.LIZJ) {
            if (((Number) ListProtector.get(this.LIZIZ, 0)).longValue() > this.LIZLLL) {
                this.LJ--;
            } else {
                this.LJFF--;
            }
            ListProtector.remove(this.LIZIZ, 0);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C19377410rU(int i, long j) {
        super(i);
        this.LIZJ = i;
        this.LIZLLL = j;
    }
}
