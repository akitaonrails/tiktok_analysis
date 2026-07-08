package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267011DoJ {
    public final ArrayList<C2267081DoQ> LIZ = new ArrayList<>();
    public final C2267311Don LIZIZ = new C2267311Don();
    public final C2267091DoR LIZJ;

    public C2267011DoJ(C2267091DoR c2267091DoR) {
        this.LIZJ = c2267091DoR;
    }

    public final void LIZJ(C2267091DoR c2267091DoR) {
        this.LIZ.clear();
        int size = c2267091DoR.LJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            C2267081DoQ c2267081DoQ = (C2267081DoQ) ListProtector.get(c2267091DoR.LJJLIIIJLLLLLLLZ, i);
            EnumC2266981DoG[] enumC2266981DoGArr = c2267081DoQ.LJJJJ;
            EnumC2266981DoG enumC2266981DoG = enumC2266981DoGArr[0];
            EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT;
            if (enumC2266981DoG == enumC2266981DoG2 || enumC2266981DoGArr[1] == enumC2266981DoG2) {
                this.LIZ.add(c2267081DoQ);
            }
        }
        c2267091DoR.LJJLIL.LIZIZ = true;
    }

    public final boolean LIZ(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C2267311Don c2267311Don = this.LIZIZ;
        EnumC2266981DoG[] enumC2266981DoGArr = c2267081DoQ.LJJJJ;
        c2267311Don.LIZ = enumC2266981DoGArr[0];
        boolean z5 = true;
        c2267311Don.LIZIZ = enumC2266981DoGArr[1];
        c2267311Don.LIZJ = c2267081DoQ.LJIIJJI();
        this.LIZIZ.LIZLLL = c2267081DoQ.LJIIIIZZ();
        C2267311Don c2267311Don2 = this.LIZIZ;
        c2267311Don2.LJIIIIZZ = false;
        c2267311Don2.LJIIIZ = i;
        EnumC2266981DoG enumC2266981DoG = c2267311Don2.LIZ;
        EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT;
        if (enumC2266981DoG == enumC2266981DoG2) {
            z = true;
        } else {
            z = false;
        }
        if (c2267311Don2.LIZIZ == enumC2266981DoG2) {
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
        if (z3 && c2267081DoQ.LJIJJ[0] == 4) {
            c2267311Don2.LIZ = EnumC2266981DoG.FIXED;
        }
        if (z4 && c2267081DoQ.LJIJJ[1] == 4) {
            c2267311Don2.LIZIZ = EnumC2266981DoG.FIXED;
        }
        interfaceC2267341Doq.LIZIZ(c2267081DoQ, c2267311Don2);
        c2267081DoQ.LJJIIZI(this.LIZIZ.LJ);
        c2267081DoQ.LJJIIJ(this.LIZIZ.LJFF);
        C2267311Don c2267311Don3 = this.LIZIZ;
        c2267081DoQ.LJJIIZI = c2267311Don3.LJII;
        int i2 = c2267311Don3.LJI;
        c2267081DoQ.LJJJJZ = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        c2267081DoQ.LJJIIZI = z5;
        c2267311Don3.LJIIIZ = 0;
        return c2267311Don3.LJIIIIZZ;
    }

    public final void LIZIZ(C2267091DoR c2267091DoR, int i, int i2, int i3) {
        int i4 = c2267091DoR.LJJJJZI;
        int i5 = c2267091DoR.LJJJLIIL;
        c2267091DoR.LJJJJZI = 0;
        c2267091DoR.LJJJLIIL = 0;
        c2267091DoR.LJJIIZI(i2);
        c2267091DoR.LJJIIJ(i3);
        if (i4 < 0) {
            c2267091DoR.LJJJJZI = 0;
        } else {
            c2267091DoR.LJJJJZI = i4;
        }
        if (i5 < 0) {
            c2267091DoR.LJJJLIIL = 0;
        } else {
            c2267091DoR.LJJJLIIL = i5;
        }
        C2267091DoR c2267091DoR2 = this.LIZJ;
        c2267091DoR2.LJJLJ = i;
        c2267091DoR2.LJJIJIIJIL();
    }
}
