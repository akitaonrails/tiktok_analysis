package X;

import X.C830490Whz;
import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19806012eQ extends C19807912ej {
    public final C830490Whz LIZIZ;
    public final C830490Whz LIZJ;
    public long LIZLLL;

    public C19806012eQ(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZJ = new C830490Whz();
        this.LIZIZ = new C830490Whz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(long j) {
        C19811512fJ c19811512fJLJIIZILJ = LJIIIIZZ().LJIIZILJ(false);
        for (String str : (C830490Whz.c) this.LIZIZ.keySet()) {
            LJIILLIIL(str, j - ((Long) this.LIZIZ.get(str)).longValue(), c19811512fJLJIIZILJ);
        }
        if (!this.LIZIZ.isEmpty()) {
            LJIILL(j - this.LIZLLL, c19811512fJLJIIZILJ);
        }
        LJIIZILJ(j);
    }

    public final void LJIIZILJ(long j) {
        Iterator it2 = ((C830490Whz.c) this.LIZIZ.keySet()).iterator();
        while (it2.hasNext()) {
            this.LIZIZ.put(it2.next(), Long.valueOf(j));
        }
        if (!this.LIZIZ.isEmpty()) {
            this.LIZLLL = j;
        }
    }

    public final void LJIILIIL(final long j, final String str) {
        if (str != null && str.length() != 0) {
            LJIIL().LJIILL(new Runnable(this) { // from class: X.12ea
                public final /* synthetic */ C19806012eQ LLILLL;

                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() {
                    C19806012eQ c19806012eQ = this.LLILLL;
                    String str2 = str;
                    long j2 = j;
                    c19806012eQ.LJ();
                    C0W3J.LJI(str2);
                    if (c19806012eQ.LIZJ.isEmpty()) {
                        c19806012eQ.LIZLLL = j2;
                    }
                    Integer num = (Integer) c19806012eQ.LIZJ.get(str2);
                    if (num != null) {
                        c19806012eQ.LIZJ.put(str2, Integer.valueOf(num.intValue() + 1));
                        return;
                    }
                    C830490Whz c830490Whz = c19806012eQ.LIZJ;
                    if (c830490Whz.LLILLL >= 100) {
                        c19806012eQ.LJIILJJIL().LJIIIIZZ.LIZJ("Too many ads visible");
                    } else {
                        c830490Whz.put(str2, 1);
                        c19806012eQ.LIZIZ.put(str2, Long.valueOf(j2));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzc@9673.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzc@9673.run");
                }

                {
                    this.LLILLL = this;
                }
            });
        } else {
            LJIILJJIL().LJFF.LIZJ("Ad unit id must be a non-empty string");
        }
    }

    public final void LJIILL(long j, C19811512fJ c19811512fJ) {
        if (c19811512fJ == null) {
            LJIILJJIL().LJIILIIL.LIZJ("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        C19803112dx.LJJIJLIJ(c19811512fJ, bundle, true);
        LJII().LJJJIL("am", "_xa", bundle);
    }

    public final void LJIJI(final long j, final String str) {
        if (str != null && str.length() != 0) {
            LJIIL().LJIILL(new Runnable(this) { // from class: X.12eZ
                public final /* synthetic */ C19806012eQ LLILLL;

                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() {
                    C19806012eQ c19806012eQ = this.LLILLL;
                    String str2 = str;
                    long j2 = j;
                    c19806012eQ.LJ();
                    C0W3J.LJI(str2);
                    Integer num = (Integer) c19806012eQ.LIZJ.get(str2);
                    if (num == null) {
                        c19806012eQ.LJIILJJIL().LJFF.LIZ(str2, "Call to endAdUnitExposure for unknown ad unit id");
                        return;
                    }
                    C19811512fJ c19811512fJLJIIZILJ = c19806012eQ.LJIIIIZZ().LJIIZILJ(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        c19806012eQ.LIZJ.put(str2, Integer.valueOf(iIntValue));
                        return;
                    }
                    c19806012eQ.LIZJ.remove(str2);
                    Long l = (Long) c19806012eQ.LIZIZ.get(str2);
                    if (l == null) {
                        c19806012eQ.LJIILJJIL().LJFF.LIZJ("First ad unit exposure time was never set");
                    } else {
                        long jLongValue = j2 - l.longValue();
                        c19806012eQ.LIZIZ.remove(str2);
                        c19806012eQ.LJIILLIIL(str2, jLongValue, c19811512fJLJIIZILJ);
                    }
                    if (c19806012eQ.LIZJ.isEmpty()) {
                        long j3 = c19806012eQ.LIZLLL;
                        if (j3 == 0) {
                            c19806012eQ.LJIILJJIL().LJFF.LIZJ("First ad exposure time was never set");
                        } else {
                            c19806012eQ.LJIILL(j2 - j3, c19811512fJLJIIZILJ);
                            c19806012eQ.LIZLLL = 0L;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzb@9672.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzb@9672.run");
                }

                {
                    this.LLILLL = this;
                }
            });
        } else {
            LJIILJJIL().LJFF.LIZJ("Ad unit id must be a non-empty string");
        }
    }

    public final void LJIILLIIL(String str, long j, C19811512fJ c19811512fJ) {
        if (c19811512fJ == null) {
            LJIILJJIL().LJIILIIL.LIZJ("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("_ai", str, bundle);
        bundle.putLong("_xt", j);
        C19803112dx.LJJIJLIJ(c19811512fJ, bundle, true);
        LJII().LJJJIL("am", "_xu", bundle);
    }
}
