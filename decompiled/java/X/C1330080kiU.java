package X;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0kiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1330080kiU<V> {
    public final int LIZ;
    public final int LIZIZ;
    public final Queue LIZJ;
    public final boolean LIZLLL;
    public int LJ;

    public V LIZIZ() {
        return (V) ((LinkedList) this.LIZJ).poll();
    }

    public void LIZ(V v) {
        ((LinkedList) this.LIZJ).add(v);
    }

    public final void LIZJ(V v) {
        v.getClass();
        boolean z = false;
        if (this.LIZLLL) {
            if (this.LJ > 0) {
                z = true;
            }
            C1322350kW1.LJFF(z);
            this.LJ--;
            LIZ(v);
            return;
        }
        int i = this.LJ;
        if (i > 0) {
            this.LJ = i - 1;
            LIZ(v);
        } else {
            C1328570kg3.LJII("BUCKET", "Tried to release value %s from an empty bucket!", v);
        }
    }

    public C1330080kiU(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LJFF(z2);
        C1322350kW1.LJFF(i3 >= 0);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = new LinkedList();
        this.LJ = i3;
        this.LIZLLL = false;
    }
}
