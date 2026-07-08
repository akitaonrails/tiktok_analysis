package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21622319jh {
    public final C21622219jg LIZ;
    public final List<C21622419ji> LIZIZ;

    public C21622319jh(C21622219jg c21622219jg) {
        this.LIZ = c21622219jg;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        arrayList.add(new C21622419ji(c21622219jg, new int[]{1}));
    }

    public final void LIZ(int i, int[] iArr) {
        C21622419ji c21622419ji;
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                char c = 0;
                int i2 = 1;
                if (i >= ((ArrayList) this.LIZIZ).size()) {
                    List<C21622419ji> list = this.LIZIZ;
                    C21622419ji c21622419ji2 = (C21622419ji) ListProtector.get(list, ((ArrayList) list).size() - 1);
                    int size = ((ArrayList) this.LIZIZ).size();
                    while (size <= i) {
                        C21622219jg c21622219jg = this.LIZ;
                        int[] iArr2 = new int[2];
                        iArr2[c] = i2;
                        iArr2[i2] = c21622219jg.LIZ[(size - 1) + c21622219jg.LJFF];
                        C21622419ji c21622419ji3 = new C21622419ji(c21622219jg, iArr2);
                        if (c21622419ji2.LIZ.equals(c21622219jg)) {
                            if (!c21622419ji2.LIZIZ() && !c21622419ji3.LIZIZ()) {
                                int[] iArr3 = c21622419ji2.LIZIZ;
                                int length2 = iArr3.length;
                                int[] iArr4 = c21622419ji3.LIZIZ;
                                int length3 = iArr4.length;
                                int[] iArr5 = new int[(length2 + length3) - 1];
                                for (int i3 = 0; i3 < length2; i3++) {
                                    int i4 = iArr3[i3];
                                    for (int i5 = 0; i5 < length3; i5++) {
                                        int i6 = i3 + i5;
                                        i4 = i4;
                                        iArr5[i6] = c21622419ji2.LIZ.LIZ(i4, iArr4[i5]) ^ iArr5[i6];
                                    }
                                }
                                c21622419ji2 = new C21622419ji(c21622419ji2.LIZ, iArr5);
                            } else {
                                c21622419ji2 = c21622419ji2.LIZ.LIZJ;
                            }
                            ((ArrayList) this.LIZIZ).add(c21622419ji2);
                            size++;
                            c = 0;
                            i2 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                C21622419ji c21622419ji4 = (C21622419ji) ListProtector.get(this.LIZIZ, i);
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                C21622419ji c21622419jiLIZJ = new C21622419ji(this.LIZ, iArr6).LIZJ(i, 1);
                if (c21622419jiLIZJ.LIZ.equals(c21622419ji4.LIZ)) {
                    if (!c21622419ji4.LIZIZ()) {
                        C21622219jg c21622219jg2 = c21622419jiLIZJ.LIZ;
                        C21622419ji c21622419jiLIZ = c21622219jg2.LIZJ;
                        if (c21622419ji4.LIZIZ[(r2.length - 1) - (r2.length - 1)] != 0) {
                            int i7 = c21622219jg2.LIZ[(c21622219jg2.LIZLLL - c21622219jg2.LIZIZ[r3]) - 1];
                            C21622419ji c21622419jiLIZ2 = c21622419jiLIZJ;
                            while (c21622419jiLIZ2.LIZIZ.length - 1 >= c21622419ji4.LIZIZ.length - 1 && !c21622419jiLIZ2.LIZIZ()) {
                                int length4 = (r3.length - 1) - (c21622419ji4.LIZIZ.length - 1);
                                int iLIZ = c21622419jiLIZJ.LIZ.LIZ(c21622419jiLIZ2.LIZIZ[(r3.length - 1) - (r3.length - 1)], i7);
                                C21622419ji c21622419jiLIZJ2 = c21622419ji4.LIZJ(length4, iLIZ);
                                C21622219jg c21622219jg3 = c21622419jiLIZJ.LIZ;
                                c21622219jg3.getClass();
                                if (length4 >= 0) {
                                    if (iLIZ == 0) {
                                        c21622419ji = c21622219jg3.LIZJ;
                                    } else {
                                        int[] iArr7 = new int[length4 + 1];
                                        iArr7[0] = iLIZ;
                                        c21622419ji = new C21622419ji(c21622219jg3, iArr7);
                                    }
                                    c21622419jiLIZ = c21622419jiLIZ.LIZ(c21622419ji);
                                    c21622419jiLIZ2 = c21622419jiLIZ2.LIZ(c21622419jiLIZJ2);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            int[] iArr8 = c21622419jiLIZ2.LIZIZ;
                            int length5 = i - iArr8.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                iArr[length + i8] = 0;
                            }
                            System.arraycopy(iArr8, 0, iArr, length + length5, iArr8.length);
                            return;
                        }
                        c21622219jg2.getClass();
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
