package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;

/* JADX INFO: renamed from: X.0Jxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508920Jxa {
    public static EmotePerformanceTrackerViewModel LIZIZ(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        if (subscriptionPrivilegeDetailFragment.isAdded()) {
            return (EmotePerformanceTrackerViewModel) ViewModelProviders.of(subscriptionPrivilegeDetailFragment, new C508930Jxb("live_room_sub_perks_guide_page")).get("live_room_sub_perks_guide_page", EmotePerformanceTrackerViewModel.class);
        }
        return null;
    }

    public static EmotePerformanceTrackerViewModel LIZ(Context context, String str) {
        if (context != null) {
            return (EmotePerformanceTrackerViewModel) C520010KaN.LJJJI(context, EmotePerformanceTrackerViewModel.class, new C508930Jxb(str), 12);
        }
        return null;
    }
}
