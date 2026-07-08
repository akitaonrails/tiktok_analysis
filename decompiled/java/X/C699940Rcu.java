package X;

import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Rcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699940Rcu {
    public static final void LIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((LinkedHashMap) C699910Rcr.LIZLLL).get(C699930Rct.LIZ(str, str2));
            if (l != null) {
                c2344009Gk.LIZLLL(jCurrentTimeMillis - l.longValue(), "component_show_time");
            }
            IPlayerComponentAbility iPlayerComponentAbilityLIZJ = C699930Rct.LIZJ(str);
            if (iPlayerComponentAbilityLIZJ != null) {
                c2344009Gk.LIZLLL(iPlayerComponentAbilityLIZJ.te(), "video_duration");
            }
            IPlayerComponentAbility iPlayerComponentAbilityLIZJ2 = C699930Rct.LIZJ(str);
            if (iPlayerComponentAbilityLIZJ2 != null) {
                c2344009Gk.LIZLLL(iPlayerComponentAbilityLIZJ2.getCurrentPosition(), "video_play_time");
            }
            Long l2 = (Long) ((LinkedHashMap) C699910Rcr.LJ).get(str);
            if (l2 != null) {
                c2344009Gk.LIZLLL(jCurrentTimeMillis - l2.longValue(), "click_stay_time");
            }
        }
    }
}
