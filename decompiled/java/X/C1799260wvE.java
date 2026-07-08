package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799260wvE extends AbstractC1799290wvH {
    public C11JF LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C11JF c11jf = this.LLILLL;
        if (c11jf == null || !c11jf.isDisposed()) {
            return;
        }
        c11jf.dispose();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final String billingCountryCode;
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        this.LLILLL = (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0wl5
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("GetGooglePayStorefrontMethod@43d2.handle$1");
                c09aj.onNext(C1797270ws1.LIZIZ().LIZJ());
                c09aj.onComplete();
                C1C7U.LIZIZ("GetGooglePayStorefrontMethod@43d2.handle$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0wvG
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GetGooglePayStorefrontMethod@43d2.handle$2");
                CompletionBlock<InterfaceC1799300wvI> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1799300wvI.class, null);
                String str = billingCountryCode;
                InterfaceC1799270wvF interfaceC1799270wvF = (InterfaceC1799270wvF) C1909107dp.LIZJ(InterfaceC1799270wvF.class, null);
                interfaceC1799270wvF.setCurrencyCode((String) obj);
                interfaceC1799270wvF.setCountryCode(str);
                ((InterfaceC1799300wvI) xBaseModelLIZJ).setStorefront(interfaceC1799270wvF);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                C1C7U.LIZIZ("GetGooglePayStorefrontMethod@43d2.handle$2");
            }
        });
    }
}
