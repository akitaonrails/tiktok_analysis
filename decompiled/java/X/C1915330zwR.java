package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS7S1000000_12;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915330zwR implements InterfaceC1914220zue {
    public final /* synthetic */ PolicyNoticeServiceImpl LIZIZ;

    @Override // X.InterfaceC1914220zue
    public final void LIZLLL() {
        if (this.LIZIZ.LIZ) {
            LJI();
        }
    }

    public static void LJI() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
        }
    }

    public C1915330zwR(PolicyNoticeServiceImpl policyNoticeServiceImpl) {
        this.LIZIZ = policyNoticeServiceImpl;
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZ(C1519370pdn c1519370pdn) {
        C11JF c11jf = this.LIZIZ.LJIIIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LIZIZ.LJIIJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        PolicyNoticeServiceImpl policyNoticeServiceImpl = this.LIZIZ;
        policyNoticeServiceImpl.LJIIIZ = null;
        policyNoticeServiceImpl.LJIIJ = null;
        policyNoticeServiceImpl.LJIIJJI = false;
        C622680Oba.LIZLLL(this);
        if (this.LIZIZ.LIZLLL) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("policy_notice_popup_defer", true)) {
                PolicyNoticeServiceImpl.LJIILIIL = "";
                return;
            }
        }
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(121);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJFF("policy_notice_dismiss_delay", 0L) == 0) {
            aFwS217S0000000_28.invoke();
            return;
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19((Object) aFwS217S0000000_28, 33);
        SettingsManager.LIZLLL().getClass();
        C786410Ut5.LJLIIL(SettingsManager.LJFF("policy_notice_dismiss_delay", 0L), bPEAHandler, aRunnableS119S0100000_19);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // X.InterfaceC1914220zue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C1519370pdn r6) {
        /*
            r5 = this;
            X.102U r0 = X.C102U.LIZ
            r0.getClass()
            r2 = 1
            X.C102U.LJFF = r2
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r0 = r5.LIZIZ
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L74
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r0 = r5.LIZIZ
            java.lang.String r1 = r6.LIZ
            r0.getClass()
            java.util.List<java.lang.String> r0 = com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl.LJIILJJIL
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L74
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            boolean r0 = r0.isPaused()
            if (r0 == 0) goto L2e
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            r0.LJIILLIIL()
        L2e:
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r0 = r5.LIZIZ
            r0.LJIIJJI = r2
        L32:
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r0 = r5.LIZIZ
            X.11JF r0 = r0.LJIIIZ
            if (r0 == 0) goto L3b
            r0.dispose()
        L3b:
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r0 = r5.LIZIZ
            X.11JF r0 = r0.LJIIJ
            if (r0 == 0) goto L44
            r0.dispose()
        L44:
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r3 = r5.LIZIZ
            X.0ziL r0 = X.C1906580ziK.LIZJ()
            X.09Pw r2 = r0.LJIIIIZZ()
            Y.AfS148S0200000_12 r1 = new Y.AfS148S0200000_12
            r0 = 36
            r1.<init>(r5, r6, r0)
            X.11JF r0 = r2.LJLLLLLL(r1)
            r3.LJIIIZ = r0
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r4 = r5.LIZIZ
            X.0ziL r0 = X.C1906580ziK.LIZJ()
            X.09Pw r3 = r0.LIZ()
            Y.AfS117S0300000_28 r2 = new Y.AfS117S0300000_28
            com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl r1 = r5.LIZIZ
            r0 = 0
            r2.<init>(r5, r1, r6, r0)
            X.11JF r0 = r3.LJLLLLLL(r2)
            r4.LJIIJ = r0
            return
        L74:
            LJI()
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915330zwR.LJFF(X.0pdn):void");
    }

    public static void LJII(C1519370pdn c1519370pdn, boolean z) {
        Map map;
        String str;
        Object objLJJJLIIL = C13LP.LJJJLIIL(c1519370pdn.LJ.values());
        Object obj = null;
        if (objLJJJLIIL instanceof Map) {
            map = (Map) objLJJJLIIL;
        } else {
            map = null;
        }
        if (z) {
            if (map != null) {
                obj = map.get("on_success");
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                return;
            }
        } else {
            if (map != null) {
                obj = map.get("on_fail");
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                return;
            }
        }
        if (str != null && !a0.LJJJIL(str)) {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS7S1000000_12(str, 2));
        }
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
        Object next;
        Object obj;
        Map map;
        Object obj2;
        Map map2;
        Map map3;
        int iHashCode = str.hashCode();
        if (iHashCode != -2032186645) {
            if (iHashCode != 53065585) {
                if (iHashCode == 1203972105 && str.equals("reload_settings")) {
                    C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0zwV
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$onCustomizedAction$1");
                            try {
                                C102U.LIZ.getClass();
                                C102U.LIZJ().LIZ(null, 0);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$onCustomizedAction$1");
                        }
                    });
                    return;
                }
                return;
            }
            if (!str.equals("submit_data")) {
                return;
            }
            Iterator<T> it2 = c1519370pdn.LJ.values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if ((next instanceof Map) && (map3 = (Map) next) != null && Intrinsics.LJFF(map3.get("selected"), Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if ((next instanceof Map) && (map2 = (Map) next) != null) {
                obj = map2.get("consent_data");
            } else {
                obj = null;
            }
            if (!(obj instanceof Map) || (map = (Map) obj) == null || (obj2 = map.get("key")) == null || Intrinsics.LJFF(obj2, EnumC683800Qry.TT_DMA_CONSENT.getKey())) {
                return;
            }
            C793770VBv.LJII("call_consent_sdk_from_server_popup", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("consent_key", obj2), new Pair("popup_business", c1519370pdn.LIZ))), null, null);
            return;
        }
        if (!str.equals("non_personalized_feed_off")) {
            return;
        }
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null) {
            C1915720zx4.LJIIIIZZ(null, "dsa_consent_box_universal_popup", Collections.singletonList(new C1876860ywO(EnumC683800Qry.TT_DSA_RECOMMENDATION_CONSENT.getKey(), EnumC1876780ywG.APPROVE, EnumC1915430zwb.DSA_CONSENT_BOX_UNIVERSAL_POPUP.getS(), null, null, null, 120)));
        }
        ((IComplianceBusinessService) this.LIZIZ.LJI.getValue()).LJIJJ(false);
    }

    @Override // X.InterfaceC1914220zue
    public final void LIZJ(Boolean bool, String str) {
        Context contextLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, str);
        smartRouteBuildRoute.withParam("use_webview_title", true);
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    @Override // X.InterfaceC1914220zue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction r7, X.C1519370pdn r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915330zwR.LJ(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, X.0pdn):void");
    }
}
