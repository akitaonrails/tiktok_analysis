package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tracker.EventSampleConfig;
import com.ss.android.ugc.aweme.tracker.SampleConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196180hEW extends C09AY implements Function0<EventSampleConfig[]> {
    public C1196180hEW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EventSampleConfig[] invoke() {
        String string;
        String string2;
        EventSampleConfig[] eventSampleConfigArr = (EventSampleConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("local_service_event_sample_rate_config", EventSampleConfig[].class, null);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_event_sample_setting_report_exp", false) == 1 && eventSampleConfigArr != null) {
            for (EventSampleConfig eventSampleConfig : eventSampleConfigArr) {
                String str = "";
                if (Intrinsics.LJFF(eventSampleConfig.eventName, "location_image_monitor")) {
                    List<SampleConfig> list = eventSampleConfig.sampleList;
                    if (list != null && (string2 = list.toString()) != null) {
                        str = string2;
                    }
                    C1196170hEV.LIZ("location_image_monitor", str);
                } else if (Intrinsics.LJFF(eventSampleConfig.eventName, "local_service_pass_through_experience")) {
                    List<SampleConfig> list2 = eventSampleConfig.sampleList;
                    if (list2 != null && (string = list2.toString()) != null) {
                        str = string;
                    }
                    C1196170hEV.LIZ("local_service_pass_through_experience", str);
                }
            }
        }
        return eventSampleConfigArr;
    }
}
