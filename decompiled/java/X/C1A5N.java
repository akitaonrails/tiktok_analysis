package X;

import com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A5N, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5N extends C09AY implements Function0<GestureControllerSettings.GestureControllerConfig> {
    public C1A5N() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings$GestureControllerConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final GestureControllerSettings.GestureControllerConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        GestureControllerSettings.GestureControllerConfig gestureControllerConfig = GestureControllerSettings.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(GestureControllerSettings.GestureControllerConfig.class, gestureControllerConfig, "feed_gesture_controller_v2_settings", true);
        return LJJII != 0 ? LJJII : gestureControllerConfig;
    }
}
