package Y;

import X.C1177190gjt;
import X.C1C7U;
import X.C603820NmG;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS11S1000000_18 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1000000_18.LIZ$0():void");
    }

    public static final void run$0(ARunnableS11S1000000_18 aRunnableS11S1000000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RecreateMemoryStation@3ffb.saveModel$1");
        try {
            ((C603820NmG) C1177190gjt.LIZIZ.getValue()).LJ(aRunnableS11S1000000_18.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecreateMemoryStation@3ffb.saveModel$1");
    }

    public static final void run$1(ARunnableS11S1000000_18 aRunnableS11S1000000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiPublishTracker@8cf6.trackEntranceNotShowNew$1");
        try {
            aRunnableS11S1000000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiPublishTracker@8cf6.trackEntranceNotShowNew$1");
    }

    public ARunnableS11S1000000_18(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
