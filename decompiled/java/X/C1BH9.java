package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;

/* JADX INFO: renamed from: X.1BH9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BH9 extends AbstractC1542070qEP {
    public final SparkThirdContext LLILLJJLI;
    public Context LLILLL;
    public SearchLandingPageViewModel LLILZ;

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        return null;
    }

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILLL = null;
    }

    public C1BH9(SparkThirdContext sparkThirdContext) {
        this.LLILLJJLI = sparkThirdContext;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(final InterfaceC1051240dSk interfaceC1051240dSk) {
        C2173521A4o c2173521A4o;
        if (this.LLILZ == null) {
            this.LLILZ = (SearchLandingPageViewModel) ViewModelProviders.of((C19EG) this.LLILLJJLI.container).get(SearchLandingPageViewModel.class);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "no_internet";
        Context context = this.LLILLL;
        if (context != null) {
            c2173521A4o = new C2173521A4o(context);
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                c2173521A4o.setCurrentStatus$search_release((String) c259800zU.element);
                c2173521A4o.setCurrentStatusView$search_release(new InterfaceC2173531A4p() { // from class: X.1BHD
                    @Override // X.InterfaceC2173531A4p
                    public final void LIZ() {
                        C1BH3.LIZ.getClass();
                        C1BH3.LIZ("retry");
                        interfaceC1051240dSk.refresh();
                        c259800zU.element = "safe";
                        C1BH6.LIZ.getClass();
                        C1BH6.LIZIZ = "safe";
                        SearchLandingPageViewModel searchLandingPageViewModel = this.LLILZ;
                        if (searchLandingPageViewModel != null) {
                            searchLandingPageViewModel.vQ2(c259800zU.element);
                        }
                        C1BH6.LJFF = false;
                    }
                });
            } else {
                c259800zU.element = "broken";
                c2173521A4o.setCurrentStatus$search_release("broken");
                c2173521A4o.setCurrentStatusView$search_release(new InterfaceC2173531A4p() { // from class: X.1BHC
                    @Override // X.InterfaceC2173531A4p
                    public final void LIZ() {
                        SearchLandingPageViewModel searchLandingPageViewModel;
                        C1BH3.LIZ.getClass();
                        C1BH3.LIZ("go_back");
                        SparkThirdContext sparkThirdContext = this.LIZ.LLILLJJLI;
                        C1BHH c1bhh = sparkThirdContext.webView;
                        if (c1bhh == null || !c1bhh.canGoBack()) {
                            InterfaceC1059280dfi interfaceC1059280dfi = sparkThirdContext.container;
                            if (interfaceC1059280dfi != null) {
                                interfaceC1059280dfi.close();
                            }
                        } else {
                            c1bhh.LIZIZ();
                        }
                        C1BHH c1bhh2 = this.LIZ.LLILLJJLI.webView;
                        if ((c1bhh2 == null || !c1bhh2.canGoBack()) && (searchLandingPageViewModel = this.LIZ.LLILZ) != null) {
                            searchLandingPageViewModel.vQ2("no_internet");
                        }
                        SearchLandingPageViewModel searchLandingPageViewModel2 = this.LIZ.LLILZ;
                        if (searchLandingPageViewModel2 != null) {
                            searchLandingPageViewModel2.vQ2(c259800zU.element);
                        }
                    }
                });
            }
        } else {
            c2173521A4o = null;
        }
        C1BH6.LIZ.getClass();
        if (C1BH6.LJFF) {
            C1BH6.LJFF = false;
            T t = c259800zU.element;
            C1BH6.LIZIZ = (String) t;
            SearchLandingPageViewModel searchLandingPageViewModel = this.LLILZ;
            if (searchLandingPageViewModel != null) {
                searchLandingPageViewModel.vQ2((String) t);
            }
            C1BH3.LIZ.getClass();
            C1BH3.LIZIZ();
        }
        return c2173521A4o;
    }
}
