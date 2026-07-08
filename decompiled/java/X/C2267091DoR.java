package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1DoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267091DoR extends C2267271Doj {
    public final C2267011DoJ LJJLIIJ;
    public final C2267021DoK LJJLIL;
    public int LJJLJ;
    public InterfaceC2267341Doq LJJLJLI;
    public final C21536919Qh LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public int LJL;
    public C2267261Doi[] LJLI;
    public C2267261Doi[] LJLIIIL;
    public int LJLIIL;
    public WeakReference<C2267141DoW> LJLIL;
    public WeakReference<C2267141DoW> LJLILLLLZI;
    public WeakReference<C2267141DoW> LJLJI;
    public WeakReference<C2267141DoW> LJLJJI;
    public final HashSet<C2267081DoQ> LJLJJL;
    public final C2267311Don LJLJJLL;

    /* JADX WARN: Removed duplicated region for block: B:283:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x077d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x07bd A[EDGE_INSN: B:511:0x07bd->B:418:0x07bd BREAK  A[LOOP:28: B:340:0x05b8->B:513:?], SYNTHETIC] */
    @Override // X.C2267271Doj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 2001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267091DoR.LJJIJIIJIL():void");
    }

    @Override // X.C2267271Doj, X.C2267081DoQ
    public final void LJJ() {
        this.LJJLL.LJIJI();
        this.LJJZ = 0;
        this.LJJZZI = 0;
        super.LJJ();
    }

    public C2267091DoR() {
        this.LJJLIIJ = new C2267011DoJ(this);
        this.LJJLIL = new C2267021DoK(this);
        this.LJJLJLI = null;
        this.LJJLL = new C21536919Qh();
        this.LJJZZIII = 0;
        this.LJL = 0;
        this.LJLI = new C2267261Doi[4];
        this.LJLIIIL = new C2267261Doi[4];
        this.LJLIIL = 257;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = new HashSet<>();
        this.LJLJJLL = new C2267311Don();
    }

    public C2267091DoR(int i) {
        super(0);
        this.LJJLIIJ = new C2267011DoJ(this);
        this.LJJLIL = new C2267021DoK(this);
        this.LJJLJLI = null;
        this.LJJLL = new C21536919Qh();
        this.LJJZZIII = 0;
        this.LJL = 0;
        this.LJLI = new C2267261Doi[4];
        this.LJLIIIL = new C2267261Doi[4];
        this.LJLIIL = 257;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = new HashSet<>();
        this.LJLJJLL = new C2267311Don();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJL(C21536919Qh c21536919Qh) {
        int i;
        boolean zLJJIL = LJJIL(64);
        LIZJ(c21536919Qh, zLJJIL);
        int size = this.LJJLIIIJLLLLLLLZ.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C2267081DoQ c2267081DoQ = (C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i2);
            boolean[] zArr = c2267081DoQ.LJJJIL;
            zArr[0] = false;
            zArr[1] = false;
            if (c2267081DoQ instanceof C2267181Doa) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C2267081DoQ c2267081DoQ2 = (C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i3);
                if (c2267081DoQ2 instanceof C2267181Doa) {
                    C2267181Doa c2267181Doa = (C2267181Doa) c2267081DoQ2;
                    for (int i4 = 0; i4 < c2267181Doa.LJJLIIJ; i4++) {
                        C2267081DoQ c2267081DoQ3 = c2267181Doa.LJJLIIIJLLLLLLLZ[i4];
                        if (c2267181Doa.LJJLIL || c2267081DoQ3.LIZLLL()) {
                            c2267181Doa.getClass();
                            c2267081DoQ3.LJJJIL[0] = true;
                        }
                    }
                }
            }
        }
        this.LJLJJL.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C2267081DoQ c2267081DoQ4 = (C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i5);
            c2267081DoQ4.getClass();
            if ((c2267081DoQ4 instanceof C2267391Dov) || (c2267081DoQ4 instanceof C2267171DoZ)) {
                if (c2267081DoQ4 instanceof C2267391Dov) {
                    this.LJLJJL.add(c2267081DoQ4);
                } else {
                    c2267081DoQ4.LIZJ(c21536919Qh, zLJJIL);
                }
            }
        }
        while (this.LJLJJL.size() > 0) {
            int size2 = this.LJLJJL.size();
            Iterator<C2267081DoQ> it2 = this.LJLJJL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C2267291Dol c2267291Dol = (C2267291Dol) it2.next();
                HashSet<C2267081DoQ> hashSet = this.LJLJJL;
                for (int i6 = 0; i6 < c2267291Dol.LJJLIIJ; i6++) {
                    if (hashSet.contains(c2267291Dol.LJJLIIIJLLLLLLLZ[i6])) {
                        c2267291Dol.LIZJ(c21536919Qh, zLJJIL);
                        this.LJLJJL.remove(c2267291Dol);
                        break;
                    }
                }
            }
            if (size2 == this.LJLJJL.size()) {
                Iterator<C2267081DoQ> it3 = this.LJLJJL.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ(c21536919Qh, zLJJIL);
                }
                this.LJLJJL.clear();
            }
        }
        if (C21536919Qh.LJIILL) {
            HashSet<C2267081DoQ> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = ListProtector.get(this.LJJLIIIJLLLLLLLZ, i7);
                obj.getClass();
                if (!(obj instanceof C2267391Dov) && !(obj instanceof C2267171DoZ)) {
                    hashSet2.add(obj);
                }
            }
            if (this.LJJJJ[0] == EnumC2266981DoG.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            LIZIZ(this, c21536919Qh, hashSet2, i, false);
            for (C2267081DoQ c2267081DoQ5 : hashSet2) {
                C2267231Dof.LIZ(this, c21536919Qh, c2267081DoQ5);
                c2267081DoQ5.LIZJ(c21536919Qh, zLJJIL);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C2267081DoQ c2267081DoQ6 = (C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i8);
                if (c2267081DoQ6 instanceof C2267091DoR) {
                    EnumC2266981DoG[] enumC2266981DoGArr = c2267081DoQ6.LJJJJ;
                    EnumC2266981DoG enumC2266981DoG = enumC2266981DoGArr[0];
                    EnumC2266981DoG enumC2266981DoG2 = enumC2266981DoGArr[1];
                    EnumC2266981DoG enumC2266981DoG3 = EnumC2266981DoG.WRAP_CONTENT;
                    if (enumC2266981DoG == enumC2266981DoG3) {
                        c2267081DoQ6.LJJIIJZLJL(EnumC2266981DoG.FIXED);
                    }
                    if (enumC2266981DoG2 == enumC2266981DoG3) {
                        c2267081DoQ6.LJJIIZ(EnumC2266981DoG.FIXED);
                    }
                    c2267081DoQ6.LIZJ(c21536919Qh, zLJJIL);
                    if (enumC2266981DoG == enumC2266981DoG3) {
                        c2267081DoQ6.LJJIIJZLJL(enumC2266981DoG);
                    }
                    if (enumC2266981DoG2 == enumC2266981DoG3) {
                        c2267081DoQ6.LJJIIZ(enumC2266981DoG2);
                    }
                } else {
                    C2267231Dof.LIZ(this, c21536919Qh, c2267081DoQ6);
                    if (!(c2267081DoQ6 instanceof C2267391Dov) && !(c2267081DoQ6 instanceof C2267171DoZ)) {
                        c2267081DoQ6.LIZJ(c21536919Qh, zLJJIL);
                    }
                }
            }
        }
        if (this.LJJZZIII > 0) {
            C2267151DoX.LIZ(this, c21536919Qh, null, 0);
        }
        if (this.LJL > 0) {
            C2267151DoX.LIZ(this, c21536919Qh, null, 1);
        }
    }

    public final boolean LJJIL(int i) {
        if ((this.LJLIIL & i) == i) {
            return true;
        }
        return false;
    }

    @Override // X.C2267081DoQ
    public final void LJJIJ(boolean z, boolean z2) {
        super.LJJIJ(z, z2);
        int size = this.LJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i)).LJJIJ(z, z2);
        }
    }

    public final void LJJIJIL(int i, C2267081DoQ c2267081DoQ) {
        if (i == 0) {
            int i2 = this.LJJZZIII + 1;
            C2267261Doi[] c2267261DoiArr = this.LJLIIIL;
            if (i2 >= c2267261DoiArr.length) {
                this.LJLIIIL = (C2267261Doi[]) Arrays.copyOf(c2267261DoiArr, c2267261DoiArr.length * 2);
            }
            C2267261Doi[] c2267261DoiArr2 = this.LJLIIIL;
            int i3 = this.LJJZZIII;
            c2267261DoiArr2[i3] = new C2267261Doi(c2267081DoQ, 0, false);
            this.LJJZZIII = i3 + 1;
            return;
        }
        if (i != 1) {
            return;
        }
        int i4 = this.LJL + 1;
        C2267261Doi[] c2267261DoiArr3 = this.LJLI;
        if (i4 >= c2267261DoiArr3.length) {
            this.LJLI = (C2267261Doi[]) Arrays.copyOf(c2267261DoiArr3, c2267261DoiArr3.length * 2);
        }
        C2267261Doi[] c2267261DoiArr4 = this.LJLI;
        int i5 = this.LJL;
        c2267261DoiArr4[i5] = new C2267261Doi(c2267081DoQ, 1, false);
        this.LJL = i5 + 1;
    }

    public static void LJJIJLIJ(C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq, C2267311Don c2267311Don) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (interfaceC2267341Doq == null) {
            return;
        }
        if (c2267081DoQ.LJJL != 8 && !(c2267081DoQ instanceof C2267171DoZ) && !(c2267081DoQ instanceof C2267181Doa)) {
            EnumC2266981DoG[] enumC2266981DoGArr = c2267081DoQ.LJJJJ;
            c2267311Don.LIZ = enumC2266981DoGArr[0];
            boolean z5 = true;
            c2267311Don.LIZIZ = enumC2266981DoGArr[1];
            c2267311Don.LIZJ = c2267081DoQ.LJIIJJI();
            c2267311Don.LIZLLL = c2267081DoQ.LJIIIIZZ();
            c2267311Don.LJIIIIZZ = false;
            c2267311Don.LJIIIZ = 0;
            EnumC2266981DoG enumC2266981DoG = c2267311Don.LIZ;
            EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT;
            if (enumC2266981DoG == enumC2266981DoG2) {
                z = true;
            } else {
                z = false;
            }
            if (c2267311Don.LIZIZ == enumC2266981DoG2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && c2267081DoQ.LJJJJJL > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c2267081DoQ.LJJJJJL > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && c2267081DoQ.LJIILJJIL(0) && c2267081DoQ.LJIJ == 0 && !z3) {
                c2267311Don.LIZ = EnumC2266981DoG.WRAP_CONTENT;
                if (z2 && c2267081DoQ.LJIJI == 0) {
                    c2267311Don.LIZ = EnumC2266981DoG.FIXED;
                }
                z = false;
            }
            if (z2 && c2267081DoQ.LJIILJJIL(1) && c2267081DoQ.LJIJI == 0 && !z4) {
                c2267311Don.LIZIZ = EnumC2266981DoG.WRAP_CONTENT;
                if (z && c2267081DoQ.LJIJ == 0) {
                    c2267311Don.LIZIZ = EnumC2266981DoG.FIXED;
                }
                z2 = false;
            }
            if (c2267081DoQ.LJIJJLI()) {
                c2267311Don.LIZ = EnumC2266981DoG.FIXED;
                z = false;
            }
            if (c2267081DoQ.LJIL()) {
                c2267311Don.LIZIZ = EnumC2266981DoG.FIXED;
                z2 = false;
            }
            if (z3) {
                if (c2267081DoQ.LJIJJ[0] == 4) {
                    c2267311Don.LIZ = EnumC2266981DoG.FIXED;
                } else if (!z2) {
                    EnumC2266981DoG enumC2266981DoG3 = c2267311Don.LIZIZ;
                    EnumC2266981DoG enumC2266981DoG4 = EnumC2266981DoG.FIXED;
                    if (enumC2266981DoG3 == enumC2266981DoG4) {
                        i2 = c2267311Don.LIZLLL;
                    } else {
                        c2267311Don.LIZ = EnumC2266981DoG.WRAP_CONTENT;
                        interfaceC2267341Doq.LIZIZ(c2267081DoQ, c2267311Don);
                        i2 = c2267311Don.LJFF;
                    }
                    c2267311Don.LIZ = enumC2266981DoG4;
                    c2267311Don.LIZJ = (int) (c2267081DoQ.LJJJJJL * i2);
                }
            }
            if (z4) {
                if (c2267081DoQ.LJIJJ[1] == 4) {
                    c2267311Don.LIZIZ = EnumC2266981DoG.FIXED;
                } else if (!z) {
                    EnumC2266981DoG enumC2266981DoG5 = c2267311Don.LIZ;
                    EnumC2266981DoG enumC2266981DoG6 = EnumC2266981DoG.FIXED;
                    if (enumC2266981DoG5 == enumC2266981DoG6) {
                        i = c2267311Don.LIZJ;
                    } else {
                        c2267311Don.LIZIZ = EnumC2266981DoG.WRAP_CONTENT;
                        interfaceC2267341Doq.LIZIZ(c2267081DoQ, c2267311Don);
                        i = c2267311Don.LJ;
                    }
                    c2267311Don.LIZIZ = enumC2266981DoG6;
                    if (c2267081DoQ.LJJJJL == -1) {
                        c2267311Don.LIZLLL = (int) (i / c2267081DoQ.LJJJJJL);
                    } else {
                        c2267311Don.LIZLLL = (int) (c2267081DoQ.LJJJJJL * i);
                    }
                }
            }
            interfaceC2267341Doq.LIZIZ(c2267081DoQ, c2267311Don);
            c2267081DoQ.LJJIIZI(c2267311Don.LJ);
            c2267081DoQ.LJJIIJ(c2267311Don.LJFF);
            c2267081DoQ.LJJIIZI = c2267311Don.LJII;
            int i3 = c2267311Don.LJI;
            c2267081DoQ.LJJJJZ = i3;
            if (i3 <= 0) {
                z5 = false;
            }
            c2267081DoQ.LJJIIZI = z5;
            c2267311Don.LJIIIZ = 0;
            return;
        }
        c2267311Don.LJ = 0;
        c2267311Don.LJFF = 0;
    }
}
