package X;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.utils.oh;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.List;

/* JADX INFO: renamed from: X.0Mp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580090Mp5 extends C0L18 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.AbstractC579520MoA r15) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580090Mp5.LIZ(X.0MoA):void");
    }

    public final Intent LIZIZ(C580100Mp6 c580100Mp6, ShortVideoContext shortVideoContext) {
        String firstFrameWithEffect;
        List<MultiEditVideoSegmentRecordData> list;
        AVMusicWaveBean aVMusicWaveBean = c580100Mp6.LJ;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = c580100Mp6.LJFF;
        long j = c580100Mp6.LIZIZ;
        int i = c580100Mp6.LIZLLL;
        String str = c580100Mp6.LJI;
        String str2 = c580100Mp6.LJII;
        C580120Mp8 c580120Mp8 = c580100Mp6.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordPageAction video path = ");
        sbLIZ.append(str);
        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Intent intentLIZJ = LIZJ(shortVideoContext, c580120Mp8, i);
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intentLIZJ);
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (multiEditVideoRecordData != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                C0MUK.LIZIZ(intentLIZJ).albumModel.videoCount = list.size();
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (multiEditVideoRecordData2 != null) {
                long j2 = multiEditVideoRecordData2.endTime;
                oh.LIZ.getClass();
                oh.LIZIZ = (int) j2;
            }
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        c543670LTx.LIZ.put("type", "record");
        c543670LTx.LIZ.put("abParam", Boolean.TRUE);
        C1637890six.LIZIZ("type_av_record_concat_time", c543670LTx.LJ());
        if (aVMusicWaveBean != null) {
            intentLIZJ.putExtra("music_wave_data", aVMusicWaveBean);
        }
        if (multiEditVideoStatusRecordData != null) {
            C1441190nbh c1441190nbhLIZJ = shortVideoContext.LIZJ();
            if (shortVideoContext.cameraComponentModel.isRetakeMode) {
                multiEditVideoStatusRecordData.editSegments = c1441190nbhLIZJ;
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
            } else {
                multiEditVideoStatusRecordData.originalSegments = c1441190nbhLIZJ;
                multiEditVideoStatusRecordData.isMultiEditRetake = false;
                multiEditVideoStatusRecordData.recordMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                multiEditVideoStatusRecordData.originalMusicStart = shortVideoContext.cameraComponentModel.mMusicStart;
            }
            C0MUK.LIZIZ(intentLIZJ).editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        }
        if (!TextUtils.isEmpty(shortVideoContext.mShareId)) {
            intentLIZJ.putExtra("share_id", shortVideoContext.mShareId);
        }
        if (!TextUtils.isEmpty(shortVideoContext.clientId)) {
            intentLIZJ.putExtra("channel", shortVideoContext.clientId);
        }
        creativeModelLIZIZ.editModel.editPreviewInfo = p1.LIZJ(shortVideoContext, multiEditVideoStatusRecordData, str, str2);
        ExtractFramesModel extractFramesModel = shortVideoContext.cameraComponentModel.extractFramesModel;
        if (extractFramesModel != null && (firstFrameWithEffect = extractFramesModel.getFirstFrameWithEffect()) != null) {
            creativeModelLIZIZ.editModel.singleImageCoverBitmapData = new SingleImageCoverBitmapData("", 1, 0L, 0, 0, 0, firstFrameWithEffect, false);
        }
        intentLIZJ.putExtra("extra_need_add_recent", shortVideoContext.creativeModel.musicBuzModel.needAddRecent);
        C1402840mbq c1402840mbq = shortVideoContext.shareContext;
        if (c1402840mbq != null && this != null) {
            intentLIZJ.putExtra("extra_share_context", c1402840mbq);
        }
        return intentLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r22, X.C580120Mp8 r23, int r24) {
        /*
            Method dump skipped, instruction units count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580090Mp5.LIZJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.0Mp8, int):android.content.Intent");
    }
}
