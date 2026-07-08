package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.vesdk.VESize;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSQ {
    public static PointF LIZ(VESize vESize, PointF pointF) {
        if (vESize == null) {
            vESize = new VESize(ScreenUtils.getScreenWidth(C786410Ut5.M3(C0CHQ.LIZ)), ScreenUtils.getScreenHeight(C786410Ut5.M3(C0CHQ.LIZ)));
        }
        return new PointF(AbstractC568770MSl.LIZ(pointF.x / vESize.width), AbstractC568770MSl.LIZ(pointF.y / vESize.height));
    }

    public static Pair LIZIZ(VESize vESize, RectF rectF) {
        return new Pair(LIZ(vESize, new PointF(rectF.centerX(), rectF.centerY())), LIZ(vESize, new PointF(rectF.width(), rectF.height())));
    }
}
