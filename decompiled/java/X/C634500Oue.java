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
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Oue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("feed_auto_dubbing_consumption_education")
public final class C634500Oue extends AbstractC20659715sp<TuxPanel> {
    public final C19EG LL;
    public final DialogInterface.OnDismissListener LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            C1391960mKI c1391960mKI = new C1391960mKI();
            String string = c19eg.getString(2131828757);
            String string2 = c19eg.getString(2131828756);
            String string3 = c19eg.getString(2131828755);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x6;
            c1391960mKI.LIZLLL = c0hti.LIZ(c19eg);
            c1391960mKI.LJI = 1;
            c1391960mKI.LJII = string;
            c1391960mKI.LJIIIIZZ = string2;
            c1391960mKI.LIZ = true;
            c1391960mKI.LIZIZ(string3, new C634510Ouf());
            C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
            C0P4S c0p4s = new C0P4S(this, 9);
            TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
            tuxPanel.LLILZIL = c0p4s;
            tuxPanel.show(supportFragmentManager, "auto dubbing consumption pop-up");
            return tuxPanel;
        }
        return null;
    }

    public C634500Oue(final C19EG c19eg, DialogInterface.OnDismissListener onDismissListener) {
        super(new InterfaceC20660615sy(c19eg) { // from class: X.0Oty
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
