package X;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSevenSheetFragment;
import com.tts.oecverify.verify.RiskControlService;

/* JADX INFO: renamed from: X.14d7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class DialogInterfaceOnDismissListenerC20307514d7 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC20307514d7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7, DialogInterface dialogInterface) {
        C20286614Zk.LIZ.getClass();
        if (C20286614Zk.LJFF) {
            C1483410ohn.LJLJJI().LJIILLIIL();
            C20286614Zk.LJFF = false;
        }
        ((View) dialogInterfaceOnDismissListenerC20307514d7.l0).getViewTreeObserver().removeOnWindowFocusChangeListener(ViewTreeObserverOnWindowFocusChangeListenerC20289714aF.LL);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        ((TakoSevenSheetFragment) dialogInterfaceOnDismissListenerC20307514d7.l0).LLLLLJIL.invoke(C1391190mJ3.LJIIJJI(dialogInterface));
        ((TakoSevenSheetFragment) dialogInterfaceOnDismissListenerC20307514d7.l0).G2(4);
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7, DialogInterface dialogInterface) {
        RiskControlService riskControlService = (RiskControlService) dialogInterfaceOnDismissListenerC20307514d7.l0;
        if (dialogInterface == riskControlService.mDialogShowing) {
            riskControlService.mDialogShowing = null;
            riskControlService.setMShowingRequestPath(null);
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7, DialogInterface dialogInterface) {
        com.bytedance.bdturing.verify.RiskControlService riskControlService = (com.bytedance.bdturing.verify.RiskControlService) dialogInterfaceOnDismissListenerC20307514d7.l0;
        if (dialogInterface == riskControlService.mDialogShowing) {
            riskControlService.mDialogShowing = null;
        }
    }
}
