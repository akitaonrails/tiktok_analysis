package X;

import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.setting.ProInboxUpgradeGuideResource;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS109S0110000_23;

/* JADX INFO: renamed from: X.0pvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530280pvO {
    public static void LIZ(Context context, Function1 function1, boolean z) {
        Pair pair;
        C1618770sE7.LJFF("ProInboxUpgradeGuidePopupTask fetchGeckoResource");
        if (context == null) {
            return;
        }
        if (C960203pA.LIZIZ(context)) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ProInboxUpgradeGuideResource proInboxUpgradeGuideResource = C1530290pvP.LIZ;
            ProInboxUpgradeGuideResource proInboxUpgradeGuideResource2 = (ProInboxUpgradeGuideResource) settingsManagerLIZLLL.LJIIIIZZ("tt_pro_inbox_upgrade_guide_resource", ProInboxUpgradeGuideResource.class, proInboxUpgradeGuideResource);
            if (proInboxUpgradeGuideResource2 != null) {
                proInboxUpgradeGuideResource = proInboxUpgradeGuideResource2;
            }
            pair = new Pair("/social_proinboxguide_andark_tux_lottie.json", proInboxUpgradeGuideResource.illustrationUrlDark);
        } else {
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            ProInboxUpgradeGuideResource proInboxUpgradeGuideResource3 = C1530290pvP.LIZ;
            ProInboxUpgradeGuideResource proInboxUpgradeGuideResource4 = (ProInboxUpgradeGuideResource) settingsManagerLIZLLL2.LJIIIIZZ("tt_pro_inbox_upgrade_guide_resource", ProInboxUpgradeGuideResource.class, proInboxUpgradeGuideResource3);
            if (proInboxUpgradeGuideResource4 != null) {
                proInboxUpgradeGuideResource3 = proInboxUpgradeGuideResource4;
            }
            pair = new Pair("/social_proinboxguide_anlight_tux_lottie.json", proInboxUpgradeGuideResource3.illustrationUrlLight);
        }
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.enableRequestReuse = true;
        Boolean bool = Boolean.TRUE;
        requestParams.enableMemoryCache = bool;
        requestParams.enableCDNCache = bool;
        requestParams.channel = "professional_inbox";
        requestParams.bundle = str;
        forestLIZ.fetchResourceAsync(str2, requestParams, new AwS109S0110000_23(function1, (Function1<? super Pair<? extends InputStream, String>, Unit>) z, true));
    }
}
