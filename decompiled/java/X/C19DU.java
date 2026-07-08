package X;

import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.compliance.api.services.userbehavior.IUITransitionService;

/* JADX INFO: renamed from: X.19DU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DU extends C19D2 {
    public final C01GW LLILLL = C452501pT.LIZIZ(new C19DW());

    @Override // X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIJL(BaseActivity baseActivity) {
        IUITransitionService iUITransitionService;
        View viewFindViewById = baseActivity.findViewById(R.id.content);
        if (viewFindViewById != null && (iUITransitionService = (IUITransitionService) this.LLILLL.getValue()) != null) {
            iUITransitionService.LIZ(viewFindViewById, baseActivity);
        }
    }

    @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
        super.LJJIIZI(baseActivity, bundle);
        baseActivity.getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.19DV
            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle2) {
                super.onFragmentViewCreated(fragmentManager, fragment, view, bundle2);
                IUITransitionService iUITransitionService = (IUITransitionService) this.LL.LLILLL.getValue();
                if (iUITransitionService != null) {
                    iUITransitionService.LIZ(view, fragment);
                }
            }
        }, true);
    }
}
