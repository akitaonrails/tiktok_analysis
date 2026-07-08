package X;

import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.utils.GsonProvider;

/* JADX INFO: renamed from: X.0JHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHJ implements InterfaceC489200JGk {
    public SMBCourseVideo LIZ;
    public Aweme LIZIZ;

    @Override // X.InterfaceC489200JGk
    public final String LIZJ() {
        return "";
    }

    @Override // X.InterfaceC489200JGk
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC489200JGk
    public final void LJIILL(C0JH1 c0jh1) {
    }

    @Override // X.InterfaceC489200JGk
    public final String LIZIZ() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        return String.valueOf(sMBCourseVideo != null ? Long.valueOf(sMBCourseVideo.itemId) : null);
    }

    @Override // X.InterfaceC489200JGk
    public final int LIZLLL() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.overallReviewLabel;
        }
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final void LJFF() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            sMBCourseVideo.overallReviewLabel = 2;
        }
    }

    @Override // X.InterfaceC489200JGk
    public final int LJI() {
        ContentAuditStatus contentAuditStatus;
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo == null || (contentAuditStatus = sMBCourseVideo.cover) == null) {
            return 0;
        }
        return contentAuditStatus.auditStatus;
    }

    @Override // X.InterfaceC489200JGk
    public final C0JH1 LJIIIIZZ() {
        Integer numValueOf;
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null && (numValueOf = Integer.valueOf(sMBCourseVideo.publishStatus)) != null) {
            if (numValueOf.intValue() == 1) {
                return C0JH1.UPLOAD_SUCCESS_PUBLISHED_TO_COURSE;
            }
            if (numValueOf.intValue() == 2) {
                return C0JH1.UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE;
            }
        }
        return C0JH1.UNKNOWN;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIIZ() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.needConfirmAudio;
        }
        return false;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIJ() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        return (sMBCourseVideo == null || sMBCourseVideo.isVisibleToViewers) ? false : true;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIIL() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.audioReviewResult;
        }
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final String LJIILIIL() {
        ContentAuditStatus contentAuditStatus;
        String str;
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        return (sMBCourseVideo == null || (contentAuditStatus = sMBCourseVideo.title) == null || (str = contentAuditStatus.content) == null) ? "" : str;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIILJJIL() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.audioReviewStatus;
        }
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final void LJIILLIIL() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            sMBCourseVideo.isEdited = true;
        }
    }

    @Override // X.InterfaceC489200JGk
    public final long LJIIZILJ() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.videoDuration;
        }
        return 0L;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIJ() {
        ContentAuditStatus contentAuditStatus;
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo == null || (contentAuditStatus = sMBCourseVideo.title) == null) {
            return 0;
        }
        return contentAuditStatus.auditStatus;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIJI() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.videoReviewStatus;
        }
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final C0JH6 LJIJJ() {
        ContentAuditStatus contentAuditStatus;
        String str = null;
        C0JH6 c0jh6 = new C0JH6(null, 3);
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null && (contentAuditStatus = sMBCourseVideo.cover) != null) {
            str = contentAuditStatus.content;
        }
        c0jh6.LIZIZ = str;
        return c0jh6;
    }

    @Override // X.InterfaceC489200JGk
    public final Aweme LJIJJLI() {
        Video video;
        String aid;
        Gson gson;
        if (this.LIZIZ == null) {
            GsonProvider gsonProvider = (GsonProvider) PluggableExtentionKt.pluggableSpi$default(GsonProvider.class, false, false, false, 14, null);
            Aweme aweme = null;
            aweme = null;
            if (gsonProvider != null && (gson = gsonProvider.getGson()) != null) {
                SMBCourseVideo sMBCourseVideo = this.LIZ;
                aweme = (Aweme) GsonProtectorUtils.fromJson(gson, sMBCourseVideo != null ? sMBCourseVideo.awemeStructStr : null, Aweme.class);
            }
            this.LIZIZ = aweme;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                Aweme aweme2 = this.LIZIZ;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                video.setSourceId(aid);
            }
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIL() {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        return sMBCourseVideo != null && sMBCourseVideo.isEdited;
    }

    @Override // X.InterfaceC489200JGk
    public final int LIZ() {
        return C489210JGl.LIZ(this);
    }

    @Override // X.InterfaceC489200JGk
    public final boolean isMute() {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        Aweme awemeLJIJJLI = LJIJJLI();
        return (awemeLJIJJLI == null || (statusSafety = AwemeExtKt.getStatusSafety(awemeLJIJJLI)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) ? false : true;
    }

    public C0JHJ(SMBCourseVideo sMBCourseVideo) {
        this.LIZ = sMBCourseVideo;
    }

    @Override // X.InterfaceC489200JGk
    public final long LJ(boolean z) {
        SMBCourseVideo sMBCourseVideo = this.LIZ;
        if (sMBCourseVideo != null) {
            return sMBCourseVideo.videoId;
        }
        return 0L;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIJJI(InterfaceC489200JGk interfaceC489200JGk) {
        return C489210JGl.LIZIZ(this, interfaceC489200JGk);
    }
}
