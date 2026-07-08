package Y;

import X.AbstractC1968807nS;
import X.C1035880d3y;
import X.C1054770dYR;
import X.C1075100e5E;
import X.C1075210e5P;
import X.C1371600lnS;
import X.C997860c4e;
import X.InterfaceC1036110d4L;
import X.InterfaceC1370310llN;
import X.InterfaceC1541990qEH;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.share.service.AdWebShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS57S1200000_16 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS57S1200000_16 aCListenerS57S1200000_16, View view) {
        View viewE1;
        WebView webView;
        InterfaceC1036110d4L interfaceC1036110d4L;
        AdWebShareService adWebShareService = new AdWebShareService();
        String str = aCListenerS57S1200000_16.s0;
        SparkContext sparkContext = (SparkContext) aCListenerS57S1200000_16.l1;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
        adWebShareService.LIZ(sparkContext);
        C1371600lnS c1371600lnS = new C1371600lnS();
        Activity activity = null;
        if (interfaceC1541990qEHLJIJJ != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        } else {
            viewE1 = null;
        }
        if (viewE1 instanceof WebView) {
            webView = (WebView) viewE1;
        } else {
            webView = null;
        }
        AbstractC1968807nS abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class);
        if (abstractC1968807nS != null) {
            activity = ((C1054770dYR) abstractC1968807nS).getActivity();
        }
        C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        if (c1035880d3y != null) {
            AdWebShareService.LJ(sparkContext, c1371600lnS, c1035880d3y, activity, false);
            InterfaceC1370310llN interfaceC1370310llNLIZ = C1075100e5E.LIZ(new C1075210e5P(webView, sparkContext), str);
            if (interfaceC1370310llNLIZ != null) {
                c1371600lnS.LIZJ(interfaceC1370310llNLIZ);
            }
            BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
            if (baseSharePackage != null) {
                C997860c4e c997860c4e = (C997860c4e) aCListenerS57S1200000_16.l2;
                SparkContext sparkContext2 = (SparkContext) aCListenerS57S1200000_16.l1;
                String str2 = aCListenerS57S1200000_16.s0;
                ((InterfaceC1370310llN) ListProtector.get(c1371600lnS.LJFF, 0)).LJIILIIL(c997860c4e.getContext(), baseSharePackage);
                if (sparkContext2 != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext2.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJJ(0, str2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS57S1200000_16 r10, android.view.View r11) {
        /*
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem r0 = (com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.text.CommerceAgentAnswerTextAssem) r0
            android.content.Context r0 = r0.getContext()
            r5 = 0
            if (r0 == 0) goto L1a
            X.19EG r7 = X.C1388190mED.LIZIZ(r0)
            if (r7 == 0) goto L1a
        L11:
            if (r7 == 0) goto L48
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel r0 = (com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel) r0
            java.lang.String r9 = r10.s0
            goto L25
        L1a:
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L48
            android.app.Activity r7 = r0.LIZIZ()
            goto L11
        L25:
            java.lang.String r10 = r0.getShopifyPid()     // Catch: java.lang.Exception -> L44
            if (r10 != 0) goto L2d
            java.lang.String r10 = ""
        L2d:
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService> r0 = com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService.class
            r1 = 0
            r4 = 14
            r2 = r1
            r3 = r1
            java.lang.Object r6 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L44
            com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService r6 = (com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService) r6     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L48
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = X.C321640CjC.LIZ     // Catch: java.lang.Exception -> L44
            java.lang.String r11 = "iab_ai_agent"
            r6.LIZJ(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C321640CjC.LIZ
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L7c
            java.lang.String r3 = r0.getCreativeIdStr()
        L56:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C321640CjC.LIZ
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L64
            java.lang.String r5 = r0.getLogExtra()
        L64:
            java.lang.String r2 = X.C321640CjC.LIZIZ
            java.lang.String r1 = X.C321640CjC.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.log.IAdChatAgentLogService> r6 = com.ss.android.ugc.aweme.log.IAdChatAgentLogService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.log.IAdChatAgentLogService r0 = (com.ss.android.ugc.aweme.log.IAdChatAgentLogService) r0
            if (r0 == 0) goto L7b
            r0.LJ(r3, r5, r2, r1)
        L7b:
            return
        L7c:
            r3 = r5
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS57S1200000_16.onClick$1(Y.ACListenerS57S1200000_16, android.view.View):void");
    }

    public ACListenerS57S1200000_16(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
