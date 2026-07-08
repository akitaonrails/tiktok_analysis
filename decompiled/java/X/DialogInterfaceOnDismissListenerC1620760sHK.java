package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaSpecialCardServiceImpl;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class DialogInterfaceOnDismissListenerC1620760sHK implements DialogInterface.OnDismissListener {
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
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1620760sHK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((SeriesVipSubscriptionFragment) dialogInterfaceOnDismissListenerC1620760sHK.l0).LLJ = null;
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        C11JF c11jf;
        C11JF c11jf2 = ((MiniDramaSpecialCardServiceImpl) dialogInterfaceOnDismissListenerC1620760sHK.l0).LL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = ((MiniDramaSpecialCardServiceImpl) dialogInterfaceOnDismissListenerC1620760sHK.l0).LL) != null) {
            c11jf.dispose();
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((PaidContentVideoPanel) dialogInterfaceOnDismissListenerC1620760sHK.l0).A2 = null;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        TuxSheet tuxSheet;
        Fragment parentFragment = ((SeriesPurchaseOptionFragment) dialogInterfaceOnDismissListenerC1620760sHK.l0).getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (tuxSheet = (TuxSheet) parentFragment) != null) {
            tuxSheet.ZR();
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0).invoke();
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0).invoke();
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0).invoke();
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0).invoke();
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1620760sHK.l0).invoke();
    }
}
