package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0nJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429700nJA {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(videoPublishEditModel.getVideoSegmentsDesc());
        if (arrayListLJIIIIZZ.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = arrayListLJIIIIZZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().isUploadTypeSticker()) {
                return true;
            }
        }
        return false;
    }
}
