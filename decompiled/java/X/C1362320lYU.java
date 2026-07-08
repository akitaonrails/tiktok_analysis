package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;

/* JADX INFO: renamed from: X.0lYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362320lYU implements ViewModelProvider.Factory {
    public final SharePackage LIZ;
    public final List<InterfaceC1369790lkX> LIZIZ;
    public final InterfaceC1362600lYw LIZJ;
    public final SharePanelViewModel LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        return new SharePanelImHeadViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1362320lYU(SharePackage sharePackage, List<? extends InterfaceC1369790lkX> list, InterfaceC1362600lYw interfaceC1362600lYw, SharePanelViewModel sharePanelViewModel) {
        this.LIZ = sharePackage;
        this.LIZIZ = list;
        this.LIZJ = interfaceC1362600lYw;
        this.LIZLLL = sharePanelViewModel;
    }
}
