package Y;

import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272300jDI;
import X.C1301070jxh;
import X.C1301090jxj;
import X.C1311720kEs;
import X.C1311730kEt;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1272120jD0;
import X.InterfaceC1301080jxi;
import android.os.Build;
import android.os.Handler;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S1401000_20 implements Runnable {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load font success ");
        sbLIZ.append(this.s0);
        sbLIZ.append(this.i5);
        LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
        if (Build.VERSION.SDK_INT >= 28) {
            ((InterfaceC1301080jxi) this.l1).LIZIZ(((C1301070jxh) this.l2).LIZ(this.i5), this.i5);
            return;
        }
        C1301090jxj c1301090jxj = (C1301090jxj) this.l4;
        Handler handler = (Handler) this.l3;
        InterfaceC1301080jxi interfaceC1301080jxi = (InterfaceC1301080jxi) this.l1;
        C1301070jxh c1301070jxh = (C1301070jxh) this.l2;
        int i = this.i5;
        c1301090jxj.getClass();
        C1301090jxj.LJFF(handler, interfaceC1301080jxi, c1301070jxh, i);
    }

    public final void LIZ$1() {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UIOwner.AfterCreateAsyncViewRunnable.");
            sbLIZ.append(this.s0);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZIZ(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        LynxBaseUI[] lynxBaseUIArr = (LynxBaseUI[]) this.l1;
        lynxBaseUIArr[0] = ((C1311720kEs) this.l4).LIZ(lynxBaseUIArr[0], (UIShadowProxy) this.l2, (C1311730kEt) this.l3);
        ((C1311720kEs) this.l4).LJJIJ(this.s0);
        ((C1311720kEs) this.l4).LJJIJIIJIL(this.i5, this.s0, (C1311730kEt) this.l3);
        ((C1311720kEs) this.l4).LJI.put(Integer.valueOf(this.i5), ((LynxBaseUI[]) this.l1)[0]);
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    public final void LIZ$2() {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UIOwner.AfterCreateViewAsync.");
            sbLIZ.append(this.s0);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ((C1311720kEs) this.l4).LJJIJIIJI(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        LynxBaseUI[] lynxBaseUIArr = (LynxBaseUI[]) this.l1;
        lynxBaseUIArr[0] = ((C1311720kEs) this.l4).LIZ(lynxBaseUIArr[0], (UIShadowProxy) this.l2, (C1311730kEt) this.l3);
        ((C1311720kEs) this.l4).LJJIJ(this.s0);
        ((C1311720kEs) this.l4).LJJIJIIJIL(this.i5, this.s0, (C1311730kEt) this.l3);
        ((C1311720kEs) this.l4).LJI.put(Integer.valueOf(this.i5), ((LynxBaseUI[]) this.l1)[0]);
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    public static final void run$0(ARunnableS0S1401000_20 aRunnableS0S1401000_20) {
        boolean zLIZ;
        int iComposerUpdateMultipleNodes;
        C1C7U.LIZ("FilterManager@d45d.composerUpdateMultipleNodes$1");
        try {
            if (((C1272090jCx) aRunnableS0S1401000_20.l4).isValid() && (iComposerUpdateMultipleNodes = ((C1272090jCx) aRunnableS0S1401000_20.l4).LLJJIJIIJIL.composerUpdateMultipleNodes(aRunnableS0S1401000_20.i5, (String[]) aRunnableS0S1401000_20.l1, (String[]) aRunnableS0S1401000_20.l2, (float[]) aRunnableS0S1401000_20.l3)) != 0) {
                ((C1272090jCx) aRunnableS0S1401000_20.l4).LLJZIJLIL.onError(iComposerUpdateMultipleNodes, aRunnableS0S1401000_20.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerUpdateMultipleNodes$1");
    }

    public static final void run$1(ARunnableS0S1401000_20 aRunnableS0S1401000_20) {
        int iComposerUpdateMultipleNodes;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS0S1401000_20.l1;
        int i = aRunnableS0S1401000_20.i5;
        String[] strArr = (String[]) aRunnableS0S1401000_20.l2;
        String[] strArr2 = (String[]) aRunnableS0S1401000_20.l3;
        float[] fArr = (float[]) aRunnableS0S1401000_20.l4;
        String str = aRunnableS0S1401000_20.s0;
        C1C7U.LIZ("VideoEffectNode@5e69.composerUpdateMultipleNodes$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerUpdateMultipleNodes = interfaceC1272120jD0.composerUpdateMultipleNodes(i, strArr, strArr2, fArr);
                if (iComposerUpdateMultipleNodes != 0) {
                }
            } else {
                iComposerUpdateMultipleNodes = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerUpdateMultipleNodes, str);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerUpdateMultipleNodes$1L");
    }

    public static final void run$2(ARunnableS0S1401000_20 aRunnableS0S1401000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.getTypeface$1");
        try {
            aRunnableS0S1401000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.getTypeface$1");
    }

    public static final void run$3(ARunnableS0S1401000_20 aRunnableS0S1401000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxUIOwner@2474.createViewAsyncRunnable$1");
        try {
            aRunnableS0S1401000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxUIOwner@2474.createViewAsyncRunnable$1");
    }

    public static final void run$4(ARunnableS0S1401000_20 aRunnableS0S1401000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxUIOwner@2474.createViewAsync$1L$1");
        try {
            aRunnableS0S1401000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxUIOwner@2474.createViewAsync$1L$1");
    }

    public ARunnableS0S1401000_20(Object obj, int i, Object obj2, Object obj3, Object obj4, String str, int i2) {
        this.$t = i2;
        this.l4 = obj;
        this.i5 = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.s0 = str;
    }
}
