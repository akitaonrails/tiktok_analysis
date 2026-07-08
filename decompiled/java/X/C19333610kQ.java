package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donate.DonatePageViewModel;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donorlist.DonorListPageViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.tiktok.tpsc.core.render.components.builtin.setting.SettingItemViewModel;
import java.util.Map;

/* JADX INFO: renamed from: X.10kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19333610kQ implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
            case 4:
                return (T) create$4(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C19333610kQ(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C19333610kQ c19333610kQ, Class cls) {
        return new FundraiserContainerViewModel();
    }

    public static final ViewModel create$1(C19333610kQ c19333610kQ, Class cls) {
        return new DonatePageViewModel();
    }

    public static final ViewModel create$2(C19333610kQ c19333610kQ, Class cls) {
        return new DonorListPageViewModel();
    }

    public static final ViewModel create$3(C19333610kQ c19333610kQ, Class cls) {
        C01GW<C1902840zcI> c01gw = MultiViewModel.LLLIL;
        c01gw.getValue().LIZ();
        Object objRemove = ((Map) c01gw.getValue().LJ.getValue()).remove("BUFFER_VM");
        if (objRemove == null) {
            objRemove = null;
        }
        ViewModel viewModel = (ViewModel) objRemove;
        if (viewModel == null) {
            return new MultiViewModel();
        }
        return viewModel;
    }

    public static final ViewModel create$4(C19333610kQ c19333610kQ, Class cls) {
        return new SettingItemViewModel();
    }
}
