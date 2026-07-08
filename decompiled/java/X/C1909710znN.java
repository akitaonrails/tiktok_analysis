package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0znN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909710znN {
    public static final C1909710znN LIZ = new C1909710znN();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<String>> LIZJ = new ConcurrentHashMap<>();

    public static void LJ() {
        for (String str : C13LP.LLIIII(LIZIZ.keySet())) {
            C1909710znN c1909710znN = LIZ;
            CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZIZ.get(str);
            c1909710znN.getClass();
            String string = LIZ().getString(str, "");
            C19506911Tn c19506911Tn = new C19506911Tn(!TextUtils.isEmpty(string) ? C08JS.LJ(Object[].class, string) : new ArrayList(), 100);
            c19506911Tn.LIZ(copyOnWriteArraySet);
            LIZ().storeString(str, C08JS.LIZLLL(c19506911Tn.LIZIZ));
        }
        if (((Boolean) InnerPushExperienceOptimize.LJIIIZ.getValue()).booleanValue()) {
            for (String str2 : C13LP.LLIIII(LIZJ.keySet())) {
                C1909710znN c1909710znN2 = LIZ;
                CopyOnWriteArraySet<String> copyOnWriteArraySet2 = LIZJ.get(str2);
                c1909710znN2.getClass();
                String string2 = LIZ().getString(str2, "");
                C19506911Tn c19506911Tn2 = new C19506911Tn(!TextUtils.isEmpty(string2) ? C08JS.LJ(Object[].class, string2) : new ArrayList(), 100);
                c19506911Tn2.LIZ(copyOnWriteArraySet2);
                LIZ().storeString(str2, C08JS.LIZLLL(c19506911Tn2.LIZIZ));
            }
        }
    }

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repo_in_app_push_dedup_");
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((IAccountUserService) C19331310k3.LIZ.getValue()).getCurUserId());
        sbLIZ.append(lLJIILIIL != null ? lLJIILIIL.longValue() : 0L);
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
    }

    public static String LIZIZ(InnerPushMessage innerPushMessage) {
        String strLIZJ;
        InnerPushUITemplate uiTemplate;
        String str;
        String str2;
        String str3;
        String str4;
        if (innerPushMessage.getType() == 30) {
            return LIZLLL(innerPushMessage, "insert_ids");
        }
        if (innerPushMessage.getType() == 35) {
            return LIZLLL(innerPushMessage, "item_id");
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (str4 = uiTemplate2.avatarSchema) != null) {
            LIZ.getClass();
            strLIZJ = LIZJ(str4);
        } else {
            strLIZJ = null;
        }
        if (C123100dR.LIZ(strLIZJ)) {
            return strLIZJ;
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (str3 = uiTemplate3.middleSchemaUrl) != null) {
            LIZ.getClass();
            strLIZJ = LIZJ(str3);
        }
        if (C123100dR.LIZ(strLIZJ)) {
            return strLIZJ;
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (str2 = uiTemplate4.rightSchemaUrl) != null) {
            LIZ.getClass();
            strLIZJ = LIZJ(str2);
        }
        if (!C123100dR.LIZ(strLIZJ) && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (str = uiTemplate.globalSchemaUrl) != null) {
            LIZ.getClass();
            return LIZJ(str);
        }
        return strLIZJ;
    }

    public static String LIZJ(String str) {
        if (C703302op.LIZ(str)) {
            if (!u.LJJIIJZLJL(str, "aweme://aweme/detail/", false) && !u.LJJIIJZLJL(str, "sslocal://aweme/detail/", false) && !u.LJJIIJZLJL(str, "snssdk1180://aweme/detail/", false)) {
                if (u.LJJIIJZLJL(str, "sslocal://story/detail/", false) || u.LJJIIJZLJL(str, "aweme://story/detail/", false)) {
                    return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "push_id");
                }
                return null;
            }
            Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(InnerPushMessage innerPushMessage, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        InnerPushUITemplate uiTemplate;
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (str5 = uiTemplate2.avatarSchema) != null && (uri = UriProtector.parse(str5)) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (str4 = uiTemplate3.middleSchemaUrl) != null) {
            Uri uri2 = UriProtector.parse(str4);
            if (uri2 != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str);
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
        }
        if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (str3 = uiTemplate4.rightSchemaUrl) != null) {
            Uri uri3 = UriProtector.parse(str3);
            if (uri3 != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, str);
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
        }
        if (!C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (str2 = uiTemplate.globalSchemaUrl) != null) {
            Uri uri4 = UriProtector.parse(str2);
            if (uri4 == null) {
                return null;
            }
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, str);
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }
}
