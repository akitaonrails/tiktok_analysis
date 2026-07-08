package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554830LpR {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String[] LJFF;
    public final String[] LJI;

    public final EditPreviewInfo LIZ(MultiEditVideoRecordData multiEditVideoRecordData) {
        C538310L9h c538310L9h = new C538310L9h(this.LIZ, this.LIZJ, this.LIZLLL, this.LIZIZ, "");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList.add(multiEditVideoSegmentRecordData);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : arrayList) {
            EditVideoSegment editVideoSegment = new EditVideoSegment(multiEditVideoSegmentRecordData2.videoPath, multiEditVideoSegmentRecordData2.audioPath, new VideoFileInfo(multiEditVideoSegmentRecordData2.width, multiEditVideoSegmentRecordData2.height, multiEditVideoSegmentRecordData2.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT), -100, 0, 0, 0, 0, 0.0f, 496, null));
            if (this.LJ) {
                editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData2.getStartTime(), multiEditVideoSegmentRecordData2.getEndTime(), multiEditVideoSegmentRecordData2.getVideoSpeed(), multiEditVideoSegmentRecordData2.rotate));
            }
            editVideoSegment.setAigcInfo(multiEditVideoSegmentRecordData2.aigcInfo);
            arrayList2.add(editVideoSegment);
        }
        EditPreviewInfo editPreviewInfoLIZ = c538310L9h.LIZ(new ArrayList(arrayList2));
        editPreviewInfoLIZ.setPreviewVideoLength((int) multiEditVideoRecordData.endTime);
        editPreviewInfoLIZ.setReverseAudioArray(this.LJFF);
        editPreviewInfoLIZ.setReverseVideoArray(this.LJI);
        return editPreviewInfoLIZ;
    }

    public C554830LpR(int i, int i2, boolean z, String[] strArr, String[] strArr2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        z = (i3 & 16) != 0 ? false : z;
        strArr = (i3 & 32) != 0 ? null : strArr;
        strArr2 = (i3 & 64) != 0 ? null : strArr2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = z;
        this.LJFF = strArr;
        this.LJI = strArr2;
    }
}
