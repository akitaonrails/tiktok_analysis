package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814860Vxs {
    public static final Keva LIZ = KevaImpl.getRepo("uid_recorder", 0);

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(C814730Vxf c814730Vxf) {
        if (c814730Vxf == null || TextUtils.isEmpty(c814730Vxf.openUrl)) {
            return "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730Vxf.openUrl), "gd_label");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return "";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static String LJI(String str) {
        if (C2093608Ic.LJ(str)) {
            return str;
        }
        try {
            String scheme = UriProtector.parse(str).getScheme();
            String strLIZIZ = LIZIZ();
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                str = str.replace(scheme, strLIZIZ);
                return str;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0285 A[Catch: all -> 0x028d, TRY_LEAVE, TryCatch #0 {all -> 0x028d, blocks: (B:84:0x01dd, B:89:0x01ef, B:91:0x01f8, B:92:0x01fc, B:94:0x020b, B:116:0x026c, B:117:0x0285, B:95:0x0210, B:97:0x0218, B:102:0x0225, B:103:0x0232, B:105:0x023a, B:106:0x0247, B:108:0x0251, B:113:0x025c, B:88:0x01eb), top: B:124:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb A[Catch: all -> 0x028d, TRY_ENTER, TryCatch #0 {all -> 0x028d, blocks: (B:84:0x01dd, B:89:0x01ef, B:91:0x01f8, B:92:0x01fc, B:94:0x020b, B:116:0x026c, B:117:0x0285, B:95:0x0210, B:97:0x0218, B:102:0x0225, B:103:0x0232, B:105:0x023a, B:106:0x0247, B:108:0x0251, B:113:0x025c, B:88:0x01eb), top: B:124:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8 A[Catch: all -> 0x028d, TryCatch #0 {all -> 0x028d, blocks: (B:84:0x01dd, B:89:0x01ef, B:91:0x01f8, B:92:0x01fc, B:94:0x020b, B:116:0x026c, B:117:0x0285, B:95:0x0210, B:97:0x0218, B:102:0x0225, B:103:0x0232, B:105:0x023a, B:106:0x0247, B:108:0x0251, B:113:0x025c, B:88:0x01eb), top: B:124:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b A[Catch: all -> 0x028d, TryCatch #0 {all -> 0x028d, blocks: (B:84:0x01dd, B:89:0x01ef, B:91:0x01f8, B:92:0x01fc, B:94:0x020b, B:116:0x026c, B:117:0x0285, B:95:0x0210, B:97:0x0218, B:102:0x0225, B:103:0x0232, B:105:0x023a, B:106:0x0247, B:108:0x0251, B:113:0x025c, B:88:0x01eb), top: B:124:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210 A[Catch: all -> 0x028d, TryCatch #0 {all -> 0x028d, blocks: (B:84:0x01dd, B:89:0x01ef, B:91:0x01f8, B:92:0x01fc, B:94:0x020b, B:116:0x026c, B:117:0x0285, B:95:0x0210, B:97:0x0218, B:102:0x0225, B:103:0x0232, B:105:0x023a, B:106:0x0247, B:108:0x0251, B:113:0x025c, B:88:0x01eb), top: B:124:0x01dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZ(android.content.Context r14, X.C814730Vxf r15) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814860Vxs.LIZ(android.content.Context, X.0Vxf):android.content.Intent");
    }

    public static void LJ(String str, Map<String, String> map) {
        Object obj;
        HashMap map2 = (HashMap) map;
        map2.put("o_url", str);
        Uri uri = UriProtector.parse(str);
        if (uri != null) {
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id"))) {
                map2.put("rule_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"))) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
                map2.put("push_label", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                if ("click_push_recommend".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "item_region"))) {
                    String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                    map2.put("item_region", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "item_region"));
                    map2.put("user_store_region", storeRegionUpperCase);
                }
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "muf_uv_cnt"))) {
                map2.put("muf_uv_cnt", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "muf_uv_cnt"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id"))) {
                map2.put("room_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id"));
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id"))) {
                    map2.put("anchor_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id"));
                }
            }
            String host = uri.getHost();
            if ("detail".equals(host) && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID))) {
                map2.put("group_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
            } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(uri.getLastPathSegment())) {
                map2.put("group_id", uri.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "im_type"))) {
                map2.put("im_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "im_type"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_type"))) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_type");
                if ("1818".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    map2.put("real_message_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
            }
            String path = uri.getPath();
            if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains("detail")) {
                map2.put("tag_id", uri.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sub_type"))) {
                map2.put("sub_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sub_type"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_status"))) {
                map2.put("follow_status", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_status"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_status_to_user"))) {
                map2.put("follow_status_to_user", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "follow_status_to_user"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "itemid"))) {
                map2.put("itemid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "itemid"));
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aggregate_num"))) {
                map2.put("aggregate_num", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aggregate_num"));
            }
            if ("spark".equals(host) && !TextUtils.isEmpty(path) && path.contains("intro")) {
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_msg_goal"))) {
                    map2.put("push_msg_goal", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_msg_goal"));
                }
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "to_app_id"))) {
                    map2.put("to_app_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "to_app_id"));
                }
                if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "photo_text_push_msg_type"))) {
                    map2.put("photo_text_push_msg_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "photo_text_push_msg_type"));
                }
            }
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "switch_account_sec_uid"))) {
                map2.put("is_backstage_account", "1");
            }
            LJFF(uri, "relation_tag", map);
            LJFF(uri, "is_left_big_avatar", map);
            LJFF(uri, "is_right_plot", map);
            LJFF(uri, "content_author_id", map);
            LJFF(uri, "from_user_id", map);
            try {
                AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                boolean zIsLogin = accountUserServiceLJIIJ.isLogin();
                if (zIsLogin) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("is_login", obj);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_target_uid");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                    Keva keva = LIZ;
                    String[] stringArray = keva.getStringArray("logged_in_uids", new String[20]);
                    int i = keva.getInt("num_of_logged_in_uids", 0);
                    if (!zIsLogin) {
                        int iMin = Math.min(i, 20);
                        int i2 = 0;
                        while (true) {
                            if (i2 < iMin) {
                                if (TextUtils.equals(stringArray[i2], strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                                    map2.put("is_self", "3");
                                    break;
                                }
                                i2++;
                            } else {
                                map2.put("is_self", CardStruct.IStatusCode.DEFAULT);
                                break;
                            }
                        }
                    } else if (TextUtils.equals(accountUserServiceLJIIJ.getCurUser().getSecUid(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                        map2.put("is_self", "1");
                    } else {
                        int iMin2 = Math.min(i, 20);
                        int i3 = 0;
                        while (true) {
                            if (i3 < iMin2) {
                                if (TextUtils.equals(stringArray[i3], strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                                    map2.put("is_self", "3");
                                    break;
                                }
                                i3++;
                            } else {
                                map2.put("is_self", CardStruct.IStatusCode.DEFAULT);
                                break;
                            }
                        }
                    }
                    map2.put("accounts_number", String.valueOf(Math.min(20, i)));
                    return;
                }
                map2.put("is_self", "-1");
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJFF(Uri uri, String str, Map map) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            ((HashMap) map).put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
    }

    public static Map<String, String> LIZLLL(C814730Vxf c814730Vxf, int i, boolean z, boolean z2) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        HashMap map = new HashMap();
        try {
            map.put("rule_id", String.valueOf(c814730Vxf.id));
            map.put("rule_id64", String.valueOf(c814730Vxf.rid64));
            if (!TextUtils.isEmpty(c814730Vxf.openUrl)) {
                LJ(c814730Vxf.openUrl, map);
            }
            map.put("push_channel", C814710Vxd.LIZLLL(i));
            boolean z3 = c814730Vxf.extra.turn_screen_on;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            if (z3) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("push_delay", obj);
            map.put("post_back", c814730Vxf.postBack);
            if (z) {
                str = "notify";
            } else {
                str = "alert";
            }
            map.put("click_position", str);
            if (c814730Vxf.extra.style == 5) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("mediastyle", obj2);
            if (!TextUtils.isEmpty(c814730Vxf.extra.bg_color)) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("colorized", obj3);
            if (c814730Vxf.extra.isBannerDeteled) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_banner_deleted", obj4);
            map.put("pitaya_trace_id", c814730Vxf.pitayaTraceID);
            if (z2) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("has_image", obj5);
            map.put("image_play_button", CardStruct.IStatusCode.DEFAULT);
            map.put("image_size", "normal");
            map.put("reach_type", c814730Vxf.reachType);
            map.put("item_type", c814730Vxf.itemType);
            if (C814710Vxd.LJFF(c814730Vxf)) {
                map.put("sound_url", c814730Vxf.extra.soundUrl);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c814730Vxf.extra.alertScene);
                sbLIZ.append("");
                map.put("alert_scene", C2188811AlT.LIZIZ(sbLIZ));
            }
            C814840Vxq c814840Vxq = c814730Vxf.extra;
            if (c814840Vxq != null) {
                if (!TextUtils.isEmpty(c814840Vxq.authorId)) {
                    map.put("author_id", c814730Vxf.extra.authorId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.roomId)) {
                    map.put("room_id", c814730Vxf.extra.roomId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.userId)) {
                    map.put("user_id", c814730Vxf.extra.userId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.musicId)) {
                    map.put("music_id", c814730Vxf.extra.musicId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.challengeId)) {
                    map.put("tag_id", c814730Vxf.extra.challengeId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.tagId)) {
                    map.put("tag_id", c814730Vxf.extra.tagId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.socialExtra)) {
                    JSONObject jSONObject = new JSONObject(c814730Vxf.extra.socialExtra);
                    map.put("sub_item_type", String.valueOf(jSONObject.optInt("sub_item_type")));
                    map.put("dm_action_type", String.valueOf(jSONObject.optInt("dm_action_type")));
                    String strOptString = jSONObject.optString("sound_url");
                    if (!strOptString.isEmpty()) {
                        map.put("sound_url", strOptString);
                    }
                }
                if (!c814730Vxf.extra.actionList.isEmpty()) {
                    str2 = "1";
                }
                map.put("has_button", str2);
                if (!TextUtils.isEmpty(c814730Vxf.extra.trackInfo) && !"null".equalsIgnoreCase(c814730Vxf.extra.trackInfo)) {
                    C2080208Cy.LIZ(c814730Vxf.extra.trackInfo, map);
                }
                if (c814730Vxf.extra.enableRTL == 1) {
                    if (!C444960Hcc.LIZIZ()) {
                        if (C21627319kV.LIZJ().LIZLLL(c814730Vxf.text)) {
                            map.put("rtl_optimized", "1");
                        }
                    } else if (!C21627319kV.LIZJ().LIZLLL(c814730Vxf.text)) {
                        map.put("rtl_optimized", "1");
                    }
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.titlePreDirection)) {
                    map.put("reading_order_pre_title", c814730Vxf.extra.titlePreDirection);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.titlePostDirection)) {
                    map.put("reading_order_post_title", c814730Vxf.extra.titlePostDirection);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.contentPreDirection)) {
                    map.put("reading_order_pre_text", c814730Vxf.extra.contentPreDirection);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.contentPostDirection)) {
                    map.put("reading_order_post_text", c814730Vxf.extra.contentPostDirection);
                    return map;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return map;
    }
}
