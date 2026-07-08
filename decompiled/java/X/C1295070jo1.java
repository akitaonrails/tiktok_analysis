package X;

import android.graphics.Matrix;
import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0jo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295070jo1 implements InterfaceC1295830jpF, InterfaceC1295820jpE {
    public final Path LIZ = new Path();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final List<InterfaceC1295830jpF> LIZLLL = new ArrayList();
    public final C1294900jnk LJ;

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        this.LIZJ.reset();
        C1294900jnk c1294900jnk = this.LJ;
        if (c1294900jnk.LIZJ) {
            return this.LIZJ;
        }
        int i = C1295650jox.LIZ[c1294900jnk.LIZIZ.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < ((ArrayList) this.LIZLLL).size(); i2++) {
                this.LIZJ.addPath(((InterfaceC1295830jpF) ListProtector.get(this.LIZLLL, i2)).getPath());
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

    public C1295070jo1(C1294900jnk c1294900jnk) {
        this.LJ = c1294900jnk;
    }

    @Override // X.InterfaceC1295820jpE
    public final void LIZIZ(ListIterator<InterfaceC1295810jpD> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC1295810jpD interfaceC1295810jpDPrevious = listIterator.previous();
            if (interfaceC1295810jpDPrevious instanceof InterfaceC1295830jpF) {
                ((ArrayList) this.LIZLLL).add(interfaceC1295810jpDPrevious);
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
            InterfaceC1295830jpF interfaceC1295830jpF = (InterfaceC1295830jpF) ListProtector.get(this.LIZLLL, size);
            if (interfaceC1295830jpF instanceof C1295040jny) {
                C1295040jny c1295040jny = (C1295040jny) interfaceC1295830jpF;
                List<InterfaceC1295830jpF> listLIZIZ = c1295040jny.LIZIZ();
                for (int size2 = listLIZIZ.size() - 1; size2 >= 0; size2--) {
                    Path path = ((InterfaceC1295830jpF) ListProtector.get(listLIZIZ, size2)).getPath();
                    C1295050jnz c1295050jnz = c1295040jny.LJIIJ;
                    if (c1295050jnz != null) {
                        matrixLIZLLL2 = c1295050jnz.LIZLLL();
                    } else {
                        c1295040jny.LIZJ.reset();
                        matrixLIZLLL2 = c1295040jny.LIZJ;
                    }
                    path.transform(matrixLIZLLL2);
                    this.LIZIZ.addPath(path);
                }
            } else {
                this.LIZIZ.addPath(interfaceC1295830jpF.getPath());
            }
        }
        InterfaceC1295830jpF interfaceC1295830jpF2 = (InterfaceC1295830jpF) ListProtector.get(this.LIZLLL, 0);
        if (interfaceC1295830jpF2 instanceof C1295040jny) {
            C1295040jny c1295040jny2 = (C1295040jny) interfaceC1295830jpF2;
            List<InterfaceC1295830jpF> listLIZIZ2 = c1295040jny2.LIZIZ();
            for (int i = 0; i < listLIZIZ2.size(); i++) {
                Path path2 = ((InterfaceC1295830jpF) ListProtector.get(listLIZIZ2, i)).getPath();
                C1295050jnz c1295050jnz2 = c1295040jny2.LJIIJ;
                if (c1295050jnz2 != null) {
                    matrixLIZLLL = c1295050jnz2.LIZLLL();
                } else {
                    c1295040jny2.LIZJ.reset();
                    matrixLIZLLL = c1295040jny2.LIZJ;
                }
                path2.transform(matrixLIZLLL);
                this.LIZ.addPath(path2);
            }
        } else {
            this.LIZ.set(interfaceC1295830jpF2.getPath());
        }
        this.LIZJ.op(this.LIZ, this.LIZIZ, op);
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
            ((InterfaceC1295810jpD) ListProtector.get(this.LIZLLL, i)).LIZLLL(list, list2);
        }
    }
}
