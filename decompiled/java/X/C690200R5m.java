package X;

import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690200R5m {
    public static boolean LIZ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility;
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            if (interfaceC665370Q7z != null && (feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) C1558520qew.LIZ(interfaceC665370Q7z, FeedRecommendSkylightDrawerAbility.class, null)) != null && feedRecommendSkylightDrawerAbility.yw0()) {
                return true;
            }
            return false;
        }
        return A11yFeedToolComponent.LLLII;
    }
}
