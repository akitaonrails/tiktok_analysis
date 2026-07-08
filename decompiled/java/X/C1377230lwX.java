package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377230lwX {
    public static String LIZ(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || Intrinsics.LJFF(strOptString, "null")) {
            return null;
        }
        return strOptString;
    }

    public static WebSharePackage LIZIZ(Context context, WebShareInfo webShareInfo, String str, SendMessageTemplateTask sendMessageTemplateTask) {
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "pic";
        c1370940lmO.LIZIZ = "web";
        c1370940lmO.LIZLLL = webShareInfo.getTitle();
        c1370940lmO.LJ = webShareInfo.getDesc();
        String strLJ = C1375500ltk.LJ(webShareInfo.getUrl());
        if (strLJ == null) {
            strLJ = "";
        }
        c1370940lmO.LJFF = strLJ;
        c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
        WebSharePackage webSharePackage = new WebSharePackage(c1370940lmO);
        Bundle bundle = webSharePackage.extras;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(webShareInfo.getImagePath());
        C786410Ut5.LJJJI("thumb_url", C2188811AlT.LIZIZ(sbLIZ), bundle);
        C786410Ut5.LJJJI("thumb_path", webShareInfo.getImagePath(), bundle);
        C786410Ut5.LJJJI("url_for_im_share", str, bundle);
        bundle.putBoolean("enable_copylink_desc", webShareInfo.getEnableCopyLinkDesc().booleanValue());
        return webSharePackage;
    }

    public static WebSharePackage LIZJ(Context context, WebShareInfo webShareInfo, String str, boolean z, SendMessageTemplateTask sendMessageTemplateTask) {
        C1377240lwY c1377240lwY;
        if (C621180OYa.LIZIZ.LJJJJLI(webShareInfo.getEnterFrom())) {
            final CommonWebShareModel commonWebShareModel = new CommonWebShareModel(webShareInfo);
            c1377240lwY = new C1377240lwY(commonWebShareModel) { // from class: X.0lwa
                @Override // X.C1377240lwY, X.AbstractC1377630lxB
                public final String LJII() {
                    String strLJFF = C1375500ltk.LJFF(super.LJII());
                    return strLJFF == null ? "" : strLJFF;
                }
            };
        } else {
            c1377240lwY = new C1377240lwY(new CommonWebShareModel(webShareInfo));
        }
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "web";
        c1370940lmO.LIZIZ = "web";
        c1370940lmO.LIZLLL = webShareInfo.getTitle();
        c1370940lmO.LJ = webShareInfo.getDesc();
        c1370940lmO.LJFF = c1377240lwY.LJII();
        c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
        WebSharePackage webSharePackage = new WebSharePackage(c1370940lmO);
        Bundle bundle = webSharePackage.extras;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        C786410Ut5.LJJJI("thumb_url", webShareInfo.getImage(), bundle);
        C786410Ut5.LJJJI("url_for_im_share", str, bundle);
        bundle.putBoolean("user_origin_link", z);
        bundle.putBoolean("enable_copylink_desc", webShareInfo.getEnableCopyLinkDesc().booleanValue());
        C786410Ut5.LJJJI("enter_from", webShareInfo.getEnterFrom(), bundle);
        C786410Ut5.LJJJI("referral_enter_from", webShareInfo.getReferralEnterFrom(), bundle);
        C786410Ut5.LJJJI("referral_page_enter_from", webShareInfo.getReferralPageEnterFrom(), bundle);
        C786410Ut5.LJJJI("share_item_id", webShareInfo.getShareItemId(), bundle);
        webSharePackage.remoteImagePath = webShareInfo.getImage();
        C1324840ka2.LJIJJ(webShareInfo.getImage());
        return webSharePackage;
    }

    public static WebSharePackage LIZLLL(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "web";
        WebSharePackage.Companion.getClass();
        String strLIZ = LIZ("title", jSONObject);
        String str4 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        c1370940lmO.LIZLLL = strLIZ;
        String strLIZ2 = LIZ("description", jSONObject);
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        c1370940lmO.LJ = strLIZ2;
        String strLIZ3 = LIZ("url", jSONObject);
        if (strLIZ3 != null) {
            str4 = strLIZ3;
        }
        c1370940lmO.LJFF = str4;
        String str5 = c1370940lmO.LIZLLL;
        if (str5 == null || str5.length() == 0) {
            if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, "undefined")) {
                c1370940lmO.LIZLLL = str;
            } else {
                c1370940lmO.LIZLLL = str3;
            }
        }
        String str6 = c1370940lmO.LJ;
        if (str6 == null || str6.length() == 0) {
            c1370940lmO.LJ = " ";
        }
        if (c1370940lmO.LJFF != null && (!a0.LJJJIL(r0))) {
            C0XI4 c0xi4 = new C0XI4(c1370940lmO.LJFF);
            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
            C844470XAv.LIZ.getClass();
            SharedPreferences sharedPreferencesLJ = c813020VuuLJIIL.LJ(C844470XAv.LIZ());
            if (sharedPreferencesLJ == null || !sharedPreferencesLJ.getBoolean("disable_ucode_in_share_url", false)) {
                c0xi4.LJ("u_code", C2431009fo.LJI(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()));
            }
            SharedPreferences sharedPreferencesLJ2 = C813020Vuu.LJIIL().LJ(C844470XAv.LIZ());
            if (sharedPreferencesLJ2 == null || !sharedPreferencesLJ2.getBoolean("disable_iid_in_share_url", false)) {
                c0xi4.LJ("iid", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId());
            }
            c1370940lmO.LJFF = c0xi4.LJFF();
        } else {
            c1370940lmO.LJFF = str2;
        }
        WebSharePackage webSharePackage = new WebSharePackage(c1370940lmO);
        Bundle bundle = webSharePackage.extras;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        C786410Ut5.LJJJI("thumb_url", LIZ("image", jSONObject), bundle);
        return webSharePackage;
    }
}
