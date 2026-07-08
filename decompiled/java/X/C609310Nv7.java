package X;

import com.ss.android.ugc.aweme.experiment.LSContentSettings;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609310Nv7 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        int iIntValue;
        C609370NvD.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - C609370NvD.LIZIZ().getLong(C609370NvD.LIZ("button_first_collect_time"), 0L);
        Integer num = LSContentSettings.LIZ().faSensorExitFrequency;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 604800;
        }
        if (jCurrentTimeMillis > iIntValue * LSPassThroughRecordSizeConfig.DEFAULT) {
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("button_show_count"), 1);
        } else {
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("button_show_count"), C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("button_show_count"), 0) + 1);
        }
        C609370NvD.LIZIZ().storeLong(C609370NvD.LIZ("button_last_show_time"), System.currentTimeMillis());
        if (C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("button_show_count"), 0) == 1) {
            C609370NvD.LIZIZ().storeLong(C609370NvD.LIZ("button_first_show_time"), System.currentTimeMillis());
        }
        return new C1387205bq(null);
    }
}
