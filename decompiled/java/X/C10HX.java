package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10HX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HX {
    public static final C10HX LIZ = new C10HX();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AFwS271S0000000_28 LIZJ = AFwS271S0000000_28.get$arr$(328);
    public static final C10HY LIZLLL = new SocialPublishCallback() { // from class: X.10HY
        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishStart(PublishModel publishModel) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onReadyToCreateAweme(PublishModel publishModel) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onReportPublish() {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onSynthesisSuccess(PublishModel publishModel, String str) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
            VideoPublishEditModel videoPublishEditModel;
            List<String> list;
            BaseShortVideoContext baseShortVideoContext = null;
            if (publishModel != null) {
                try {
                    baseShortVideoContext = publishModel.editModel;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("publish-success → history update failed: ");
                    sbLIZ.append(th.getMessage());
                    C201955140j.LJFF("GeoFencingHistoryReg", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
            }
            if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (list = videoPublishEditModel.geofencingSetting) != null && !list.isEmpty()) {
                AnonymousClass0105.LIZ(list);
            }
        }
    };
}
