package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552540qVI {
    public static final C1552540qVI LIZ = new C1552540qVI();
    public static volatile boolean LIZIZ;
    public static volatile String LIZJ;

    public static Pair LIZIZ() {
        String string = C1570870qyr.LIZ().getString("tt_ug_shoptab_new", "");
        if (string == null || a0.LJJJIL(string)) {
            try {
                ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
                C19259610Wk c19259610Wk = C19259610Wk.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C19259610Wk.LIZJ().LIZ) {
                LIZLLL(true);
                string = "1";
            } else {
                if (!C1514430pVp.LIZLLL().booleanValue()) {
                    LIZLLL(false);
                }
                string = CardStruct.IStatusCode.DEFAULT;
            }
        }
        return new Pair("tt_ug_shoptab_new", string);
    }

    public static void LJ() {
        try {
            ISettingManagerService iSettingManagerService = (ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class);
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            iSettingManagerService.LIZIZ(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    public static void LIZJ(String str) {
        String strLJ;
        try {
            strLJ = AnonymousClass0185.LJ(UriProtector.parse(str), "gecko_channel");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLJ = "";
        }
        if (a0.LJJJIL(strLJ)) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = "";
        C1549330qQ7 c1549330qQ7 = new C1549330qQ7(strLJ, c259800zU, c259800zU2, c259800zU3, SystemClock.elapsedRealtime());
        try {
            c259800zU.element = C123500dV.LIZIZ(C1553670qX7.LIZ());
            c259800zU2.element = C123500dV.LIZIZ(C1553670qX7.LIZIZ());
            C0VSJ c0vsjLIZLLL = C1553670qX7.LIZLLL();
            c259800zU3.element = C123500dV.LIZIZ(c0vsjLIZLLL.getPath());
            if (!a0.LJJJIL((CharSequence) c259800zU.element) && !a0.LJJJIL((CharSequence) c259800zU2.element) && !a0.LJJJIL((CharSequence) c259800zU3.element)) {
                C844470XAv.LIZ.getClass();
                C1537040q6I c1537040q6I = new C1537040q6I(C844470XAv.LIZ());
                c1537040q6I.LJIIIZ = (String) c259800zU2.element;
                c1537040q6I.LIZJ(C844470XAv.LJIIJ);
                c1537040q6I.LJII = C844470XAv.LIZJ();
                C844470XAv.LIZ();
                c1537040q6I.LIZ = new GeckoXNetImpl();
                c1537040q6I.LJ = new InterfaceC1551450qTX() { // from class: X.0q40
                    @Override // X.InterfaceC1551450qTX
                    public final void LIZ(String str2, JSONObject jSONObject) {
                        if (!a0.LJJJIL(str2)) {
                            C20684815ws.LJIJ(str2, jSONObject);
                        }
                    }
                };
                boolean z = true;
                c1537040q6I.LIZIZ(c259800zU.element);
                c1537040q6I.LIZ(c259800zU.element);
                c1537040q6I.LJIIJJI = C2222691Bz1.LIZIZ();
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && !a0.LJJJIL(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                    z = false;
                }
                if (z || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null) {
                    strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
                }
                c1537040q6I.LJIIIIZZ = strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
                c1537040q6I.LJIIJ = c0vsjLIZLLL;
                C1551530qTf c1551530qTf = new C1551530qTf(c1537040q6I);
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                optionCheckUpdateParams.setEnableThrottle(false);
                optionCheckUpdateParams.setListener(new C1554330qYB(c1549330qQ7, 3));
                C1551950qUL.LIZLLL(c1551530qTf).LIZ(null, C2097908Jt.LIZJ(new Pair(c259800zU.element, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(strLJ)))), optionCheckUpdateParams);
                return;
            }
            c1549330qQ7.invoke("onInit", Boolean.FALSE, "config argument empty");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c1549330qQ7.invoke("onInitException", Boolean.FALSE, th2.getMessage());
        }
    }

    public static void LIZLLL(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1570870qyr.LIZ().storeString("tt_ug_shoptab_new", str);
    }

    public static void LIZ(C19EG c19eg, String str) {
        String strLIZIZ;
        String str2;
        String str3;
        HomeTabAbility homeTabAbilityLIZ;
        String strLJ;
        Uri uri;
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        String str5 = null;
        String strLJ2 = null;
        Uri uri2 = null;
        str5 = null;
        if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            try {
                if (!homeTabAbilityLIZ.zd1()) {
                    homeTabAbilityLIZ.Gx0(EnumC1585090rLn.NUJ);
                }
            } catch (Throwable th) {
                th = th;
                str2 = null;
            }
            if (homeTabAbilityLIZ.zd1()) {
                try {
                    uri = UriProtector.parse(str);
                    try {
                        strLJ = AnonymousClass0185.LJ(uri, "previous_page");
                        try {
                            strLJ2 = AnonymousClass0185.LJ(uri, "deeplink_type");
                            AnonymousClass0185.LJ(uri, "diversion_params");
                            str2 = strLJ2;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = strLJ2;
                            uri2 = uri;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                uri = uri2;
                            } catch (Throwable th3) {
                                th = th3;
                                str5 = strLJ;
                                TryCatchGuardChecker.doCheck(th);
                                strLIZIZ = C123500dV.LIZIZ(th.getMessage());
                                str3 = CardStruct.IStatusCode.DEFAULT;
                                str4 = "-1";
                                C340370DVz.LIZ.getClass();
                                C1768000w6o c1768000w6o = C1768000w6o.LIZ;
                                HashMap map = new HashMap();
                                map.put("previous_page", C123500dV.LIZIZ(str5));
                                map.put("deeplink_type", C123500dV.LIZIZ(str2));
                                map.put("position_type", C123500dV.LIZIZ(str4));
                                map.put("top_product_id", C123500dV.LIZIZ(""));
                                map.put("creative_id", C123500dV.LIZIZ(""));
                                map.put("campaign_id", C123500dV.LIZIZ(""));
                                map.put("schema", C123500dV.LIZIZ(str));
                                map.put("has_landing_deeplink", 0);
                                map.put("is_success", str3);
                                map.put("error_info", C123500dV.LIZIZ(strLIZIZ));
                                c1768000w6o.getClass();
                                C1768000w6o.LIZIZ("rd_tiktokec_mall_home_route", map);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        strLJ = null;
                        uri2 = uri;
                        str2 = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str2 = null;
                    strLJ = null;
                }
                str5 = strLJ;
                try {
                    IEcMallUgService iEcMallUgService = (IEcMallUgService) PluggableExtentionKt.pluggableSpi$default(IEcMallUgService.class, false, false, false, 14, null);
                    if (iEcMallUgService != null) {
                        iEcMallUgService.LIZ(c19eg, uri);
                    }
                    homeTabAbilityLIZ.fw0(new Bundle(), "SHOP_MALL");
                    str3 = "1";
                    strLIZIZ = "";
                } catch (Throwable th6) {
                    th = th6;
                    TryCatchGuardChecker.doCheck(th);
                    strLIZIZ = C123500dV.LIZIZ(th.getMessage());
                    str3 = CardStruct.IStatusCode.DEFAULT;
                    str4 = "-1";
                }
                C340370DVz.LIZ.getClass();
                C1768000w6o c1768000w6o2 = C1768000w6o.LIZ;
                HashMap map2 = new HashMap();
                map2.put("previous_page", C123500dV.LIZIZ(str5));
                map2.put("deeplink_type", C123500dV.LIZIZ(str2));
                map2.put("position_type", C123500dV.LIZIZ(str4));
                map2.put("top_product_id", C123500dV.LIZIZ(""));
                map2.put("creative_id", C123500dV.LIZIZ(""));
                map2.put("campaign_id", C123500dV.LIZIZ(""));
                map2.put("schema", C123500dV.LIZIZ(str));
                map2.put("has_landing_deeplink", 0);
                map2.put("is_success", str3);
                map2.put("error_info", C123500dV.LIZIZ(strLIZIZ));
                c1768000w6o2.getClass();
                C1768000w6o.LIZIZ("rd_tiktokec_mall_home_route", map2);
            }
            strLIZIZ = "no mall tab";
        } else {
            strLIZIZ = "activity is not main";
        }
        str3 = CardStruct.IStatusCode.DEFAULT;
        str4 = "-1";
        str2 = null;
        C340370DVz.LIZ.getClass();
        C1768000w6o c1768000w6o22 = C1768000w6o.LIZ;
        HashMap map22 = new HashMap();
        map22.put("previous_page", C123500dV.LIZIZ(str5));
        map22.put("deeplink_type", C123500dV.LIZIZ(str2));
        map22.put("position_type", C123500dV.LIZIZ(str4));
        map22.put("top_product_id", C123500dV.LIZIZ(""));
        map22.put("creative_id", C123500dV.LIZIZ(""));
        map22.put("campaign_id", C123500dV.LIZIZ(""));
        map22.put("schema", C123500dV.LIZIZ(str));
        map22.put("has_landing_deeplink", 0);
        map22.put("is_success", str3);
        map22.put("error_info", C123500dV.LIZIZ(strLIZIZ));
        c1768000w6o22.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_mall_home_route", map22);
    }
}
