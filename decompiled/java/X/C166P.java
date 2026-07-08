package X;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: X.166P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166P {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public float[] LJIIIIZZ;

    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        int iLJIIIZ = C2441009hQ.LJIIIZ(4.5f, -1, this.LIZLLL);
        int iLJIIIZ2 = C2441009hQ.LJIIIZ(3.0f, -1, this.LIZLLL);
        if (iLJIIIZ != -1 && iLJIIIZ2 != -1) {
            this.LJII = C2441009hQ.LJIIL(-1, iLJIIIZ);
            this.LJI = C2441009hQ.LJIIL(-1, iLJIIIZ2);
            this.LJFF = true;
            return;
        }
        int iLJIIIZ3 = C2441009hQ.LJIIIZ(4.5f, -16777216, this.LIZLLL);
        int iLJIIIZ4 = C2441009hQ.LJIIIZ(3.0f, -16777216, this.LIZLLL);
        if (iLJIIIZ3 == -1 || iLJIIIZ4 == -1) {
            this.LJII = iLJIIIZ != -1 ? C2441009hQ.LJIIL(-1, iLJIIIZ) : C2441009hQ.LJIIL(-16777216, iLJIIIZ3);
            this.LJI = iLJIIIZ2 != -1 ? C2441009hQ.LJIIL(-1, iLJIIIZ2) : C2441009hQ.LJIIL(-16777216, iLJIIIZ4);
            this.LJFF = true;
        } else {
            this.LJII = C2441009hQ.LJIIL(-16777216, iLJIIIZ3);
            this.LJI = C2441009hQ.LJIIL(-16777216, iLJIIIZ4);
            this.LJFF = true;
        }
    }

    public final float[] LIZIZ() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new float[3];
        }
        C2441009hQ.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LJIIIIZZ);
        return this.LJIIIIZZ;
    }

    public final int hashCode() {
        return (this.LIZLLL * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C166P.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.LIZLLL));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(LIZIZ()));
        sb.append("] [Population: ");
        sb.append(this.LJ);
        sb.append("] [Title Text: #");
        LIZ();
        sb.append(Integer.toHexString(this.LJI));
        sb.append("] [Body Text: #");
        LIZ();
        sb.append(Integer.toHexString(this.LJII));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C166P.class != obj.getClass()) {
            return false;
        }
        C166P c166p = (C166P) obj;
        if (this.LJ == c166p.LJ && this.LIZLLL == c166p.LIZLLL) {
            return true;
        }
        return false;
    }

    public C166P(int i, int i2) {
        this.LIZ = Color.red(i);
        this.LIZIZ = Color.green(i);
        this.LIZJ = Color.blue(i);
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
