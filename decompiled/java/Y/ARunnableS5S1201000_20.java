package Y;

import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272300jDI;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC1272120jD0;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.LynxEngineProxy;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS5S1201000_20 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1272090jCx) this.l2).isValid()) {
            int iComposerRemoveNodes = ((C1272090jCx) this.l2).LLJJIJIIJIL.composerRemoveNodes((String[]) this.l1, this.i3);
            C1272090jCx c1272090jCx = (C1272090jCx) this.l2;
            c1272090jCx.LLLLLIL = "";
            if (iComposerRemoveNodes != 0) {
                c1272090jCx.LLJZIJLIL.onError(iComposerRemoveNodes, this.s0);
            }
            C1272090jCx c1272090jCx2 = (C1272090jCx) this.l2;
            if (c1272090jCx2.LLLLJ || !c1272090jCx2.LLLILZLLLI) {
                return;
            }
            C786410Ut5.LJJZZIII(c1272090jCx2.LLILZLL, new ARunnableS120S0100000_20(c1272090jCx2, 170));
        }
    }

    public static final void run$0(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxEngineProxy@d809.invokeLepusApiCallback$1");
        try {
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) aRunnableS5S1201000_20.l2;
            long j = lynxEngineProxy.LIZ;
            if (j == 0) {
                LynxLog.e("LynxEngineProxy", "invokeLepusApiCallback failed since mNativePtr is null");
            } else {
                lynxEngineProxy.nativeInvokeLepusApiCallback(j, aRunnableS5S1201000_20.i3, aRunnableS5S1201000_20.s0, aRunnableS5S1201000_20.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxEngineProxy@d809.invokeLepusApiCallback$1");
    }

    public static final void run$1(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        boolean zLIZ;
        int iComposerSetNodes;
        C1C7U.LIZ("FilterManager@d45d.composerSetNodes$1");
        try {
            if (((C1272090jCx) aRunnableS5S1201000_20.l2).isValid() && (iComposerSetNodes = ((C1272090jCx) aRunnableS5S1201000_20.l2).LLJJIJIIJIL.composerSetNodes((String[]) aRunnableS5S1201000_20.l1, aRunnableS5S1201000_20.i3)) != 0) {
                ((C1272090jCx) aRunnableS5S1201000_20.l2).LLJZIJLIL.onError(iComposerSetNodes, aRunnableS5S1201000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerSetNodes$1");
    }

    public static final void run$2(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        boolean zLIZ;
        int iComposerAppendNodes;
        C1C7U.LIZ("FilterManager@d45d.composerAppendNodes$1");
        try {
            if (((C1272090jCx) aRunnableS5S1201000_20.l2).isValid() && (iComposerAppendNodes = ((C1272090jCx) aRunnableS5S1201000_20.l2).LLJJIJIIJIL.composerAppendNodes((String[]) aRunnableS5S1201000_20.l1, aRunnableS5S1201000_20.i3)) != 0) {
                ((C1272090jCx) aRunnableS5S1201000_20.l2).LLJZIJLIL.onError(iComposerAppendNodes, aRunnableS5S1201000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerAppendNodes$1");
    }

    public static final void run$3(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.composerRemoveNodes$1");
        try {
            aRunnableS5S1201000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerRemoveNodes$1");
    }

    public static final void run$4(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        int iComposerAppendNodes;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS5S1201000_20.l1;
        String[] strArr = (String[]) aRunnableS5S1201000_20.l2;
        int i = aRunnableS5S1201000_20.i3;
        String str = aRunnableS5S1201000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerAppendNodes$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerAppendNodes = interfaceC1272120jD0.composerAppendNodes(strArr, i);
                if (iComposerAppendNodes != 0) {
                }
            } else {
                iComposerAppendNodes = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerAppendNodes, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerAppendNodes$1L");
    }

    public static final void run$5(ARunnableS5S1201000_20 aRunnableS5S1201000_20) {
        int iComposerSetNodes;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS5S1201000_20.l1;
        String[] strArr = (String[]) aRunnableS5S1201000_20.l2;
        int i = aRunnableS5S1201000_20.i3;
        String str = aRunnableS5S1201000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerSetNodes$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerSetNodes = interfaceC1272120jD0.composerSetNodes(strArr, i);
                if (iComposerSetNodes != 0) {
                }
            } else {
                iComposerSetNodes = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerSetNodes, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerSetNodes$1L");
    }

    public ARunnableS5S1201000_20(C1272090jCx c1272090jCx, String[] strArr, String str, int i) {
        this.$t = i;
        this.l2 = c1272090jCx;
        this.l1 = strArr;
        this.i3 = 1;
        this.s0 = str;
    }

    public ARunnableS5S1201000_20(C1272100jCy c1272100jCy, String[] strArr, String str, int i) {
        this.$t = i;
        this.l1 = c1272100jCy;
        this.l2 = strArr;
        this.i3 = 1;
        this.s0 = str;
    }

    public ARunnableS5S1201000_20(Object obj, int i, String str, Object obj2, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.i3 = i;
        this.s0 = str;
        this.l1 = obj2;
    }
}
