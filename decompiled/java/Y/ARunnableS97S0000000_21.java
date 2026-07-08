package Y;

import X.C1360620lVk;
import X.C1C7U;
import X.C2211751BhN;
import X.C786410Ut5;
import X.EnumC1360550lVd;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS97S0000000_21 implements Runnable {
    public final int $t;

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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS97S0000000_21(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            if (r2 == 0) goto L9
            r0 = r1
        L5:
            r0.<init>()
            return
        L9:
            r0 = r1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS97S0000000_21.<init>(int):void");
    }

    public static final void run$0(ARunnableS97S0000000_21 aRunnableS97S0000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("InteractionFragment@9cfb.tabVisibleChange$1");
        try {
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractionFragment@9cfb.tabVisibleChange$1");
    }

    public static final void run$1(ARunnableS97S0000000_21 aRunnableS97S0000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("RepostFeedEntranceRepository@19c7.pollingRunnable$1");
        try {
            C1360620lVk.LIZIZ(EnumC1360550lVd.POOLING);
            C786410Ut5.LJLIIL(((Number) C1360620lVk.LJ.getValue()).longValue(), C1360620lVk.LIZLLL, aRunnableS97S0000000_21);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepostFeedEntranceRepository@19c7.pollingRunnable$1");
    }
}
