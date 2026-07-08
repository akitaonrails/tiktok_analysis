package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;

/* JADX INFO: renamed from: X.0K61, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K61 {
    public static final void LIZ(C511970K5z c511970K5z, SubscriptionSceneContext subscriptionSceneContext) {
        String str;
        String str2;
        String str3;
        if (subscriptionSceneContext == null) {
            subscriptionSceneContext = C0K4B.LIZ();
        }
        String str4 = null;
        if (subscriptionSceneContext != null) {
            str4 = subscriptionSceneContext.enterFromMerge;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (subscriptionSceneContext == null || (str = subscriptionSceneContext.enterMethod) == null) {
            str = "";
        }
        if (subscriptionSceneContext == null || (str2 = subscriptionSceneContext.requestId) == null) {
            str2 = "";
        }
        if (subscriptionSceneContext != null && (str3 = subscriptionSceneContext.videoId) != null) {
            str5 = str3;
        }
        c511970K5z.LIZIZ(str4, "enter_from_merge");
        c511970K5z.LIZIZ(str, "enter_method");
        c511970K5z.LIZIZ(str2, "request_id");
        c511970K5z.LIZIZ(str5, "video_id");
    }
}
