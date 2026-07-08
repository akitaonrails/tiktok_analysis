package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.pipo.stellar.base.page.StellarPageFragment;
import com.bytedance.pipo.stellar.base.page.StellarPageViewModel;

/* JADX INFO: renamed from: X.0huQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222160huQ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Fragment LIZ;

    public C1222160huQ(StellarPageFragment stellarPageFragment) {
        this.LIZ = stellarPageFragment;
    }

    public final void LIZ(String str) {
        StellarPageFragment stellarPageFragment;
        Fragment fragment = this.LIZ;
        if ((fragment instanceof StellarPageFragment) && (stellarPageFragment = (StellarPageFragment) fragment) != null) {
            AssemVMLazy assemVMLazy = stellarPageFragment.LLJLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StellarPageFragment.LLJLILLLLZIIL;
            StellarPageViewModel stellarPageViewModel = (StellarPageViewModel) assemVMLazy.getValue();
            C1222130huN.LIZ.getClass();
            stellarPageViewModel.CQ2(C1222130huN.LIZJ(str));
            stellarPageViewModel.wQ2(null);
        }
    }
}
