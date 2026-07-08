package X;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import defpackage.u2;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import org.json.JSONException;

/* JADX INFO: renamed from: X.141y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201996141y {
    public static final C201996141y LIZ = new C201996141y();
    public static final C444890HcV LIZIZ;

    static {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(112);
        LIZIZ = c444890HcV;
    }

    public static String LIZ(String str) {
        return new Uri.Builder().scheme("https").authority("inapp.tiktokv.com").path(str).build().toString();
    }

    public static Map LJIIJ(String str) {
        boolean z;
        Map map;
        if (str != null) {
            try {
                if (str.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    str = null;
                }
                if (str != null && (map = (Map) C597040NbK.LIZ().LJIIIIZZ(str, new TypeToken<Map<String, Boolean>>() { // from class: X.141z
                }.getType())) != null) {
                    return map;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return C2097608Jq.LJ();
            }
        }
        return C2097608Jq.LJ();
    }

    public static String LJIIJJI(Map map) {
        String json;
        if (map == null || !(!map.isEmpty()) || (json = GsonProtectorUtils.toJson(C597040NbK.LIZ(), map)) == null) {
            return "";
        }
        return json;
    }

    public static void LIZJ(Context context, Map map) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        LJII(iIntValue, context, LIZ("/web-inapp/search-web-inapp/tako-faq"), map);
    }

    public static void LIZLLL(Context context, Map map) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        LJII(iIntValue, context, LIZ("/web-inapp/search-web-inapp/tako-management"), map);
    }

    public static String LJ(Integer num, Long l) {
        String str;
        u2 u2VarLJFF = C1863380yae.LJJII.LJFF(num, l);
        if (u2VarLJFF != null) {
            str = u2VarLJFF.LJIIL;
        } else {
            str = null;
        }
        Boolean bool = (Boolean) C1856050yOp.LIZIZ("2", LJIIJ(str));
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LJI(String str, Map map) {
        String str2;
        String str3;
        String str4;
        String str5;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str6 = null;
        if (map != null) {
            str6 = (String) map.get("enter_from");
        }
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        if (map == null || (str2 = (String) map.get("enter_method")) == null) {
            str2 = "";
        }
        if (map == null || (str3 = (String) map.get("process_id")) == null) {
            str3 = "";
        }
        if (map == null || (str4 = (String) map.get("tako_session_id")) == null) {
            str4 = "";
        }
        if (map != null && (str5 = (String) map.get("tako_chat_id")) != null) {
            str7 = str5;
        }
        C1862330yYx.LJJ(c1862330yYx, str6, str2, str3, str4, str7, "settings", str, null, null, null, null, null, null, null, null, 65408);
    }

    public static void LIZIZ(Context context, TakoEnterParams takoEnterParams, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Pair[] pairArr = new Pair[5];
        String str7 = null;
        if (takoEnterParams != null) {
            str7 = takoEnterParams.enterFrom;
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        pairArr[0] = new Pair("enter_from", str7);
        if (takoEnterParams == null || (str2 = takoEnterParams.enterMethod) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        if (takoEnterParams == null || (str3 = takoEnterParams.processId) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("process_id", str3);
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        pairArr[3] = new Pair("tako_session_id", str4);
        if (takoEnterParams == null || (str5 = takoEnterParams.takoChatId) == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("tako_chat_id", str5);
        LIZJ(context, C2097608Jq.LJIIJ(pairArr));
        if (takoEnterParams != null && (str6 = takoEnterParams.takoChatId) != null) {
            str8 = str6;
        }
        LJFF("click_learn_more", takoEnterParams, str, str8);
    }

    public static void LJIIIIZZ(boolean z, u2 u2Var, IMessageAbility iMessageAbility) {
        if (u2Var != null) {
            C201996141y c201996141y = LIZ;
            String str = u2Var.LJIIL;
            c201996141y.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJIIJ(str));
            linkedHashMap.put("2", Boolean.valueOf(z));
            String strLJIIJJI = LJIIJJI(linkedHashMap);
            u2Var.LJIIL = strLJIIJJI;
            iMessageAbility.U61(3, 1, strLJIIJJI, LJIIJJI(C2097908Jt.LIZJ(new Pair("2", Boolean.valueOf(z)))));
        }
    }

    public static void LJIIIZ(SpannableStringBuilder spannableStringBuilder, Context context, Function0 function0) {
        spannableStringBuilder.append("*");
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_info_circle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        C0GZF c0gzf = new C0GZF(tuxIconDrawableLIZ, 2);
        C0GZF.LIZJ(c0gzf, C426750GoL.LIZLLL(context), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0, 28);
        C786410Ut5.q2(spannableStringBuilder, c0gzf, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (C07Q4.LIZ()) {
            C1857690yRT.LIZJ(spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), null, null, new AwS608S0100000_29(function0, (Function0<Unit>) 634));
        } else {
            C1857690yRT.LJ(spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), null, null, new AwS573S0100000_29(function0, (Function0<? extends Banner>) 893));
        }
    }

    public static void LJFF(String str, TakoEnterParams takoEnterParams, String str2, String str3) throws JSONException {
        String str4;
        String str5;
        String str6 = str2;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str7 = null;
        if (takoEnterParams != null) {
            str7 = takoEnterParams.enterFrom;
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (takoEnterParams == null || (str4 = takoEnterParams.enterMethod) == null) {
            str4 = "";
        }
        if (takoEnterParams == null || (str5 = takoEnterParams.processId) == null) {
            str5 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str3 != null) {
            str8 = str3;
        }
        C1862330yYx.LJIIZILJ(c1862330yYx, str7, str4, str5, "memory_mode_available", str, null, null, null, null, null, null, str6, str8, 10208);
    }

    public static void LJII(int i, Context context, String str, Map map) {
        String strJ4 = C786410Ut5.j4("%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))}, 4));
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", str).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").appendQueryParameter("trans_status_bar", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("status_bar_bg_color", strJ4).appendQueryParameter("loading_bg_color", strJ4);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        SmartRouter.buildRoute(context, builderAppendQueryParameter.build().toString()).open();
    }
}
