package X;

import com.ss.android.ugc.aweme.configuration.functions.TemplateOpenLinkFunctionAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import defpackage.g9;
import java.util.List;

/* JADX INFO: renamed from: X.10RX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RX {
    public static final C10RX LIZ = new C10RX();
    public static C10QY LIZIZ;

    /* JADX WARN: Type inference failed for: r1v4, types: [X.10QI, X.10QY] */
    public static final boolean LIZ() {
        C10QZ c10qz = C10RW.LIZLLL;
        if (c10qz == null || !c10qz.LIZ("is_ecomm_new", false)) {
            return false;
        }
        C10QZ c10qz2 = C10RW.LIZLLL;
        if ((c10qz2 != null && c10qz2.LIZ("need_check_user", true)) || ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getDeviceCheckResult() != IPluginService.ReinstallCheck.NON_REINSTALL) {
            return false;
        }
        if (LIZIZ == null) {
            ?? r1 = new C10QI() { // from class: X.10QY
                {
                    g9 g9Var = g9.STRATEGY_TTS_SEA_SPEED_UP_AB;
                }
            };
            LIZIZ = r1;
            if (!r1.LIZ("is_enable", false)) {
                return false;
            }
        }
        return true;
    }

    public static final String LIZIZ() {
        C10QY c10qy;
        C10QZ c10qz = C10RW.LIZLLL;
        if ((c10qz != null && c10qz.LIZ("need_open_link", false)) && (c10qy = LIZIZ) != null) {
            return TemplateOpenLinkFunctionAbility.LIZIZ(new TemplateOpenLinkFunctionAbility.ReplaceParams(c10qy.LIZLLL("link_template", ""), C1697810uHb.LJ(new TemplateOpenLinkFunctionAbility.KV("__REGION__", "#priority_region"), new TemplateOpenLinkFunctionAbility.KV("__CAMPAIGN_ID__", "#tts_campaign_id"), new TemplateOpenLinkFunctionAbility.KV("&top_product_ids=__TOP_PRODUCT_IDS__", "#tts_product_ids"))));
        }
        return null;
    }

    public static final List<String> LIZJ() {
        C10QZ c10qz = C10RW.LIZLLL;
        if (c10qz == null || !c10qz.LIZ("is_show_ecomm_feed_card", false)) {
            return null;
        }
        return C10SR.LIZLLL();
    }
}
