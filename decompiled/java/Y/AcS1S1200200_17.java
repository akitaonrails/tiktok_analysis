package Y;

import X.C1119120fEE;
import X.InterfaceC1119160fEI;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: loaded from: classes18.dex */
public class AcS1S1200200_17 implements InterfaceC743640TFa {
    public final int $t;
    public long j3;
    public long j4;
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

    public static final void LIZ$0(AcS1S1200200_17 acS1S1200200_17, LiveDialog liveDialog) {
        C1119120fEE c1119120fEE = (C1119120fEE) acS1S1200200_17.l1;
        String str = acS1S1200200_17.s0;
        c1119120fEE.getClass();
        C1119120fEE.LJI(str, "continue");
        liveDialog.dismiss();
        C1119120fEE.LJFF(acS1S1200200_17.j3, acS1S1200200_17.j4, (InterfaceC1119160fEI) acS1S1200200_17.l2);
    }

    public static final void LIZ$1(AcS1S1200200_17 acS1S1200200_17, LiveDialog liveDialog) {
        C1119120fEE c1119120fEE = (C1119120fEE) acS1S1200200_17.l1;
        String str = acS1S1200200_17.s0;
        c1119120fEE.getClass();
        C1119120fEE.LJI(str, "continue");
        liveDialog.dismiss();
        C1119120fEE.LJFF(acS1S1200200_17.j3, acS1S1200200_17.j4, (InterfaceC1119160fEI) acS1S1200200_17.l2);
    }

    public AcS1S1200200_17(long j, long j2, C1119120fEE c1119120fEE, InterfaceC1119160fEI interfaceC1119160fEI, String str, int i) {
        this.$t = i;
        this.l1 = c1119120fEE;
        this.s0 = str;
        this.j3 = j;
        this.j4 = j2;
        this.l2 = interfaceC1119160fEI;
    }
}
