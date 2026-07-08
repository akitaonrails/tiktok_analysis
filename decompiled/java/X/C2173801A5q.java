package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.gesture.GestureHotfix;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173801A5q extends C09AY implements Function0<GestureHotfix> {
    public C2173801A5q() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.gesture.GestureHotfix, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final GestureHotfix invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        GestureHotfix gestureHotfix = C2173791A5p.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_gesture_hotfix_settings", GestureHotfix.class, gestureHotfix);
        return LJIIIIZZ != 0 ? LJIIIIZZ : gestureHotfix;
    }
}
