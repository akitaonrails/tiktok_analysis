package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.mob.PushPermissionRequestEvent;
import com.ss.android.ugc.awemepushlib.events.PushShowInterceptEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814850Vxr {
    public static String LIZ(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            String str4 = "";
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            jSONObject.put("image_url", str3);
            if (str2 != null) {
                str4 = str2;
            }
            jSONObject.put("large_mode_icon", str4);
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{");
            sbLIZ.append("image_url");
            sbLIZ.append(":");
            sbLIZ.append(str);
            sbLIZ.append(" ; ");
            sbLIZ.append("large_mode_icon");
            sbLIZ.append(":");
            sbLIZ.append(str2);
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZIZ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (new JSONObject(str).optInt("IsCommerce") == 1) {
                ((ICommercializeFeedService) ServiceManager.get().getService(ICommercializeFeedService.class)).LIZLLL(str, z);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = UriProtector.parse(str);
        if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), "click_push_user")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "push_out_app");
            c2344009Gk.LJIIIIZZ("scene_type", "push");
            c2344009Gk.LJIIIIZZ("action_type", "show");
            c2344009Gk.LJIIIIZZ("to_user_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "to_user_id"));
            c2344009Gk.LJIIIIZZ("rule_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rule_id"));
            c2344009Gk.LJIIIIZZ("rec_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rec_type"));
            c2344009Gk.LJIIIIZZ("follow_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_type"));
            c2344009Gk.LJIIIIZZ("relation_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "relation_type"));
            C20684815ws.LJIILLIIL("follow_recommend", c2344009Gk.LIZ);
        }
        String host = uri.getHost();
        List<String> pathSegments = uri.getPathSegments();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        StringBuilder sb = new StringBuilder("//");
        sb.append(host);
        for (String str3 : pathSegments) {
            if (!TextUtils.isEmpty(str3)) {
                sb.append("/");
                try {
                    CastLongProtector.parseLong(str3);
                    sb.append("xxx");
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    sb.append(str3);
                }
            }
        }
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            sb.append("?");
            Iterator<String> it2 = queryParameterNames.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                if (it2.hasNext()) {
                    sb.append("&");
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_url", sb.toString());
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_push", str2);
            C794240VDq.LIZIZ("deep_link_collect", "", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJFF(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap map = new HashMap();
            map.put(str, str2);
            if (C791500V3c.LIZ != null && C801670Vcb.LIZ != null) {
                Npth.addTags(map);
            }
        }
    }

    public static void LJIIIIZZ(C814730Vxf c814730Vxf, int i) {
        boolean z;
        boolean z2 = false;
        if (TextUtils.isEmpty(c814730Vxf.imageUrl) && TextUtils.isEmpty(c814730Vxf.extra.largeModeIconUrl)) {
            z = false;
        } else {
            z = true;
        }
        if (C2214201BlK.LJFF() == null) {
            z2 = true;
        }
        JSONObject jSONObject = new JSONObject(C814860Vxs.LIZLLL(c814730Vxf, i, z2, z));
        try {
            jSONObject.put("real_receive_time", System.currentTimeMillis());
            jSONObject.put("is_push_enabled", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() ? 1 : 0);
            if (c814730Vxf.isSilentMsg()) {
                jSONObject.put("silent_type", c814730Vxf.silentType);
                jSONObject.put("push_label", c814730Vxf.silentMsg.scene);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIJ("push_receive", jSONObject);
    }

    public static void LJI(int i, int i2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LIZJ(i, "group_cnt");
        c2344009Gk.LIZJ(i2, "msg_cnt");
        C20684815ws.LJIILLIIL("push_cancel_group", c2344009Gk.LIZ);
    }

    public static void LJIIJ(C814730Vxf c814730Vxf, int i, String str) {
        PushShowInterceptEvent pushShowInterceptEvent = new PushShowInterceptEvent();
        try {
            pushShowInterceptEvent.LJI(String.valueOf(c814730Vxf.id), "rule_id");
            pushShowInterceptEvent.LJI(String.valueOf(c814730Vxf.rid64), "rule_id64");
            if (!TextUtils.isEmpty(c814730Vxf.openUrl)) {
                Uri uri = UriProtector.parse(c814730Vxf.openUrl);
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"))) {
                    pushShowInterceptEvent.LJI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), "push_label");
                }
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id"))) {
                    pushShowInterceptEvent.LJI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id"), "msg_id");
                }
            }
            pushShowInterceptEvent.LJI(C814710Vxd.LIZLLL(i), "push_channel");
            pushShowInterceptEvent.LJI(str, "reason");
            pushShowInterceptEvent.LJIIIIZZ();
            C089N.LIZ.LJIIZILJ(String.valueOf(c814730Vxf.id), String.valueOf(c814730Vxf.rid64), str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(long j, String str, String str2, Map map) {
        try {
            map.put("click_position", "notify");
            if (str2 != null) {
                map.put("position", str2);
            } else {
                map.put("position", "push_body");
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("post_back", str);
            }
            map.put("rule_id", String.valueOf(j));
            C20684815ws.LJIIZILJ("non_login_push_click", map, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            C20684915wt.LJ(context, "apn", str, j, j2, jSONObjectArr[0]);
            return;
        }
        try {
            C20684915wt.LIZJ(context, "event_v1", "apn", str, j, j2, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII(int i, int i2, String str, String str2, String str3) {
        PushPermissionRequestEvent pushPermissionRequestEvent = new PushPermissionRequestEvent();
        pushPermissionRequestEvent.LJI(Integer.valueOf(i), "is_with_cover");
        pushPermissionRequestEvent.LJI(str, "out_status");
        pushPermissionRequestEvent.LJI(str2, "popup_type");
        pushPermissionRequestEvent.LJI(Integer.valueOf(i2), "is_first_start");
        if (!TextUtils.isEmpty(str3)) {
            pushPermissionRequestEvent.LJI(str3, "popup_page");
        }
        pushPermissionRequestEvent.LJI(Integer.valueOf(C1BY5.LIZIZ()), "pop_up_count");
        pushPermissionRequestEvent.LJIIIIZZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0137, code lost:
    
        if (r0 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.C814730Vxf r15, boolean r16, int r17, java.lang.String r18, android.graphics.Bitmap r19, android.graphics.Bitmap r20) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814850Vxr.LJIIIZ(X.0Vxf, boolean, int, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }
}
