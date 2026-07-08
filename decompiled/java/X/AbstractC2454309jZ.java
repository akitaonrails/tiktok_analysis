package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.09jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2454309jZ implements InterfaceC345370DgN {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC345370DgN
    public String LIZ() {
        return null;
    }

    public abstract List<File> LJIIL();

    public abstract List<File> LJIILJJIL();

    @Override // X.InterfaceC345370DgN
    public final long LIZJ() {
        if (this.LIZ.get()) {
            return 0L;
        }
        LJFF(true);
        long jLJIILL = LJIILL(true);
        LJIILLIIL(jLJIILL, true);
        return jLJIILL;
    }

    @Override // X.InterfaceC345370DgN
    public final long LJI() {
        if (this.LIZ.get()) {
            return 0L;
        }
        LJFF(true);
        long jLJIIIZ = LJIIIZ(LJIILIIL(), true);
        LJIILLIIL(jLJIIIZ, true);
        return jLJIIIZ;
    }

    @Override // X.InterfaceC345370DgN
    public File LJIIIIZZ() {
        List<File> listLJIIL = LJIIL();
        if (!listLJIIL.isEmpty()) {
            return ((File) ListProtector.get(listLJIIL, 0)).getParentFile();
        }
        return null;
    }

    public List<File> LJIIJ() {
        return C2454209jY.LIZ(604800000L, LJIIL());
    }

    public List<File> LJIIJJI() {
        return C2454209jY.LIZ(0L, LJIIL());
    }

    public List<File> LJIILIIL() {
        return C2454209jY.LIZ(259200000L, LJIIL());
    }

    @Override // X.InterfaceC345370DgN
    public final long LIZIZ(boolean z) {
        if (this.LIZ.get()) {
            return 0L;
        }
        LJFF(true);
        long jLJIIIZ = LJIIIZ(LJIIJ(), z);
        LJIILLIIL(jLJIIIZ, true);
        return jLJIIIZ;
    }

    @Override // X.InterfaceC345370DgN
    public final long LJ(boolean z) {
        if (this.LIZ.get()) {
            return 0L;
        }
        LJFF(true);
        long jLJIIIZ = LJIIIZ(LJIIJJI(), z);
        LJIILLIIL(jLJIIIZ, true);
        return jLJIIIZ;
    }

    @Override // X.InterfaceC345370DgN
    public final void LJFF(boolean z) {
        this.LIZ.set(true);
    }

    @Override // X.InterfaceC345370DgN
    public final long LJII(boolean z) {
        if (this.LIZ.get()) {
            return 0L;
        }
        LJFF(true);
        long jLJIILL = LJIILL(z);
        LJIILLIIL(jLJIILL, true);
        return jLJIILL;
    }

    public long LJIILL(boolean z) {
        return LJIIIZ(LJIIJJI(), z);
    }

    public final long LJIIIZ(List<? extends File> list, boolean z) {
        List<File> listLJIILJJIL = LJIILJJIL();
        Iterator<? extends File> it2 = list.iterator();
        long jLIZIZ = 0;
        while (it2.hasNext()) {
            jLIZIZ += C2454209jY.LIZIZ(it2.next(), listLJIILJJIL, z);
        }
        return jLIZIZ;
    }

    public final void LJIILLIIL(long j, boolean z) {
        this.LIZ.set(false);
    }
}
