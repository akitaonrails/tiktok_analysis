package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioFormPreloadSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0JLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490590JLt {
    public static final C490590JLt LIZ = new C490590JLt();

    public static String LIZLLL(String str) {
        if (!LivePcsServiceBioFormPreloadSetting.INSTANCE.getValue()) {
            w.LIZ.getClass();
            return LIZJ(str, C2097908Jt.LIZJ(new Pair("request_id", w.LJIJI())));
        }
        w.LIZ.getClass();
        return LIZJ(str, C2097608Jq.LJIIIIZZ(new Pair("business_from", "Live_PCS"), new Pair("target_handler", "Live_PCS"), new Pair("request_id", w.LJIJI())));
    }

    public static boolean LJII(String str) {
        Uri uri = UriProtector.parse(str);
        if (Intrinsics.LJFF(uri.getHost(), "webcast_pcs") && Intrinsics.LJFF(uri.getPath(), "/form_revamp")) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "old_schema");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return false;
            }
            return Intrinsics.LJFF(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getHost(), "lynxview_popup");
        }
        if (Intrinsics.LJFF(uri.getHost(), "webcast_pcs") && Intrinsics.LJFF(uri.getPath(), "/service/form")) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "old_schema");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_schema")) == null) {
                return false;
            }
            return Intrinsics.LJFF(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).getHost(), "lynxview_popup");
        }
        return Intrinsics.LJFF(uri.getHost(), "lynxview_popup");
    }

    public static String LIZIZ(String str, Map map) {
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LIZJ(String str, Map map) {
        try {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) entry.getKey()) == null) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LJIIIZ(String str, String str2) {
        Object c098200Yq;
        String string;
        String secUid;
        User owner;
        User owner2;
        Object obj = "form_pin_card";
        if (!LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            return str;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "pcs_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "{}";
            }
            c098200Yq = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).optString("show_entrance", "form_pin_card");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str3 = (String) obj;
        String string2 = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (room != null && (owner2 = room.getOwner()) != null) {
            secUid = owner2.getSecUid();
        } else {
            secUid = null;
        }
        if (secUid == null) {
            secUid = "";
        }
        if (room != null && (owner = room.getOwner()) != null) {
            string2 = Long.valueOf(owner.getId()).toString();
        }
        if (string2 == null) {
            string2 = "";
        }
        return LJFF(str3, string, string2, secUid, str, str2, "pin_card", true);
    }

    public static String LIZ(String str, String str2, Map map) {
        Object next;
        try {
            Uri uri = UriProtector.parse(str);
            Iterator<T> it2 = UriProtector.getQueryParameterNames(uri).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF((String) next, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                Map map2 = (Map) new Gson().LJIIIIZZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), new TypeToken<Map<String, ? extends String>>() { // from class: X.0JLu
                }.getType());
                for (Map.Entry entry : map.entrySet()) {
                    if (map2 != null) {
                        map2.put(entry.getKey(), entry.getValue());
                    }
                }
                map = map2;
            }
            Uri.Builder builderPath = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
            builderPath.appendQueryParameter(str2, new Gson().LJIILL(map));
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str3, str2)) {
                    builderPath.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
                }
            }
            return builderPath.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LJIIIIZZ(String str, String str2, boolean z) {
        Object c098200Yq;
        String string;
        String secUid;
        User owner;
        User owner2;
        String str3 = str2;
        if (!LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            return str;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (str3 == null) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "biz_event_tracking_extra");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "{}";
                }
                c098200Yq = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).optString("show_entrance");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            str3 = (String) c098200Yq;
        }
        Long lValueOf = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (room != null && (owner2 = room.getOwner()) != null) {
            secUid = owner2.getSecUid();
        } else {
            secUid = null;
        }
        if (secUid == null) {
            secUid = "";
        }
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        }
        return LJ(str3, string, secUid, String.valueOf(lValueOf), z, str, null);
    }

    public static String LJ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        return new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("service/dm").appendQueryParameter("show_entrance", str).appendQueryParameter("room_id", str2).appendQueryParameter("sec_anchor_id", str3).appendQueryParameter("anchor_id", str4).appendQueryParameter("sku_schema", str5).appendQueryParameter("sku_id", str6).appendQueryParameter("show_back_button", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)).build().toString();
    }

    public static String LJFF(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("service/form").appendQueryParameter("show_entrance", str).appendQueryParameter("room_id", str2).appendQueryParameter("sec_anchor_id", str4).appendQueryParameter("anchor_id", str3);
        if (str7 == null) {
            str7 = "";
        }
        return builderAppendQueryParameter.appendQueryParameter("enter_mode", str7).appendQueryParameter("sku_id", str6).appendQueryParameter("sku_schema", str5).appendQueryParameter("show_back_button", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)).build().toString();
    }
}
