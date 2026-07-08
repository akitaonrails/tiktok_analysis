package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKJ {
    public static void LIZ(DataChannel dataChannel, String str) {
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            SubscriptionCommunityFragment subscriptionCommunityFragment = new SubscriptionCommunityFragment();
            subscriptionCommunityFragment.LLLIIIIL = str;
            subscriptionCommunityFragment.LLLIIIL = false;
            subscriptionCommunityFragment.show(fragmentManager, "SubscriptionCommunityFragment");
        }
    }
}
