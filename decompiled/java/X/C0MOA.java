package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0MOA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOA {
    public static final float LIZIZ(int i, int i2) {
        float f = i / i2;
        double d = f;
        if (d <= 0.75d && d > 0.5625d) {
            return (f * 16.0f) / 9.0f;
        }
        if (d < 0.5625d) {
            return 9.0f / (f * 16.0f);
        }
        return 1.0f;
    }

    public static final CanvasVideoData LIZJ(C0MOZ c0moz, List<String> list) {
        CanvasBackground canvasBackgroundLIZIZ;
        List listLJIILJJIL;
        if (c0moz.LIZIZ.getFirst().intValue() == c0moz.LIZIZ.getSecond().intValue()) {
            C567420MNg c567420MNg = CanvasBackground.Companion;
            int iIntValue = c0moz.LIZIZ.getFirst().intValue();
            c567420MNg.getClass();
            canvasBackgroundLIZIZ = C567420MNg.LIZ(iIntValue);
        } else {
            canvasBackgroundLIZIZ = C567420MNg.LIZIZ(CanvasBackground.Companion, c0moz.LIZIZ.getFirst().intValue(), c0moz.LIZIZ.getSecond().intValue());
        }
        if (list != null && !list.isEmpty()) {
            listLJIILJJIL = new ArrayList(list);
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(c0moz.LIZ);
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(C1697810uHb.LJIILJJIL(c0moz.LIZ), listLJIILJJIL, canvasBackgroundLIZIZ, null, null, 0, null, 0, null, null, null, null, 4088, null);
        CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
        canvasFilterParam.setScaleFactor(c0moz.LIZLLL);
        canvasFilterParam.setClipIndex(0);
        canvasVideoData.putTransform(canvasFilterParam);
        canvasVideoData.setExtra(new CanvasExtra(0, 0, 0, 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(false, false, false, false, false, 2, false, false, false), null, 1.0f, 0L, 0));
        return canvasVideoData;
    }

    public static CanvasVideoData LIZLLL(C0MOZ c0moz, List list) {
        CanvasBackground canvasBackground;
        List listLJIILJJIL;
        if (c0moz.LIZIZ.getFirst().intValue() == c0moz.LIZIZ.getSecond().intValue()) {
            C567420MNg c567420MNg = CanvasBackground.Companion;
            int iIntValue = c0moz.LIZIZ.getFirst().intValue();
            c567420MNg.getClass();
            canvasBackground = C567420MNg.LIZ(iIntValue);
        } else {
            C567420MNg c567420MNg2 = CanvasBackground.Companion;
            int iIntValue2 = c0moz.LIZIZ.getFirst().intValue();
            int iIntValue3 = c0moz.LIZIZ.getSecond().intValue();
            int i = c0moz.LIZJ;
            c567420MNg2.getClass();
            canvasBackground = new CanvasBackground(2);
            canvasBackground.setStartColor(iIntValue2);
            canvasBackground.setEndColor(iIntValue3);
            canvasBackground.setPrimaryColor(i);
        }
        if (list != null && !list.isEmpty()) {
            listLJIILJJIL = new ArrayList(list);
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(c0moz.LIZ);
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(C1697810uHb.LJIILJJIL(c0moz.LIZ), listLJIILJJIL, canvasBackground, null, null, 0, null, 0, null, null, null, null, 4088, null);
        if (c0moz.LIZLLL != 1.0f) {
            CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
            canvasFilterParam.setScaleFactor(c0moz.LIZLLL);
            canvasFilterParam.setClipIndex(0);
            canvasVideoData.putTransform(canvasFilterParam);
        }
        return canvasVideoData;
    }

    public static final float LIZ(int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        PointF pointF = new PointF(i, i2);
        PointF pointF2 = new PointF(i3, i4);
        if (z) {
            f = pointF2.y / pointF2.x;
            f2 = pointF.y / pointF.x;
            if (f <= f2) {
                return 1.0f;
            }
        } else {
            f = pointF2.y / pointF2.x;
            f2 = pointF.y / pointF.x;
            if (f <= f2) {
                return 1.0f;
            }
        }
        return f / f2;
    }
}
