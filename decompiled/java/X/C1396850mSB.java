package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0mSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396850mSB {
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public final C1384750m8f LJIIJJI;
    public final C1384800m8k LJIIL;
    public final ArrayList<AbstractC1384320m7y> LIZ = new ArrayList<>();
    public final CopyOnWriteArrayList<AbstractC1384320m7y> LIZIZ = new CopyOnWriteArrayList<>();
    public final ArrayList<AbstractC1384320m7y> LIZJ = new ArrayList<>();
    public final ArrayList<AbstractC1384320m7y> LIZLLL = new ArrayList<>();
    public final ArrayList<AbstractC1384320m7y> LJIIJ = new ArrayList<>();

    public final void LJ() {
        this.LJ = false;
        this.LIZ.clear();
        this.LJIIJ.clear();
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJFF = 0;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
    }

    public final List<AbstractC1384320m7y> LIZ() {
        if (!this.LJIIIZ) {
            return this.LIZ;
        }
        this.LJIIJ.clear();
        this.LJIIJ.addAll(this.LIZ);
        return this.LJIIJ;
    }

    public final List<AbstractC1384320m7y> LJFF() {
        this.LIZIZ.clear();
        if (this.LJ) {
            this.LIZIZ.addAll(this.LIZLLL);
            this.LIZLLL.clear();
            this.LIZIZ.addAll(this.LIZJ);
            this.LIZJ.clear();
        }
        List<AbstractC1384320m7y> listLIZ = LIZ();
        while (true) {
            int i = this.LJFF;
            if (i >= 0 && i < listLIZ.size()) {
                AbstractC1384320m7y abstractC1384320m7y = (AbstractC1384320m7y) ListProtector.get(listLIZ, this.LJFF);
                if (abstractC1384320m7y.LIZLLL > this.LJIIIIZZ) {
                    break;
                }
                if (C1384750m8f.LJIIL) {
                    this.LJIIL.LIZ(abstractC1384320m7y, this.LJIIJJI);
                }
                this.LIZIZ.add(abstractC1384320m7y);
                this.LJFF++;
            } else {
                break;
            }
        }
        return this.LIZIZ;
    }

    public final long LJI() {
        if (!this.LJ) {
            return this.LJIIIIZZ;
        }
        long jCurrentTimeMillis = (long) ((((System.currentTimeMillis() - this.LJII) * ((long) this.LJIIJJI.LIZLLL.LJ)) / 100.0f) + this.LJI);
        this.LJIIIIZZ = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    public final long LIZJ() {
        List<AbstractC1384320m7y> listLIZ = LIZ();
        if (listLIZ.size() <= 0) {
            return -1L;
        }
        int size = listLIZ.size();
        int i = this.LJFF;
        if (i < 0 || size <= i) {
            return -1L;
        }
        return ((AbstractC1384320m7y) ListProtector.get(listLIZ, i)).LIZLLL - this.LJIIIIZZ;
    }

    public final void LIZIZ(AbstractC1384320m7y abstractC1384320m7y) {
        if (this.LIZ.isEmpty()) {
            this.LIZ.add(abstractC1384320m7y);
            return;
        }
        int size = this.LIZ.size() - 1;
        for (int i = 0; i < size; i++) {
            if (abstractC1384320m7y.LIZLLL < ((AbstractC1384320m7y) ListProtector.get(this.LIZ, i)).LIZLLL) {
                ListProtector.add(this.LIZ, i, abstractC1384320m7y);
                return;
            }
            long j = ((AbstractC1384320m7y) ListProtector.get(this.LIZ, i)).LIZLLL;
            long j2 = abstractC1384320m7y.LIZLLL;
            if (j <= j2) {
                int i2 = i + 1;
                if (j2 < ((AbstractC1384320m7y) ListProtector.get(this.LIZ, i2)).LIZLLL) {
                    ListProtector.add(this.LIZ, i2, abstractC1384320m7y);
                    return;
                }
            }
        }
    }

    public final void LIZLLL(long j) {
        this.LJ = true;
        int i = 0;
        this.LJFF = 0;
        this.LJI = Math.max(0L, j);
        this.LJII = System.currentTimeMillis();
        this.LJIIIIZZ = this.LJI;
        Iterator<AbstractC1384320m7y> it2 = this.LIZ.iterator();
        while (it2.hasNext() && it2.next().LIZLLL < j) {
        }
        for (AbstractC1384320m7y abstractC1384320m7y : this.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                long j2 = abstractC1384320m7y.LIZLLL;
                if (j2 >= j) {
                    return;
                }
                this.LJIIJJI.LIZLLL.getClass();
                if (j2 < j - 0) {
                    this.LJFF = i2;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public C1396850mSB(C1384750m8f c1384750m8f, C1384800m8k c1384800m8k) {
        this.LJIIJJI = c1384750m8f;
        this.LJIIL = c1384800m8k;
    }
}
