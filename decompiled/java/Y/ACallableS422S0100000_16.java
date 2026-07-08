package Y;

import X.C098200Yq;
import X.C0C64;
import X.C1002250cBj;
import X.C1002270cBl;
import X.C1015330cWp;
import X.C1017070cZd;
import X.C1019240cd8;
import X.C1020790cfd;
import X.C1022500ciO;
import X.C1022670cif;
import X.C1022820ciu;
import X.C1024100cky;
import X.C1024150cl3;
import X.C1024380clQ;
import X.C1024500clc;
import X.C1024550clh;
import X.C1025340cmy;
import X.C1027250cq3;
import X.C1030680cva;
import X.C1030780cvk;
import X.C1030790cvl;
import X.C1030840cvq;
import X.C1055960daM;
import X.C1074600e4Q;
import X.C1075950e6b;
import X.C1075970e6d;
import X.C1076000e6g;
import X.C123100dR;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C189200o6;
import X.C1AF0;
import X.C1C7U;
import X.C214775193l;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2214471Bll;
import X.C23250099c;
import X.C23271099x;
import X.C2344809Gs;
import X.C295940Biq;
import X.C7740030o;
import X.C799890VZj;
import X.C799900VZk;
import X.C844470XAv;
import X.EnumC1074240e3q;
import X.InterfaceC1022870ciz;
import X.InterfaceC1022880cj0;
import X.InterfaceC1058390deH;
import X.InterfaceC1075980e6e;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS67S1000000_16;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS422S0100000_16 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1C7U.LIZ("AdxDeepLinkManager@1914.handleUri$1");
        C1024550clh c1024550clh = C1024550clh.LIZ;
        Uri uri = (Uri) aCallableS422S0100000_16.l0;
        c1024550clh.getClass();
        C1024500clc c1024500clc = C1024550clh.LIZJ;
        String string = null;
        C1024550clh.LIZJ = null;
        if (c1024500clc != null) {
            String str = c1024500clc.LIZ;
            if (str != null && str.length() > 0) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1024500clc.LIZ;
            } else {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tag");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tag");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "draw_ad";
                }
            }
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            c1024100ckyLIZ.LIZIZ = "open_url_appback";
            c1024100ckyLIZ.LIZLLL(Long.valueOf(c1024500clc.LIZIZ));
            c1024100ckyLIZ.LJI(c1024500clc.LIZJ);
            Long lValueOf = Long.valueOf(c1024500clc.LIZLLL);
            if (lValueOf != null) {
                string = lValueOf.toString();
            }
            c1024100ckyLIZ.LIZLLL = string;
            c1024100ckyLIZ.LJIIIZ();
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                C2184171Adz.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "open_url_appback", String.valueOf(c1024500clc.LIZIZ), c1024500clc.LIZJ, String.valueOf(c1024500clc.LIZLLL)).LJIIIIZZ();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdxDeepLinkManager@1914.handleUri$1");
        return unit;
    }

    public static final Object call$1(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        List list = (List) aCallableS422S0100000_16.l0;
        C1C7U.LIZ("TopViewPreloadManager@b174.preload$1L");
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                new C1015330cWp(it2.next()).LJJIIZ();
            }
        }
        C1C7U.LIZIZ("TopViewPreloadManager@b174.preload$1L");
        return null;
    }

    public static final Object call$10(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        C1C7U.LIZ("ThirdAppOpenUrlHandler@13d3.doHandle$2");
        try {
            C1025340cmy.LIZIZ.LIZ = ((C1027250cq3) aCallableS422S0100000_16.l0).LJ().LIZ.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LJI(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ThirdAppOpenUrlHandler@13d3.doHandle$2");
        return unit;
    }

    public static final Object call$2(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        Object c098200Yq;
        int iIntValue;
        boolean z;
        C1C7U.LIZ("AddContentLabelComponent@a79.showGuideIfNeed$1");
        C1002270cBl c1002270cBlZ4 = ((C214775193l) aCallableS422S0100000_16.l0).Z4();
        c1002270cBlZ4.getClass();
        C1002250cBj.LIZ.getClass();
        boolean z2 = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Integer.valueOf(SettingsManager.LJ("enable_add_content_labels_entry_highlight", 1));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = C1002250cBj.LIZIZ;
        }
        if (iIntValue == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || ((Keva) c1002270cBlZ4.LIZ.getValue()).getBoolean("CACHE_KEY_GUIDE_SHOWN_STATE", false)) {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1C7U.LIZIZ("AddContentLabelComponent@a79.showGuideIfNeed$1");
        return boolValueOf;
    }

    public static final Object call$3(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        Aweme aweme = (Aweme) aCallableS422S0100000_16.l0;
        C1C7U.LIZ("AdOpenBaseUtils@abbc.openFeedAdScheme$1L");
        try {
            C1025340cmy.LIZIZ.LIZ = aweme.getAwemeRawAd();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        C1C7U.LIZIZ("AdOpenBaseUtils@abbc.openFeedAdScheme$1L");
        return null;
    }

    public static final Object call$4(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        C1C7U.LIZ("ContactUploadUtil@889d.uploadContacts$1");
        Collection collection = (Collection) C23250099c.LJ(C23271099x.INSTANCE, new C1055960daM((EnumC1074240e3q) aCallableS422S0100000_16.l0, null));
        if (collection != null && !collection.isEmpty()) {
            if (C295940Biq.LIZ() && C1075950e6b.LIZIZ() && C295940Biq.LIZ()) {
                C1075970e6d c1075970e6d = C1075950e6b.LIZIZ;
                C1075950e6b.LIZ.getClass();
                String strLIZ = C1075950e6b.LIZ("contact_last_upload_time");
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC1075980e6e interfaceC1075980e6e = ((C1076000e6g) c1075970e6d.LIZ.getValue()).LIZ;
                if (interfaceC1075980e6e != null) {
                    interfaceC1075980e6e.LIZ(strLIZ, jCurrentTimeMillis);
                }
            }
            Keva repo = Keva.getRepo("friendslist_permission_keva_name");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            SettingsManager.LIZLLL().getClass();
            repo.storeLong("contact_upload_next_time_key", jCurrentTimeMillis2 + (SettingsManager.LJFF("addressbook_upload_interval", 86400L) * 1000));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContacts$1");
        return unit;
    }

    public static final Object call$5(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        C1C7U.LIZ("AdRouterTestUtils@7e7b.openAdLink$5");
        try {
            C1025340cmy.LIZIZ.LIZ = ((Aweme) aCallableS422S0100000_16.l0).getAwemeRawAd();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        C1C7U.LIZIZ("AdRouterTestUtils@7e7b.openAdLink$5");
        return null;
    }

    public static final Object call$6(ACallableS422S0100000_16 aCallableS422S0100000_16) throws JSONException {
        long j;
        IAppLogDepend iAppLogDependLIZ;
        InterfaceC1022880cj0 interfaceC1022880cj0;
        C1022820ciu c1022820ciu;
        C1C7U.LIZ("AdLogHelper$InnerAdLog@62d1.send$1");
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        JSONObject jSONObjectLJ = ((C1022820ciu) aCallableS422S0100000_16.l0).LJ();
        try {
            C1019240cd8 c1019240cd8 = C1019240cd8.LIZ;
            C1022820ciu c1022820ciu2 = (C1022820ciu) aCallableS422S0100000_16.l0;
            c1019240cd8.LIZ(c1022820ciu2.LIZ, c1022820ciu2.LIZIZ, c1022820ciu2.LIZJ, jSONObjectLJ);
            jSONObjectLJ.put("tag", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZ);
            C1022670cif.LIZ.getClass();
            InterfaceC1022870ciz interfaceC1022870ciz = (InterfaceC1022870ciz) C1022670cif.LJIIJ.getValue();
            C1022820ciu c1022820ciu3 = (C1022820ciu) aCallableS422S0100000_16.l0;
            interfaceC1022870ciz.LIZ(new C1074600e4Q(c1022820ciu3.LJFF, jSONObjectLJ, c1022820ciu3.LIZIZ, c1022820ciu3.LIZJ));
            interfaceC1022880cj0 = (InterfaceC1022880cj0) C1022670cif.LJIIJJI.getValue();
            c1022820ciu = (C1022820ciu) aCallableS422S0100000_16.l0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (!interfaceC1022880cj0.LIZ(new C1074600e4Q(c1022820ciu.LJFF, jSONObjectLJ, c1022820ciu.LIZIZ, c1022820ciu.LIZJ))) {
            C1022820ciu c1022820ciu4 = (C1022820ciu) aCallableS422S0100000_16.l0;
            C2184171Adz.LIZ(c1022820ciu4.LIZ, c1022820ciu4.LIZIZ, c1022820ciu4.LIZJ, jSONObjectLJ);
            try {
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
            if (C123100dR.LIZ(((C1022820ciu) aCallableS422S0100000_16.l0).LIZLLL)) {
                j = CastLongProtector.parseLong(((C1022820ciu) aCallableS422S0100000_16.l0).LIZLLL);
            } else {
                j = 0;
            }
            if (TextUtils.equals(((C1022820ciu) aCallableS422S0100000_16.l0).LIZIZ, "click")) {
                C1022820ciu c1022820ciu5 = (C1022820ciu) aCallableS422S0100000_16.l0;
                C1022500ciO.LIZIZ(j, c1022820ciu5.LIZ, c1022820ciu5.LIZJ, jSONObjectLJ, true);
                IAppLogDepend iAppLogDependLIZ2 = C2214471Bll.LIZ();
                if (iAppLogDependLIZ2 != null) {
                    C1022820ciu c1022820ciu6 = (C1022820ciu) aCallableS422S0100000_16.l0;
                    iAppLogDependLIZ2.onEventV1(contextLIZ, c1022820ciu6.LIZ, null, c1022820ciu6.LIZIZ, c1022820ciu6.LIZJ, j, jSONObjectLJ);
                }
            } else {
                String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true);
                if (strLJJ != null) {
                    int iHashCode = strLJJ.hashCode();
                    if (iHashCode != 3707) {
                        if (iHashCode != 3709) {
                            if (iHashCode == 96673 && strLJJ.equals("all")) {
                                jSONObjectLJ.put("_ad_staging_flag", "1");
                                IAppLogDepend iAppLogDependLIZ3 = C2214471Bll.LIZ();
                                if (iAppLogDependLIZ3 != null) {
                                    C1022820ciu c1022820ciu7 = (C1022820ciu) aCallableS422S0100000_16.l0;
                                    iAppLogDependLIZ3.onEventV1(contextLIZ, c1022820ciu7.LIZ, null, c1022820ciu7.LIZIZ, c1022820ciu7.LIZJ, j, jSONObjectLJ);
                                }
                                jSONObjectLJ.put("_ad_staging_flag", "3");
                                jSONObjectLJ.put("tag", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZ);
                                jSONObjectLJ.put("value", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZJ);
                                jSONObjectLJ.put("group_id", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZLLL);
                                jSONObjectLJ.put("category", "event_v3");
                                IAppLogDepend iAppLogDependLIZ4 = C2214471Bll.LIZ();
                                if (iAppLogDependLIZ4 != null) {
                                    iAppLogDependLIZ4.onEventV3Json(((C1022820ciu) aCallableS422S0100000_16.l0).LIZIZ, jSONObjectLJ);
                                }
                            }
                        } else if (strLJJ.equals("v3")) {
                            jSONObjectLJ.put("tag", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZ);
                            jSONObjectLJ.put("value", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZJ);
                            jSONObjectLJ.put("group_id", ((C1022820ciu) aCallableS422S0100000_16.l0).LIZLLL);
                            jSONObjectLJ.put("category", "event_v3");
                            IAppLogDepend iAppLogDependLIZ5 = C2214471Bll.LIZ();
                            if (iAppLogDependLIZ5 != null) {
                                iAppLogDependLIZ5.onEventV3Json(((C1022820ciu) aCallableS422S0100000_16.l0).LIZIZ, jSONObjectLJ);
                            }
                        }
                    } else if (strLJJ.equals("v1") && (iAppLogDependLIZ = C2214471Bll.LIZ()) != null) {
                        C1022820ciu c1022820ciu8 = (C1022820ciu) aCallableS422S0100000_16.l0;
                        iAppLogDependLIZ.onEventV1(contextLIZ, c1022820ciu8.LIZ, null, c1022820ciu8.LIZIZ, c1022820ciu8.LIZJ, j, jSONObjectLJ);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdLogHelper$InnerAdLog@62d1.send$1");
        return unit;
    }

    public static final Object call$7(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        int brandSafety;
        AwemeRawAd awemeRawAd;
        JSONArray jSONArray = (JSONArray) aCallableS422S0100000_16.l0;
        C1C7U.LIZ("SplashAdInitManager@b427.initSplashFactory$1$preLoadAwemesFromSDK$1L");
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            ArrayList<Aweme> arrayList = new ArrayList();
            Gson gson = C7740030o.LIZ().getGson();
            if (gson == null) {
                C1C7U.LIZIZ("SplashAdInitManager@b427.initSplashFactory$1$preLoadAwemesFromSDK$1L");
                return null;
            }
            for (int i = 0; i < length; i++) {
                try {
                    JSONArrayProtectorUtils.getJSONObject(jSONArray, i).putOpt("raw_ad_data", new JSONObject(JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), "raw_ad_data")));
                    Aweme aweme = (Aweme) gson.LJII(jSONArray.get(i).toString(), Aweme.class);
                    if (aweme != null) {
                        arrayList.add(aweme);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    Objects.requireNonNull(message);
                    C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
                    C1030840cvq.LIZ.getClass();
                    c1020790cfd.log(C1030840cvq.LIZLLL, new AwS67S1000000_16(message, 3));
                    C1AF0.LIZIZ();
                }
            }
            if (arrayList.size() == 0) {
                C1C7U.LIZIZ("SplashAdInitManager@b427.initSplashFactory$1$preLoadAwemesFromSDK$1L");
                return null;
            }
            arrayList.size();
            C1030790cvl.LIZ.getClass();
            if (!arrayList.isEmpty()) {
                ArrayList arrayListLIZ = C1030790cvl.LIZ(false);
                if (arrayListLIZ == null) {
                    arrayListLIZ = new ArrayList();
                }
                for (Aweme aweme2 : arrayList) {
                    AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2);
                    if (awemeRawAdLJJIJLIJ != null) {
                        Long creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
                        AwemeSplashInfo splashInfo = awemeRawAdLJJIJLIJ.getSplashInfo();
                        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                            brandSafety = awemeRawAd.getBrandSafety();
                        } else {
                            brandSafety = 0;
                        }
                        if (creativeId != null && splashInfo != null && C1030680cva.LJIIJ(brandSafety)) {
                            int startTime = splashInfo.getStartTime();
                            int endTime = splashInfo.getEndTime();
                            if (C1030790cvl.LIZIZ(creativeId.toString(), arrayListLIZ)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("saveTopViewBrandSafetyCheckResult hasSavedDataByCid: ");
                                sbLIZ.append(creativeId);
                                C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                arrayListLIZ.add(new C1030780cvk(creativeId.toString(), startTime, endTime, brandSafety));
                            }
                        }
                    }
                }
                if (!arrayListLIZ.isEmpty()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator it2 = arrayListLIZ.iterator();
                    while (it2.hasNext()) {
                        stringBuffer.append(((C1030780cvk) it2.next()).toString());
                        stringBuffer.append(",");
                    }
                    Keva repo = Keva.getRepo("top_view_brand_safety_cache_sp");
                    String string = repo.getString("top_view_brand_safety_show_info", "");
                    repo.storeString("top_view_brand_safety_show_info", stringBuffer.toString());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveTopViewBrandSafetyCheckResult: ");
                    sbLIZ2.append((Object) stringBuffer);
                    sbLIZ2.append(", beforeInfo=");
                    sbLIZ2.append(string);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new TopViewPreloadTask(arrayList));
            c799890VZj.LIZIZ();
            C1C7U.LIZIZ("SplashAdInitManager@b427.initSplashFactory$1$preLoadAwemesFromSDK$1L");
            return null;
        }
        C1C7U.LIZIZ("SplashAdInitManager@b427.initSplashFactory$1$preLoadAwemesFromSDK$1L");
        return null;
    }

    public static final Object call$8(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        List<InterfaceC1058390deH> list = (List) aCallableS422S0100000_16.l0;
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            for (InterfaceC1058390deH interfaceC1058390deH : list) {
                iAdLandPagePreloadService.G0();
                C1024380clQ.LJIILLIIL(Integer.valueOf(interfaceC1058390deH.getPreloadWeb()), interfaceC1058390deH.getId(), interfaceC1058390deH.LIZ(), interfaceC1058390deH.getLogExtra(), (NativeSiteConfig) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), interfaceC1058390deH.LIZIZ(), NativeSiteConfig.class));
            }
            return null;
        }
        return null;
    }

    public static final Object call$9(ACallableS422S0100000_16 aCallableS422S0100000_16) {
        C1C7U.LIZ("FriendsFeedEmptyPageCell@fd38.initShareChannel$1$1");
        C1371590lnR c1371590lnRLJ = ((C1371600lnS) aCallableS422S0100000_16.l0).LJ();
        C1C7U.LIZIZ("FriendsFeedEmptyPageCell@fd38.initShareChannel$1$1");
        return c1371590lnRLJ;
    }

    public ACallableS422S0100000_16(Aweme aweme, int i) {
        this.$t = i;
        if (3 - i != 0) {
            this.l0 = aweme;
        } else {
            this.l0 = aweme;
        }
    }

    public ACallableS422S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
