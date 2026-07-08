package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.experiment.SeekBarThumbnailExperimentV2Data;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867330yh1 extends C09AY implements Function0<SeekBarThumbnailExperimentV2Data> {
    public C1867330yh1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SeekBarThumbnailExperimentV2Data invoke() {
        try {
            return (SeekBarThumbnailExperimentV2Data) C0C64.LJIILLIIL().LJJII(SeekBarThumbnailExperimentV2Data.class, C1867340yh2.LIZ, "seekbar_show_thumbnail_when_drag_v2", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1867340yh2.LIZ;
        }
    }
}
