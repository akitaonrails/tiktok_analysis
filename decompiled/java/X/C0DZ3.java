package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;

/* JADX INFO: renamed from: X.0DZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZ3 {
    public static SocialThoughtPanelFragment LIZJ(String str, String str2, boolean z) {
        SocialThoughtPanelFragment socialThoughtPanelFragment = new SocialThoughtPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("mode", "CONSUMPTION_SELF", bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        bundle.putBoolean("in_aggregate_flow", z);
        socialThoughtPanelFragment.setArguments(bundle);
        return socialThoughtPanelFragment;
    }

    public static SocialThoughtPanelFragment LIZIZ(ThoughtInfo thoughtInfo, User user, boolean z, boolean z2) {
        SocialThoughtPanelFragment socialThoughtPanelFragment = new SocialThoughtPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("mode", "CONSUMPTION_OTHERS", bundle);
        C786410Ut5.LJJIZ(bundle, "thought_info", thoughtInfo);
        C786410Ut5.LJJIZ(bundle, "user", user);
        bundle.putBoolean("is_from_aggregated", z);
        bundle.putBoolean("in_aggregate_flow", z2);
        socialThoughtPanelFragment.setArguments(bundle);
        return socialThoughtPanelFragment;
    }

    public static SocialThoughtPanelFragment LIZ(String str, boolean z, String str2, boolean z2, int i) {
        String str3 = SocialThoughtPanelFragment._pnsPageId;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        SocialThoughtPanelFragment socialThoughtPanelFragment = new SocialThoughtPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("mode", "CREATION", bundle);
        C786410Ut5.LJJJI("uid", str, bundle);
        bundle.putBoolean("has_back", z);
        bundle.putBoolean("in_aggregate_flow", z2);
        if (str2 != null && str2.length() != 0) {
            C786410Ut5.LJJJI("prefill_text", str2, bundle);
        }
        socialThoughtPanelFragment.setArguments(bundle);
        return socialThoughtPanelFragment;
    }
}
