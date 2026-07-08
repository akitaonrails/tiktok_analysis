package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* JADX INFO: renamed from: X.0mem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404660mem {
    public static final int[] LIZ(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null && videoList.size() > 0) {
            return C1404710mer.LIZIZ(((EditVideoSegment) ListProtector.get(videoList, 0)).getVideoPath());
        }
        return null;
    }
}
