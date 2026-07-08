package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.service.IDraftFeedbackService;

/* JADX INFO: renamed from: X.0MYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570300MYi {
    public static final C570300MYi LIZ = new C570300MYi();

    public static void LIZIZ(DraftRestoreResult draftRestoreResult) {
        Context contextLJIIIIZZ;
        int i = !draftRestoreResult.isSuc() ? 1 : 0;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.putAll(C570260MYe.LIZIZ(draftRestoreResult));
        C1637890six.LJ("aweme_draft_load_fail_rate", i, c543670LTx.LJ());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_enable_feedback_log", true, false)) {
            C0M7L.LIZIZ("DraftLoad", C570260MYe.LIZLLL(draftRestoreResult, 2));
        }
        if (!draftRestoreResult.isSuc()) {
            C543670LTx c543670LTx2 = new C543670LTx();
            c543670LTx2.LIZ.putAll(C570260MYe.LIZIZ(draftRestoreResult));
            C1637890six.LJ("aweme_draft_invalid", i, c543670LTx2.LJ());
        }
        if (C0CH1.LIZJ()) {
            return;
        }
        IDraftFeedbackService iDraftFeedbackService = (IDraftFeedbackService) ServiceManager.get().getService(IDraftFeedbackService.class);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ();
        } else {
            contextLJIIIIZZ = null;
        }
        if (!draftRestoreResult.isSuc() && !C570420MYu.LIZ(draftRestoreResult.getErrorCode()) && contextLJIIIIZZ != null) {
            if (iDraftFeedbackService != null) {
                iDraftFeedbackService.LIZ();
            }
        } else {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            int errorCode = draftRestoreResult.getErrorCode();
            if (errorCode == 0) {
                C1448790nnx.LIZJ("draft_load_success");
            } else {
                C1448790nnx.LIZIZ("draft_load_error", String.valueOf(errorCode), null, 12);
            }
        }
    }

    public static void LIZJ(DraftSaveResult draftSaveResult) {
        int i = !draftSaveResult.isSuc() ? 1 : 0;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.putAll(C570260MYe.LIZJ(draftSaveResult));
        C1637890six.LJ("aweme_draft_create_fail_rate", i, c543670LTx.LJ());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_enable_feedback_log", true, false)) {
            C0M7L.LIZIZ("DraftSave", C570260MYe.LIZLLL(draftSaveResult, 2));
        }
        int errorCode = draftSaveResult.getErrorCode();
        if (errorCode == 0) {
            C1448790nnx.LIZJ("draft_save_success");
        } else {
            C1448790nnx.LIZIZ("draft_save_error", String.valueOf(errorCode), null, 12);
        }
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
    }

    public static void LIZ(boolean z, Exception exc) {
        String message = null;
        if (z) {
            C1637890six.LJ("draft_list_load_fail_rate", 0, null);
            return;
        }
        C543670LTx c543670LTx = new C543670LTx();
        if (exc != null) {
            message = exc.getMessage();
        }
        c543670LTx.LIZ.put("exception", message);
        C1637890six.LJ("draft_list_load_fail_rate", 1, c543670LTx.LJ());
    }
}
