package X;

import com.ss.android.ugc.aweme.service.PublishResourceFirstPolicyServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QG extends C09AY implements Function0<C09QH> {
    public final /* synthetic */ PublishResourceFirstPolicyServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QG(PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl) {
        super(0);
        this.LL = publishResourceFirstPolicyServiceImpl;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.09QH] */
    @Override // kotlin.jvm.functions.Function0
    public final C09QH invoke() {
        final PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl = this.LL;
        return new SocialPublishCallback() { // from class: X.09QH
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
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
            public final void onPublishStart(PublishModel publishModel) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI(publishResourceFirstPolicyServiceImpl.LIZ, "on publish start, open yield policy");
                publishResourceFirstPolicyServiceImpl.LIZLLL.LIZJ(true);
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI(publishResourceFirstPolicyServiceImpl.LIZ, "on publish success, close yield policy");
                publishResourceFirstPolicyServiceImpl.LIZLLL.LIZJ(false);
                publishResourceFirstPolicyServiceImpl.LJ();
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI(publishResourceFirstPolicyServiceImpl.LIZ, "on publish failed, close yield policy");
                publishResourceFirstPolicyServiceImpl.LIZLLL.LIZJ(false);
                publishResourceFirstPolicyServiceImpl.LJ();
            }
        };
    }
}
