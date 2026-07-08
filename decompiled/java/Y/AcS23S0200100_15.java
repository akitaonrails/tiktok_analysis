package Y;

import X.C19GU;
import X.C259800zU;
import X.C785410UrT;
import X.C942580adU;
import X.C955400ayA;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AcS23S0200100_15 implements InterfaceC743640TFa {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(AcS23S0200100_15 acS23S0200100_15, LiveDialog liveDialog) {
        C955400ayA.LIZ.LLIIIL(acS23S0200100_15.j2, 0L, false);
        C19GU c19gu = (C19GU) ((C259800zU) acS23S0200100_15.l0).element;
        if (c19gu != null) {
            c19gu.dismiss();
            C785410UrT.LIZ(c19gu);
        }
        ((Function1) acS23S0200100_15.l1).invoke(Boolean.FALSE);
    }

    public static final void LIZ$1(AcS23S0200100_15 acS23S0200100_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiGuestV3GuestWidget) acS23S0200100_15.l0).A1((Runnable) acS23S0200100_15.l1, false);
        C942580adU.LJIIIZ(acS23S0200100_15.j2, "watch");
    }

    public static final void LIZ$2(AcS23S0200100_15 acS23S0200100_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((MultiGuestV3GuestWidget) acS23S0200100_15.l0).A1((Runnable) acS23S0200100_15.l1, false);
        C942580adU.LJIIIIZZ(acS23S0200100_15.j2, "send");
    }

    public AcS23S0200100_15(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
