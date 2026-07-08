package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387620mDI {
    public static final C1387620mDI LIZ = new C1387620mDI();

    public static int LIZIZ(Context context) {
        if (LJ(context)) {
            return 2;
        }
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.lemon.lvoverseas", 0);
            return 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static String LIZJ(Context context) {
        if (context == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return String.valueOf(LIZIZ(context));
    }

    public static boolean LJ(Context context) {
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.lemon.lvoverus", 0);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LJFF(Aweme aweme) {
        CCTemplateInfo ccTemplateInfo;
        if (aweme == null || aweme.getAwemeType() == 65 || aweme.getCcTemplateInfo() == null) {
            return false;
        }
        CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
        String template_id = null;
        if (ccTemplateInfo2 == null || ccTemplateInfo2.getTemplate_id() == null) {
            return false;
        }
        CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo3 != null) {
            template_id = ccTemplateInfo3.getTemplate_id();
        }
        if (Intrinsics.LJFF(template_id, CardStruct.IStatusCode.DEFAULT) || (ccTemplateInfo = aweme.getCcTemplateInfo()) == null || !ccTemplateInfo.isMatchThePolicy()) {
            return false;
        }
        return true;
    }

    public static boolean LJI(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 65) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3Usb24wdvindZbK2SC/S09DtOg+boTmoL+7Ejs3", null));
    }

    public static void LJIIIIZZ(Context context, String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(UriProtector.parse(str));
            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                LIZ(context, intent);
                return;
            }
            intent.setPackage(null);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                LIZ(context, intent);
                return;
            }
            Activity activityLIZ = C06MM.LIZ(context);
            if (activityLIZ == null) {
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131833858);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZLLL(Context context, Aweme aweme, String str, String str2) {
        String template_music_id;
        String template_id;
        Integer numValueOf;
        String template_music_id2;
        String idStr;
        String str3;
        String template_music_id3;
        Music music;
        String str4 = str2;
        if (context == null || aweme == null) {
            return;
        }
        CCTemplateInfo ccTemplateInfo = aweme.getCcTemplateInfo();
        boolean z = true;
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.lemon.lvoverseas", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!LJ(context)) {
                z = false;
            }
        }
        String str5 = "";
        if (z) {
            if (LJFF(aweme)) {
                str3 = "tiktok_music_template_pub";
            } else if (!LJI(aweme)) {
                str3 = "";
            } else {
                str3 = "tiktok_music_template";
            }
            if (!LJFF(aweme) ? !LJI(aweme) || (template_music_id3 = ccTemplateInfo.getTemplate_music_id()) == null : (music = aweme.getMusic()) == null || (template_music_id3 = music.getIdStr()) == null) {
                template_music_id3 = "";
            }
            String template_id2 = ccTemplateInfo.getTemplate_id();
            if (template_id2 == null) {
                template_id2 = "";
            }
            String strValueOf = String.valueOf(aweme.getMusicBeginTime());
            String schemaExtraJsonStr = ccTemplateInfo.getSchemaExtraJsonStr();
            if (schemaExtraJsonStr == null) {
                schemaExtraJsonStr = "";
            }
            LJII(context, template_id2, template_music_id3, strValueOf, schemaExtraJsonStr, str3, ccTemplateInfo.getOnelink());
        } else {
            LJIIIIZZ(context, ccTemplateInfo.getOnelink());
        }
        String match_type = null;
        if (LJFF(aweme)) {
            Music music2 = aweme.getMusic();
            if (music2 != null) {
                template_music_id = music2.getIdStr();
            } else {
                template_music_id = null;
            }
        } else {
            template_music_id = ccTemplateInfo.getTemplate_music_id();
        }
        String template_id3 = ccTemplateInfo.getTemplate_id();
        if (template_id3 != null && template_music_id != null) {
            C527590Kmb.LIZ.getClass();
            C527590Kmb.LIZIZ(template_id3, template_music_id, 0, null);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo2 == null || (template_id = ccTemplateInfo2.getTemplate_id()) == null) {
            template_id = "";
        }
        c2344009Gk.LJIIIIZZ("template_id", template_id);
        c2344009Gk.LIZJ(LIZIZ(context), "is_install_lv");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo3 != null) {
            numValueOf = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "order");
        CCTemplateInfo ccTemplateInfo4 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo4 != null) {
            match_type = ccTemplateInfo4.getMatch_type();
        }
        c2344009Gk.LJIIIIZZ("match_type", match_type);
        if (LJFF(aweme)) {
            c2344009Gk.LJFF("match_item_id", aweme.getAid());
            Music music3 = aweme.getMusic();
            if (music3 != null && (idStr = music3.getIdStr()) != null) {
                str5 = idStr;
            }
            c2344009Gk.LJFF("music_id", str5);
        } else {
            CCTemplateInfo ccTemplateInfo5 = aweme.getCcTemplateInfo();
            if (ccTemplateInfo5 != null && (template_music_id2 = ccTemplateInfo5.getTemplate_music_id()) != null) {
                str5 = template_music_id2;
            }
            c2344009Gk.LJFF("music_id", str5);
        }
        C20684815ws.LJIILLIIL("cc_music_template_page_click", c2344009Gk.LIZ);
    }

    public static void LJII(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(str4).optString("scheme", "capcut");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str7 = (String) c098200Yq;
        if (str7 == null) {
            str7 = "capcut";
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str7.concat("://template/detail")).buildUpon().appendQueryParameter("enter_from", str5).appendQueryParameter("template_id", str).appendQueryParameter("music_id", str2).appendQueryParameter("music_begin_time", str3).appendQueryParameter("tab_name", "template");
        CCTemplateInfo.Companion.appendQueryParameter(builderAppendQueryParameter, str4);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse(builderAppendQueryParameter.toString()));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207967233);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            LIZ(context, intent);
            return;
        }
        if (!LJ(context) && !Intrinsics.LJFF(str7, "capcut") && C123100dR.LIZ(str6)) {
            LJIIIIZZ(context, str6);
            return;
        }
        Activity activityLIZ = C06MM.LIZ(context);
        if (activityLIZ == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
        c1389890mGx.LJIIIZ(2131833858);
        c1389890mGx.LJIIJJI();
    }
}
