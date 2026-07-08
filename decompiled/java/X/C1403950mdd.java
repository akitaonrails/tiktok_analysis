package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0mdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403950mdd {
    public static final long LIZ(EditPreviewInfo editPreviewInfo) {
        long duration = 0;
        if (editPreviewInfo == null) {
            return 0L;
        }
        Iterator<EditVideoSegment> it2 = editPreviewInfo.getVideoList().iterator();
        while (it2.hasNext()) {
            duration += it2.next().getVideoFileInfo().getDuration();
        }
        return duration;
    }

    public static final String LIZIZ(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("the ");
                sbLIZ.append(i);
                sbLIZ.append(" audio path => {");
                sbLIZ.append(editVideoSegment.getAudioPath());
                sbLIZ.append("} \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LIZJ(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("the ");
                sbLIZ.append(i);
                sbLIZ.append(" video path =>{");
                sbLIZ.append(editVideoSegment.getVideoPath());
                sbLIZ.append("} \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }
}
