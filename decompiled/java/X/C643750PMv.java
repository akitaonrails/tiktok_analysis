package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0PMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643750PMv implements InterfaceC1603360rpG {
    public final AbstractC1255880imo LL;
    public final C1255920ims LLILLJJLI = new C1255920ims();

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return this.LL.isDataEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILLJJLI.LJIIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        this.LLILLJJLI.LIZ();
        this.LLILLJJLI.LJIILJJIL();
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LL;
    }

    public C643750PMv(AbstractC1255880imo abstractC1255880imo) {
        this.LL = abstractC1255880imo;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        C1255920ims c1255920ims = this.LLILLJJLI;
        c1255920ims.LLILLJJLI = interfaceC1209780haS;
        c1255920ims.LLILZ = interfaceC1209780haS;
        c1255920ims.LJIIJ(this.LL);
        this.LL.onModelBound();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ == null && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Ar(str)) == null) {
            return false;
        }
        return this.LLILLJJLI.LJIILLIIL(awemeLLILZ);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        if (this.LL != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILLJJLI.onSuccess();
    }
}
