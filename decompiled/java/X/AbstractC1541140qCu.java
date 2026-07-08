package X;

import X.InterfaceC1541240qD4;

/* JADX INFO: renamed from: X.0qCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1541140qCu<Output extends InterfaceC1541240qD4> implements InterfaceC1541260qD6 {
    public final C1540930qCZ LIZ;
    public volatile Long LIZIZ;
    public volatile Long LIZJ;
    public Long LIZLLL;
    public volatile Long LJ;
    public volatile int LJFF;

    public final boolean LJ() {
        Long l = this.LIZJ;
        if (l != null) {
            return System.currentTimeMillis() < l.longValue();
        }
        return true;
    }

    public AbstractC1541140qCu(C1540930qCZ c1540930qCZ) {
        this.LIZ = c1540930qCZ;
    }

    @Override // X.InterfaceC1541260qD6
    public boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return LIZ(c1540930qCZ);
    }

    public final int LIZLLL(long j) {
        double dExp;
        double dExp2;
        double dExp3;
        if (!LJ()) {
            return 0;
        }
        int i = this.LJFF;
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        double dLog = Math.log(((double) i) + 1.0d) / Math.log(101.0d);
        Long l = this.LJ;
        long j2 = 0;
        if (l != null) {
            long jLongValue = j - l.longValue();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            dExp = Math.exp((-jLongValue) / 180000.0d);
        } else {
            dExp = 0.2d;
        }
        Long l2 = this.LIZJ;
        if (l2 != null) {
            if (l2.longValue() - j <= 0) {
                dExp2 = 0.0d;
            } else {
                dExp2 = 1.0d - Math.exp((-r0) / 60000.0d);
            }
        } else {
            dExp2 = 0.6d;
        }
        Long l3 = this.LIZIZ;
        if (l3 != null) {
            long jLongValue2 = j - l3.longValue();
            if (jLongValue2 >= 0) {
                j2 = jLongValue2;
            }
            dExp3 = Math.exp((-j2) / 420000.0d);
        } else {
            dExp3 = 0.8d;
        }
        return C13LZ.LJ((int) (((dLog * 0.3d) + (dExp * 0.3d) + (dExp2 * 0.2d) + (dExp3 * 0.1d) + 0.05d) * ((double) 100000)), 0, 100000);
    }

    public final void LJFF(Long l) {
        long jLongValue;
        Long l2 = this.LIZJ;
        long j = Long.MAX_VALUE;
        if (l2 != null && l2.longValue() == Long.MAX_VALUE) {
            return;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LIZ.LJ.LIZLLL;
        }
        long jLongValue2 = 0;
        if (jLongValue <= 0) {
            Long lValueOf = this.LIZJ;
            if (lValueOf == null) {
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            this.LIZJ = lValueOf;
            return;
        }
        if (jLongValue == Long.MAX_VALUE) {
            this.LIZJ = Long.MAX_VALUE;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + jLongValue;
        if (jCurrentTimeMillis >= 0) {
            j = jCurrentTimeMillis;
        }
        Long l3 = this.LIZJ;
        if (l3 != null) {
            jLongValue2 = l3.longValue();
        }
        if (jLongValue2 >= j) {
            j = jLongValue2;
        }
        this.LIZJ = Long.valueOf(j);
    }
}
