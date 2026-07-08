package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.0Kqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530130Kqh {
    public static final int LIZ(MediaModel mediaModel) {
        if (mediaModel == null) {
            return -1;
        }
        if (mediaModel.LJIIL() && mediaModel.onlineVideoUrl != null) {
            return 0;
        }
        if (mediaModel.LJFF() == null) {
            return -1;
        }
        return TEVideoUtils.isCanImport(mediaModel.LJFF());
    }
}
