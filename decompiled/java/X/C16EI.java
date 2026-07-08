package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.16EI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EI extends C09AY implements Function2<VideoProgressBarAssem, C2248751Czx, Unit> {
    public C16EI() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C2248751Czx c2248751Czx) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        VideoControl videoControl;
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        C2248751Czx c2248751Czx2 = c2248751Czx;
        if (!C288460BSi.LIZ || !C1591860rWi.LIZIZ(((VideoItemParams) C631370Opb.LIZ(videoProgressBarAssem2)).getAweme())) {
            VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(videoProgressBarAssem2);
            String aid = null;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.getVideoControl() != null) {
                VideoItemParams videoItemParams2 = (VideoItemParams) C631370Opb.LIZ(videoProgressBarAssem2);
                int progress = 0;
                if ((videoItemParams2 == null || (aweme4 = videoItemParams2.getAweme()) == null || (videoControl = aweme4.getVideoControl()) == null || videoControl.showProgressBar != 0) && c2248751Czx2 != null) {
                    VideoProgressBarViewModel videoProgressBarViewModelEp = videoProgressBarAssem2.Ep();
                    C418630GbF c418630GbF = videoProgressBarAssem2.LLLF;
                    if (c418630GbF != null) {
                        progress = c418630GbF.getProgress();
                    }
                    VideoItemParams item = videoProgressBarViewModelEp.getItem();
                    if (item != null && item.getAweme() != null && (aweme2 = c2248751Czx2.LIZ) != null) {
                        String aid2 = aweme2.getAid();
                        VideoItemParams item2 = videoProgressBarViewModelEp.getItem();
                        if (item2 != null && (aweme3 = item2.getAweme()) != null) {
                            aid = aweme3.getAid();
                        }
                        if (aid2 == aid && (progress != 0 || SystemClock.elapsedRealtime() >= videoProgressBarViewModelEp.LL + ((long) 600))) {
                            videoProgressBarViewModelEp.setState(new AwS397S0200000_31(videoProgressBarViewModelEp, c2248751Czx2, 88));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
