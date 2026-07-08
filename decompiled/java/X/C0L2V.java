package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0L2V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2V extends AbstractC1664490tPr<C0L2Y, C536460L2e> {
    public final C536430L2b LLJJJIL = new C536430L2b(10, 100);
    public final C536420L2a LLJJJJ = new C536420L2a(0, 10, 2000);
    public C0L2U LLJJJJJIL;

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C0L2U c0l2u = this.LLJJJJJIL;
        if (c0l2u != null) {
            C0CNO.LIZLLL(0L, new AwS552S0100000_8(c0l2u, 9));
        }
        this.LLJJJJJIL = null;
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        CreativeDialogWrapper creativeDialogWrapper;
        C0L2U c0l2u = new C0L2U(requireActivity(), new AwS552S0100000_8(this, 739));
        this.LLJJJJJIL = c0l2u;
        Activity activity = c0l2u.LJFF.get();
        if (activity != null && !activity.isFinishing() && ((creativeDialogWrapper = c0l2u.LIZLLL) == null || !creativeDialogWrapper.isShowing())) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            int i = c0l2u.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(c0l2u.LIZIZ);
            creativeLoadingDialogBuilder.loadingMessage(activity.getString(2131845263));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(c0l2u, 6));
            CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, i, creativeLoadingDialogBuilder);
            c0l2u.LIZLLL = creativeDialogWrapper2;
            creativeDialogWrapper2.show();
            C0CNO.LIZLLL(0L, new AwS148S0101000_8(c0l2u, 0, 0));
        }
        C0L2U c0l2u2 = this.LLJJJJJIL;
        if (c0l2u2 != null) {
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(c0l2u2, this.LLJJJJ, 2));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0L2X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0L2Y) obj).LIZ;
            }
        }, new AwS587S0100000_8(this, 470));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new FrameLayout(requireSceneContext());
    }
}
