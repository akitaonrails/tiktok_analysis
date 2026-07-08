package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import lth.o;

/* JADX INFO: renamed from: X.0nRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434660nRA implements InterfaceC1433360nP4<CreateBaseAwemeResponse> {
    public final C1433530nPL LL;
    public final AbstractC1433570nPP LLILLJJLI;

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
        this.LLILLJJLI.onStageUpdate("STAGE_SYNTHETIC", new C1433370nP5(new C1433390nP7(str)), null);
    }

    public C1434660nRA(C1433530nPL c1433530nPL, AbstractC1433570nPP abstractC1433570nPP) {
        this.LL = c1433530nPL;
        this.LLILLJJLI = abstractC1433570nPP;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    @Override // X.InterfaceC1433360nP4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1434650nR9 r12, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1434660nRA.LIZIZ(X.0nR9, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJFF(int i, C1434900nRY c1434900nRY) {
        this.LLILLJJLI.onProgress(i, c1434900nRY);
    }

    public static void LJI(String str, boolean z, PublishModel publishModel) {
        if (publishModel.LIZJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(z ? 1 : 0, "is_success");
            if (str == null) {
                str = "";
            }
            c0lab.LJ("creation_id", str);
            c0lab.LIZ(publishModel.isStoryPublish ? 1 : 0, "is_story");
            C20684815ws.LJIILLIIL("publish_retry_status", c0lab.LIZ);
        }
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        StoryGroupPublishModel storyGroupPublishModel;
        AVUploadSaveModel aVUploadSaveModel;
        String str;
        CreateAwemeResponse createAwemeResponse;
        Aweme aweme;
        Video video;
        if (this.LL.LIZ.videoType == 0) {
            BaseShortVideoContext baseShortVideoContext = this.LL.LIZ.editModel;
            if ((createBaseAwemeResponse instanceof CreateAwemeResponse) && (createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse) != null && (aweme = createAwemeResponse.aweme) != null && (video = aweme.getVideo()) != null) {
                video.setVideoLength(baseShortVideoContext.getVideoLength());
            }
            createBaseAwemeResponse.setVideoCoverPath((String) C13LP.LJJJLL(this.LL.LIZ.videoCoverPaths));
        }
        this.LLILLJJLI.onFinish(new C492390JSr(createBaseAwemeResponse), Boolean.valueOf(z), publishModel);
        BaseShortVideoContext baseShortVideoContext2 = this.LL.LIZ.editModel;
        if (createBaseAwemeResponse != null && (aVUploadSaveModel = createBaseAwemeResponse.mSaveModel) != null && aVUploadSaveModel.isSaveLocal()) {
            o.LJIJI.getClass();
            AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
            if (aVAwemeLambda$getAVConverter$0 != null) {
                str = aVAwemeLambda$getAVConverter$0.aid;
            } else {
                str = "";
            }
            String strLJIILL = C1428470nHB.LJIILL((VideoPublishEditModel) baseShortVideoContext2);
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(1004, "scene_id");
            c0lab.LJ("group_id", str);
            c0lab.LJ("content_type", strLJIILL);
            c0lab.LJ("download_type", "self");
            c0lab.LJ("download_method", "download_with_publish");
            C20684815ws.LJIILLIIL("download_publish_finish", c0lab.LIZ);
        }
        LJI(this.LL.LIZ.editModel.getCreationId(), true, this.LL.LIZ);
        if (this.LL.LIZ.storyGroupPublishModel == null || ((storyGroupPublishModel = this.LL.LIZ.storyGroupPublishModel) != null && storyGroupPublishModel.childIndex == 0)) {
            o.LJIILLIIL.onBackToOpenPlatform(this.LL.LIZ.editModel);
        }
    }
}
