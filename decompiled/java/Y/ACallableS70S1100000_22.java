package Y;

import X.AbstractC1452680nuE;
import X.C1407050mid;
import X.C1450140nq8;
import X.C1C7U;
import X.C560870LzB;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS70S1100000_22 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS70S1100000_22 aCallableS70S1100000_22) {
        C1C7U.LIZ("AudioMetricsHelper@eff5.getAndReportAudioMetricsResultNLE$1$1");
        C1407050mid c1407050mid = C1407050mid.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS70S1100000_22.l1;
        String str = aCallableS70S1100000_22.s0;
        c1407050mid.getClass();
        C1407050mid.LJ(2, jCurrentTimeMillis, videoPublishEditModel, str);
        C560870LzB.LIZ("zxz", "index = 2, INDEX_ORIGIN_VOICEOVER");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioMetricsHelper@eff5.getAndReportAudioMetricsResultNLE$1$1");
        return unit;
    }

    public static final Object call$1(ACallableS70S1100000_22 aCallableS70S1100000_22) {
        C1C7U.LIZ("AudioMetricsHelper@eff5.getAndReportAudioMetricsResultNLE$1$2$1");
        C1407050mid c1407050mid = C1407050mid.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS70S1100000_22.l1;
        String str = aCallableS70S1100000_22.s0;
        c1407050mid.getClass();
        C1407050mid.LJ(1, jCurrentTimeMillis, videoPublishEditModel, str);
        C560870LzB.LIZ("zxz", "index = 1, INDEX_ORIGIN_VIDEO");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioMetricsHelper@eff5.getAndReportAudioMetricsResultNLE$1$2$1");
        return unit;
    }

    public static final Object call$2(ACallableS70S1100000_22 aCallableS70S1100000_22) {
        C1450140nq8 c1450140nq8 = ((AbstractC1452680nuE) aCallableS70S1100000_22.l1).LJIIL;
        return VEEditor.LJIILJJIL(new String[]{aCallableS70S1100000_22.s0}, new int[]{c1450140nq8.LIZ}, new int[]{c1450140nq8.LIZIZ});
    }

    public ACallableS70S1100000_22(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
