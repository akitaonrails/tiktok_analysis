package Y;

import X.C1546700qLs;
import X.EnumC1538460q8a;
import X.InterfaceC1541990qEH;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class ACListenerS157S0100000_23 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public ACListenerS157S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS157S0100000_23 aCListenerS157S0100000_23, View view) {
        ((SparkThirdPopUp) aCListenerS157S0100000_23.l0).SR(true);
    }

    public static final void onClick$1(ACListenerS157S0100000_23 aCListenerS157S0100000_23, View view) {
        Function0<Unit> function0;
        SparkFragment sparkFragment;
        EnumC1538460q8a enumC1538460q8aRR;
        Function0<Unit> function02;
        InterfaceC1541990qEH kitView;
        SparkFragment sparkFragment2 = ((C1546700qLs) aCListenerS157S0100000_23.l0).LIZ;
        EnumC1538460q8a enumC1538460q8aRR2 = null;
        if (sparkFragment2 != null && (kitView = sparkFragment2.getKitView()) != null) {
            kitView.LIZ("containerMaskTapped", null);
        }
        if (((C1546700qLs) aCListenerS157S0100000_23.l0).LIZIZ.getDisableOutsideClickClose()) {
            SparkFragment sparkFragment3 = ((C1546700qLs) aCListenerS157S0100000_23.l0).LIZ;
            if (sparkFragment3 != null) {
                enumC1538460q8aRR2 = sparkFragment3.RR();
            }
            if (enumC1538460q8aRR2 == EnumC1538460q8a.FAIL && (function02 = ((C1546700qLs) aCListenerS157S0100000_23.l0).LIZLLL) != null) {
                function02.invoke();
                return;
            }
            return;
        }
        if ((((C1546700qLs) aCListenerS157S0100000_23.l0).LIZIZ.getMaskCloseUntilLoaded() && (sparkFragment = ((C1546700qLs) aCListenerS157S0100000_23.l0).LIZ) != null && (enumC1538460q8aRR = sparkFragment.RR()) != null && enumC1538460q8aRR != EnumC1538460q8a.FAIL && enumC1538460q8aRR != EnumC1538460q8a.SUCCESS) || (function0 = ((C1546700qLs) aCListenerS157S0100000_23.l0).LIZLLL) == null) {
            return;
        }
        function0.invoke();
    }
}
