package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0l6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345020l6a {
    public static C1354540lLw LIZIZ;
    public static boolean LIZLLL;
    public static final C1345020l6a LIZ = new C1345020l6a();
    public static final ISocialPublishBridgeService LIZJ = (ISocialPublishBridgeService) ServiceManager.get().getService(ISocialPublishBridgeService.class);

    public static void LIZ() {
        if (LIZLLL) {
            return;
        }
        LIZJ.Kg(new SocialPublishCallback() { // from class: X.0l6d
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
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
                String str;
                VideoPublishEditModel videoPublishEditModel;
                CreativeModel creativeModel;
                Text2ImageModel text2ImageModel;
                String str2 = null;
                if (publishModel != null) {
                    str2 = publishModel.creationId;
                }
                if (C123100dR.LIZ(str2)) {
                    C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
                    String str3 = publishModel.creationId;
                    c1354600lM2.getClass();
                    if (C1354600lM2.LIZIZ(str3) == null) {
                        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
                        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (text2ImageModel = creativeModel.text2ImageModel) == null || (str = text2ImageModel.fromCommentId) == null) {
                            str = "";
                        }
                        if (str.length() != 0 && !publishModel.isStoryPublish) {
                            String str4 = publishModel.creationId;
                            Comment comment = new Comment();
                            comment.setCid(str);
                            C1354600lM2.LIZIZ.put(str4, comment);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
                String str;
                PublishModel publishModel;
                C1345020l6a c1345020l6a = C1345020l6a.LIZ;
                if (c1434900nRY != null && (publishModel = c1434900nRY.LIZJ) != null) {
                    str = publishModel.creationId;
                } else {
                    str = null;
                }
                c1345020l6a.getClass();
                C1345020l6a.LIZJ(1, i, str, null);
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
                String str;
                C1345020l6a c1345020l6a = C1345020l6a.LIZ;
                if (publishModel != null) {
                    str = publishModel.creationId;
                } else {
                    str = null;
                }
                String aid = createAwemeResponse.aweme.getAid();
                c1345020l6a.getClass();
                C1345020l6a.LIZJ(2, 0, str, aid);
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
                String str2;
                C1345020l6a c1345020l6a = C1345020l6a.LIZ;
                if (publishModel != null) {
                    str2 = publishModel.creationId;
                } else {
                    str2 = null;
                }
                c1345020l6a.getClass();
                C1345020l6a.LIZJ(0, 0, str2, null);
            }
        }, AFwS259S0000000_21.get$arr$(362));
        LIZLLL = true;
    }

    public static void LIZIZ(Comment comment, int i, String str, int i2) {
        if (comment == null || comment.getCommentPostStatus() == 2) {
            return;
        }
        comment.setCommentPostStatus(i);
        comment.setCommentPostProgress(i2);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    comment.setCommentPostItemList(C1697810uHb.LJIILJJIL(str));
                    comment.setTextImageCommentPostItemList(new ArrayList());
                    return;
                }
                return;
            }
            comment.setCommentPostItemList(new ArrayList());
            comment.setTextImageCommentPostItemList(new ArrayList());
            return;
        }
        comment.setCommentPostItemList(new ArrayList());
        comment.setTextImageCommentPostItemList(new ArrayList());
    }

    public static void LIZJ(int i, int i2, String str, String str2) {
        C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
        if (str == null) {
            str = "";
        }
        c1354600lM2.getClass();
        Comment commentLIZIZ = C1354600lM2.LIZIZ(str);
        if (commentLIZIZ == null) {
            return;
        }
        LIZIZ(commentLIZIZ, i, str2, i2);
    }
}
