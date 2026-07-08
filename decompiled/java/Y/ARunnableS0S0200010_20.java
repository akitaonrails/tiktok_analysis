package Y;

import X.C1311130kDv;
import X.C1C7U;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0200010_20 implements Runnable {
    public final int $t;
    public double d2;
    public Object l0;
    public Object l1;

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

    public static final void run$0(ARunnableS0S0200010_20 aRunnableS0S0200010_20) {
        LynxFoldViewNG lynxFoldViewNG = (LynxFoldViewNG) aRunnableS0S0200010_20.l0;
        double d = aRunnableS0S0200010_20.d2;
        Callback callback = (Callback) aRunnableS0S0200010_20.l1;
        int i = LynxFoldViewNG.LLJJIII;
        C1C7U.LIZ("LynxFoldViewNG@9829.scrollBy$1L");
        float f = (float) d;
        float[] fArrScrollBy = lynxFoldViewNG.scrollBy(f, f);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putDouble("consumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[0]));
        javaOnlyMap.putDouble("consumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[1]));
        javaOnlyMap.putDouble("unconsumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[2]));
        javaOnlyMap.putDouble("unconsumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[3]));
        callback.invoke(0, javaOnlyMap);
        C1C7U.LIZIZ("LynxFoldViewNG@9829.scrollBy$1L");
    }

    public static final void run$1(ARunnableS0S0200010_20 aRunnableS0S0200010_20) {
        LynxUIScrollCoordinator lynxUIScrollCoordinator = (LynxUIScrollCoordinator) aRunnableS0S0200010_20.l0;
        double d = aRunnableS0S0200010_20.d2;
        Callback callback = (Callback) aRunnableS0S0200010_20.l1;
        int i = LynxUIScrollCoordinator.LLJJIII;
        C1C7U.LIZ("LynxUIScrollCoordinator@7ba0.scrollBy$1L");
        float f = (float) d;
        float[] fArrScrollBy = lynxUIScrollCoordinator.scrollBy(f, f);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putDouble("consumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[0]));
        javaOnlyMap.putDouble("consumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[1]));
        javaOnlyMap.putDouble("unconsumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[2]));
        javaOnlyMap.putDouble("unconsumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[3]));
        callback.invoke(0, javaOnlyMap);
        C1C7U.LIZIZ("LynxUIScrollCoordinator@7ba0.scrollBy$1L");
    }

    public static final void run$2(ARunnableS0S0200010_20 aRunnableS0S0200010_20) {
        UIList uIList = (UIList) aRunnableS0S0200010_20.l0;
        double d = aRunnableS0S0200010_20.d2;
        Callback callback = (Callback) aRunnableS0S0200010_20.l1;
        int i = UIList.LLLL;
        uIList.getClass();
        C1C7U.LIZ("UIList@ec82.scrollBy$1L");
        float f = (float) d;
        float[] fArrScrollBy = uIList.scrollBy(f, f);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putDouble("consumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[0]));
        javaOnlyMap.putDouble("consumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[1]));
        javaOnlyMap.putDouble("unconsumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[2]));
        javaOnlyMap.putDouble("unconsumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[3]));
        callback.invoke(0, javaOnlyMap);
        C1C7U.LIZIZ("UIList@ec82.scrollBy$1L");
    }

    public static final void run$3(ARunnableS0S0200010_20 aRunnableS0S0200010_20) {
        UIListContainer uIListContainer = (UIListContainer) aRunnableS0S0200010_20.l0;
        double d = aRunnableS0S0200010_20.d2;
        Callback callback = (Callback) aRunnableS0S0200010_20.l1;
        int i = UIListContainer.LLJLLIL;
        uIListContainer.getClass();
        C1C7U.LIZ("UIListContainer@af5a.scrollBy$1L");
        float f = (float) d;
        float[] fArrScrollBy = uIListContainer.scrollBy(f, f);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putDouble("consumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[0]));
        javaOnlyMap.putDouble("consumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[1]));
        javaOnlyMap.putDouble("unconsumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[2]));
        javaOnlyMap.putDouble("unconsumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[3]));
        callback.invoke(0, javaOnlyMap);
        C1C7U.LIZIZ("UIListContainer@af5a.scrollBy$1L");
    }

    public static final void run$4(ARunnableS0S0200010_20 aRunnableS0S0200010_20) {
        UIScrollView uIScrollView = (UIScrollView) aRunnableS0S0200010_20.l0;
        double d = aRunnableS0S0200010_20.d2;
        Callback callback = (Callback) aRunnableS0S0200010_20.l1;
        int i = UIScrollView.LLJZIJLIL;
        uIScrollView.getClass();
        C1C7U.LIZ("UIScrollView@cecf.scrollBy$1L");
        float f = (float) d;
        float[] fArrScrollBy = uIScrollView.scrollBy(f, f);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putDouble("consumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[0]));
        javaOnlyMap.putDouble("consumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[1]));
        javaOnlyMap.putDouble("unconsumedX", (int) C1311130kDv.LIZJ(fArrScrollBy[2]));
        javaOnlyMap.putDouble("unconsumedY", (int) C1311130kDv.LIZJ(fArrScrollBy[3]));
        callback.invoke(0, javaOnlyMap);
        C1C7U.LIZIZ("UIScrollView@cecf.scrollBy$1L");
    }

    public ARunnableS0S0200010_20(Object obj, double d, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.d2 = d;
        this.l1 = obj2;
    }
}
