package X;

import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IRewardAdFactory;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031260cwW implements InterfaceC1031500cwu, InterfaceC1032840cz4, InterfaceC1031420cwm {
    public final InterfaceC1032940czE LL;
    public final String LLILLJJLI;
    public boolean LLILZ;
    public final InterfaceC1032100cxs LLJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(165));
    public final List<C1027830cqz> LLILZIL = new ArrayList();
    public final List<Context> LLILZLL = new ArrayList();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(166));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(167));

    public final InterfaceC1019050ccp LIZIZ() {
        return (InterfaceC1019050ccp) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1032840cz4
    public final InterfaceC1031720cxG getGpMiniCardManager() {
        return (C1024980cmO) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1032840cz4
    public final void exit() {
        InterfaceC1031390cwj interfaceC1031390cwj;
        C1027570cqZ.LIZ(this);
        InterfaceC1019050ccp interfaceC1019050ccpLIZIZ = LIZIZ();
        if ((interfaceC1019050ccpLIZIZ instanceof InterfaceC1031390cwj) && (interfaceC1031390cwj = (InterfaceC1031390cwj) interfaceC1019050ccpLIZIZ) != null) {
            interfaceC1031390cwj.LJII();
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
        return this.LLJ;
    }

    @Override // X.InterfaceC1031420cwm
    public final void LIZ(Context context) {
        if (this.LLILZ) {
            ((ArrayList) this.LLILZLL).add(context);
        } else {
            LIZLLL(context);
        }
    }

    public final void LIZLLL(Context context) {
        Aweme aweme;
        if (LIZIZ().LJIILIIL() == null || (aweme = LIZIZ().getAweme()) == null) {
            return;
        }
        LIZIZ().LJJIII(context, aweme);
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
                c098200Yq2 = ((n) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "data"), n.class)).LJJIIZ("report_from").LJIL();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2) && c098200Yq2 != null && Intrinsics.LJFF(c098200Yq, "adVideoReportSuccess") && Intrinsics.LJFF(c098200Yq2, "draw_ad")) {
                C622680Oba.LIZLLL(this);
                InterfaceC1032100cxs interfaceC1032100cxs = this.LLJ;
                if (interfaceC1032100cxs != null) {
                    interfaceC1032100cxs.reportSuccess();
                }
            }
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void loadDataSuccess(Object obj) {
        Aweme aweme;
        InterfaceC1031390cwj interfaceC1031390cwj;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            InterfaceC1019050ccp interfaceC1019050ccpLIZIZ = LIZIZ();
            if ((interfaceC1019050ccpLIZIZ instanceof InterfaceC1031390cwj) && (interfaceC1031390cwj = (InterfaceC1031390cwj) interfaceC1019050ccpLIZIZ) != null) {
                interfaceC1031390cwj.LJIL(this);
            }
            C1029590ctp.LJI().getClass();
            if (C1045220dJ2.LJIIIZ(aweme) || C1045220dJ2.LJIIIIZZ(aweme)) {
                C1045220dJ2.LJIIJ(aweme, C15O7.LJI, new ARunnableS116S0100000_16(this, 50), false);
            }
            this.LLILZ = true;
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).vr(aweme);
            C1027910cr7.LIZ = aweme.getAwemeRawAd();
            ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
            C1024380clQ.LJIILIIL(Collections.singletonList(aweme), null, null);
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void showToast(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131836146);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final C1008080cL8 getHybridConfig(Object obj, Context context) {
        Aweme aweme;
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || context == null) {
            return null;
        }
        C1020420cf2 c1020420cf2LJIILIIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIILIIL();
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        Bundle bundle = new Bundle();
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
        }
        bundle.putBoolean("not_open_by_profile_page", true);
        return new C1008080cL8(bundle, strLIZ, c1020420cf2LJIILIIL, (AwS595S0100000_16) null, 24);
    }

    @Override // X.InterfaceC1032840cz4
    public final void report(Context context, Object obj) {
        Aweme aweme;
        if (context != null && (obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C622680Oba.LIZJ(this);
            C1047660dMy.LIZIZ.a3(context, aweme, "draw_ad", null, true, null);
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void track3rdPartyURL(C1031370cwh c1031370cwh, Object obj) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        UrlModel urlModel = c1031370cwh.LIZ;
        List<String> list = c1031370cwh.LIZJ;
        if (urlModel != null) {
            C2201691BEx.LIZ(c1031370cwh.LIZIZ, urlModel, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        } else {
            C2201691BEx.LIZJ(c1031370cwh.LIZIZ, list, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void trackEvent(C1031310cwb c1031310cwb, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(c1031310cwb.LIZ, c1031310cwb.LIZIZ, aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(c1031310cwb.LIZJ, "refer");
            c1022820ciuLIZLLL.LIZ(c1031310cwb.LIZLLL);
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void trackUserEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    public C1031260cwW(C1031810cxP c1031810cxP, InterfaceC1032940czE interfaceC1032940czE, String str) {
        C1032810cz1 c1032810cz1LIZ;
        this.LL = interfaceC1032940czE;
        this.LLILLJJLI = str;
        IRewardAdFactory iRewardAdFactory = (IRewardAdFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdFactory.class, false, false, false, 14, null);
        if (iRewardAdFactory != null) {
            c1032810cz1LIZ = iRewardAdFactory.LIZ(c1031810cxP, interfaceC1032940czE, this);
        } else {
            c1032810cz1LIZ = null;
        }
        this.LLJ = c1032810cz1LIZ;
    }

    @Override // X.InterfaceC1032840cz4
    public final void handleTap(Context context, Map<EnumC1005420cGq, ? extends Object> map, Object obj) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        final String str;
        Integer num;
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String aid;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        Object obj2 = map.get(EnumC1005420cGq.REFER);
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
                    C1027570cqZ.LIZIZ(aid, awemeRawAd, context, str, new InterfaceC1021920chS() { // from class: X.0cwc
                        @Override // X.InterfaceC1021920chS
                        public final void LIZ() {
                            InterfaceC1032100cxs interfaceC1032100cxs = this.LIZ.LLJ;
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
            Object obj3 = map.get(EnumC1005420cGq.ENTER_FROM);
            if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null) {
                return;
            }
            int iIntValue = num.intValue();
            InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
            if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
                interfaceC1000280c8Y.LJIIIZ(context, aweme, iIntValue, new InterfaceC1021920chS() { // from class: X.0cwd
                    @Override // X.InterfaceC1021920chS
                    public final void LIZ() {
                        InterfaceC1032100cxs interfaceC1032100cxs = this.LIZ.LLJ;
                        if (interfaceC1032100cxs != null) {
                            interfaceC1032100cxs.onHandleTapFinished(str);
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1032840cz4
    public final void trackOMSDK(AbstractC1891907b3 abstractC1891907b3, Object obj, Context context) {
        Aweme aweme;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || context == null) {
            return;
        }
        if (this.LLILZ) {
            ((ArrayList) this.LLILZIL).add(new C1027830cqz(abstractC1891907b3, aweme, context));
            return;
        }
        if (abstractC1891907b3 instanceof C1892507b9) {
            C1892507b9 c1892507b9 = (C1892507b9) abstractC1891907b3;
            LIZIZ().LIZJ(context, c1892507b9.LIZ, aweme, c1892507b9.LIZIZ);
            LIZIZ().LJ(c1892507b9.LIZ, aweme);
            return;
        }
        if (abstractC1891907b3 instanceof C1891207aw) {
            LIZIZ().LJIIL(context, aweme, ((C1891207aw) abstractC1891907b3).LIZ);
            return;
        }
        if (abstractC1891907b3 instanceof C07XX) {
            InterfaceC1019050ccp interfaceC1019050ccpLIZIZ = LIZIZ();
            abstractC1891907b3.getClass();
            interfaceC1019050ccpLIZIZ.LJJ(context, aweme);
            return;
        }
        if (abstractC1891907b3 instanceof C1031290cwZ) {
            InterfaceC1019050ccp interfaceC1019050ccpLIZIZ2 = LIZIZ();
            C1031290cwZ c1031290cwZ = (C1031290cwZ) abstractC1891907b3;
            interfaceC1019050ccpLIZIZ2.LJJIFFI(c1031290cwZ.LIZJ);
            interfaceC1019050ccpLIZIZ2.LJJII(c1031290cwZ.LIZLLL);
            LIZIZ().LJIJJ(LIZIZ());
            LIZIZ().LJIIJ(c1031290cwZ.LIZ, context, c1031290cwZ.LIZIZ, aweme);
            return;
        }
        if (abstractC1891907b3 instanceof C1891707b1) {
            LIZIZ().LJJIIJ(((C1891707b1) abstractC1891907b3).LIZ, context, aweme);
            return;
        }
        if ((abstractC1891907b3 instanceof C1891007au) || (abstractC1891907b3 instanceof C1891407ay)) {
            return;
        }
        if (abstractC1891907b3 instanceof C07XV) {
            InterfaceC1019050ccp interfaceC1019050ccpLIZIZ3 = LIZIZ();
            abstractC1891907b3.getClass();
            interfaceC1019050ccpLIZIZ3.LJIJJLI(context, null, aweme, false);
        } else if (Intrinsics.LJFF(abstractC1891907b3, C1892107b5.LIZ)) {
            LIZIZ().LIZIZ(context, aweme);
            LIZIZ().LJ(null, null);
        } else {
            if (Intrinsics.LJFF(abstractC1891907b3, new AbstractC1891907b3() { // from class: X.07b4
            })) {
                LIZIZ().LJIJ(context, aweme);
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1033030czN
    public final void request(EnumC1033610d0J enumC1033610d0J, String str, Map<String, String> map, Map<String, String> map2, Function1<? super AbstractC1033380czw, Unit> function1) {
        C1033570d0F.LIZ.getClass();
        C1033570d0F.LIZ(enumC1033610d0J, str, map, map2, function1);
    }
}
