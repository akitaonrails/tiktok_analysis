package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.translation.ui.AutoDubbingConsumptionSheetFragment;

/* JADX INFO: renamed from: X.0Oug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("auto_dubbing_consumption_sheet")
public final class C634520Oug extends AbstractC20659715sp<TuxSheet> {
    public final C19EG LL;
    public final DialogInterface.OnDismissListener LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        FragmentManager supportFragmentManager;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLL = true;
        if (C299170Bo3.LIZIZ()) {
            c1390920mIc.LJIIIIZZ(1);
        }
        c1390920mIc.LJI(16);
        AutoDubbingConsumptionSheetFragment autoDubbingConsumptionSheetFragment = new AutoDubbingConsumptionSheetFragment();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = autoDubbingConsumptionSheetFragment;
        tuxSheet.LLILLJJLI = new C0P4S(this, 8);
        C19EG c19eg = this.LL;
        if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "auto dubbing consumption");
        }
        return tuxSheet;
    }

    public C634520Oug(final C19EG c19eg, DialogInterface.OnDismissListener onDismissListener) {
        super(new InterfaceC20660615sy(c19eg) { // from class: X.0Otx
            public final C19EG LL;

            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return false;
            }

            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                Fragment fragment;
                IDetailFeedSafService iDetailFeedSafService;
                Fragment fragmentLIZLLL;
                Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(this.LL);
                return (objLJIILLIIL == null || (fragment = (Fragment) objLJIILLIIL) == null || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) == null) ? this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) : fragmentLIZLLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                Fragment fragment;
                Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(this.LL);
                if (objLJIILLIIL == null || (fragment = (Fragment) objLJIILLIIL) == null) {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }
                Context context = fragment.getContext();
                if (context != null) {
                    return new C688120Qyw(context, fragment, null);
                }
                C19EG c19eg3 = this.LL;
                return new C688120Qyw(c19eg3, c19eg3, null);
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }

            {
                this.LL = c19eg;
            }
        });
        this.LL = c19eg;
        this.LLILLJJLI = onDismissListener;
        this.LLILLL = "AutoDubbingConsumptionPopupTask";
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExampleGlobalStandardPopupTask: show failed: errorMsg:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window;
        Dialog dialog = ((DialogFragment) obj).getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            return window.getDecorView();
        }
        return null;
    }
}
