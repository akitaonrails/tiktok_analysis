package X;

import android.os.Build;
import android.view.FrameMetrics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1BBW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BBW extends AbstractC2201091BCp<C1BBX> implements InterfaceC20485415Dw {
    public final C2092108Hn<Long, Integer> LJFF = new C2092108Hn<>(10);
    public final AtomicLong LJI = new AtomicLong(0);

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() {
        ((ArrayList) C20533215Wg.LJI).add(this);
    }

    @Override // X.AbstractC2201091BCp
    public final C1BBX LJIILIIL() {
        return new C1BBX();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.1BBX] */
    @Override // X.AbstractC2201091BCp
    public final C1BBX LJIILJJIL() {
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        return this.LIZIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILL() {
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJIJI) {
            return true;
        }
        return this instanceof C2200681BBa;
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Fluency;
    }

    @Override // X.InterfaceC20485415Dw
    public final void LJ(FrameMetrics frameMetrics) {
        int i;
        EnumC1006810cJ5 enumC1006810cJ5;
        if (frameMetrics == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        boolean z2 = false;
        if ((((((frameMetrics.getMetric(0) + frameMetrics.getMetric(1)) + frameMetrics.getMetric(2)) + frameMetrics.getMetric(3)) + frameMetrics.getMetric(4)) + frameMetrics.getMetric(5)) / ((long) 1000000) >= 48) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.LJI.get() > 2147483647L) {
            this.LJI.set(0L);
        }
        this.LJFF.put(Long.valueOf(this.LJI.incrementAndGet()), Integer.valueOf(i));
        Collection<Integer> collectionValues = this.LJFF.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        C1BBX c1bbx = new C1BBX();
        if (size >= 3) {
            z2 = true;
        }
        c1bbx.LIZIZ = z2;
        float f = size;
        C2200821BBo.LIZ.getClass();
        C1BBZ c1bbz = C2200821BBo.LJIILIIL;
        float f2 = 10;
        if (f > c1bbz.LIZ * f2) {
            enumC1006810cJ5 = EnumC1006810cJ5.Critical;
        } else if (f > c1bbz.LIZIZ * f2) {
            enumC1006810cJ5 = EnumC1006810cJ5.High;
        } else if (f > c1bbz.LIZJ * f2) {
            enumC1006810cJ5 = EnumC1006810cJ5.Medium;
        } else {
            enumC1006810cJ5 = EnumC1006810cJ5.Low;
        }
        c1bbx.LIZ = enumC1006810cJ5;
        c1bbx.LIZLLL = 10;
        c1bbx.LIZJ = size;
        LJJ(c1bbx);
    }

    @Override // X.AbstractC2201091BCp
    public final C1BBX LJIIJ(C1057250dcR c1057250dcR) {
        C1BBZ c1bbz;
        EnumC1006810cJ5 enumC1006810cJ5;
        C1BBX c1bbxLJIIIZ = LJIIIZ();
        if ((c1057250dcR instanceof C1BBZ) && (c1bbz = (C1BBZ) c1057250dcR) != null) {
            float f = c1bbxLJIIIZ.LIZJ;
            float f2 = c1bbz.LIZ;
            float f3 = c1bbxLJIIIZ.LIZLLL;
            if (f > f2 * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f > c1bbz.LIZIZ * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f > c1bbz.LIZJ * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1BBX c1bbx = new C1BBX();
            c1bbx.LIZ = enumC1006810cJ5;
            c1bbx.LIZIZ = c1bbxLJIIIZ.LIZIZ;
            c1bbx.LIZJ = c1bbxLJIIIZ.LIZJ;
            c1bbx.LIZLLL = c1bbxLJIIIZ.LIZLLL;
            return c1bbx;
        }
        return c1bbxLJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1BBX c1bbx, C1BBX c1bbx2) {
        C1BBX c1bbx3 = c1bbx;
        if (c1bbx3.LIZIZ == c1bbx2.LIZIZ && c1bbx3.LIZ == ((C1702170uOd) this.LIZIZ).LIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2201091BCp
    public final void LJJI(C2201121BCs<C1BBX> c2201121BCs, C1BBX c1bbx, C1057250dcR c1057250dcR) {
        C1BBZ c1bbz;
        EnumC1006810cJ5 enumC1006810cJ5;
        EnumC1006810cJ5 enumC1006810cJ52;
        C1BBX c1bbx2 = c1bbx;
        if ((c1057250dcR instanceof C1BBZ) && (c1bbz = (C1BBZ) c1057250dcR) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current cpuChangeListener has defined config level, critical: ");
            sbLIZ.append(c1bbz.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            float f = c1bbx2.LIZJ;
            float f2 = c1bbz.LIZ;
            float f3 = c1bbx2.LIZLLL;
            if (f > f2 * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f > c1bbz.LIZIZ * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f > c1bbz.LIZJ * f3) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1702170uOd c1702170uOd = c2201121BCs.LJ;
            C1BBX c1bbx3 = new C1BBX();
            c1bbx3.LIZ = enumC1006810cJ5;
            c1bbx3.LIZIZ = c1bbx2.LIZIZ;
            c1bbx3.LIZJ = c1bbx2.LIZJ;
            c1bbx3.LIZLLL = c1bbx2.LIZLLL;
            c2201121BCs.LJ = c1bbx3;
            if (c1702170uOd != null && (enumC1006810cJ52 = c1702170uOd.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                c2201121BCs.LIZ(c1702170uOd, c1bbx3);
            }
        }
    }
}
