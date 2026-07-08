package X;

import android.graphics.Matrix;
import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0jkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292790jkL implements InterfaceC1292610jk3, InterfaceC1292600jk2 {
    public final Path LIZ = new Path();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final List<InterfaceC1292610jk3> LIZLLL = new ArrayList();
    public final C1292800jkM LJ;

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        this.LIZJ.reset();
        int i = C1292810jkN.LIZ[this.LJ.LIZIZ.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < ((ArrayList) this.LIZLLL).size(); i2++) {
                this.LIZJ.addPath(((InterfaceC1292610jk3) ListProtector.get(this.LIZLLL, i2)).getPath());
            }
        } else if (i == 2) {
            LIZJ(Path.Op.UNION);
        } else if (i == 3) {
            LIZJ(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            LIZJ(Path.Op.INTERSECT);
        } else if (i == 5) {
            LIZJ(Path.Op.XOR);
        }
        return this.LIZJ;
    }

    public C1292790jkL(C1292800jkM c1292800jkM) {
        this.LJ = c1292800jkM;
    }

    @Override // X.InterfaceC1292600jk2
    public final void LIZIZ(ListIterator<InterfaceC1291780jii> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC1291780jii interfaceC1291780jiiPrevious = listIterator.previous();
            if (interfaceC1291780jiiPrevious instanceof InterfaceC1292610jk3) {
                ((ArrayList) this.LIZLLL).add(interfaceC1291780jiiPrevious);
                listIterator.remove();
            }
        }
    }

    public final void LIZJ(Path.Op op) {
        Matrix matrixLIZLLL;
        Matrix matrixLIZLLL2;
        this.LIZIZ.reset();
        this.LIZ.reset();
        for (int size = ((ArrayList) this.LIZLLL).size() - 1; size >= 1; size--) {
            InterfaceC1292610jk3 interfaceC1292610jk3 = (InterfaceC1292610jk3) ListProtector.get(this.LIZLLL, size);
            if (interfaceC1292610jk3 instanceof C1292570jjz) {
                C1292570jjz c1292570jjz = (C1292570jjz) interfaceC1292610jk3;
                List<InterfaceC1292610jk3> listLIZIZ = c1292570jjz.LIZIZ();
                for (int size2 = listLIZIZ.size() - 1; size2 >= 0; size2--) {
                    Path path = ((InterfaceC1292610jk3) ListProtector.get(listLIZIZ, size2)).getPath();
                    C1292730jkF c1292730jkF = c1292570jjz.LJII;
                    if (c1292730jkF != null) {
                        matrixLIZLLL2 = c1292730jkF.LIZLLL();
                    } else {
                        c1292570jjz.LIZ.reset();
                        matrixLIZLLL2 = c1292570jjz.LIZ;
                    }
                    path.transform(matrixLIZLLL2);
                    this.LIZIZ.addPath(path);
                }
            } else {
                this.LIZIZ.addPath(interfaceC1292610jk3.getPath());
            }
        }
        InterfaceC1292610jk3 interfaceC1292610jk32 = (InterfaceC1292610jk3) ListProtector.get(this.LIZLLL, 0);
        if (interfaceC1292610jk32 instanceof C1292570jjz) {
            C1292570jjz c1292570jjz2 = (C1292570jjz) interfaceC1292610jk32;
            List<InterfaceC1292610jk3> listLIZIZ2 = c1292570jjz2.LIZIZ();
            for (int i = 0; i < listLIZIZ2.size(); i++) {
                Path path2 = ((InterfaceC1292610jk3) ListProtector.get(listLIZIZ2, i)).getPath();
                C1292730jkF c1292730jkF2 = c1292570jjz2.LJII;
                if (c1292730jkF2 != null) {
                    matrixLIZLLL = c1292730jkF2.LIZLLL();
                } else {
                    c1292570jjz2.LIZ.reset();
                    matrixLIZLLL = c1292570jjz2.LIZ;
                }
                path2.transform(matrixLIZLLL);
                this.LIZ.addPath(path2);
            }
        } else {
            this.LIZ.set(interfaceC1292610jk32.getPath());
        }
        this.LIZJ.op(this.LIZ, this.LIZIZ, op);
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
            ((InterfaceC1291780jii) ListProtector.get(this.LIZLLL, i)).LIZLLL(list, list2);
        }
    }
}
