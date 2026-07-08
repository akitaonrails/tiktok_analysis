package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404080mdq {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        c0lab.LIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.compileBeginScene, "compose_begin_period");
        c0lab.LIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.compileEndScene, "compose_end_period");
        c0lab.LIZIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.compileBeginDuration, "compose_begin_time_gap");
        c0lab.LIZIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.compileEndDuration, "compose_end_time_gap");
        c0lab.LIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.uploadBeginScene, "upload_begin_period");
        c0lab.LIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.uploadEndScene, "upload_end_period");
        c0lab.LIZIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.uploadBeginDuration, "upload_begin_time_gap");
        c0lab.LIZIZ(videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.uploadEndDuration, "upload_end_time_gap");
    }
}
