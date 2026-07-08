package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577420Mkm {
    public static final boolean LIZ(boolean z, ShortVideoContext shortVideoContext) {
        IAVServiceProxy iAVServiceProxy;
        InterfaceC566960MLm storyService;
        C0MDM.LIZ.getClass();
        if (!C0MDM.LIZ() || !C290620BaG.LIZ() || C0CHQ.LIZ().getAccountService().LIZ() || (iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null)) == null || (storyService = iAVServiceProxy.getStoryService()) == null || !storyService.LJI()) {
            return false;
        }
        if (z) {
            if (C13LP.LJJJJ(shortVideoContext.shootWay, (HashSet) C0CLI.LIZIZ.getValue())) {
                return true;
            }
        }
        if (shortVideoContext.LJJIIZ() || shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.LJJJJIZL() || shortVideoContext.LJJJIL() || shortVideoContext.cameraComponentModel.editorProRecordUsedForPip || shortVideoContext.LJJJJLL() || shortVideoContext.isDuetMode || shortVideoContext.LJJLL() || ((C1443960ngA.LJ(shortVideoContext) && !shortVideoContext.isBusinessFirstSticker.booleanValue()) || shortVideoContext.LJJJ() || shortVideoContext.LJJJJZ() || shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM || d4.LJIIJ(shortVideoContext) || Intrinsics.LJFF(shortVideoContext.shootWay, "anchor_combine_tts"))) {
            return false;
        }
        if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"add_yours", "trend_button"}) < 0) {
            if (shortVideoContext.creativeModel.stickerModel.isFromFollowAddYours || (!r1.addYoursStickerExtras.isEmpty()) || shortVideoContext.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                return false;
            }
            C0L76 c0l76 = C0L76.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shootWay=");
            sbLIZ.append(shortVideoContext.shootWay);
            sbLIZ.append(",enterFrom=");
            sbLIZ.append(shortVideoContext.enterFrom);
            C201955140j.LIZLLL(c0l76, "AIAliveFeatureGate", C2188811AlT.LIZIZ(sbLIZ));
            return C13LP.LJJJJ(shortVideoContext.shootWay, (HashSet) C0CLI.LIZIZ.getValue());
        }
        return false;
    }
}
