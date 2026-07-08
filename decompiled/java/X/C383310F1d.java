package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383310F1d implements Serializable {
    public static final int $stable = 8;
    public AudioRecorderParam LL;
    public MultiEditVideoRecordData LLILLJJLI;
    public float LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLIZ;
    public int LLJ;
    public int LLJI;
    public float LLJIJIL;
    public String LLILZLL = "";
    public String LLIZLLLIL = "";

    public final AudioRecorderParam getAudioRecordParam() {
        return this.LL;
    }

    public final MultiEditVideoRecordData getEditRecordData() {
        return this.LLILLJJLI;
    }

    public final boolean getHasAudioChangeInEditorPro() {
        return this.LLIZ;
    }

    public final String getLastNle() {
        return this.LLILZLL;
    }

    public final int getMusicEndTime() {
        return this.LLJI;
    }

    public final String getMusicId() {
        return this.LLIZLLLIL;
    }

    public final int getMusicStartTime() {
        return this.LLJ;
    }

    public final float getMusicVolume() {
        return this.LLJIJIL;
    }

    public final long getRecordEndTime() {
        return this.LLILZIL;
    }

    public final long getRecordStartTime() {
        return this.LLILZ;
    }

    public final float getVoiceVolume() {
        return this.LLILLL;
    }

    public final void getData(VideoPublishEditModel videoPublishEditModel) {
        long j;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        MultiEditVideoRecordData multiEditVideoRecordDataCloneSegmentDataList = null;
        if (videoPublishEditModel.getVeAudioRecorderParam() == null) {
            this.LL = null;
        } else {
            if (this.LL == null) {
                this.LL = new AudioRecorderParam();
            }
            this.LL.copyFrom(videoPublishEditModel.getVeAudioRecorderParam());
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData4 != null && (multiEditVideoRecordData3 = multiEditVideoRecordData4.curMultiEditVideoRecordData) != null) {
            multiEditVideoRecordDataCloneSegmentDataList = multiEditVideoRecordData3.cloneSegmentDataList();
        }
        this.LLILLJJLI = multiEditVideoRecordDataCloneSegmentDataList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel.getMultiEditVideoRecordData();
        long j2 = 0;
        if (multiEditVideoRecordData5 != null && (multiEditVideoRecordData2 = multiEditVideoRecordData5.curMultiEditVideoRecordData) != null) {
            j = multiEditVideoRecordData2.startTime;
        } else {
            j = 0;
        }
        this.LLILZ = j;
        MultiEditVideoStatusRecordData multiEditVideoRecordData6 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData6 != null && (multiEditVideoRecordData = multiEditVideoRecordData6.curMultiEditVideoRecordData) != null) {
            j2 = multiEditVideoRecordData.endTime;
        }
        this.LLILZIL = j2;
        this.LLILLL = videoPublishEditModel.getVoiceVolume();
        String nleData = videoPublishEditModel.getNleData();
        String str = "";
        if (nleData == null) {
            nleData = "";
        }
        this.LLILZLL = nleData;
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId != null) {
            str = musicId;
        }
        this.LLIZLLLIL = str;
        this.LLJ = videoPublishEditModel.getMMusicStart();
        this.LLJI = videoPublishEditModel.getMMusicEnd();
        this.LLJIJIL = videoPublishEditModel.getMusicVolume();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasChanged(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C383310F1d.hasChanged(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public final boolean hasMusicChange(VideoPublishEditModel videoPublishEditModel) {
        String str = this.LLIZLLLIL;
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        if (!Intrinsics.LJFF(str, musicId) || this.LLJ != videoPublishEditModel.getMMusicStart() || this.LLJI != videoPublishEditModel.getMMusicEnd() || this.LLJIJIL != videoPublishEditModel.getMusicVolume()) {
            return true;
        }
        return false;
    }

    public final void setAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.LL = audioRecorderParam;
    }

    public final void setEditRecordData(MultiEditVideoRecordData multiEditVideoRecordData) {
        this.LLILLJJLI = multiEditVideoRecordData;
    }

    public final void setHasAudioChangeInEditorPro(boolean z) {
        this.LLIZ = z;
    }

    public final void setLastNle(String str) {
        this.LLILZLL = str;
    }

    public final void setMusicEndTime(int i) {
        this.LLJI = i;
    }

    public final void setMusicId(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setMusicStartTime(int i) {
        this.LLJ = i;
    }

    public final void setMusicVolume(float f) {
        this.LLJIJIL = f;
    }

    public final void setRecordEndTime(long j) {
        this.LLILZIL = j;
    }

    public final void setRecordStartTime(long j) {
        this.LLILZ = j;
    }

    public final void setVoiceVolume(float f) {
        this.LLILLL = f;
    }
}
