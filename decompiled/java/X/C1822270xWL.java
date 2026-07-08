package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0xWL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822270xWL {
    public static final Gson LIZ = new Gson();

    public static Bundle LIZIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("show_entrance", pcsServicePlusOptinPageParams.getShowEntrance(), bundle);
        C786410Ut5.LJJJI("anchor_id", pcsServicePlusOptinPageParams.getAnchorId(), bundle);
        C786410Ut5.LJJJI("sec_anchor_id", pcsServicePlusOptinPageParams.getSecAnchorId(), bundle);
        C786410Ut5.LJJJI("pcs_track_context", pcsServicePlusOptinPageParams.getPcsTrackContext(), bundle);
        C786410Ut5.LJJIZ(bundle, "extra", pcsServicePlusOptinPageParams.getExtra());
        return bundle;
    }

    public static String LJ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        String showEntrance = pcsServicePlusOptinPageParams.getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        String anchorId = pcsServicePlusOptinPageParams.getAnchorId();
        if (anchorId == null) {
            anchorId = "";
        }
        String anchorId2 = pcsServicePlusOptinPageParams.getAnchorId();
        if (anchorId2 == null) {
            anchorId2 = "";
        }
        String pcsTrackContext = pcsServicePlusOptinPageParams.getPcsTrackContext();
        if (pcsTrackContext == null) {
            pcsTrackContext = "";
        }
        return subscribeUpsellLynxUrlSetting.getSmbIndustryBlockPage(showEntrance, anchorId, anchorId2, true, true, null, pcsTrackContext, "");
    }

    public static List LJFF(int i) {
        List listLJIIJJI;
        switch (i) {
            case 1:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856349, 2131856354, 2131856350);
                break;
            case 2:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856351, 2131856352, 2131856353);
                break;
            case 3:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856347, 2131856348, 2131856354);
                break;
            case 4:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856358, 2131856359, 2131856354);
                break;
            case 5:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856360, 2131856354, 2131856361);
                break;
            case 6:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856355, 2131856356, 2131856357);
                break;
            default:
                listLJIIJJI = C1697810uHb.LJIIJJI(2131856362, 2131856363, 2131856364);
                break;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(C497740JfY.LJIJI(((Number) it2.next()).intValue()));
        }
        return arrayList;
    }

    public static void LJIIIIZZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        String strLJ = LJ(pcsServicePlusOptinPageParams);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C176600m4.LIZ(), strLJ);
    }

    public static String LIZ(String str, List list) {
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                builderBuildUpon.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = "?";
            if (!u.LJIIZILJ(str, "?", false) && !u.LJIIZILJ(str, "&", false)) {
                if (a0.LJJIIZI(str, "?", false)) {
                    str2 = "&";
                }
            } else {
                str2 = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            sbLIZ.append(C13LP.LJJLIIIJ(list, "&", null, null, 0, null, new C011M(), 30));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams, boolean z) {
        String smbManagementPage = SubscribeUpsellLynxUrlSetting.INSTANCE.getSmbManagementPage(pcsServicePlusOptinPageParams.getShowEntrance(), pcsServicePlusOptinPageParams.getAnchorId(), pcsServicePlusOptinPageParams.getSecAnchorId(), pcsServicePlusOptinPageParams.getAnchorId(), false, pcsServicePlusOptinPageParams.getPcsTrackContext(), "", z);
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, smbManagementPage);
        }
    }

    public static String LIZLLL(long j, String str, String str2) {
        if (str2.length() == 0) {
            str2 = "aweme://roma_redirect/?spark_page=smb_lead_form_creation_halfscreen";
        }
        return LIZ(str2, C1697810uHb.LJIIJJI(new Pair("is_from_opt_in", "1"), new Pair("sku_id", String.valueOf(j)), new Pair("is_onboarding", "1"), new Pair("show_entrance", str)));
    }

    public static String LIZJ(String str, int i, int i2, String str2, String str3, String str4) {
        String strSmbLynxDmAiService = LiveSubscriptionAnchorUrlSetting.smbLynxDmAiService();
        if (strSmbLynxDmAiService.length() == 0) {
            strSmbLynxDmAiService = "aweme://roma_redirect/?spark_page=smb_lynx_dm_ai_service";
        }
        return UriProtector.parse(strSmbLynxDmAiService).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str2).appendQueryParameter("anchor_id", str3).appendQueryParameter("enter_from", str4).appendQueryParameter("upsell_source_page", "onboarding").appendQueryParameter("step_bar_current", String.valueOf(i)).appendQueryParameter("step_bar_total", String.valueOf(i2)).appendQueryParameter("force_theme_style", "light").build().toString();
    }

    public static String LJI(String str, List list, int i, long j, String str2, String str3) {
        String str4 = str3;
        if (str4.length() == 0) {
            str4 = "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=suggested_qna";
        }
        return LIZ(str4, C1697810uHb.LJIIJJI(new Pair("is_adding", String.valueOf(i)), new Pair("title", str), new Pair("placeholder_questions", C13LP.LJJLIIIJ(list, ",", e3.e, e3.f, 0, null, new C052300Gz(), 24)), new Pair("sku_id", String.valueOf(j)), new Pair("is_onboarding", "1"), new Pair("show_entrance", str2)));
    }

    public static String LJII(int i, String str, String str2, long j, String str3, String str4) {
        if (str4.length() == 0) {
            str4 = "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=welcome";
        }
        return LIZ(str4, C1697810uHb.LJIIJJI(new Pair("is_adding", String.valueOf(i)), new Pair("title", str), new Pair("hint_text", str2), new Pair("sku_id", String.valueOf(j)), new Pair("is_onboarding", "1"), new Pair("show_entrance", str3)));
    }
}
