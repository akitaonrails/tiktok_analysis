package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21339318f9 {
    public static final void LIZ(C21341918fZ c21341918fZ, InterfaceC1891370zJn interfaceC1891370zJn, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        c21341918fZ.LIZIZ(new InterfaceC1891370zJn() { // from class: X.18f8
            @Override // X.InterfaceC1891370zJn
            public final void LJZL(int i, int i2) {
                arrayList.add(new C21339418fA(1, i, i2, null));
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLI(int i, int i2) {
                throw new UnsupportedOperationException("Does not support move");
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLIZLLLIL(int i, int i2) {
                arrayList.add(new C21339418fA(2, i, i2, null));
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLJJJJJIL(int i, int i2, Object obj) {
                if (z) {
                    arrayList.add(new C21339418fA(3, i, i2, obj));
                }
            }
        });
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            C21339418fA c21339418fA = (C21339418fA) ListProtector.get(arrayList, size);
            int i = c21339418fA.LIZ;
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        interfaceC1891370zJn.LLJJJJJIL(c21339418fA.LIZIZ, c21339418fA.LIZJ, c21339418fA.LIZLLL);
                    }
                } else {
                    interfaceC1891370zJn.LLIZLLLIL(c21339418fA.LIZIZ, c21339418fA.LIZJ);
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        C21339418fA c21339418fA2 = (C21339418fA) ListProtector.get(arrayList, i2);
                        if (c21339418fA2 != c21339418fA) {
                            int i3 = c21339418fA.LIZIZ;
                            int i4 = c21339418fA2.LIZIZ;
                            if (i3 < i4) {
                                c21339418fA2.LIZIZ = i4 - c21339418fA.LIZJ;
                            }
                            i2++;
                        }
                    }
                }
            } else {
                interfaceC1891370zJn.LJZL(c21339418fA.LIZIZ, c21339418fA.LIZJ);
                int size3 = arrayList.size();
                while (i2 < size3) {
                    C21339418fA c21339418fA3 = (C21339418fA) ListProtector.get(arrayList, i2);
                    if (c21339418fA3 != c21339418fA) {
                        int i5 = c21339418fA.LIZIZ;
                        int i6 = c21339418fA3.LIZIZ;
                        if (i5 <= i6) {
                            c21339418fA3.LIZIZ = i6 + c21339418fA.LIZJ;
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
