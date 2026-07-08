package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.shareprop.SharePropHelper;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0luP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375910luP {
    public static String LIZIZ(String str) {
        if (!TextUtils.equals(str, "live") && !TextUtils.equals(str, "live_event")) {
            if (!TextUtils.equals(str, "comment") && !TextUtils.equals(str, "qna") && !TextUtils.equals(str, "group") && !TextUtils.equals(str, "invite_friends")) {
                if (TextUtils.equals(str, "sticker")) {
                    return EnumC1375930luR.CREATION.name();
                }
                if (TextUtils.equals(str, "challenge")) {
                    return EnumC1375930luR.TECH.name();
                }
                if (TextUtils.equals(str, "playlist")) {
                    return EnumC1375930luR.MUSIC.name();
                }
                if (TextUtils.equals(str, "user")) {
                    return EnumC1375930luR.ACCOUNT.name();
                }
                if (TextUtils.equals(str, "aweme")) {
                    return EnumC1375930luR.MAIN.name();
                }
                if (TextUtils.equals(str, "search")) {
                    return EnumC1375930luR.SEARCH.name();
                }
                return EnumC1375930luR.UNKNOWN.name();
            }
            return EnumC1375930luR.SOCIAL.name();
        }
        return EnumC1375930luR.LIVE.name();
    }

    public static String LIZ(String str, String str2, String str3, BaseSharePackage baseSharePackage) {
        String strReplaceAll;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Activity activityLIZIZ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String string = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UUID.randomUUID());
        String str4 = "";
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!str2.contains("utm_source")) {
            C0XI4 c0xi4 = new C0XI4(str2);
            c0xi4.LJ("utm_source", str3);
            c0xi4.LJ("utm_campaign", "client_share");
            c0xi4.LJ("utm_medium", "android");
            c0xi4.LJ("share_iid", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId());
            c0xi4.LJ("share_link_id", strLIZIZ);
            C844470XAv.LIZ.getClass();
            c0xi4.LIZIZ(C844470XAv.LJIIJ, "share_app_id");
            c0xi4.LJ("ugbiz_name", LIZIZ(str));
            String strLIZIZ2 = C0XJW.LIZIZ();
            if (!TextUtils.isEmpty(strLIZIZ2)) {
                c0xi4.LJ("ug_btm", strLIZIZ2);
            }
            String strLJFF = c0xi4.LJFF();
            boolean z11 = true;
            if (C1357670lQz.LIZ(str, str2)) {
                String strResolveSharePropItemIdFromUrl = SharePropHelper.resolveSharePropItemIdFromUrl(str2);
                if (!TextUtils.isEmpty(strResolveSharePropItemIdFromUrl)) {
                    if (strLIZIZ != null) {
                        string = a0.LJLIIIL(strLIZIZ).toString();
                    }
                    if (string != null) {
                        str4 = string;
                    }
                    C1357670lQz.LIZIZ = str4;
                    if (C18041074t.LIZ()) {
                        if (strResolveSharePropItemIdFromUrl.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            try {
                                Uri uri = UriProtector.parse(strLJFF);
                                Uri.Builder builderBuildUpon = uri.buildUpon();
                                Map<String, String> sharePropInfo = SharePropHelper.getSharePropInfo(strResolveSharePropItemIdFromUrl, 2, Long.valueOf(C18041074t.LIZIZ()));
                                if (sharePropInfo == null) {
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_share_link_id");
                                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        builderBuildUpon.appendQueryParameter("sp_root_share_link_id", strLIZIZ);
                                    }
                                } else {
                                    String str5 = sharePropInfo.get("sp_root_d");
                                    String str6 = sharePropInfo.get("sp_root_u");
                                    String str7 = sharePropInfo.get("sp_root_od");
                                    if (str5 != null && str5.length() != 0) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_d");
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        if (z9) {
                                            builderBuildUpon.appendQueryParameter("sp_root_d", str5);
                                        }
                                    }
                                    if (str6 != null && str6.length() != 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_u");
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() != 0) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        if (z8) {
                                            builderBuildUpon.appendQueryParameter("sp_root_u", str6);
                                        }
                                    }
                                    if (str7 != null && str7.length() != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_od");
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4.length() != 0) {
                                            z7 = false;
                                        } else {
                                            z7 = true;
                                        }
                                        if (z7) {
                                            builderBuildUpon.appendQueryParameter("sp_root_od", str7);
                                        }
                                    }
                                    String str8 = sharePropInfo.get("sp_root_share_link_id");
                                    if (str8 != null && str8.length() != 0) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sp_root_share_link_id");
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5.length() != 0) {
                                            z6 = false;
                                        } else {
                                            z6 = true;
                                        }
                                        if (z6) {
                                            builderBuildUpon.appendQueryParameter("sp_root_share_link_id", str8);
                                        }
                                    }
                                }
                                strLJFF = builderBuildUpon.build().toString();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            }
            C0XI4 c0xi42 = new C0XI4(strLJFF);
            C1234690iEd.LIZIZ.LIZ().LIZ(((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIIZ(str, c0xi42.LIZIZ), c0xi42);
            C1374960lss.LIZ.getClass();
            if (!Intrinsics.LJFF(str3, "sms") || (abstractC1387200mCcLJFF = C1906580ziK.LJFF()) == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null || !Intrinsics.LJFF(Telephony.Sms.getDefaultSmsPackage(activityLIZIZ), "com.google.android.apps.messaging")) {
                z11 = false;
            }
            if (z11) {
                c0xi42.LJ("sms_channel", "google_messages");
            }
            strReplaceAll = c0xi42.LJFF();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("utm_source=");
            sbLIZ2.append(str3);
            strReplaceAll = str2.replaceAll("utm_source=\\w*_?\\w?", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (baseSharePackage != null && !TextUtils.isEmpty(strReplaceAll)) {
            Bundle bundle = baseSharePackage.extras;
            C0XI4 c0xi43 = new C0XI4(strReplaceAll);
            if (((Boolean) C1097804Rc.LIZ.getValue()).booleanValue() && bundle != null) {
                String string2 = bundle.getString("panel_source_v2");
                String string3 = bundle.getString("series_category");
                String string4 = bundle.getString("enter_from");
                if (!TextUtils.isEmpty(string2)) {
                    c0xi43.LJ("panel_source_v2", string2);
                }
                if (!TextUtils.isEmpty(string3) && "1".equals(string3)) {
                    c0xi43.LJ("series_category", string3);
                }
                if (!TextUtils.isEmpty(string4)) {
                    c0xi43.LJ("share_enter_from", string4);
                }
            }
            if (bundle != null) {
                String string5 = bundle.getString("item_author_type");
                if (!TextUtils.isEmpty(string5)) {
                    c0xi43.LJ("item_author_type", string5);
                }
            }
            return c0xi43.LJFF();
        }
        return strReplaceAll;
    }
}
