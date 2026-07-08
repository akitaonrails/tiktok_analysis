package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridAsyncSparkLoader;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import java.util.Iterator;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077560e9C extends AbstractC1542100qES {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJJZZIII$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            default:
                super.LJJZZIII(interfaceC1541990qEH, str);
                break;
            case 4:
                LJJZZIII$1(this, interfaceC1541990qEH, str);
                break;
            case 6:
                LJJZZIII$2(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 1:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 2:
                LJL$2(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 3:
                LJL$3(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 4:
                LJL$4(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        switch (this.$t) {
            case 0:
                LJLI$0(this, interfaceC1541990qEH, str, str2);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLI(interfaceC1541990qEH, str, str2);
                break;
            case 4:
                LJLI$1(this, interfaceC1541990qEH, str, str2);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLIIIL$3(this, interfaceC1541990qEH);
                break;
            case 4:
                LJLIIIL$4(this, interfaceC1541990qEH);
                break;
            case 5:
                LJLIIIL$5(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            case 2:
                LJLIIL$2(this, interfaceC1541990qEH, str);
                break;
            case 3:
                LJLIIL$3(this, interfaceC1541990qEH, str);
                break;
            case 4:
                LJLIIL$4(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLILLLLZI() {
        switch (this.$t) {
            case 0:
                LJLILLLLZI$0(this);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLILLLLZI();
                break;
            case 4:
                LJLILLLLZI$1(this);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        switch (this.$t) {
            case 0:
                LJLJJI$0(this);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLJJI();
                break;
            case 4:
                LJLJJI$1(this);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        switch (this.$t) {
            case 0:
                LJLJJLL$0(this, enumC1067640dtC);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLJJLL(enumC1067640dtC);
                break;
            case 4:
                LJLJJLL$1(this, enumC1067640dtC);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        switch (this.$t) {
            case 0:
                LJLJLLL$0(this, sparkContext);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLJLLL(sparkContext);
                break;
            case 4:
                LJLJLLL$1(this, sparkContext);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        switch (this.$t) {
            case 0:
                LJLL$0(this, sparkContext);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.LJLL(sparkContext);
                break;
            case 4:
                LJLL$1(this, sparkContext);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        switch (this.$t) {
            case 0:
                onDestroy$0(this);
                break;
            case 1:
            case 2:
            case 3:
            default:
                super.onDestroy();
                break;
            case 4:
                onDestroy$1(this);
                break;
        }
    }

    public static final void LJLILLLLZI$0(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLILLLLZI();
        }
    }

    public static final void LJLILLLLZI$1(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLILLLLZI();
        }
    }

    public static final void LJLJJI$0(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJI();
        }
    }

    public static final void LJLJJI$1(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJI();
        }
    }

    public static final void onDestroy$0(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        ((AdSparkHybridContext) c1077560e9C.l0).LJJIFFI();
    }

    public static final void onDestroy$1(C1077560e9C c1077560e9C) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
    }

    public C1077560e9C(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLIIIL(interfaceC1541990qEH);
        }
    }

    public static final void LJLIIIL$1(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = (AdHybridAsyncSparkLoader) c1077560e9C.l0;
        if (!adHybridAsyncSparkLoader.isLoadFailed) {
            adHybridAsyncSparkLoader.runOnUiThread(new AwS560S0100000_16(adHybridAsyncSparkLoader, 170));
        }
    }

    public static final void LJLIIIL$2(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        InterfaceC1028390crt iAdHybridPreRenderStatus;
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) c1077560e9C.l0;
        if (!abstractC1051250dSl.isPreRenderLoadFailed) {
            abstractC1051250dSl.isPreloadSuccess = true;
            View viewE1 = interfaceC1541990qEH.e1();
            if (viewE1 != null && (iAdHybridPreRenderStatus = ((AbstractC1051250dSl) c1077560e9C.l0).getIAdHybridPreRenderStatus()) != null) {
                iAdHybridPreRenderStatus.LIZLLL(new C1014910cW9(viewE1, EnumC2008907tv.STATUS_LOAD_SUCCESS, interfaceC1541990qEH.getHybridContext().containerId, true));
            }
            C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
        }
        ((AbstractC1051250dSl) c1077560e9C.l0).renderState = EnumC1051280dSo.LLILLL;
        ((AbstractC1051250dSl) c1077560e9C.l0).handlePendingReleaseCacheKeys();
        C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
    }

    public static final void LJLIIIL$3(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        View view;
        AbstractC1051250dSl abstractC1051250dSl;
        InterfaceC1051190dSf interfaceC1051190dSf;
        String containerId;
        C301090Br9.LIZIZ(new AwS560S0100000_16((AbstractC1051250dSl) c1077560e9C.l0, 172));
        AbstractC1051250dSl abstractC1051250dSl2 = (AbstractC1051250dSl) c1077560e9C.l0;
        if (!abstractC1051250dSl2.isLoadFailed) {
            C811103Ev.LIZ(abstractC1051250dSl2.getTag());
            InterfaceC1051160dSc interfaceC1051160dSc = ((AbstractC1051250dSl) c1077560e9C.l0).sparkMixture;
            if (interfaceC1051160dSc != null && (view = interfaceC1051160dSc.getView()) != null && (interfaceC1051190dSf = (abstractC1051250dSl = (AbstractC1051250dSl) c1077560e9C.l0).iAdHybridLoadStatus) != null) {
                EnumC2008907tv enumC2008907tv = EnumC2008907tv.STATUS_LOAD_SUCCESS;
                InterfaceC1051160dSc interfaceC1051160dSc2 = abstractC1051250dSl.sparkMixture;
                if (interfaceC1051160dSc2 != null) {
                    containerId = interfaceC1051160dSc2.getContainerId();
                } else {
                    containerId = null;
                }
                interfaceC1051190dSf.A9(new C1014910cW9(view, enumC2008907tv, containerId, false));
            }
            InterfaceC1028400cru adRenderLifecycle = ((AbstractC1051250dSl) c1077560e9C.l0).getAdRenderLifecycle();
            if (adRenderLifecycle != null) {
                adRenderLifecycle.LIZJ(((AbstractC1051250dSl) c1077560e9C.l0).isFromPre);
            }
        }
        ((AbstractC1051250dSl) c1077560e9C.l0).renderState = EnumC1051280dSo.LLILLL;
        ((AbstractC1051250dSl) c1077560e9C.l0).handlePendingReleaseCacheKeys();
        C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
    }

    public static final void LJLIIIL$4(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLIIIL(interfaceC1541990qEH);
        }
    }

    public static final void LJLIIIL$5(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        if (interfaceC1541990qEH instanceof WebKitView) {
            ((C1037220d68) c1077560e9C.l0).setWebView((WebKitView) interfaceC1541990qEH);
            C2429209fW.LIZ().appendDataFlowId(((C1037220d68) c1077560e9C.l0).getWebView(), "402657281");
            WebKitView webView = ((C1037220d68) c1077560e9C.l0).getWebView();
            if (webView != null) {
                final C1037220d68 c1037220d68 = (C1037220d68) c1077560e9C.l0;
                webView.setWebScrollListener(new InterfaceC1038890d8p() { // from class: X.0d6B
                    @Override // X.InterfaceC1038890d8p
                    public final void onScrollChanged(int i, int i2, int i3, int i4) {
                        InterfaceC1037260d6C scrollListener = c1037220d68.getScrollListener();
                        if (scrollListener != null) {
                            scrollListener.onScrollChanged(i, i2, i3, i4);
                        }
                    }
                });
                SparkWebViewTouchDelegate sparkWebViewTouchDelegate = new SparkWebViewTouchDelegate(webView, false, 30);
                c1037220d68.LLILLJJLI = sparkWebViewTouchDelegate;
                webView.setWebViewEventDelegate(sparkWebViewTouchDelegate);
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null) {
                    C1028210crb.LIZIZ(c1037220d68.getRootContainer(), webView);
                }
            }
        }
    }

    public static final void LJLJI$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJI(interfaceC1541990qEH);
        }
    }

    public static final void LJLJJLL$0(C1077560e9C c1077560e9C, EnumC1067640dtC enumC1067640dtC) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJLL(enumC1067640dtC);
        }
    }

    public static final void LJLJJLL$1(C1077560e9C c1077560e9C, EnumC1067640dtC enumC1067640dtC) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJLL(enumC1067640dtC);
        }
    }

    public static final void LJLJLLL$0(C1077560e9C c1077560e9C, SparkContext sparkContext) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJLLL(sparkContext);
        }
    }

    public static final void LJLJLLL$1(C1077560e9C c1077560e9C, SparkContext sparkContext) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJLLL(sparkContext);
        }
    }

    public static final void LJLL$0(C1077560e9C c1077560e9C, SparkContext sparkContext) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLL(sparkContext);
        }
    }

    public static final void LJLL$1(C1077560e9C c1077560e9C, SparkContext sparkContext) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLL(sparkContext);
        }
    }

    public static final void LJJZZIII$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJJZZIII(interfaceC1541990qEH, str);
        }
    }

    public static final void LJJZZIII$1(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJJZZIII(interfaceC1541990qEH, str);
        }
    }

    public static final void LJJZZIII$2(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        ((C1024570clj) c1077560e9C.l0).LIZJ();
    }

    public static final void LJLIIL$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLIIL(interfaceC1541990qEH, str);
        }
    }

    public static final void LJLIIL$1(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AdHybridAsyncSparkLoader.Companion.getClass();
        C811103Ev.LIZ(AdHybridAsyncSparkLoader.tag);
    }

    public static final void LJLIIL$2(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) c1077560e9C.l0;
        abstractC1051250dSl.isPreRenderLoadFailed = false;
        abstractC1051250dSl.preRenderLoadFailedReason = null;
    }

    public static final void LJLIIL$3(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
        C301090Br9.LIZIZ(new AwS165S1100000_16((AbstractC1051250dSl) c1077560e9C.l0, str, 16));
    }

    public static final void LJLIIL$4(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLIIL(interfaceC1541990qEH, str);
        }
    }

    public static final void LJL$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJL(interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    public static final void LJL$1(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = (AdHybridAsyncSparkLoader) c1077560e9C.l0;
        adHybridAsyncSparkLoader.isLoadFailed = true;
        adHybridAsyncSparkLoader.runOnUiThread(new AwS417S0200000_16(c1542120qEU, adHybridAsyncSparkLoader, 10));
    }

    public static final void LJL$2(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) c1077560e9C.l0;
        abstractC1051250dSl.isPreRenderLoadFailed = true;
        abstractC1051250dSl.preRenderLoadFailedReason = c1542120qEU;
        abstractC1051250dSl.isPreloadSuccess = false;
        InterfaceC1028390crt iAdHybridPreRenderStatus = abstractC1051250dSl.getIAdHybridPreRenderStatus();
        if (iAdHybridPreRenderStatus != null) {
            iAdHybridPreRenderStatus.LJ(String.valueOf(c1542120qEU.LIZ), String.valueOf(c1542120qEU.LIZIZ));
        }
        ((AbstractC1051250dSl) c1077560e9C.l0).renderState = EnumC1051280dSo.LLILZ;
        ((AbstractC1051250dSl) c1077560e9C.l0).handlePendingReleaseCacheKeys();
        C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
    }

    public static final void LJL$3(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C301090Br9.LIZIZ(new AwS165S1100000_16((AbstractC1051250dSl) c1077560e9C.l0, str, 15));
        AbstractC1051250dSl abstractC1051250dSl = (AbstractC1051250dSl) c1077560e9C.l0;
        abstractC1051250dSl.isLoadFailed = true;
        InterfaceC1051190dSf interfaceC1051190dSf = abstractC1051250dSl.iAdHybridLoadStatus;
        String str2 = "Unknown_reason";
        if (interfaceC1051190dSf != null) {
            String strValueOf = String.valueOf(c1542120qEU.LIZ);
            String str3 = c1542120qEU.LIZIZ;
            if (str3 == null) {
                str3 = "Unknown_reason";
            }
            interfaceC1051190dSf.k3(strValueOf, str3);
        }
        InterfaceC1028400cru adRenderLifecycle = abstractC1051250dSl.getAdRenderLifecycle();
        if (adRenderLifecycle != null) {
            boolean z = abstractC1051250dSl.isFromPre;
            String strValueOf2 = String.valueOf(c1542120qEU.LIZ);
            String str4 = c1542120qEU.LIZIZ;
            if (str4 != null) {
                str2 = str4;
            }
            adRenderLifecycle.LIZ(strValueOf2, str2, z);
        }
        ((AbstractC1051250dSl) c1077560e9C.l0).renderState = EnumC1051280dSo.LLILZ;
        ((AbstractC1051250dSl) c1077560e9C.l0).handlePendingReleaseCacheKeys();
        C811103Ev.LIZ(((AbstractC1051250dSl) c1077560e9C.l0).getTag());
    }

    public static final void LJL$4(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJL(interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    public static final void LJLI$0(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkHybridContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLI(interfaceC1541990qEH, str, str2);
        }
    }

    public static final void LJLI$1(C1077560e9C c1077560e9C, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        Iterator<AbstractC1542100qES> it2 = ((AdSparkContext) c1077560e9C.l0).loadCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LJLI(interfaceC1541990qEH, str, str2);
        }
    }
}
