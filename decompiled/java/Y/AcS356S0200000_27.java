package Y;

import X.C013C;
import X.C1797250wrz;
import X.C1802660x0i;
import X.C1802670x0j;
import X.C1808080x9S;
import X.C785410UrT;
import X.C920470a3p;
import X.DialogC1841990y29;
import X.EnumC500800JkU;
import X.EnumC500820JkW;
import X.InterfaceC1106030et7;
import X.InterfaceC743640TFa;
import X.InterfaceC934710aQn;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes28.dex */
public class AcS356S0200000_27 implements InterfaceC743640TFa {
    public final int $t;
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
            case 3:
                LIZ$3(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS356S0200000_27 acS356S0200000_27, LiveDialog liveDialog) {
        C1802660x0i.LIZJ((C1797250wrz) acS356S0200000_27.l1, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS356S0200000_27 acS356S0200000_27, LiveDialog liveDialog) {
        C1802670x0j.LIZJ((C1797250wrz) acS356S0200000_27.l1, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS356S0200000_27 acS356S0200000_27, LiveDialog liveDialog) {
        C1808080x9S.LIZ.getClass();
        InterfaceC1106030et7.V5.LIZJ(Boolean.TRUE);
        C1808080x9S.LIZ((EnumC500800JkU) acS356S0200000_27.l0, EnumC500820JkW.LL, null);
        liveDialog.dismiss();
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) acS356S0200000_27.l1;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(liveDialog);
        }
    }

    public static final void LIZ$3(AcS356S0200000_27 acS356S0200000_27, LiveDialog liveDialog) {
        String string;
        if (((C013C) acS356S0200000_27.l0).element) {
            InterfaceC934710aQn.Ib.LJFF(Boolean.FALSE);
        }
        Gift gift = ((DialogC1841990y29) acS356S0200000_27.l1).LLJJIJIL;
        if (gift == null || (string = Long.valueOf(gift.id).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        DialogC1841990y29 dialogC1841990y29 = (DialogC1841990y29) acS356S0200000_27.l1;
        C920470a3p.LIZ(string, String.valueOf(dialogC1841990y29.LLJIJIL - dialogC1841990y29.LLJI), "send", "second");
        ((DialogC1841990y29) acS356S0200000_27.l1).LJL();
        liveDialog.dismiss();
        DialogC1841990y29 dialogC1841990y292 = (DialogC1841990y29) acS356S0200000_27.l1;
        dialogC1841990y292.dismiss();
        C785410UrT.LIZ(dialogC1841990y292);
    }

    public AcS356S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
