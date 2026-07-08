package X;

import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;

/* JADX INFO: renamed from: X.0MbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571520MbG {
    public static final int LIZ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        CanvasExtra canvasExtra2;
        CanvasExtra canvasExtra3;
        if (C1444940nhk.LJII(canvasVideoData)) {
            if (canvasVideoData != null && (canvasExtra2 = canvasVideoData.extra) != null && canvasExtra2.duration > 0) {
                if (canvasVideoData == null || (canvasExtra3 = canvasVideoData.extra) == null) {
                    return 0;
                }
                return canvasExtra3.duration;
            }
            return C571540MbI.LIZ.defaultDuration;
        }
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null) {
            return canvasExtra.duration;
        }
        return -1;
    }
}
