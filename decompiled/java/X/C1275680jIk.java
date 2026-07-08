package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275680jIk {
    public static InterfaceC1275670jIj LIZ(final int i, final int i2) {
        if (i2 > i && i2 >= 0 && i >= 0) {
            int i3 = i2;
            while (i3 != 0) {
                int i4 = i % i3;
                i = i3;
                i3 = i4;
            }
            final int iMin = Math.min(i2 / Math.min(Math.round(i2 * 0.19999999f), Math.max(500, i)), 100);
            final int i5 = i2 / iMin;
            return new InterfaceC1275670jIj(iMin, i5) { // from class: X.0jIl
                public final int LIZ;
                public final int LIZIZ;
                public final ArrayList<C1275710jIn> LIZJ = new ArrayList<>();

                @Override // X.InterfaceC1275670jIj
                public final float LIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i6 = 0;
                    float f = 0.0f;
                    for (C1275710jIn c1275710jIn : this.LIZJ) {
                        if (c1275710jIn.LIZJ >= jCurrentTimeMillis) {
                            break;
                        }
                        f += c1275710jIn.LIZIZ;
                        i6 += c1275710jIn.LIZ;
                    }
                    if (i6 <= 0) {
                        return Float.NaN;
                    }
                    return f / i6;
                }

                {
                    this.LIZ = 7500;
                    this.LIZIZ = 4;
                    if (iMin > 0) {
                        this.LIZIZ = iMin;
                    }
                    this.LIZ = i5;
                }

                @Override // X.InterfaceC1275670jIj
                public final void LIZIZ(int i6, long j) {
                    if (this.LIZJ.isEmpty()) {
                        this.LIZJ.add(new C1275710jIn(j, i6));
                        return;
                    }
                    for (C1275710jIn c1275710jIn : this.LIZJ) {
                        long j2 = c1275710jIn.LIZJ;
                        if (j < j2) {
                            return;
                        }
                        if (j - j2 < this.LIZ) {
                            c1275710jIn.LIZIZ += i6;
                            c1275710jIn.LIZ++;
                            return;
                        }
                    }
                    if (this.LIZJ.size() >= this.LIZIZ) {
                        ListProtector.remove(this.LIZJ, 0);
                    }
                    this.LIZJ.add(new C1275710jIn(j, i6));
                }
            };
        }
        return new InterfaceC1275670jIj(i2, i) { // from class: X.0jIm
            public float LIZ;
            public int LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public long LJ = System.currentTimeMillis();

            @Override // X.InterfaceC1275670jIj
            public final float LIZ() {
                this.LJ = System.currentTimeMillis();
                int i6 = this.LIZIZ;
                if (i6 <= 0) {
                    return Float.NaN;
                }
                float f = this.LIZ / i6;
                this.LIZ = 0.0f;
                this.LIZIZ = 0;
                return f;
            }

            {
                this.LIZJ = 15000;
                this.LIZLLL = 15000;
                if (i > 0) {
                    this.LIZLLL = i;
                    this.LIZJ = Math.min(i2, i);
                }
            }

            @Override // X.InterfaceC1275670jIj
            public final void LIZIZ(int i6, long j) {
                if (j - this.LJ >= this.LIZLLL - this.LIZJ) {
                    this.LIZ += i6;
                    this.LIZIZ++;
                } else {
                    this.LIZ = i6;
                    this.LIZIZ = 1;
                }
            }
        };
    }
}
