package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.0LBU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LBU {
    public final MediaModel LIZ;
    public final Rect LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaLayoutInfo(media=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutViewSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LBU(MediaModel mediaModel, Rect rect) {
        this.LIZ = mediaModel;
        this.LIZIZ = rect;
    }
}
