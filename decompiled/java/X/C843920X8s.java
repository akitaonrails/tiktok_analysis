package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GameAttributionAPI;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.api.ISandboxService;
import java.net.URLEncoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843920X8s {
    public GameLivePartnershipRetrofitApi LIZIZ;
    public GameAttributionAPI LIZJ;
    public final String LIZ = "livesdk_gp_mmp_event";
    public String LIZLLL = "";

    public final String LIZJ() {
        if (this.LIZLLL.length() == 0) {
            C823050WQl.LIZIZ().submit(new C0TS7(this));
        }
        return this.LIZLLL;
    }

    public C843920X8s() {
        C823050WQl.LIZIZ().submit(new C0TS7(this));
    }

    public static final String LIZIZ(Context context) throws Throwable {
        try {
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(context);
            if (infoLIZIZ != null) {
                String strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58h5DQstV5Lij8K96FyWO7RJsi8Bars1sZ4uw=", null));
                if (strLLLLLIL != null) {
                    return strLLLLLIL;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return "";
        }
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisE6FE3ojqb8wEvf58h5DQstV5Lij8K96FyWO7RJsi8Bars1sZ4uw=", null));
    }

    public static void LJIIIIZZ(C843940X8u c843940X8u, JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_interface");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(c843940X8u.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c843940X8u.LJFF, "game_id");
        c474500IjALIZ.LJJII(c843940X8u.LJ, "anchor_id");
        c474500IjALIZ.LJJII(c843940X8u.LIZLLL, "task_id");
        c474500IjALIZ.LJJII(c843940X8u.LIZIZ, "app_id");
        c474500IjALIZ.LJJII(Long.valueOf(jSONObject.optLong("duration", 0L)), "duration");
        c474500IjALIZ.LJJII(jSONObject.optString("http_code", "-1"), "http_status");
        String str = c843940X8u.LJI;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "view_report_scene");
        String str2 = c843940X8u.LJIIIIZZ;
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "game_name");
        c474500IjALIZ.LJJII(jSONObject.optString("error_code", "-1"), "error_code");
        c474500IjALIZ.LJJII(jSONObject.optString("error_message", ""), "error_desc");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(EnumC751770TeJ enumC751770TeJ, C843930X8t c843930X8t) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_partnership_download_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(enumC751770TeJ.ordinal()), "result");
        c474500IjALIZ.LJJII(c843930X8t.LJII, "room_id");
        c474500IjALIZ.LJJII(c843930X8t.LJIIIZ, "audience_uid");
        c474500IjALIZ.LJJII(c843930X8t.LIZJ, "game_id");
        c474500IjALIZ.LJJII(c843930X8t.LJI, "game_name");
        c474500IjALIZ.LJJII(Boolean.valueOf(c843930X8t.LJIIJJI), "is_anchor");
        c474500IjALIZ.LJJII(c843930X8t.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c843930X8t.LIZ, "task_id");
        c474500IjALIZ.LJJII(c843930X8t.LJIIIIZZ, "package_name");
        c474500IjALIZ.LIZ();
    }

    public final C11NZ<C470590Icr<PartnershipDownloadResponse>> LJI(Context context, C843930X8t c843930X8t) throws Throwable {
        String strLIZIZ;
        long jLongValue;
        boolean z;
        String str;
        String strValueOf;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        C480460Ism.LIZ().getClass();
        GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class);
        int i = c843930X8t.LJ;
        String str2 = "";
        if (context == null) {
            strLIZIZ = "";
        } else {
            strLIZIZ = LIZIZ(context);
        }
        String str3 = c843930X8t.LIZJ;
        long jLongValue2 = 0;
        if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String str4 = c843930X8t.LJII;
        if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        }
        String strF3 = C786410Ut5.F3(context);
        if (strF3 == null) {
            strF3 = "ua";
        }
        String strEncode = URLEncoder.encode(strF3, "UTF-8");
        if (i == 3) {
            C843880X8o.LIZJ(3, 5, 0, String.valueOf(jLongValue), c843930X8t.LIZ, c843930X8t.LJIILIIL, c843930X8t.LJIILJJIL, true);
            String strValueOf2 = String.valueOf(i);
            String str5 = c843930X8t.LJIIL;
            String str6 = c843930X8t.LJIILIIL;
            String strValueOf3 = String.valueOf(jLongValue);
            String str7 = c843930X8t.LJIILJJIL;
            if (str7.length() == 0) {
                String str8 = c843930X8t.LIZIZ;
                if (str8.length() != 0) {
                    str2 = str8;
                }
            } else {
                str2 = str7;
            }
            return gameLivePartnershipRetrofitApi.gameTtcmDownload(strValueOf2, str5, str6, strValueOf3, strLIZIZ, strEncode, str2);
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        String strValueOf4 = String.valueOf(jLongValue);
        String str9 = c843930X8t.LIZ;
        if (z) {
            str = c843930X8t.LJII;
        } else {
            str = c843930X8t.LJIILL;
        }
        C843880X8o.LIZJ(i, 5, 0, strValueOf4, str9, str, c843930X8t.LJIILJJIL, true);
        String str10 = c843930X8t.LJIIL;
        if (z) {
            strValueOf = String.valueOf(jLongValue2);
        } else {
            strValueOf = c843930X8t.LJIILIIL;
        }
        String strValueOf5 = String.valueOf(jLongValue);
        String str11 = c843930X8t.LIZLLL;
        String str12 = c843930X8t.LJIILJJIL;
        if (str12.length() == 0) {
            String str13 = c843930X8t.LIZIZ;
            if (str13.length() != 0) {
                str2 = str13;
            }
        } else {
            str2 = str12;
        }
        return gameLivePartnershipRetrofitApi.gameStationDownload(i, str10, strValueOf, strValueOf5, str11, strLIZIZ, strEncode, str2, String.valueOf(jLongValue2), c843930X8t.LJIILL, c843930X8t.LIZ, c843930X8t.LJIILLIIL, c843930X8t.LJIIZILJ, c843930X8t.LJIJJ, c843930X8t.LJIJJLI, c843930X8t.LJJ);
    }

    public static final void LIZLLL(int i, int i2, JSONObject jSONObject) {
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("point: ");
        sbLIZ.append(i);
        sbLIZ.append(", type: ");
        sbLIZ.append(i2);
        sbLIZ.append(", params: ");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("handleAttributionAction", C2188811AlT.LIZIZ(sbLIZ));
        int iOptInt = 99;
        if (i2 != 1) {
            if (i2 == 2) {
                String strOptString = jSONObject.optString("item_id", "");
                String strOptString2 = jSONObject.optString("game_id", "");
                String strOptString3 = jSONObject.optString("enter_from", "");
                String strOptString4 = jSONObject.optString("creator_id", "");
                String strOptString5 = jSONObject.optString("task_id", "");
                String strOptString6 = jSONObject.optString("log_extra", "");
                if (jSONObject.has(Scene.SCENE_SERVICE)) {
                    iOptInt = jSONObject.optInt(Scene.SCENE_SERVICE, 99);
                } else {
                    if (i != 1 && i != 2) {
                        if (i == 6) {
                            i3 = 0;
                            iOptInt = 0;
                        }
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C843870X8n(strOptString3, i, iOptInt, strOptString, jSONObject.optInt("threshold_duration", i3), strOptString2, strOptString4, strOptString6, strOptString5, jSONObject.optString("promote_ad_type", ""), null), 2);
                        return;
                    }
                    iOptInt = 2;
                }
                i3 = 0;
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C843870X8n(strOptString3, i, iOptInt, strOptString, jSONObject.optInt("threshold_duration", i3), strOptString2, strOptString4, strOptString6, strOptString5, jSONObject.optString("promote_ad_type", ""), null), 2);
                return;
            }
            return;
        }
        String strOptString7 = jSONObject.optString("item_id", "");
        String strOptString8 = jSONObject.optString("enter_from", "");
        String strOptString9 = jSONObject.optString("report_url", "");
        String strOptString10 = jSONObject.optString("domain", "");
        String strOptString11 = jSONObject.optString("common_params", "");
        int iOptInt2 = 0;
        int iOptInt3 = jSONObject.optInt("threshold_duration", 0);
        if (jSONObject.has(Scene.SCENE_SERVICE)) {
            iOptInt2 = jSONObject.optInt(Scene.SCENE_SERVICE, 99);
        } else {
            if (i != 1 && i != 2) {
                if (i == 6) {
                }
            } else {
                iOptInt = 2;
            }
            String strOptString12 = jSONObject.optString("game_id", "");
            String strOptString13 = jSONObject.optString("task_id", "");
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C843860X8m(strOptString8, i, strOptString7, iOptInt, strOptString9, strOptString10, strOptString11, iOptInt3, strOptString12, jSONObject.optString("creator_id", ""), strOptString13, jSONObject.optString("promote_ad_type", ""), null), 2);
        }
        iOptInt = iOptInt2;
        String strOptString122 = jSONObject.optString("game_id", "");
        String strOptString132 = jSONObject.optString("task_id", "");
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C843860X8m(strOptString8, i, strOptString7, iOptInt, strOptString9, strOptString10, strOptString11, iOptInt3, strOptString122, jSONObject.optString("creator_id", ""), strOptString132, jSONObject.optString("promote_ad_type", ""), null), 2);
    }

    public static final boolean LJII(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://play.google.com/store/apps/details?id=");
        sbLIZ.append(str);
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (str2.length() > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("&referrer=");
            sbLIZ2.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse(sb.toString()));
        intent.setPackage("com.android.vending");
        try {
            ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965953);
            LIZ(context, intent);
            return true;
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(sb.toString()));
            ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent2, 1207965953);
            LIZ(context, intent2);
            return false;
        }
    }

    public static void LJIIIZ(C0X8U c0x8u, JSONObject jSONObject, C843940X8u c843940X8u) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode: ");
        sbLIZ.append(-30);
        sbLIZ.append(", errorMsg: ");
        sbLIZ.append("api service instance is null");
        C20441214yg.LJ("reportMmpRespFail", C2188811AlT.LIZIZ(sbLIZ));
        if (c0x8u != null) {
            c0x8u.LIZ("api service instance is null", false);
        }
        jSONObject.put("error_code", -30);
        jSONObject.put("error_message", "api service instance is null");
        LJIIIIZZ(c843940X8u, jSONObject);
    }

    public final void LJ(Context context, C843930X8t c843930X8t, C1882170z4x c1882170z4x) {
        if (context == null) {
            LJIIJJI(EnumC751770TeJ.LLILZIL, c843930X8t);
            c1882170z4x.LIZ(-1, "", false);
            return;
        }
        int i = c843930X8t.LJIJI;
        if ((i != 1 && (i != 2 || u.LJJIIJZLJL(c843930X8t.LJFF, "http://", false) || u.LJJIIJZLJL(c843930X8t.LJFF, "https://", false))) || c843930X8t.LJIIIIZZ.length() != 0) {
            int i2 = c843930X8t.LJIJI;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            c1882170z4x.LIZ(-1, "", false);
                            C20441214yg.LJ("handleCTAClickJump", "unknown jumpType: " + c843930X8t.LJIJI);
                            return;
                        }
                        LJIIJ(context, c843930X8t, null, null);
                        String str = c843930X8t.LJIJ;
                        if (str.length() == 0) {
                            c1882170z4x.LIZ(-1, "webUrl empty", false);
                            return;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                            if (iSandboxServiceLIZ != null) {
                                iSandboxServiceLIZ.appendDataFlowId(intent, 1207967489);
                            }
                            intent.setData(UriProtector.parse(str));
                            LIZ(context, intent);
                            c1882170z4x.LIZ(0, "", true);
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            c1882170z4x.LIZ(-1, message, false);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("openWebExternal error: ");
                            sbLIZ.append(e.getMessage());
                            C20441214yg.LJFF("handleCTAClickJump", C2188811AlT.LIZIZ(sbLIZ), e);
                            return;
                        }
                    }
                    LJIIJ(context, c843930X8t, null, null);
                    final String str2 = c843930X8t.LJIJ;
                    if (str2.length() == 0) {
                        c1882170z4x.LIZ(-1, "webUrl empty", false);
                        return;
                    } else {
                        new C828330WeV(new ThirdPartyBizCert(402653197)).LIZIZ(context, str2, new InterfaceC828360WeY() { // from class: X.0dUp
                            @Override // X.InterfaceC828360WeY
                            public final void LIZ(Context context2, String str3) {
                                C20441214yg.LIZIZ("handleCTAClickJump", "openWebInApp fallback");
                                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                                sparkThirdContext.url = str2;
                                sparkThirdContext.bizCert = new ThirdPartyBizCert(402653197);
                                C1554300qY8.LIZIZ(context2, sparkThirdContext);
                            }
                        }, null);
                        c1882170z4x.LIZ(0, "", true);
                        return;
                    }
                }
                if (c843930X8t.LJFF.length() == 0) {
                    c1882170z4x.LIZ(-1, "deepLink empty", false);
                    return;
                } else {
                    LJIIJ(context, c843930X8t, new C0T7M(context, c843930X8t, c1882170z4x, this), new C751740TeG(context, c843930X8t, c1882170z4x, this));
                    return;
                }
            }
            LJIIJ(context, c843930X8t, new C751760TeI(context, c843930X8t, c1882170z4x, this), new C751750TeH(context, c843930X8t, c1882170z4x, this));
            return;
        }
        C766270U4b.LIZLLL(2131841782);
        LJIIJJI(EnumC751770TeJ.LLILLJJLI, c843930X8t);
        c1882170z4x.LIZ(-1, "", false);
    }

    public final void LJFF(Context context, C843930X8t c843930X8t, C0T7K c0t7k) {
        if (c843930X8t.LJIIIIZZ.length() == 0) {
            C766270U4b.LIZLLL(2131841782);
            LJIIJJI(EnumC751770TeJ.LLILLJJLI, c843930X8t);
        } else if (context == null) {
            LJIIJJI(EnumC751770TeJ.LLILZIL, c843930X8t);
        } else if (c843930X8t.LJIIJJI) {
            LJIILIIL(c843930X8t, context, "");
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C751720TeE(this, context, c843930X8t, c0t7k, 2131841782, null), 2);
        }
    }

    public final void LJIIL(Context context, C843940X8u c843940X8u, C0X8U c0x8u) throws Throwable {
        Object c098200Yq;
        String strLIZIZ;
        try {
            String strF3 = C786410Ut5.F3(context);
            if (strF3 == null) {
                strF3 = "ua";
            }
            c098200Yq = URLEncoder.encode(strF3, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = "";
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String str2 = (String) c098200Yq;
        String str3 = c843940X8u.LIZ;
        String str4 = c843940X8u.LJIIIZ;
        String str5 = c843940X8u.LJIIJ;
        if (context == null) {
            strLIZIZ = "";
        } else {
            strLIZIZ = LIZIZ(context);
        }
        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str3, "__UA__", str2, false), "__ADID__", strLIZIZ, false), "__TS__", String.valueOf(System.currentTimeMillis()), false), "__EF__", str4, false), "__AT__", str5, false);
        if (strLJJIFFI.length() == 0) {
            if (c0x8u != null) {
                c0x8u.LIZ("impression url empty", false);
                return;
            }
            return;
        }
        String str6 = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str6);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("show", "event");
        c474500IjALIZ.LJJII(c843940X8u.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c843940X8u.LJFF, "game_id");
        c474500IjALIZ.LJJII(c843940X8u.LJIIIIZZ, "game_name");
        c474500IjALIZ.LJJII(c843940X8u.LJ, "anchor_id");
        c474500IjALIZ.LJJII(c843940X8u.LIZLLL, "task_id");
        c474500IjALIZ.LJJII(c843940X8u.LIZIZ, "app_id");
        String str7 = c843940X8u.LJI;
        if (str7 == null) {
            str7 = "";
        }
        c474500IjALIZ.LJJII(str7, "view_report_scene");
        String str8 = c843940X8u.LJII;
        if (str8 != null) {
            str = str8;
        }
        c474500IjALIZ.LJJII(str, "package_name");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0X8T(strLJJIFFI, this, c0x8u, c843940X8u, null), 2);
    }

    public final boolean LJIILIIL(C843930X8t c843930X8t, Context context, String str) {
        int i;
        String str2 = c843930X8t.LJFF;
        if (str2.length() != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(str2));
            intent.setPackage(c843930X8t.LJIIIIZZ);
            ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207968513);
            try {
                LIZ(context, intent);
                i = 1;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("DownloadPartneringGameMethod", e.getMessage());
                i = 0;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gp_open_deeplink");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(c843930X8t.LJFF, "deeplink_url");
            c474500IjALIZ.LJJII(c843930X8t.LJIIJ, "app_id");
            c474500IjALIZ.LJJII(c843930X8t.LJII, "room_id");
            c474500IjALIZ.LJJII(c843930X8t.LIZ, "task_id");
            c474500IjALIZ.LJJII(c843930X8t.LIZIZ, "anchor_id");
            c474500IjALIZ.LJJII(c843930X8t.LIZJ, "game_id");
            c474500IjALIZ.LJJII(c843930X8t.LJI, "game_name");
            c474500IjALIZ.LJJII(c843930X8t.LJIIIIZZ, "package_name");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "success");
            c474500IjALIZ.LIZ();
            if (i != 0) {
                LJIIJJI(EnumC751770TeJ.LL, c843930X8t);
                return true;
            }
        }
        String str3 = c843930X8t.LJIIIIZZ;
        if (str3 == null) {
            str3 = "";
        }
        if (LJII(context, str3, str)) {
            LJIIJJI(EnumC751770TeJ.LL, c843930X8t);
            return true;
        }
        LJIIJJI(EnumC751770TeJ.LLILZ, c843930X8t);
        return false;
    }

    public final void LJIIJ(Context context, C843930X8t c843930X8t, final Function1<? super String, Unit> function1, final Function1<? super Throwable, Unit> function12) {
        if (!c843930X8t.LJIL) {
            if (function1 != null) {
                function1.invoke("");
                return;
            }
            return;
        }
        LJI(context, c843930X8t).LJL(C11S5.LIZ()).LJJLIIIJJIZ(2L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0T7I
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                C1C7U.LIZ("CommerceAttributionHandler@65e.requestDownloadApi$1");
                PartnershipDownloadResponse partnershipDownloadResponse = (PartnershipDownloadResponse) ((BaseResponse) obj).data;
                if (partnershipDownloadResponse == null || (str = partnershipDownloadResponse.referrer) == null) {
                    str = "";
                }
                Function1<String, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(str);
                }
                C20441214yg.LIZIZ("handleCTAClickJump", "download api success");
                C1C7U.LIZIZ("CommerceAttributionHandler@65e.requestDownloadApi$1");
            }
        }, new C09JN() { // from class: X.0T7H
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CommerceAttributionHandler@65e.requestDownloadApi$2");
                Throwable th = (Throwable) obj;
                Function1<Throwable, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(th);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download api error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJFF("handleCTAClickJump", C2188811AlT.LIZIZ(sbLIZ), th);
                C1C7U.LIZIZ("CommerceAttributionHandler@65e.requestDownloadApi$2");
            }
        });
    }
}
