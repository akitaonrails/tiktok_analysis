package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;

/* JADX INFO: renamed from: X.0K4B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K4B {
    public static final C2252321DDq LIZ;
    public static final AnonymousClass0951 LIZIZ;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        LIZ = c2252321DDqLIZ;
        LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public static SubscriptionSceneContext LIZ() {
        return (SubscriptionSceneContext) LIZ.getValue();
    }

    public static void LIZIZ(SubscriptionSceneContext subscriptionSceneContext) {
        LIZ.setValue(subscriptionSceneContext);
    }
}
