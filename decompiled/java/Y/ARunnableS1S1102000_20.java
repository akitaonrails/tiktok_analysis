package Y;

import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272300jDI;
import X.C1C7U;
import X.InterfaceC1272120jD0;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S1102000_20 implements Runnable {
    public final int $t;
    public int i2 = 1;
    public int i3 = 0;
    public Object l1;
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

    public static final void run$0(ARunnableS1S1102000_20 aRunnableS1S1102000_20) {
        boolean zLIZ;
        int iComposerSetMode;
        C1C7U.LIZ("FilterManager@d45d.composerSetMode$1");
        try {
            if (((C1272090jCx) aRunnableS1S1102000_20.l1).isValid() && (iComposerSetMode = ((C1272090jCx) aRunnableS1S1102000_20.l1).LLJJIJIIJIL.composerSetMode(aRunnableS1S1102000_20.i2, aRunnableS1S1102000_20.i3)) != 0) {
                ((C1272090jCx) aRunnableS1S1102000_20.l1).LLJZIJLIL.onError(iComposerSetMode, aRunnableS1S1102000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerSetMode$1");
    }

    public static final void run$1(ARunnableS1S1102000_20 aRunnableS1S1102000_20) {
        int iComposerSetMode;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS1S1102000_20.l1;
        int i = aRunnableS1S1102000_20.i2;
        int i2 = aRunnableS1S1102000_20.i3;
        String str = aRunnableS1S1102000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerSetMode$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerSetMode = interfaceC1272120jD0.composerSetMode(i, i2);
                if (iComposerSetMode != 0) {
                }
            } else {
                iComposerSetMode = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerSetMode, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerSetMode$1L");
    }

    public ARunnableS1S1102000_20(C1272090jCx c1272090jCx, String str, int i) {
        this.$t = i;
        this.l1 = c1272090jCx;
        this.s0 = str;
    }

    public ARunnableS1S1102000_20(C1272100jCy c1272100jCy, String str, int i) {
        this.$t = i;
        this.l1 = c1272100jCy;
        this.s0 = str;
    }
}
