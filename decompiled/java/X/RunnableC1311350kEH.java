package X;

import Y.ARunnableS4S0201100_20;
import Y.ARunnableS89S0200000_20;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import j27.s;

/* JADX INFO: renamed from: X.0kEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1311350kEH implements Runnable {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ReadableMap LLILZIL;
    public final /* synthetic */ PaintingContext LLILZLL;

    public final void LIZIZ() {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LLILZLL.LIZ.LJIIZILJ(this.LLILLL);
        if (lynxBaseUILJIIZILJ != null) {
            LynxUIMethodsExecutor.LIZ(lynxBaseUILJIIZILJ, this.LLILZ, this.LLILZIL, new Callback() { // from class: X.0kEI
                @Override // com.lynx.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    RunnableC1311350kEH runnableC1311350kEH = this.LIZ;
                    runnableC1311350kEH.getClass();
                    C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(objArr, runnableC1311350kEH, 138));
                }
            });
        } else {
            LIZ(6, C786410Ut5.j4("Worklet: node %d does not have a LynxUI", new Object[]{Integer.valueOf(this.LLILLL)}));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PaintingContext@8cd7.invoke$1");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaintingContext@8cd7.invoke$1");
    }

    public final void LIZ(Object... objArr) {
        s sVar;
        PaintingContext paintingContext = this.LLILZLL;
        if (!paintingContext.LIZJ && (sVar = paintingContext.LIZ.LIZJ) != null) {
            ARunnableS4S0201100_20 aRunnableS4S0201100_20 = new ARunnableS4S0201100_20(this, this.LL, this.LLILLJJLI, objArr, 2);
            C1310660kDA c1310660kDALJIILL = sVar.LJIILL();
            if (c1310660kDALJIILL != null) {
                c1310660kDALJIILL.runOnTasmThread(aRunnableS4S0201100_20);
            }
        }
    }

    public RunnableC1311350kEH(PaintingContext paintingContext, long j, int i, int i2, String str, ReadableMap readableMap) {
        this.LLILZLL = paintingContext;
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = readableMap;
    }
}
