package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfigNew;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ITk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467100ITk extends C09AY implements Function0<Map<String, ? extends Map<String, ? extends Map<String, ? extends Integer>>>> {
    public C467100ITk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Integer>>>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Map<String, ? extends Map<String, ? extends Integer>>> invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveFeedDynamicFeatureConfigNew.class);
    }
}
