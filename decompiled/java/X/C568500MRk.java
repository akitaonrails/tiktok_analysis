package X;

import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568500MRk {
    public static final Pair<PointF, PointF> LIZ = new Pair<>(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC568550MRp LIZ(View view) {
        if (view == 0 || !(view instanceof InterfaceC568550MRp)) {
            return null;
        }
        return (InterfaceC568550MRp) view;
    }

    public static final boolean LIZIZ(MediaModel mediaModel) {
        int i;
        if (mediaModel == null) {
            return false;
        }
        int i2 = mediaModel.width;
        int i3 = mediaModel.height;
        if (i2 < i3) {
            i = i3;
        } else {
            i = i2;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        if (i < 4096 && i2 < 2160) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(MediaModel mediaModel) {
        if (mediaModel != null && mediaModel.LJIILJJIL() && LIZIZ(mediaModel) && !C2495709qF.LIZ()) {
            return true;
        }
        return false;
    }
}
