package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1D1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249071D1d {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final List<Integer> LIZJ = new ArrayList();
    public final List<Integer> LIZLLL = new ArrayList();

    public final int LIZ(int i) {
        if (i < 0) {
            return i;
        }
        if (this.LIZ == -1) {
            this.LIZ = i;
        }
        if (((ArrayList) this.LIZJ).size() > 0) {
            i = ((Integer) ListProtector.get(this.LIZJ, ((ArrayList) r1).size() - 1)).intValue() + 1;
        }
        ((ArrayList) this.LIZJ).add(Integer.valueOf(i));
        return i;
    }

    public final int LIZIZ(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (i != 1) {
            if (i != 2 || i2 < (i4 = this.LIZIZ) || i4 == -1) {
                return i2;
            }
            while (i5 < ((ArrayList) this.LIZLLL).size()) {
                if (i2 == ((Integer) ListProtector.get(this.LIZLLL, i5)).intValue()) {
                    i3 = this.LIZIZ;
                    return i5 + i3;
                }
                i5++;
            }
            return i2;
        }
        int i6 = this.LIZ;
        if (i2 < i6 || i6 == -1) {
            return i2;
        }
        while (i5 < ((ArrayList) this.LIZJ).size()) {
            if (i2 == ((Integer) ListProtector.get(this.LIZJ, i5)).intValue()) {
                i3 = this.LIZ;
                return i5 + i3;
            }
            i5++;
        }
        return i2;
    }
}
