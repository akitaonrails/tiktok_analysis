package Y;

import X.AbstractC985060bk0;
import X.C09JN;
import X.C1C7U;
import X.C951100arE;
import X.C985050bjz;

/* JADX INFO: loaded from: classes16.dex */
public class AfS5S0100200_15 implements C09JN {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS5S0100200_15 afS5S0100200_15, Object obj) {
        AbstractC985060bk0 abstractC985060bk0;
        AbstractC985060bk0 abstractC985060bk02;
        C1C7U.LIZ("CountDownTicker@dd82.startCountDown$1");
        Long l = (Long) obj;
        if (l != null && l.longValue() == 0 && (abstractC985060bk02 = ((C985050bjz) afS5S0100200_15.l0).LIZIZ) != null) {
            abstractC985060bk02.LIZ(l.longValue());
        }
        AbstractC985060bk0 abstractC985060bk03 = ((C985050bjz) afS5S0100200_15.l0).LIZIZ;
        if (abstractC985060bk03 != null) {
            abstractC985060bk03.LIZJ(afS5S0100200_15.j1 - l.longValue());
        }
        long j = afS5S0100200_15.j1 - afS5S0100200_15.j2;
        if (l != null && l.longValue() == j && (abstractC985060bk0 = ((C985050bjz) afS5S0100200_15.l0).LIZIZ) != null) {
            abstractC985060bk0.LIZIZ(l.longValue());
        }
        C1C7U.LIZIZ("CountDownTicker@dd82.startCountDown$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[PHI: r6
      0x011e: PHI (r6v1 java.util.ArrayList) = (r6v0 java.util.ArrayList), (r6v3 java.util.ArrayList) binds: [B:27:0x00c1, B:34:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS5S0100200_15 r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS5S0100200_15.accept$1(Y.AfS5S0100200_15, java.lang.Object):void");
    }

    public AfS5S0100200_15(C985050bjz c985050bjz, long j, int i) {
        this.$t = i;
        this.l0 = c985050bjz;
        this.j1 = j;
        this.j2 = 0L;
    }

    public AfS5S0100200_15(C951100arE c951100arE, long j, long j2, int i) {
        this.$t = i;
        this.l0 = c951100arE;
        this.j1 = j;
        this.j2 = j2;
    }
}
