package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19929012yG implements InterfaceC19361110or {
    public final AbstractC19928912yF LIZ;

    public C19929012yG(AbstractC19928912yF abstractC19928912yF) {
        C19922012x8.LIZ(abstractC19928912yF, "output");
        this.LIZ = abstractC19928912yF;
        abstractC19928912yF.LIZ = this;
    }

    public final void LIZLLL(int i) {
        this.LIZ.LJJIJIIJIL(i, 4);
    }

    public final void LJIJI(int i) {
        this.LIZ.LJJIJIIJIL(i, 3);
    }

    public final void LIZ(int i, boolean z) {
        this.LIZ.LJIIZILJ(i, z);
    }

    public final void LIZIZ(int i, AbstractC19922812xG abstractC19922812xG) {
        this.LIZ.LJIJI(i, abstractC19922812xG);
    }

    public final void LIZJ(double d, int i) {
        AbstractC19928912yF abstractC19928912yF = this.LIZ;
        abstractC19928912yF.getClass();
        abstractC19928912yF.LJJ(i, Double.doubleToRawLongBits(d));
    }

    public final void LJ(int i, int i2) {
        this.LIZ.LJIJJLI(i, i2);
    }

    public final void LJI(int i, long j) {
        this.LIZ.LJJ(i, j);
    }

    public final void LJIIIIZZ(float f, int i) {
        AbstractC19928912yF abstractC19928912yF = this.LIZ;
        abstractC19928912yF.getClass();
        abstractC19928912yF.LJIJJLI(i, Float.floatToRawIntBits(f));
    }

    public final void LJIIJ(int i, int i2) {
        this.LIZ.LJJII(i, i2);
    }

    public final void LJIIJJI(int i, long j) {
        this.LIZ.LJJIJLIJ(i, j);
    }

    public final void LJIILJJIL(int i, Object obj) {
        if (obj instanceof AbstractC19922812xG) {
            this.LIZ.LJJIIZI(i, (AbstractC19922812xG) obj);
        } else {
            this.LIZ.LJJIIZ(i, (InterfaceC19925612xi) obj);
        }
    }

    public final void LJIILL(int i, int i2) {
        this.LIZ.LJIJJLI(i, i2);
    }

    public final void LJIILLIIL(int i, long j) {
        this.LIZ.LJJ(i, j);
    }

    public final void LJIIZILJ(int i, int i2) {
        this.LIZ.LJJIJIL(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void LJIJ(int i, long j) {
        this.LIZ.LJJIJLIJ(i, (j >> 63) ^ (j << 1));
    }

    public final void LJIJJ(int i, int i2) {
        this.LIZ.LJJIJIL(i, i2);
    }

    public final void LJIJJLI(int i, long j) {
        this.LIZ.LJJIJLIJ(i, j);
    }

    public final void LJFF(int i, boolean z, List list) {
        int i2 = 0;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            if (z) {
                this.LIZ.LJJIJIIJIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < c19889012ro.LLILLL; i4++) {
                    c19889012ro.getInt(i4);
                    Logger logger = AbstractC19928912yF.LIZIZ;
                    i3 += 4;
                }
                this.LIZ.LJJIJL(i3);
                while (i2 < c19889012ro.LLILLL) {
                    this.LIZ.LJIL(c19889012ro.getInt(i2));
                    i2++;
                }
                return;
            }
            while (i2 < c19889012ro.LLILLL) {
                this.LIZ.LJIJJLI(i, c19889012ro.getInt(i2));
                i2++;
            }
            return;
        }
        if (z) {
            this.LIZ.LJJIJIIJIL(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) ListProtector.get(list, i6)).intValue();
                Logger logger2 = AbstractC19928912yF.LIZIZ;
                i5 += 4;
            }
            this.LIZ.LJJIJL(i5);
            while (i2 < list.size()) {
                this.LIZ.LJIL(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.LIZ.LJIJJLI(i, ((Integer) ListProtector.get(list, i2)).intValue());
            i2++;
        }
    }

    public final void LJII(int i, boolean z, List list) {
        int i2 = 0;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            if (z) {
                this.LIZ.LJJIJIIJIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < c19888812rm.LLILLL; i4++) {
                    c19888812rm.getLong(i4);
                    Logger logger = AbstractC19928912yF.LIZIZ;
                    i3 += 8;
                }
                this.LIZ.LJJIJL(i3);
                while (i2 < c19888812rm.LLILLL) {
                    this.LIZ.LJJI(c19888812rm.getLong(i2));
                    i2++;
                }
                return;
            }
            while (i2 < c19888812rm.LLILLL) {
                this.LIZ.LJJ(i, c19888812rm.getLong(i2));
                i2++;
            }
            return;
        }
        if (z) {
            this.LIZ.LJJIJIIJIL(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) ListProtector.get(list, i6)).longValue();
                Logger logger2 = AbstractC19928912yF.LIZIZ;
                i5 += 8;
            }
            this.LIZ.LJJIJL(i5);
            while (i2 < list.size()) {
                this.LIZ.LJJI(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.LIZ.LJJ(i, ((Long) ListProtector.get(list, i2)).longValue());
            i2++;
        }
    }

    public final void LJIIIZ(int i, InterfaceC19924912xb interfaceC19924912xb, Object obj) {
        this.LIZ.LJJIJIIJIL(i, 3);
        interfaceC19924912xb.LJ(obj, this);
        this.LIZ.LJJIJIIJIL(i, 4);
    }

    public final void LJIIL(int i, boolean z, List list) {
        int i2 = 0;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            if (z) {
                this.LIZ.LJJIJIIJIL(i, 2);
                int iLJIILJJIL = 0;
                for (int i3 = 0; i3 < c19888812rm.LLILLL; i3++) {
                    iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19888812rm.getLong(i3));
                }
                this.LIZ.LJJIJL(iLJIILJJIL);
                while (i2 < c19888812rm.LLILLL) {
                    this.LIZ.LJJIL(c19888812rm.getLong(i2));
                    i2++;
                }
                return;
            }
            while (i2 < c19888812rm.LLILLL) {
                this.LIZ.LJJIJLIJ(i, c19888812rm.getLong(i2));
                i2++;
            }
            return;
        }
        if (z) {
            this.LIZ.LJJIJIIJIL(i, 2);
            int iLJIILJJIL2 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iLJIILJJIL2 += AbstractC19928912yF.LJIILJJIL(((Long) ListProtector.get(list, i4)).longValue());
            }
            this.LIZ.LJJIJL(iLJIILJJIL2);
            while (i2 < list.size()) {
                this.LIZ.LJJIL(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.LIZ.LJJIJLIJ(i, ((Long) ListProtector.get(list, i2)).longValue());
            i2++;
        }
    }

    public final void LJIILIIL(int i, InterfaceC19924912xb interfaceC19924912xb, Object obj) {
        AbstractC19924812xa abstractC19924812xa = (AbstractC19924812xa) obj;
        this.LIZ.LJJIJIIJIL(i, 2);
        this.LIZ.LJJIJL(abstractC19924812xa.getSerializedSize(interfaceC19924912xb));
        interfaceC19924912xb.LJ(abstractC19924812xa, this);
    }
}
