package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.popup.HomePageFragChangeObserver;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;

/* JADX INFO: renamed from: X.0rGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581670rGH extends AbstractC813200VvC {
    public final /* synthetic */ C19EG LL;

    public C1581670rGH(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        ISpecActService.LIZ.getClass();
        C0TGV.LIZ().LJJIIJ();
        C09PT c09pt = C09PU.LIZ;
        if (c09pt != null) {
            c09pt.LIZ(fragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0rGI] */
    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, final Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        final String strPz = Hox.LLJILJIL.LIZ(this.LL).pz(fragment);
        ISpecActService.LIZ.getClass();
        C0TGV.LIZ().LJJJLZIJ(new InterfaceC1700660uMC() { // from class: X.0rGI
            @Override // X.InterfaceC1700660uMC
            public final void LIZ() {
            }

            @Override // X.InterfaceC1700660uMC
            public final void LIZIZ() {
                String str = strPz;
                if (str == null) {
                    return;
                }
                HomePageFragChangeObserver homePageFragChangeObserver = HomePageFragChangeObserver.LIZ;
                Fragment fragment2 = fragment;
                homePageFragChangeObserver.getClass();
                HomePageFragChangeObserver.LIZ(fragment2, str);
            }
        });
    }
}
