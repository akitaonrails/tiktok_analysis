package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0PMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643640PMk implements InterfaceC1603360rpG, InterfaceC666730QDf {
    public final AbstractC1255880imo LL;
    public final C643350PLh LLILLJJLI;

    @Override // X.InterfaceC666730QDf
    public final void LJI(int i, float f, int i2, Aweme aweme) {
    }

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
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC666730QDf
    public final void onPageScrollStateChanged(int i) {
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

    public C643640PMk(AbstractC1255880imo abstractC1255880imo) {
        this.LL = abstractC1255880imo == null ? new C0PNL() : abstractC1255880imo;
        this.LLILLJJLI = new C643350PLh(C0PL7.INFLOW);
    }

    @Override // X.InterfaceC666730QDf
    public final void LIZIZ(Aweme aweme) {
        AbstractC1255880imo abstractC1255880imo = this.LL;
        if (abstractC1255880imo != null && (abstractC1255880imo instanceof C0PN8) && aweme != null) {
            C0PHR c0phr = C0PHR.LIZ;
            C0PHT c0phtLJJIIZ = ((C0PN8) abstractC1255880imo).LJJIIZ();
            String aid = aweme.getAid();
            c0phr.getClass();
            C0PHR.LIZ(c0phtLJJIIZ, aid);
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLILLJJLI.LJIIJJI(interfaceC1209780haS);
        C643350PLh c643350PLh = this.LLILLJJLI;
        c643350PLh.LLILZ = interfaceC1209780haS;
        c643350PLh.LJIIJ(this.LL);
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
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLILLJJLI.LIZJ(Integer.valueOf(i));
    }
}
