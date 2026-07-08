package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577430Mkn {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAVServiceProxy iAVServiceProxy;
        InterfaceC566960MLm storyService;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ2;
        HashSet<String> hashSetLJII;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJIIIZ()) {
            if (C0CHQ.LIZ().getAccountService().LIZ() || (iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null)) == null || (storyService = iAVServiceProxy.getStoryService()) == null || !storyService.LJI() || shortVideoContext.LJJIIZ() || shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.LJJJJIZL() || shortVideoContext.LJJJIL() || shortVideoContext.cameraComponentModel.editorProRecordUsedForPip || shortVideoContext.LJJJJLL() || shortVideoContext.isDuetMode || shortVideoContext.LJJLL() || ((C1443960ngA.LJ(shortVideoContext) && !shortVideoContext.isBusinessFirstSticker.booleanValue()) || shortVideoContext.LJJJ() || shortVideoContext.LJJJJZ() || shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM || d4.LJIIJ(shortVideoContext) || Intrinsics.LJFF(shortVideoContext.shootWay, "anchor_combine_tts"))) {
                return false;
            }
            if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"add_yours", "trend_button"}) < 0) {
                if (shortVideoContext.creativeModel.stickerModel.isFromFollowAddYours || (!r1.addYoursStickerExtras.isEmpty()) || shortVideoContext.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                    return false;
                }
                C542840LQs c542840LQs = C542840LQs.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shootWay=");
                sbLIZ.append(shortVideoContext.shootWay);
                sbLIZ.append(",enterFrom=");
                sbLIZ.append(shortVideoContext.enterFrom);
                C201955140j.LIZLLL(c542840LQs, "enableAITheaterRecordEntrance", C2188811AlT.LIZIZ(sbLIZ));
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ2 != null && (interfaceC558600LvWLIZIZ2 = iAITheaterFeatureServiceLIZ2.LIZIZ()) != null && (hashSetLJII = interfaceC558600LvWLIZIZ2.LJII()) != null && C13LP.LJJJJ(shortVideoContext.shootWay, hashSetLJII)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ3 = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ3 != null) {
            C549760LhG.LIZ(iAITheaterFeatureServiceLIZ3, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE);
        }
        return false;
    }
}
