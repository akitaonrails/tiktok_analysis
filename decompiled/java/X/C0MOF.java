package X;

import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import java.util.List;

/* JADX INFO: renamed from: X.0MOF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOF {
    public static final boolean LIZ(CanvasVideoData canvasVideoData) {
        List<CanvasFilterParam> transformList;
        if (canvasVideoData == null || (transformList = canvasVideoData.getTransformList()) == null || transformList.isEmpty()) {
            return false;
        }
        for (CanvasFilterParam canvasFilterParam : transformList) {
            if (canvasFilterParam.getTransX() != 0.0f || canvasFilterParam.getTransY() != 0.0f || canvasFilterParam.getDegree() != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
