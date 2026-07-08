package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.experiment.LSContentSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609390NvF extends C09AY implements Function1<Lifecycle, C609380NvE> {
    public C609390NvF() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NvE] */
    @Override // kotlin.jvm.functions.Function1
    public final C609380NvE invoke(Lifecycle lifecycle) {
        final Lifecycle lifecycle2 = lifecycle;
        return new AbstractC616030OEf<VideoItemParams>(lifecycle2) { // from class: X.0NvE
            public final Lifecycle LLILZIL;

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return this.LLILZIL;
            }

            {
                super("bottom_button_local_alliance_post_earn");
                this.LLILZIL = lifecycle2;
            }

            @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
            public final void rr(Object obj) {
                String aid;
                long jLongValue;
                boolean z;
                Aweme aweme;
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBind,aid: ");
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                C2188811AlT.LIZIZ(sbLIZ);
                long j = C609440NvK.LIZ().getLong("sm_exposure_last_time", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = false;
                if (!C746102vj.LIZ(videoItemParams) && jCurrentTimeMillis - j < ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "fyp_similar_product_sensor_frequency_interval", false)) * 1000) {
                    LJ(false);
                    return;
                }
                int i = C609440NvK.LIZ().getInt("sm_exposure_count", 0);
                long j2 = jCurrentTimeMillis - j;
                Long l = LSContentSettings.LIZ().smSensorExitFrequency;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 259200;
                }
                if (j2 < jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exposureCount<3： ");
                    int iIntValue = 3;
                    if (i < 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ2.append(z);
                    sbLIZ2.append(", exposureCount: ");
                    sbLIZ2.append(i);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Integer num = LSContentSettings.LIZ().smSensorExitCount;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    if (i < iIntValue) {
                    }
                    LJ(z2);
                }
                C609440NvK.LIZ().storeInt("sm_exposure_count", 0);
                z2 = true;
                LJ(z2);
            }
        };
    }
}
