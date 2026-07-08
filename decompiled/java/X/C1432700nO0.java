package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;

/* JADX INFO: renamed from: X.0nO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432700nO0 {
    public static final C1432730nO3 LIZ(EditVideoSegment editVideoSegment) {
        VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
        if (videoCutInfo != null) {
            return new C1432730nO3(editVideoSegment.getVideoPath(), videoCutInfo.getStart(), videoCutInfo.getEnd() - videoCutInfo.getStart());
        }
        return new C1432730nO3(editVideoSegment.getVideoPath(), 0L, editVideoSegment.getVideoFileInfo().getDuration());
    }
}
