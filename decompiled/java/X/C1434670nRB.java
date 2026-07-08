package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0nRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434670nRB implements InterfaceC1433360nP4<CreateBaseAwemeResponse> {
    public final PublishModel LL;
    public final AbstractC1433570nPP LLILLJJLI;

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
    }

    public C1434670nRB(PublishModel publishModel, AbstractC1433570nPP abstractC1433570nPP) {
        this.LL = publishModel;
        this.LLILLJJLI = abstractC1433570nPP;
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
        String str;
        AbstractC1433570nPP abstractC1433570nPP = this.LLILLJJLI;
        String str2 = "";
        if (!(c1434650nR9 instanceof C1430810nKx)) {
            str = "";
        } else {
            str = "100104";
        }
        String stage = c1434650nR9.getStage();
        if (stage != null) {
            str2 = stage;
        }
        abstractC1433570nPP.onFinish(new C1433450nPD(new C1433270nOv(str, str2, c1434650nR9.isUserNetworkBad(), c1434650nR9.getCause(), Boolean.valueOf(c1434650nR9.isRecover()), c1434650nR9.getErrorCode())), null, publishModel);
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJFF(int i, C1434900nRY c1434900nRY) {
        this.LLILLJJLI.onProgress(i, c1434900nRY);
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        CreateAwemeResponse createAwemeResponse;
        Aweme aweme;
        Video video;
        PublishModel publishModel2 = this.LL;
        if (publishModel2.videoType == 0) {
            BaseShortVideoContext baseShortVideoContext = publishModel2.editModel;
            if ((createBaseAwemeResponse instanceof CreateAwemeResponse) && (createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse) != null && (aweme = createAwemeResponse.aweme) != null && (video = aweme.getVideo()) != null) {
                video.setVideoLength(baseShortVideoContext.getVideoLength());
            }
            createBaseAwemeResponse.setVideoCoverPath((String) C13LP.LJJJLL(this.LL.videoCoverPaths));
        }
        this.LLILLJJLI.onFinish(new C492390JSr(createBaseAwemeResponse), Boolean.valueOf(z), publishModel);
    }
}
