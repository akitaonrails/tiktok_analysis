package X;

import Y.AComparatorS50S0000000_31;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: X.166Q, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166Q {
    public static final AComparatorS50S0000000_31 LJFF = new AComparatorS50S0000000_31(7);
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final List<C166P> LIZJ;
    public final C166T[] LIZLLL;
    public final float[] LJ = new float[3];

    public static int LIZIZ(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C166Q(int[] iArr, int i, C166T[] c166tArr) {
        int i2;
        C166R c166r;
        int i3;
        int iMin;
        this.LIZLLL = c166tArr;
        int[] iArr2 = new int[32768];
        this.LIZIZ = iArr2;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            int iLIZIZ = LIZIZ(Color.blue(i5), 8, 5) | (LIZIZ(Color.red(i5), 8, 5) << 10) | (LIZIZ(Color.green(i5), 8, 5) << 5);
            iArr[i4] = iLIZIZ;
            iArr2[iLIZIZ] = iArr2[iLIZIZ] + 1;
        }
        int i6 = 0;
        int i7 = 0;
        do {
            if (iArr2[i6] > 0) {
                int iRgb = Color.rgb(LIZIZ((i6 >> 10) & 31, 5, 8), LIZIZ((i6 >> 5) & 31, 5, 8), LIZIZ(i6 & 31, 5, 8));
                C2441009hQ.LIZIZ(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), this.LJ);
                float[] fArr = this.LJ;
                C166T[] c166tArr2 = this.LIZLLL;
                if (c166tArr2 != null && c166tArr2.length > 0) {
                    int length = c166tArr2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        if (!this.LIZLLL[i8].LIZ(fArr)) {
                            iArr2[i6] = 0;
                            break;
                        }
                        i8++;
                    }
                }
            }
            i7 = iArr2[i6] > 0 ? i7 + 1 : i7;
            i6++;
        } while (i6 < 32768);
        int[] iArr3 = new int[i7];
        this.LIZ = iArr3;
        int i9 = 0;
        int i10 = 0;
        do {
            if (iArr2[i9] > 0) {
                iArr3[i10] = i9;
                i10++;
            }
            i9++;
        } while (i9 < 32768);
        if (i7 <= i) {
            this.LIZJ = new ArrayList();
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = iArr3[i11];
                ((ArrayList) this.LIZJ).add(new C166P(Color.rgb(LIZIZ((i12 >> 10) & 31, 5, 8), LIZIZ((i12 >> 5) & 31, 5, 8), LIZIZ(i12 & 31, 5, 8)), iArr2[i12]));
            }
            return;
        }
        PriorityQueue<C166R> priorityQueue = new PriorityQueue(i, LJFF);
        priorityQueue.offer(new C166R(this, 0, this.LIZ.length - 1));
        while (priorityQueue.size() < i && (c166r = (C166R) priorityQueue.poll()) != null) {
            int i13 = c166r.LIZIZ;
            int i14 = c166r.LIZ;
            if ((i13 + 1) - i14 <= 1) {
                break;
            }
            if ((i13 + 1) - i14 > 1) {
                int i15 = c166r.LJ - c166r.LIZLLL;
                int i16 = c166r.LJI - c166r.LJFF;
                int i17 = c166r.LJIIIIZZ - c166r.LJII;
                if (i15 >= i16 && i15 >= i17) {
                    i3 = -3;
                } else if (i16 >= i15 && i16 >= i17) {
                    i3 = -2;
                } else {
                    i3 = -1;
                }
                C166Q c166q = c166r.LJIIIZ;
                int[] iArr4 = c166q.LIZ;
                int[] iArr5 = c166q.LIZIZ;
                LIZ(i3, i14, i13, iArr4);
                Arrays.sort(iArr4, c166r.LIZ, c166r.LIZIZ + 1);
                LIZ(i3, c166r.LIZ, c166r.LIZIZ, iArr4);
                int i18 = c166r.LIZJ / 2;
                int i19 = c166r.LIZ;
                int i20 = 0;
                while (true) {
                    int i21 = c166r.LIZIZ;
                    if (i19 <= i21) {
                        i20 += iArr5[iArr4[i19]];
                        if (i20 >= i18) {
                            iMin = Math.min(i21 - 1, i19);
                            break;
                        }
                        i19++;
                    } else {
                        iMin = c166r.LIZ;
                        break;
                    }
                }
                C166R c166r2 = new C166R(c166r.LJIIIZ, iMin + 1, c166r.LIZIZ);
                c166r.LIZIZ = iMin;
                c166r.LIZ();
                priorityQueue.offer(c166r2);
                priorityQueue.offer(c166r);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (C166R c166r3 : priorityQueue) {
            C166Q c166q2 = c166r3.LJIIIZ;
            int[] iArr6 = c166q2.LIZ;
            int[] iArr7 = c166q2.LIZIZ;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = c166r3.LIZ; i26 <= c166r3.LIZIZ; i26++) {
                int i27 = iArr6[i26];
                int i28 = iArr7[i27];
                i23 += i28;
                i22 += ((i27 >> 10) & 31) * i28;
                i24 += ((i27 >> 5) & 31) * i28;
                i25 += i28 * (i27 & 31);
            }
            float f = i23;
            C166P c166p = new C166P(Color.rgb(LIZIZ(Math.round(i22 / f), 5, 8), LIZIZ(Math.round(i24 / f), 5, 8), LIZIZ(Math.round(i25 / f), 5, 8)), i23);
            float[] fArrLIZIZ = c166p.LIZIZ();
            C166T[] c166tArr3 = this.LIZLLL;
            if (c166tArr3 != null && c166tArr3.length > 0) {
                int length2 = c166tArr3.length;
                while (i2 < length2) {
                    i2 = this.LIZLLL[i2].LIZ(fArrLIZIZ) ? i2 + 1 : 0;
                }
            }
            arrayList.add(c166p);
        }
        this.LIZJ = arrayList;
    }

    public static void LIZ(int i, int i2, int i3, int[] iArr) {
        if (i != -2) {
            if (i != -1) {
                return;
            }
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                i2++;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            i2++;
        }
    }
}
