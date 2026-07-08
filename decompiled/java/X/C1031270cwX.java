package X;

import Y.ARunnableS116S0100000_16;
import Y.AfS185S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.IGmtRewardAdFactory;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031270cwX implements InterfaceC1031500cwu, InterfaceC1032830cz3, InterfaceC1031420cwm {
    public final InterfaceC1032940czE LL;
    public final String LLILLJJLI;
    public boolean LLILLL;
    public final List<C1031360cwg> LLILZ = new ArrayList();
    public final List<Context> LLILZIL = new ArrayList();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(549));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(550));
    public final InterfaceC1032100cxs LLIZLLLIL;

    @Override // X.InterfaceC1032830cz3
    public final InterfaceC1032290cyB getCustomAdVideo() {
        return new C1032070cxp();
    }

    @Override // X.InterfaceC1032830cz3
    public final InterfaceC1032380cyK getGpMiniCardManager() {
        return (C1024970cmN) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1033000czK
    public final Gson getGson() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    @Override // X.InterfaceC1032830cz3
    public final InterfaceC1032240cy6 getLandingPageManager() {
        return new C1031530cwx();
    }

    @Override // X.InterfaceC1032830cz3
    public final void exit() {
        InterfaceC1045710dJp interfaceC1045710dJp;
        InterfaceC1031390cwj interfaceC1031390cwj;
        C1031280cwY.LIZ(this);
        InterfaceC1019050ccp interfaceC1019050ccp = (InterfaceC1019050ccp) this.LLILZLL.getValue();
        if ((interfaceC1019050ccp instanceof InterfaceC1031390cwj) && (interfaceC1031390cwj = (InterfaceC1031390cwj) interfaceC1019050ccp) != null) {
            interfaceC1031390cwj.LJII();
        }
        if (((Boolean) C258770ACd.LIZ.getValue()).booleanValue() && (interfaceC1045710dJp = (InterfaceC1045710dJp) this.LLILZLL.getValue()) != null) {
            interfaceC1045710dJp.LJJIFFI(null);
            interfaceC1045710dJp.LJJII(null);
        }
        C622680Oba.LIZLLL(this);
        C1027910cr7.LIZ = null;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null) {
            iCommerceSaasService.LJII();
        }
        String str = this.LLILLJJLI;
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LLILLJJLI);
        ICommerceSaasService iCommerceSaasService2 = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService2 != null) {
            iCommerceSaasService2.LIZ(arrayList);
        }
    }

    @Override // X.InterfaceC1031500cwu
    public final InterfaceC1032100cxs LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1032830cz3
    public final InterfaceC1032330cyF getHostUtils() {
        return new InterfaceC1032330cyF() { // from class: X.0cwn
            @Override // X.InterfaceC1032330cyF
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1032330cyF
            public final void LJFF() {
            }

            @Override // X.InterfaceC1032330cyF
            public final boolean LIZ(String str) {
                if (str == null) {
                    return false;
                }
                return u.LJJIIJZLJL(str, "aweme://lynxview", false);
            }

            @Override // X.InterfaceC1032330cyF
            public final C11JF LIZIZ(InterfaceC1031440cwo interfaceC1031440cwo) {
                return (C11JF) C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS185S0100000_16(interfaceC1031440cwo, 2));
            }

            @Override // X.InterfaceC1032330cyF
            public final String LJ(Object obj) {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                Long creativeId;
                if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
                    return null;
                }
                return creativeId.toString();
            }

            @Override // X.InterfaceC1032330cyF
            public final void LIZJ(int i, int i2, Context context, View view) {
                new C692910RFx().LJIIJ(context, null, view, i, i2, null, null);
            }
        };
    }

    @Override // X.InterfaceC1031420cwm
    public final void LIZ(Context context) {
        Aweme aweme;
        if (this.LLILLL) {
            ((ArrayList) this.LLILZIL).add(context);
            return;
        }
        InterfaceC1019050ccp interfaceC1019050ccp = (InterfaceC1019050ccp) this.LLILZLL.getValue();
        if (interfaceC1019050ccp == null || interfaceC1019050ccp.LJIILIIL() == null || (aweme = interfaceC1019050ccp.getAweme()) == null) {
            return;
        }
        interfaceC1019050ccp.LJJIII(context, aweme);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void handleBroadcastNotification(C484220Iyq c484220Iyq) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq2 = ((n) C1227904rF.LIZLLL().LJII(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "data"), n.class)).LJJIIZ("report_from").LJIL();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2) && c098200Yq2 != null && Intrinsics.LJFF(c098200Yq, "adVideoReportSuccess") && Intrinsics.LJFF(c098200Yq2, "draw_ad")) {
                C622680Oba.LIZLLL(this);
                InterfaceC1032100cxs interfaceC1032100cxs = this.LLIZLLLIL;
                if (interfaceC1032100cxs != null) {
                    interfaceC1032100cxs.reportSuccess();
                }
            }
        }
    }

    @Override // X.InterfaceC1033000czK
    public final void incentiveAdPreloadData(Object obj) {
        C989170bqd.LIZ.getClass();
        C989170bqd.LIZ(obj);
    }

    @Override // X.InterfaceC1032830cz3
    public final void loadDataSuccess(List<Object> list) {
        InterfaceC1031390cwj interfaceC1031390cwj;
        if (list.isEmpty()) {
            return;
        }
        InterfaceC1019050ccp interfaceC1019050ccp = (InterfaceC1019050ccp) this.LLILZLL.getValue();
        if ((interfaceC1019050ccp instanceof InterfaceC1031390cwj) && (interfaceC1031390cwj = (InterfaceC1031390cwj) interfaceC1019050ccp) != null) {
            interfaceC1031390cwj.LJIL(this);
        }
        for (Object obj : list) {
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                C1023060cjI.LJFF(C623440Oco.LIZIZ, aweme);
                C1029590ctp.LJI().getClass();
                if (C1045220dJ2.LJIIIZ(aweme) || C1045220dJ2.LJIIIIZZ(aweme)) {
                    C1045220dJ2.LJIIJ(aweme, C823050WQl.LIZIZ(), new ARunnableS116S0100000_16(this, 272), false);
                }
            }
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1032830cz3
    public final void onAdSelected(Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null) {
                iAwemeService.vr(aweme);
            }
            C1027910cr7.LIZ = aweme.getAwemeRawAd();
        }
    }

    @Override // X.InterfaceC1033000czK
    public final Object parsingHostModel(k kVar) {
        Object c098200Yq;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (Aweme) C1227904rF.LIZLLL().LIZJ(kVar, Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    @Override // X.InterfaceC1032830cz3
    public final void showToast(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131836146);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void addVideoWaterMarker(Object obj, ViewGroup viewGroup) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        IAdsPreviewService iAdsPreviewService;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && viewGroup != null && C1017180cZo.LJIJ(awemeRawAd) && (iAdsPreviewService = (IAdsPreviewService) PluggableExtentionKt.pluggableSpi$default(IAdsPreviewService.class, false, false, false, 14, null)) != null) {
            iAdsPreviewService.LJIIIIZZ(viewGroup.getContext(), viewGroup, new C0RC1(awemeRawAd.getPreviewWatermarkText(), false), null);
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final Object getHybridConfig(Object obj, Context context) {
        Aweme aweme;
        IFeedAdService iFeedAdService;
        C1020420cf2 c1020420cf2LJIILIIL;
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        InterfaceC988500bpY interfaceC988500bpYQ = null;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || context == null || (iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi$default(IFeedAdService.class, false, false, false, 14, null)) == null || (c1020420cf2LJIILIIL = iFeedAdService.LJIILIIL()) == null) {
            return null;
        }
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        Bundle bundle = new Bundle();
        AwS595S0100000_16 awS595S0100000_16 = null;
        ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdService.class, false, false, false, 14, null);
        if (iCommercializeAdService != null) {
            interfaceC988500bpYQ = iCommercializeAdService.Q(17);
        }
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
        }
        bundle.putBoolean("not_open_by_profile_page", true);
        return new C1008080cL8(bundle, strLIZ, c1020420cf2LJIILIIL, awS595S0100000_16, 24);
    }

    @Override // X.InterfaceC1032830cz3
    public final void report(Context context, Object obj) {
        Aweme aweme;
        if (context != null && (obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C622680Oba.LIZJ(this);
            C1047660dMy.LIZIZ.a3(context, aweme, "draw_ad", null, true, null);
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void track3rdPartyURL(C1031380cwi c1031380cwi, Object obj) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        UrlModel urlModel = c1031380cwi.LIZ;
        List<String> list = c1031380cwi.LIZJ;
        if (urlModel != null) {
            C2201691BEx.LIZ(c1031380cwi.LIZIZ, urlModel, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        } else {
            C2201691BEx.LIZJ(c1031380cwi.LIZIZ, list, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void trackEvent(C1031480cws c1031480cws, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackEvent, event: ");
            sbLIZ.append(c1031480cws);
            C2188811AlT.LIZIZ(sbLIZ);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(c1031480cws.LIZ, c1031480cws.LIZIZ, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(c1031480cws.LIZJ, "refer");
            c1022820ciuLIZLLL.LIZ(c1031480cws.LIZLLL);
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void trackEventFromJSB(C1031480cws c1031480cws, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(c1031480cws.LIZ, c1031480cws.LIZIZ, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(c1031480cws.LIZJ, "refer");
            c1022820ciuLIZLLL.LIZ(c1031480cws.LIZLLL);
            if (C13LQ.LJJIJIIJI(c1031480cws.LIZIZ, new String[]{"click", "realtime_click"}) >= 0) {
                c1022820ciuLIZLLL.LIZIZ("1", "is_from_jsb");
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void trackUserEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // X.InterfaceC1032830cz3
    public final void handleTap(Context context, Map<EnumC1005430cGr, ? extends Object> map, Object obj) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        final String str;
        Integer num;
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String aid;
        InterfaceC988500bpY interfaceC988500bpYQ = null;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        Object obj2 = map.get(EnumC1005430cGr.REFER);
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleTap, type: ");
        sbLIZ.append(awemeRawAd.getType());
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        String type = awemeRawAd.getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 117588 && type.equals("web") && (aid = aweme.getAid()) != null) {
                    C1027570cqZ.LIZIZ(aid, awemeRawAd, context, str, new InterfaceC1021920chS() { // from class: X.0cwe
                        @Override // X.InterfaceC1021920chS
                        public final void LIZ() {
                            InterfaceC1032100cxs interfaceC1032100cxs = this.LIZ.LLIZLLLIL;
                            if (interfaceC1032100cxs != null) {
                                interfaceC1032100cxs.onHandleTapFinished(str);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (!type.equals("app")) {
                return;
            }
            Object obj3 = map.get(EnumC1005430cGr.ENTER_FROM);
            if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null) {
                return;
            }
            int iIntValue = num.intValue();
            ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdService.class, false, false, false, 14, null);
            if (iCommercializeAdService != null) {
                interfaceC988500bpYQ = iCommercializeAdService.Q(17);
            }
            if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
                interfaceC1000280c8Y.LJIIIZ(context, aweme, iIntValue, new InterfaceC1021920chS() { // from class: X.0cwf
                    @Override // X.InterfaceC1021920chS
                    public final void LIZ() {
                        InterfaceC1032100cxs interfaceC1032100cxs = this.LIZ.LLIZLLLIL;
                        if (interfaceC1032100cxs != null) {
                            interfaceC1032100cxs.onHandleTapFinished(str);
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void jumpRoute(Context context, C1016240cYI c1016240cYI, Object obj) {
        Aweme aweme;
        ICRouterManager iCRouterManager;
        GMTBaseModel gMTBaseModelLIZ;
        if (context != null && (obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null)) != null) {
            String aid = aweme.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
            if (iCRouterModelTransform != null) {
                gMTBaseModelLIZ = iCRouterModelTransform.LIZ(C1017070cZd.LJJIJLIJ(aweme));
            } else {
                gMTBaseModelLIZ = null;
            }
            C1025880cnq c1025880cnq = new C1025880cnq(context, aid, aweme, awemeRawAdLJJIJLIJ, gMTBaseModelLIZ);
            String str2 = c1016240cYI.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            C1025520cnG c1025520cnG = new C1025520cnG(null, "", null, str, c1016240cYI.LIZ, 0, null, null, 965);
            C1025670cnV c1025670cnV = C1025670cnV.LIZIZ;
            CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4((CRouterCoreModel) null, new C1025430cn7(c1025670cnV, c1025670cnV, null, null, 124), 5), true);
            if (cRouterManagerLIZLLL != null) {
                cRouterManagerLIZLLL.LJI();
            }
        }
    }

    @Override // X.InterfaceC1032830cz3
    public final void trackOMSDK(AbstractC1892207b6 abstractC1892207b6, Object obj, Context context) {
        Aweme aweme;
        InterfaceC1019050ccp interfaceC1019050ccp = (InterfaceC1019050ccp) this.LLILZLL.getValue();
        if (interfaceC1019050ccp == null || !(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || context == null) {
            return;
        }
        if (this.LLILLL) {
            ((ArrayList) this.LLILZ).add(new C1031360cwg(abstractC1892207b6, aweme, context));
            return;
        }
        if (abstractC1892207b6 instanceof C1892607bA) {
            C1892607bA c1892607bA = (C1892607bA) abstractC1892207b6;
            interfaceC1019050ccp.LIZJ(context, c1892607bA.LIZ, aweme, c1892607bA.LIZIZ);
            interfaceC1019050ccp.LJ(c1892607bA.LIZ, aweme);
            return;
        }
        if (abstractC1892207b6 instanceof C1891307ax) {
            interfaceC1019050ccp.LJIIL(context, aweme, ((C1891307ax) abstractC1892207b6).LIZ);
            return;
        }
        if (abstractC1892207b6 instanceof C07XY) {
            abstractC1892207b6.getClass();
            interfaceC1019050ccp.LJJ(context, aweme);
            return;
        }
        if (abstractC1892207b6 instanceof C1031300cwa) {
            C1031300cwa c1031300cwa = (C1031300cwa) abstractC1892207b6;
            interfaceC1019050ccp.LJJIFFI(c1031300cwa.LIZJ);
            interfaceC1019050ccp.LJJII(c1031300cwa.LIZLLL);
            interfaceC1019050ccp.LJIJJ(interfaceC1019050ccp);
            interfaceC1019050ccp.LJIIJ(c1031300cwa.LIZ, context, c1031300cwa.LIZIZ, aweme);
            return;
        }
        if (abstractC1892207b6 instanceof C1891807b2) {
            interfaceC1019050ccp.LJJIIJ(((C1891807b2) abstractC1892207b6).LIZ, context, aweme);
            return;
        }
        if ((abstractC1892207b6 instanceof C1891107av) || (abstractC1892207b6 instanceof C1891507az)) {
            return;
        }
        if (abstractC1892207b6 instanceof C07XW) {
            abstractC1892207b6.getClass();
            interfaceC1019050ccp.LJIJJLI(context, null, aweme, false);
        } else if (Intrinsics.LJFF(abstractC1892207b6, C1892407b8.LIZ)) {
            interfaceC1019050ccp.LIZIZ(context, aweme);
            interfaceC1019050ccp.LJ(null, null);
        } else {
            if (Intrinsics.LJFF(abstractC1892207b6, new AbstractC1892207b6() { // from class: X.07b7
            })) {
                interfaceC1019050ccp.LJIJ(context, aweme);
                return;
            }
            throw new C1954807lC();
        }
    }

    public C1031270cwX(C1031810cxP c1031810cxP, InterfaceC1032940czE interfaceC1032940czE, String str, InterfaceC1032410cyN interfaceC1032410cyN) {
        C1032800cz0 c1032800cz0LIZ;
        this.LL = interfaceC1032940czE;
        this.LLILLJJLI = str;
        IGmtRewardAdFactory iGmtRewardAdFactory = (IGmtRewardAdFactory) PluggableExtentionKt.pluggableSpi$default(IGmtRewardAdFactory.class, false, false, false, 14, null);
        if (iGmtRewardAdFactory != null) {
            c1032800cz0LIZ = iGmtRewardAdFactory.LIZ(c1031810cxP, new C1033040czO(((Boolean) C277640AuQ.LIZ.getValue()).booleanValue(), ((Boolean) C277690AuV.LIZ.getValue()).booleanValue(), ((Boolean) C277740Aua.LIZ.getValue()).booleanValue(), C0C64.LJIILLIIL().LJIIIZ(31744, "incentive_ad_lynx2native_enable", true, true), C0C64.LJIILLIIL().LJIIIZ(31744, "incentive_ad_fix_report_logic_enable", true, true), ((Boolean) C263950AWb.LIZ.getValue()).booleanValue(), ((Number) C258910ACr.LIZ.getValue()).intValue()), interfaceC1032940czE, this, interfaceC1032410cyN, new C1031470cwr().LIZ);
        } else {
            c1032800cz0LIZ = null;
        }
        this.LLIZLLLIL = c1032800cz0LIZ;
    }

    @Override // X.InterfaceC1032830cz3
    public final InterfaceC1032210cy3 getRewardAnoleModule(Context context, InterfaceC1032120cxu interfaceC1032120cxu, ViewGroup viewGroup, InterfaceC1032280cyA interfaceC1032280cyA, InterfaceC1016100cY4 interfaceC1016100cY4) {
        return new C1016040cXy(context, interfaceC1032120cxu, viewGroup, interfaceC1032280cyA, interfaceC1016100cY4);
    }

    @Override // X.InterfaceC1033000czK
    public final void request(EnumC1033600d0I enumC1033600d0I, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033390czx, Unit> function1) {
        C1033580d0G.LIZ.getClass();
        C1033580d0G.LIZ(enumC1033600d0I, str, map, map2, function1);
    }
}
