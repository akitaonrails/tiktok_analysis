package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538660LAq {
    public static final List<EditVideoSegment> LIZ(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : videoList) {
            C533730KwV c533730KwV = C533730KwV.LIZ;
            String videoPath = editVideoSegment.getVideoPath();
            c533730KwV.getClass();
            if (!C533730KwV.LJIIJ(videoPath)) {
                arrayList.add(editVideoSegment);
            }
        }
        return arrayList;
    }
}
