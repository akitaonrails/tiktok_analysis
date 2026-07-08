package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441450nc7 {
    public static final C1441450nc7 LIZ = new C1441450nc7();
    public static C1429690nJ9 LIZIZ;

    public static final void LIZ(C1441490ncB c1441490ncB) {
        int i;
        Integer num = c1441490ncB.LJFF;
        if (num != null && num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        C1637890six.LJ("av_audio_audit", i, c1441490ncB.LIZ());
        if (c1441490ncB.LJI == 0) {
            C805360ViY.LIZ(C1441440nc6.LIZ(c1441490ncB), C0VY4.LIZ(new Throwable("AudioAuditError")), "AudioAudit", "creative_tools_audit_error");
        }
    }

    public static final void LIZJ(C1441490ncB c1441490ncB) {
        int i;
        Integer num = c1441490ncB.LJFF;
        if (num != null && num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        C1637890six.LJ("av_video_audit", i, c1441490ncB.LIZ());
        if (c1441490ncB.LJI == 0) {
            C805360ViY.LIZ(C1441440nc6.LIZ(c1441490ncB), C0VY4.LIZ(new Throwable("VideoAuditError")), "VideoAudit", "creative_tools_audit_error");
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, CreateBaseAwemeResponse createBaseAwemeResponse, Integer num, String str) {
        String str2;
        int i;
        boolean z;
        Boolean bool = Boolean.FALSE;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVConverter().getClass();
        AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
        C1441490ncB c1441490ncB = new C1441490ncB();
        if (aVAwemeLambda$getAVConverter$0 != null) {
            str2 = aVAwemeLambda$getAVConverter$0.aid;
        } else {
            str2 = null;
        }
        c1441490ncB.LIZ = str2;
        c1441490ncB.LIZIZ = C1446400nk6.LIZ(videoPublishEditModel).LIZ;
        String cameraIds = videoPublishEditModel.getCameraIds();
        int i2 = 0;
        if (cameraIds != null && cameraIds.length() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        c1441490ncB.LIZJ = i;
        c1441490ncB.LIZLLL = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
        if (videoPublishEditModel.getRestoreType() == 2) {
            z = true;
        } else {
            z = false;
        }
        c1441490ncB.LJ = Boolean.valueOf(z);
        c1441490ncB.LJFF = num;
        if (num == null || num.intValue() == 0) {
            i2 = 1;
        }
        c1441490ncB.LJI = i2;
        c1441490ncB.LJII = bool;
        c1441490ncB.LJIIIZ = str;
        LIZ(c1441490ncB);
    }

    public static final void LIZLLL(CreateBaseAwemeResponse createBaseAwemeResponse, VideoPublishEditModel videoPublishEditModel, Boolean bool, Integer num, String str) {
        String str2;
        int i;
        boolean z;
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVConverter().getClass();
        AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
        C1441490ncB c1441490ncB = new C1441490ncB();
        if (aVAwemeLambda$getAVConverter$0 != null) {
            str2 = aVAwemeLambda$getAVConverter$0.aid;
        } else {
            str2 = null;
        }
        c1441490ncB.LIZ = str2;
        c1441490ncB.LIZIZ = C1441640ncQ.LIZ(videoPublishEditModel).LIZ;
        String cameraIds = videoPublishEditModel.getCameraIds();
        int i2 = 0;
        if (cameraIds != null && cameraIds.length() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        c1441490ncB.LIZJ = i;
        c1441490ncB.LIZLLL = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
        if (videoPublishEditModel.getRestoreType() == 2) {
            z = true;
        } else {
            z = false;
        }
        c1441490ncB.LJ = Boolean.valueOf(z);
        c1441490ncB.LJFF = num;
        if (num == null || num.intValue() == 0) {
            i2 = 1;
        }
        c1441490ncB.LJI = i2;
        c1441490ncB.LJII = bool;
        c1441490ncB.LJIIIZ = str;
        LIZJ(c1441490ncB);
    }
}
