package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.AIImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenAlgoModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.feed.model.AICommentPhoto;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.ImageItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354660lM8 {
    public static final int LIZ() {
        return (C255830A0v.LIZ() != 0 && C255830A0v.LIZ() == 1) ? 2131837120 : 2131837121;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (!LJIIIIZZ(aweme)) {
            return false;
        }
        if (aweme.getAllowAIRemix() != 1 && !C1344730l67.LIZIZ(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (LJIIIIZZ(aweme) && ((Boolean) C276160As2.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final UrlModel LJ(Aweme aweme) {
        Video video;
        Video video2;
        if (((Number) C0BJU.LIZ.getValue()).intValue() == 0) {
            if (aweme != null && (video2 = aweme.getVideo()) != null) {
                return video2.getCover();
            }
            return null;
        }
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return video.getOriginCover();
        }
        return null;
    }

    public static final CommentImageModel LJFF(Intent intent) {
        AIChatGenNodeSrcInfo srcInfo;
        Object path;
        String generateModel;
        String intentionModel;
        AIChatGenNode aIChatGenNode = (AIChatGenNode) intent.getParcelableExtra("key_ai_chat_callback_data");
        if (aIChatGenNode == null || (srcInfo = aIChatGenNode.getSrcInfo()) == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(srcInfo.getPath());
        if (c0vsj.exists()) {
            path = Uri.fromFile(c0vsj);
        } else {
            path = srcInfo.getPath();
        }
        CommentImageModel commentImageModel = new CommentImageModel();
        int iIntValue = 0;
        commentImageModel.setUrlList(C1697810uHb.LJ(path.toString()));
        commentImageModel.setFormat(C2471909mP.LJIJJLI(srcInfo.getPath(), false));
        commentImageModel.setSize(C2286708xd.LJIIL(srcInfo.getPath()));
        commentImageModel.setWidth(srcInfo.getWidth());
        commentImageModel.setHeight(srcInfo.getHeight());
        commentImageModel.setSource(2);
        commentImageModel.setAiImageTaskId(aIChatGenNode.getTaskId());
        AIChatGenAlgoModel modelInfo = aIChatGenNode.getModelInfo();
        String str = "";
        if (modelInfo == null || (generateModel = modelInfo.getGenerateModel()) == null) {
            generateModel = "";
        }
        AIChatGenAlgoModel modelInfo2 = aIChatGenNode.getModelInfo();
        if (modelInfo2 != null && (intentionModel = modelInfo2.getIntentionModel()) != null) {
            str = intentionModel;
        }
        boolean zLJFF = Intrinsics.LJFF(aIChatGenNode.isVPNewUser(), Boolean.TRUE);
        String contextPreloadImageSource = aIChatGenNode.getContextPreloadImageSource();
        Integer contextUserUploadImageCount = aIChatGenNode.getContextUserUploadImageCount();
        if (contextUserUploadImageCount != null) {
            iIntValue = contextUserUploadImageCount.intValue();
        }
        commentImageModel.setAiImageModel(new AIImageModel(contextPreloadImageSource, iIntValue, generateModel, str, zLJFF, aIChatGenNode.isHistoryPhoto(), aIChatGenNode.isVpGenerateResultShow()));
        return commentImageModel;
    }

    public static final String LJI(Intent intent) {
        AIChatGenNodeSrcInfo srcInfo;
        AIChatGenNode aIChatGenNode = (AIChatGenNode) intent.getParcelableExtra("key_ai_chat_callback_data");
        if (aIChatGenNode == null || (srcInfo = aIChatGenNode.getSrcInfo()) == null) {
            return null;
        }
        return srcInfo.getPath();
    }

    public static final boolean LJII(Aweme aweme) {
        VideoUrlModel playAddr;
        String strLJII;
        List<PhotoModeImageUrlModel> imageList;
        if (LJIIJ(aweme)) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (!imageList.isEmpty())) {
                return true;
            }
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null && (playAddr = video.getPlayAddr()) != null && (strLJII = C1374720lsU.LJII(playAddr)) != null && C1533950q1J.LJ(strLJII)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        AICommentPhoto aiCommentPhoto;
        C311030CHd.LIZ.getClass();
        if (!C311030CHd.LIZ() || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (aiCommentPhoto = standardBusinessModel.getAiCommentPhoto()) == null || !aiCommentPhoto.enableComment || !C2026007wg.LIZ(aweme) || !C1403305eR.LIZ(aweme) || !LJII(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (AwemeExtKt.isPhotoMode(aweme) || (((Number) C0A8L.LIZ.getValue()).intValue() == 1 && !AwemeExtKt.isNormalVideo(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (!imageList.isEmpty()))) {
            return true;
        }
        return false;
    }

    public static final ImageItem LJIIIZ(PhotoModeImageUrlModel photoModeImageUrlModel, String str) {
        ImageItem imageItem = null;
        if (photoModeImageUrlModel == null) {
            return null;
        }
        UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
        if (urlModel != null) {
            if (str == null && (str = C1374720lsU.LJII(urlModel)) == null) {
                str = "";
            }
            imageItem = new ImageItem(str, urlModel.getWidth(), urlModel.getHeight());
        }
        return imageItem;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0956] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0lAv, X.0mGX] */
    public static final void LIZLLL(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, final C1347430lAT c1347430lAT, OnActivityResultCallback onActivityResultCallback) {
        UrlModel urlModelLJ;
        String str;
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC1354700lMC interfaceC1354700lMCLJ;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = c1347430lAT.LIZJ;
        if (str2 != null && str2.length() != 0) {
            ((Keva) C1345630l7Z.LIZ.getValue()).storeInt(str2, 1);
        }
        Aweme aweme = c1347430lAT.LIZ;
        if (aweme != null && LJIIJ(aweme)) {
            PhotoModeImageInfo photoModeImageInfo = c1347430lAT.LIZ.getPhotoModeImageInfo();
            if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList)) == null || (urlModelLJ = photoModeImageUrlModel.displayImageNoWatermark) == null) {
                return;
            }
        } else {
            urlModelLJ = LJ(c1347430lAT.LIZ);
            if (urlModelLJ == null) {
                return;
            }
        }
        List<String> urlList = urlModelLJ.getUrlList();
        if (urlList != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC1354700lMCLJ = iAiChatFeatureService.LJ()) != null) {
            String strLIZ = interfaceC1354700lMCLJ.LIZ(str, ".png");
            C1357150lQ9 c1357150lQ9 = C1357150lQ9.LIZIZ;
            String str3 = c1357150lQ9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIPhotoCommentHelper -> enterAIChatPage: localPath = ");
            sbLIZ.append(strLIZ);
            sbLIZ.append("； cover.url = ");
            sbLIZ.append(str);
            C201955140j.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
            int i = C2208181Bbc.LJII;
            C2208191Bbd.LJIILL();
            if (C570490MZb.LJ(strLIZ)) {
                String str4 = c1357150lQ9.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AIPhotoCommentHelper -> localPath has existed & enterAIChatPage, duration = ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C201955140j.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                C201955140j.LIZIZ(C1357140lQ8.LIZIZ.LIZ, " start genAIChatPageConfig");
                AIChatPageConfig aIChatPageConfigLIZ = C21300918Xn.LIZ(new AwS146S1100000_32(c1347430lAT, strLIZ, 13));
                IAiChatFeatureService iAiChatFeatureService2 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService2 != null && (interfaceC21300818XmLIZ = iAiChatFeatureService2.LIZ()) != null) {
                    interfaceC21300818XmLIZ.LIZLLL(context, onActivityResultCallback, aIChatPageConfigLIZ);
                }
                C1347720lAw.LJIILIIL(c1347430lAT.LIZ, jCurrentTimeMillis, new C07YI(0, strLIZ, 0L, 8));
                return;
            }
            if (lifecycleCoroutineScope == null) {
                return;
            }
            final C259800zU c259800zU = new C259800zU();
            ?? r5 = new InterfaceC1389630mGX() { // from class: X.0lAv
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    C1347430lAT c1347430lAT2 = c1347430lAT;
                    C1347720lAw.LJIIL(new C1347440lAU(c1347430lAT2.LIZ, c1347430lAT2.LIZIZ, "user_cancel_in_loading_dialog", c1347430lAT2.LIZLLL, false));
                    C09AE c09ae = c259800zU.element;
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                }
            };
            C788550UwX c788550UwX = new C788550UwX(context, r5);
            if (c788550UwX.LIZIZ == null) {
                DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
                dialogC1389620mGW.LJJLJ(R.string.txr);
                dialogC1389620mGW.LJJLL(true);
                dialogC1389620mGW.LLILZLL = r5;
                c788550UwX.LIZIZ = dialogC1389620mGW;
            }
            C786410Ut5.LJLIIL(c788550UwX.LIZLLL, c788550UwX.LIZJ, new ARunnableS113S0100000_13(c788550UwX, 261));
            c259800zU.element = C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C1354680lMA(jCurrentTimeMillis, interfaceC1354700lMCLJ, urlModelLJ, strLIZ, c788550UwX, c1347430lAT, context, onActivityResultCallback, null), 3);
        }
    }
}
