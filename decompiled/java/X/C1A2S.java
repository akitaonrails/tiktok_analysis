package X;

import com.ss.android.ugc.feed.platform.cell.component.progress.VideoPlayProgressCellComponent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A2S, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A2S extends C09AY implements Function2<VideoPlayProgressCellComponent, C291001Au<? extends Long>, Unit> {
    public C1A2S() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoPlayProgressCellComponent videoPlayProgressCellComponent, C291001Au<? extends Long> c291001Au) {
        VideoPlayProgressCellComponent videoPlayProgressCellComponent2 = videoPlayProgressCellComponent;
        C291001Au<? extends Long> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            C1A2T c1a2t = videoPlayProgressCellComponent2.LLJJJJLIIL;
            long jLongValue = ((Number) c291001Au2.LIZ).longValue();
            for (Map.Entry<Long, List<C1A2U>> entry : c1a2t.LIZ.entrySet()) {
                long jLongValue2 = entry.getKey().longValue();
                List<C1A2U> value = entry.getValue();
                if (c1a2t.LIZIZ + 1 <= jLongValue2 && jLongValue2 <= jLongValue && jLongValue < 350 + jLongValue2) {
                    for (C1A2U c1a2u : value) {
                        if (c1a2u.LIZIZ) {
                            c1a2u.LIZ.LIZ(jLongValue);
                        }
                    }
                }
                if (jLongValue >= jLongValue2) {
                    for (C1A2U c1a2u2 : value) {
                        if (!c1a2u2.LIZIZ) {
                            c1a2u2.LIZ.LIZ(jLongValue);
                        }
                    }
                }
            }
            c1a2t.LIZIZ = jLongValue;
        }
        return Unit.LIZ;
    }
}
