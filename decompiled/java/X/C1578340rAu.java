package X;

import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;

/* JADX INFO: renamed from: X.0rAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578340rAu {
    public static SeriesCenterSceneEnum LIZ(int i) {
        for (SeriesCenterSceneEnum seriesCenterSceneEnum : SeriesCenterSceneEnum.values()) {
            if (seriesCenterSceneEnum.getValue() == i) {
                return seriesCenterSceneEnum;
            }
        }
        return SeriesCenterSceneEnum.NONE;
    }
}
