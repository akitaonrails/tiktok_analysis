package X;

import com.bytedance.pumbaa.pipeline.settings.EventPipelineConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823240WRe {
    public static final EventPipelineConfig LIZ;
    public static volatile EventPipelineConfig LIZIZ;

    static {
        EventPipelineConfig eventPipelineConfig = new EventPipelineConfig(false, false, false, false, false, false, null, null, 0.0d, null, null, null, 0, null, null, 32767, null);
        LIZ = eventPipelineConfig;
        C308480C7i.LJ(eventPipelineConfig, "pumbaa_event_android");
    }

    public static EventPipelineConfig LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        EventPipelineConfig eventPipelineConfig = LIZ;
        EventPipelineConfig eventPipelineConfig2 = (EventPipelineConfig) C308480C7i.LIZIZ(EventPipelineConfig.class, "pumbaa_event_android", eventPipelineConfig);
        if (!Intrinsics.LJFF(eventPipelineConfig2, eventPipelineConfig)) {
            LIZIZ = eventPipelineConfig2;
        }
        EventPipelineConfig eventPipelineConfig3 = LIZIZ;
        return eventPipelineConfig3 != null ? eventPipelineConfig3 : eventPipelineConfig;
    }
}
