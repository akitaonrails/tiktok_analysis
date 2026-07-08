package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchThemeConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15Er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20487515Er {
    public static final LeagueScoreInfo LIZ(IMultiHostService iMultiHostService) {
        C954460awe next;
        Iterator<C954460awe> it2 = iMultiHostService.LLILZLL(true).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJ == C950220apo.LJ()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C954460awe c954460awe = next;
        if (c954460awe == null) {
            return null;
        }
        return c954460awe.LJJIIJ;
    }

    public static C20487915Ev LIZIZ(LeagueScoreInfo leagueScoreInfo) {
        int i;
        C20486515Eh c20486515Eh;
        C20486515Eh c20486515Eh2;
        C20487915Ev c20487915Ev = new C20487915Ev(new C20486515Eh(EnumC1154880g9u.GECKO, 0, "tiktok_live_interaction_demand_6", "ttlive_icon_pk_league.png", null, 18), null, null, EnumC994560bzK.LEAGUE_MATCH, 0);
        if (leagueScoreInfo != null) {
            i = leagueScoreInfo.matchTheme;
        } else {
            i = 0;
        }
        C20487915Ev c20487915EvLIZ = C20487915Ev.LIZ(c20487915Ev, null, null, null, i, 15);
        if (leagueScoreInfo != null && LiveMatchThemeConfigSetting.INSTANCE.isConfiguredTheme(Integer.valueOf(leagueScoreInfo.matchTheme))) {
            ImageModel imageModel = leagueScoreInfo.leftIcon;
            if (imageModel != null) {
                c20486515Eh = new C20486515Eh(EnumC1154880g9u.IMAGE_MODEL, 0, null, null, imageModel, 14);
            } else {
                c20486515Eh = c20487915EvLIZ.LIZ;
            }
            ImageModel imageModel2 = leagueScoreInfo.rightIcon;
            if (imageModel2 != null) {
                c20486515Eh2 = new C20486515Eh(EnumC1154880g9u.IMAGE_MODEL, 0, null, null, imageModel2, 14);
            } else {
                c20486515Eh2 = null;
            }
            String str = leagueScoreInfo.rightSchemaJumpLink;
            if (str == null || !(!a0.LJJJIL(str))) {
                str = null;
            }
            return C20487915Ev.LIZ(c20487915EvLIZ, c20486515Eh, c20486515Eh2, str, 0, 24);
        }
        return c20487915EvLIZ;
    }

    public static final boolean LIZJ(ILiveMatchService iLiveMatchService, IMultiHostService iMultiHostService) {
        Integer numValueOf;
        if (!iLiveMatchService.k31()) {
            LiveMatchThemeConfigSetting liveMatchThemeConfigSetting = LiveMatchThemeConfigSetting.INSTANCE;
            LeagueScoreInfo leagueScoreInfoLIZ = LIZ(iMultiHostService);
            if (leagueScoreInfoLIZ != null) {
                numValueOf = Integer.valueOf(leagueScoreInfoLIZ.matchTheme);
            } else {
                numValueOf = null;
            }
            if (!liveMatchThemeConfigSetting.isConfiguredTheme(numValueOf)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
