package Y;

import X.C13BV;
import X.C1488750oqP;
import X.C1509850pOR;
import X.C1C7U;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS6S1200100_23 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<BitRate> bitRate;
        VideoInfo videoInfo = ((ECLiveVideoReplayFragment) this.l1).LLJJJIL;
        Video video = videoInfo != null ? videoInfo.video : null;
        boolean z = (video == null || (bitRate = video.getBitRate()) == null || !(bitRate.isEmpty() ^ true)) ? false : true;
        ECLiveVideoReplayFragment eCLiveVideoReplayFragment = (ECLiveVideoReplayFragment) this.l1;
        if (!eCLiveVideoReplayFragment.LLLIZZ) {
            ECLiveVideoReplayFragment.hS(eCLiveVideoReplayFragment, "play_fail", this.s0, 4);
        }
        if (((Boolean) ((ECLiveVideoReplayFragment) this.l1).LLLJ.getValue()).booleanValue() && z) {
            ECLiveVideoReplayFragment eCLiveVideoReplayFragment2 = (ECLiveVideoReplayFragment) this.l1;
            if (!eCLiveVideoReplayFragment2.LLLILZ) {
                eCLiveVideoReplayFragment2.LLLILZ = true;
                eCLiveVideoReplayFragment2.LLLIZZ = true;
                ECLiveVideoReplayFragment.hS(eCLiveVideoReplayFragment2, "fallback_start", null, 6);
                ECLiveVideoReplayFragment.gS((ECLiveVideoReplayFragment) this.l1, -5, "player_error_retry_without_bitrate", null, 4);
                if (video != null) {
                    video.setBitRate(C13BV.INSTANCE);
                }
                VideoInfo videoInfo2 = ((ECLiveVideoReplayFragment) this.l1).LLJJJIL;
                if (videoInfo2 != null) {
                    C1488750oqP c1488750oqP = (C1488750oqP) this.l2;
                    long j = this.j3;
                    if (j < 0) {
                        j = 0;
                    }
                    c1488750oqP.setStartTimeMs(j);
                    c1488750oqP.LJFF(videoInfo2, true);
                    return;
                }
                return;
            }
        }
        ECLiveVideoReplayFragment eCLiveVideoReplayFragment3 = (ECLiveVideoReplayFragment) this.l1;
        if (eCLiveVideoReplayFragment3.LLLIZZ) {
            ECLiveVideoReplayFragment.hS(eCLiveVideoReplayFragment3, "fallback_fail", this.s0, 4);
        }
        ECLiveVideoReplayFragment eCLiveVideoReplayFragment4 = (ECLiveVideoReplayFragment) this.l1;
        String str = this.s0;
        if (a0.LJJJIL(str)) {
            str = "player_error";
        }
        ECLiveVideoReplayFragment.gS(eCLiveVideoReplayFragment4, -5, str, null, 4);
        ((ECLiveVideoReplayFragment) this.l1).dS(false);
        ECLiveVideoReplayFragment eCLiveVideoReplayFragment5 = (ECLiveVideoReplayFragment) this.l1;
        eCLiveVideoReplayFragment5.LLJJL = false;
        eCLiveVideoReplayFragment5.kS();
    }

    public static final void run$0(ARunnableS6S1200100_23 aRunnableS6S1200100_23) {
        boolean zLIZ;
        C1C7U.LIZ("ECLiveVideoReplayFragment@4d09.initPlayer$view$1$2$onError$1");
        try {
            aRunnableS6S1200100_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECLiveVideoReplayFragment@4d09.initPlayer$view$1$2$onError$1");
    }

    public static final void run$1(ARunnableS6S1200100_23 aRunnableS6S1200100_23) {
        boolean zLIZ;
        C1C7U.LIZ("FlashFeatureManager@297e.getFeedPbFeaturesJson$1$1");
        try {
            C1509850pOR c1509850pOR = C1509850pOR.LIZ;
            String str = (String) ((Pair) ((Map.Entry) aRunnableS6S1200100_23.l1).getKey()).getFirst();
            String str2 = aRunnableS6S1200100_23.s0;
            JSONObject jSONObject = (JSONObject) aRunnableS6S1200100_23.l2;
            long j = aRunnableS6S1200100_23.j3;
            c1509850pOR.getClass();
            C1509850pOR.LIZLLL(str, str2, jSONObject, j);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashFeatureManager@297e.getFeedPbFeaturesJson$1$1");
    }

    public ARunnableS6S1200100_23(Object obj, String str, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.j3 = j;
    }
}
