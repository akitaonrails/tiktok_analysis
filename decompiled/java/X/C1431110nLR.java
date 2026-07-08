package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0nLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431110nLR {
    public static final C1431110nLR LIZ = new C1431110nLR();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<String> imageModeLocalPaths;
        String absolutePath;
        InterfaceC707110RoT interfaceC707110RoTLIZIZ;
        IWaterMarkService iWaterMarkService;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        EffectTextModel effectTextModel;
        int imageCurrentIndex = 0;
        if (!videoPublishEditModel.isSaveLocalWithWaterMark() && !videoPublishEditModel.creativeModel.editSaveLocalModel.forceSaveWithWatermark) {
            absolutePath = C0MH7.LIZIZ(videoPublishEditModel);
        } else {
            AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
            if (saveModel != null) {
                imageModeLocalPaths = saveModel.getImageModeLocalPaths();
            } else {
                imageModeLocalPaths = null;
            }
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if ((coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && effectTextModel.getHasCoverText()) || imageModeLocalPaths == null) {
                File fileLIZLLL = C2489809pI.LIZLLL(videoPublishEditModel);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("watermark");
                sbLIZ2.append(System.currentTimeMillis());
                sbLIZ.append(C08F1.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2)));
                sbLIZ.append(".jpeg");
                absolutePath = new C0VSJ(fileLIZLLL, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
                String string = UUID.randomUUID().toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1382790m5V c1382790m5V = C1382790m5V.LIZ;
                int iLJIIJJI = C1428470nHB.LJIIJJI(videoPublishEditModel);
                c1382790m5V.getClass();
                C1382790m5V.LIZ(1, 1, iLJIIJJI);
                C1382790m5V.LIZJ(1, 1, C1428470nHB.LJIIJJI(videoPublishEditModel), string, jCurrentTimeMillis);
                IWaterMarkService.DefaultImpls.addWaterMarkToImage$default((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class), C0CHQ.LIZ().getAccountService().getCurrentUser(), C0MH7.LIZIZ(videoPublishEditModel), fileLIZLLL.getPath(), false, 0, false, 56, null);
                IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel))) {
                    ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).addAiChatWaterMarkToImage(C0MH7.LIZIZ(videoPublishEditModel), fileLIZLLL.getPath());
                } else {
                    IAIPortraitFeatureService iAIPortraitFeatureService = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
                    if (iAIPortraitFeatureService != null && (interfaceC707110RoTLIZIZ = iAIPortraitFeatureService.LIZIZ()) != null) {
                        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                        C1428470nHB.LJJZZI(videoPublishEditModel);
                        if (interfaceC707110RoTLIZIZ.LIZ(creativeModel) && (iWaterMarkService = (IWaterMarkService) PluggableExtentionKt.pluggableSpi$default(IWaterMarkService.class, false, false, false, 14, null)) != null) {
                            iWaterMarkService.addAIPortraitWatermarkToImage(C0MH7.LIZIZ(videoPublishEditModel), fileLIZLLL.getPath());
                        }
                    }
                }
                C1382790m5V.LIZIZ(1, 1, C1428470nHB.LJIIJJI(videoPublishEditModel), string, jCurrentTimeMillis);
            } else {
                CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
                if (coverPublishModel2 != null) {
                    imageCurrentIndex = coverPublishModel2.getImageCurrentIndex();
                }
                absolutePath = (String) ListProtector.get(imageModeLocalPaths, imageCurrentIndex);
            }
        }
        AVUploadSaveModel saveModel2 = videoPublishEditModel.getSaveModel();
        if (saveModel2 != null) {
            saveModel2.setImageModeCoverPath(absolutePath);
        }
        AVUploadSaveModel saveModel3 = videoPublishEditModel.getSaveModel();
        if (saveModel3 != null) {
            saveModel3.setImageModeCoverPathNoWatermark(C0MH7.LIZIZ(videoPublishEditModel));
        }
    }
}
