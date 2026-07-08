package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21341918fZ {
    public final List<C21342118fb> LIZ;
    public final int[] LIZIZ;
    public final int[] LIZJ;
    public final AbstractC21342018fa LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public final int LIZ(int i) {
        if (i >= 0 && i < this.LJ) {
            int i2 = this.LIZIZ[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index out of bounds - passed position = ");
        sbLIZ.append(i);
        sbLIZ.append(", old list size = ");
        sbLIZ.append(this.LJ);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(final InterfaceC1891370zJn interfaceC1891370zJn) {
        C21341818fY c21341818fY;
        int i;
        if (interfaceC1891370zJn instanceof C21341818fY) {
            c21341818fY = (C21341818fY) interfaceC1891370zJn;
        } else {
            c21341818fY = new InterfaceC1891370zJn(interfaceC1891370zJn) { // from class: X.18fY
                public final InterfaceC1891370zJn LL;
                public int LLILLJJLI;
                public int LLILLL = -1;
                public int LLILZ = -1;
                public Object LLILZIL;

                public final void LIZ() {
                    int i2 = this.LLILLJJLI;
                    if (i2 == 0) {
                        return;
                    }
                    if (i2 == 1) {
                        this.LL.LJZL(this.LLILLL, this.LLILZ);
                    } else if (i2 == 2) {
                        this.LL.LLIZLLLIL(this.LLILLL, this.LLILZ);
                    } else if (i2 == 3) {
                        this.LL.LLJJJJJIL(this.LLILLL, this.LLILZ, this.LLILZIL);
                    }
                    this.LLILZIL = null;
                    this.LLILLJJLI = 0;
                }

                {
                    this.LL = interfaceC1891370zJn;
                }

                @Override // X.InterfaceC1891370zJn
                public final void LJZL(int i2, int i3) {
                    int i4;
                    if (this.LLILLJJLI == 1 && i2 >= (i4 = this.LLILLL)) {
                        int i5 = this.LLILZ;
                        if (i2 <= i4 + i5) {
                            this.LLILZ = i5 + i3;
                            this.LLILLL = Math.min(i2, i4);
                            return;
                        }
                    }
                    LIZ();
                    this.LLILLL = i2;
                    this.LLILZ = i3;
                    this.LLILLJJLI = 1;
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLI(int i2, int i3) {
                    LIZ();
                    this.LL.LLI(i2, i3);
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLIZLLLIL(int i2, int i3) {
                    int i4;
                    if (this.LLILLJJLI == 2 && (i4 = this.LLILLL) >= i2 && i4 <= i2 + i3) {
                        this.LLILZ += i3;
                        this.LLILLL = i2;
                    } else {
                        LIZ();
                        this.LLILLL = i2;
                        this.LLILZ = i3;
                        this.LLILLJJLI = 2;
                    }
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLJJJJJIL(int i2, int i3, Object obj) {
                    int i4;
                    if (this.LLILLJJLI == 3) {
                        int i5 = this.LLILLL;
                        int i6 = this.LLILZ;
                        if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.LLILZIL == obj) {
                            this.LLILLL = Math.min(i2, i5);
                            this.LLILZ = Math.max(i6 + i5, i4) - this.LLILLL;
                            return;
                        }
                    }
                    LIZ();
                    this.LLILLL = i2;
                    this.LLILZ = i3;
                    this.LLILZIL = obj;
                    this.LLILLJJLI = 3;
                }
            };
        }
        int i2 = this.LJ;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.LJ;
        int i4 = this.LJFF;
        for (int size = this.LIZ.size() - 1; size >= 0; size--) {
            C21342118fb c21342118fb = (C21342118fb) ListProtector.get(this.LIZ, size);
            int i5 = c21342118fb.LIZ;
            int i6 = c21342118fb.LIZJ;
            int i7 = i5 + i6;
            int i8 = c21342118fb.LIZIZ + i6;
            while (true) {
                if (i3 <= i7) {
                    break;
                }
                i3--;
                int i9 = this.LIZIZ[i3];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    C21342218fc c21342218fcLIZLLL = LIZLLL(arrayDeque, i10, false);
                    if (c21342218fcLIZLLL != null) {
                        int i11 = (i2 - c21342218fcLIZLLL.LIZIZ) - 1;
                        c21341818fY.LLI(i3, i11);
                        if ((i9 & 4) != 0) {
                            c21341818fY.LLJJJJJIL(i11, 1, this.LIZLLL.LIZJ(i3, i10));
                        }
                    } else {
                        arrayDeque.add(new C21342218fc(i3, (i2 - i3) - 1, true));
                    }
                } else {
                    c21341818fY.LLIZLLLIL(i3, 1);
                    i2--;
                }
            }
            while (i4 > i8) {
                i4--;
                int i12 = this.LIZJ[i4];
                if ((i12 & 12) != 0) {
                    int i13 = i12 >> 4;
                    C21342218fc c21342218fcLIZLLL2 = LIZLLL(arrayDeque, i13, true);
                    if (c21342218fcLIZLLL2 == null) {
                        arrayDeque.add(new C21342218fc(i4, i2 - i3, false));
                    } else {
                        c21341818fY.LLI((i2 - c21342218fcLIZLLL2.LIZIZ) - 1, i3);
                        if ((i12 & 4) != 0) {
                            c21341818fY.LLJJJJJIL(i3, 1, this.LIZLLL.LIZJ(i13, i4));
                        }
                    }
                } else {
                    c21341818fY.LJZL(i3, 1);
                    i2++;
                }
            }
            int i14 = c21342118fb.LIZ;
            int i15 = c21342118fb.LIZIZ;
            for (i = 0; i < c21342118fb.LIZJ; i++) {
                if ((this.LIZIZ[i14] & 15) == 2) {
                    c21341818fY.LLJJJJJIL(i14, 1, this.LIZLLL.LIZJ(i14, i15));
                }
                i14++;
                i15++;
            }
            i3 = c21342118fb.LIZ;
            i4 = c21342118fb.LIZIZ;
        }
        c21341818fY.LIZ();
    }

    public final void LIZJ(AbstractC21673619ry abstractC21673619ry) {
        LIZIZ(new C2173021A2q(abstractC21673619ry));
    }

    public static C21342218fc LIZLLL(Collection<C21342218fc> collection, int i, boolean z) {
        C21342218fc c21342218fc;
        Iterator it2 = ((ArrayDeque) collection).iterator();
        while (true) {
            if (it2.hasNext()) {
                c21342218fc = (C21342218fc) it2.next();
                if (c21342218fc.LIZ == i && c21342218fc.LIZJ == z) {
                    it2.remove();
                    break;
                }
            } else {
                c21342218fc = null;
                break;
            }
        }
        while (it2.hasNext()) {
            C21342218fc c21342218fc2 = (C21342218fc) it2.next();
            if (z) {
                c21342218fc2.LIZIZ--;
            } else {
                c21342218fc2.LIZIZ++;
            }
        }
        return c21342218fc;
    }

    public C21341918fZ(AbstractC21342018fa abstractC21342018fa, List<C21342118fb> list, int[] iArr, int[] iArr2, boolean z) {
        int i;
        C21342118fb c21342118fb;
        int i2;
        int i3;
        int i4;
        C21342118fb c21342118fb2;
        this.LIZ = list;
        this.LIZIZ = iArr;
        this.LIZJ = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.LIZLLL = abstractC21342018fa;
        int iLJ = abstractC21342018fa.LJ();
        this.LJ = iLJ;
        int iLIZLLL = abstractC21342018fa.LIZLLL();
        this.LJFF = iLIZLLL;
        this.LJI = z;
        ArrayList<C21342118fb> arrayList = (ArrayList) list;
        if (arrayList.isEmpty() || (c21342118fb2 = (C21342118fb) ListProtector.get(list, 0)) == null || c21342118fb2.LIZ != 0 || c21342118fb2.LIZIZ != 0) {
            ListProtector.add(list, 0, new C21342118fb(0, 0, 0));
        }
        arrayList.add(new C21342118fb(iLJ, iLIZLLL, 0));
        for (C21342118fb c21342118fb3 : arrayList) {
            for (int i5 = 0; i5 < c21342118fb3.LIZJ; i5++) {
                int i6 = c21342118fb3.LIZ + i5;
                int i7 = c21342118fb3.LIZIZ + i5;
                if (this.LIZLLL.LIZ(i6, i7)) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                this.LIZIZ[i6] = (i7 << 4) | i4;
                this.LIZJ[i7] = (i6 << 4) | i4;
            }
        }
        if (this.LJI) {
            int i8 = 0;
            for (C21342118fb c21342118fb4 : this.LIZ) {
                while (true) {
                    i = c21342118fb4.LIZ;
                    if (i8 < i) {
                        if (this.LIZIZ[i8] == 0) {
                            int size = this.LIZ.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i9 < size) {
                                    c21342118fb = (C21342118fb) ListProtector.get(this.LIZ, i9);
                                    while (true) {
                                        i2 = c21342118fb.LIZIZ;
                                        if (i10 < i2) {
                                            if (this.LIZJ[i10] == 0 && this.LIZLLL.LIZIZ(i8, i10)) {
                                                if (this.LIZLLL.LIZ(i8, i10)) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 4;
                                                }
                                                this.LIZIZ[i8] = (i10 << 4) | i3;
                                                this.LIZJ[i10] = i3 | (i8 << 4);
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                                i10 = c21342118fb.LIZJ + i2;
                                i9++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = c21342118fb4.LIZJ + i;
            }
        }
    }
}
