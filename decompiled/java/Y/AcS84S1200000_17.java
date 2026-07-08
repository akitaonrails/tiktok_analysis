package Y;

import X.C1119120fEE;
import X.InterfaceC1119160fEI;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: loaded from: classes18.dex */
public class AcS84S1200000_17 implements InterfaceC743640TFa {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS84S1200000_17 acS84S1200000_17, LiveDialog liveDialog) {
        C1119120fEE c1119120fEE = (C1119120fEE) acS84S1200000_17.l1;
        String str = acS84S1200000_17.s0;
        c1119120fEE.getClass();
        C1119120fEE.LJI(str, "cancel");
        liveDialog.dismiss();
        ((InterfaceC1119160fEI) acS84S1200000_17.l2).onCancel();
    }

    public static final void LIZ$1(AcS84S1200000_17 acS84S1200000_17, LiveDialog liveDialog) {
        C1119120fEE c1119120fEE = (C1119120fEE) acS84S1200000_17.l1;
        String str = acS84S1200000_17.s0;
        c1119120fEE.getClass();
        C1119120fEE.LJI(str, "cancel");
        liveDialog.dismiss();
        ((InterfaceC1119160fEI) acS84S1200000_17.l2).onCancel();
    }

    public AcS84S1200000_17(C1119120fEE c1119120fEE, InterfaceC1119160fEI interfaceC1119160fEI, String str, int i) {
        this.$t = i;
        this.l1 = c1119120fEE;
        this.s0 = str;
        this.l2 = interfaceC1119160fEI;
    }
}
