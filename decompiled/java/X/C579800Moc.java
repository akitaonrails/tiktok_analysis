package X;

import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: renamed from: X.0Moc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579800Moc {
    public static final void LIZ(CreativeInfo creativeInfo) {
        if (!C298170BmR.LIZ()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05XP(creativeInfo, null), 3);
    }

    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        if (!shortVideoContext.LJJJJZ() && !shortVideoContext.LJJIJIIJI() && !shortVideoContext.LJJJ() && ((Boolean) C0AR0.LIZ.getValue()).booleanValue()) {
            LIZ(shortVideoContext.creativeInfo);
        }
    }

    public static final void LIZJ(C19EG c19eg, C579810Mod c579810Mod, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) function0.invoke();
        C580090Mp5 c580090Mp5 = (C580090Mp5) ((C1DRG) function02.invoke()).LJII(C580090Mp5.class, null);
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        boolean z = true;
        if (cameraComponentModel.mRestoreType == 1 && shortVideoContext.draftToEditFrom == 0 && !cameraComponentModel.isRetakeMode && !cameraComponentModel.isEditorProRecordMode) {
            C1443030nef.LJII().LJII = "";
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            if (shortVideoContext.draftId != 0) {
                c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            }
            if (shortVideoContext.draftToEditFrom == 0) {
                c0lab.LJ("draft_way", "general_draft_list");
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("click_draft_edit_cancel", c0lab.LIZ);
            if (shortVideoContext.draftToEditFrom == 0 && !shortVideoContext.creativeModel.draftInfoModel.isPostDraftPrompt) {
                C0CHQ.LIZ().LJI().LJIILL().openDraftActivity(c19eg, null);
            }
        }
        boolean z2 = C0CHQ.LIZ().LJIJJ().LJIIJJI(c19eg).getBoolean("navigate_back_to_main", false);
        if (z2) {
            InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
            Intent intent = new Intent(c19eg, C19221910Hx.LIZJ());
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, c19eg);
                C2204961BRm.LJIILLIIL(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLp4M7PdnL36ejjHYmNMPpZY13C9f0ebUzHsxEKtM=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("event", "crash");
                C1637890six.LIZIZ("returnmain", c543670LTx.LJ());
            }
        }
        if (shortVideoContext.mFromOtherPlatform) {
            C2204961BRm.LJIILIIL(c19eg, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLp4M7PdnL36ejjHYmNMPpZY13C9f0ebUzHsxEKtM=", null));
        }
        if (C289390BVx.LIZ() && !shortVideoContext.cameraComponentModel.isRetakeMode) {
            InterfaceC1604540rrA cleanUselessDraftsProvider = C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider();
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            cleanUselessDraftsProvider.LIZ(creativeInfo.copy(creativeInfo.creationId, creativeInfo.version, creativeInfo.sessionId));
        }
        CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel2.isRetakeMode) {
            if (!shortVideoContext.LJJJJIZL()) {
                c580090Mp5.LIZ(new C579790Mob(c19eg, ((InterfaceC1648570t0B) function03.invoke()).Ak(), shortVideoContext, ((InterfaceC1650190t2n) function04.invoke()).LJLJJLL()));
                return;
            }
            boolean z3 = shortVideoContext.cameraComponentModel.editorProRecordUsedForPip;
            RetakeVideoContext retakeVideoContextLJIIZILJ = shortVideoContext.LJIIZILJ();
            if (retakeVideoContextLJIIZILJ == null || !retakeVideoContextLJIIZILJ.originFromNowsPage) {
                z = false;
            }
            c580090Mp5.LIZ(new C579510Mo9(c19eg, new C580110Mp7(shortVideoContext, z3, z, 48)));
            return;
        }
        if (cameraComponentModel2.isEditorProRecordMode) {
            c580090Mp5.LIZ(new C579510Mo9(c19eg, new C580110Mp7(shortVideoContext, cameraComponentModel2.editorProRecordUsedForPip, cameraComponentModel2.isFromEditorProNows, 48)));
            return;
        }
        if (shortVideoContext.LJJJJLL()) {
            c580090Mp5.LIZ(new C579780Moa(c19eg, c579810Mod.LIZ));
            if (!C289390BVx.LIZ() && !((Boolean) C0AR0.LIZ.getValue()).booleanValue() && z2) {
                LIZ(shortVideoContext.creativeInfo);
            }
            LIZIZ(shortVideoContext);
            return;
        }
        if (shortVideoContext.cameraComponentModel.mRestoreType != 1) {
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current restoreType is ");
            sbLIZ.append(shortVideoContext.cameraComponentModel.mRestoreType);
            C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            c580090Mp5.LIZ(new C579770MoZ(c19eg));
            if (!C289390BVx.LIZ() && !((Boolean) C0AR0.LIZ.getValue()).booleanValue() && z2) {
                LIZ(shortVideoContext.creativeInfo);
            }
            LIZIZ(shortVideoContext);
            return;
        }
        c580090Mp5.LIZ(new C579770MoZ(c19eg));
    }
}
