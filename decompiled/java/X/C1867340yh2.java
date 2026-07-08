package X;

import com.ss.android.ugc.aweme.feed.experiment.SeekBarThumbnailExperimentV2Data;
import java.util.List;

/* JADX INFO: renamed from: X.0yh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867340yh2 {
    public static final SeekBarThumbnailExperimentV2Data LIZ = new SeekBarThumbnailExperimentV2Data(0, false, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1867330yh1());

    public static boolean LIZ() {
        SeekBarThumbnailExperimentV2Data seekBarThumbnailExperimentV2Data = (SeekBarThumbnailExperimentV2Data) LIZIZ.getValue();
        return seekBarThumbnailExperimentV2Data != null && seekBarThumbnailExperimentV2Data.threshHold > 0;
    }

    public static final boolean LIZIZ(long j, String str) {
        List<String> list;
        SeekBarThumbnailExperimentV2Data seekBarThumbnailExperimentV2Data;
        C01GW c01gw = LIZIZ;
        SeekBarThumbnailExperimentV2Data seekBarThumbnailExperimentV2Data2 = (SeekBarThumbnailExperimentV2Data) c01gw.getValue();
        if (seekBarThumbnailExperimentV2Data2 != null && (list = seekBarThumbnailExperimentV2Data2.scenes) != null && C13LP.LJJJJ(str, list) && (seekBarThumbnailExperimentV2Data = (SeekBarThumbnailExperimentV2Data) c01gw.getValue()) != null && j >= seekBarThumbnailExperimentV2Data.threshHold) {
            return true;
        }
        return false;
    }
}
