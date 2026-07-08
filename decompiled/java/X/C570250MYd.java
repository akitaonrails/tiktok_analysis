package X;

import Y.ACallableS415S0100000_8;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.ClearCacheParams;
import com.ss.android.ugc.aweme.tools.draft.monitor.DataBaseParams;
import com.ss.android.ugc.aweme.tools.draft.monitor.DraftOperationEvent;
import com.ss.android.ugc.aweme.tools.draft.monitor.DraftOperationParams;
import com.ss.android.ugc.aweme.tools.draft.monitor.PublishParams;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0MYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570250MYd implements InterfaceC570320MYk {
    public static final String[] LIZ = {"java.", "kotlin.", "kotlinx.", "android.", "androidx.", "dalvik.", "com.android.", "sun.", "jdk."};
    public static final String[] LIZIZ = {"DraftLogService", "DraftLogHelper", "DraftDataAnalyzeServiceImpl"};
    public static final String[] LIZJ = {"$$", "$Lambda", "$sam$"};

    @Override // X.InterfaceC570320MYk
    public final void LIZ(DraftSaveResult draftSaveResult) {
        C570300MYi.LIZ.getClass();
        C570300MYi.LIZJ(draftSaveResult);
    }

    @Override // X.InterfaceC570320MYk
    public final void LIZJ(DraftDeleteResult draftDeleteResult) {
        C570300MYi.LIZ.getClass();
        int i = !draftDeleteResult.isSuc() ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJI(C570260MYe.LIZ(draftDeleteResult));
        C20684815ws.LJIILLIIL("aweme_draft_delete_fail_rate", c0lab.LIZ);
    }

    @Override // X.InterfaceC570320MYk
    public final void LJ(DraftSaveResult draftSaveResult) {
        C556880Lsk.LIZ.getClass();
        int i = !draftSaveResult.isSuc() ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJI(C570260MYe.LIZJ(draftSaveResult));
        C562560M4o.LIZ(c0lab, draftSaveResult.aiLivePhotoModel, true, false, null);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJIIJ(draftSaveResult.creativeModel, c0lab);
        C20684815ws.LJIILLIIL("draft_save", c0lab.LIZ);
        if (draftSaveResult.isSuc()) {
            return;
        }
        C15O7.LIZJ(new ACallableS415S0100000_8(draftSaveResult, 21));
    }

    @Override // X.InterfaceC570320MYk
    public final String LJI(int i) {
        return C09RB.LJIILLIIL(C09RB.LJJI(C09RB.LJIIIZ(C09RB.LJII(C13LQ.LJIIJJI(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()))), AFwS239S0000000_8.get$arr$(335)), i), "\n", null, null, AFwS239S0000000_8.get$arr$(336), 30);
    }

    @Override // X.InterfaceC570320MYk
    public final void LJII(DraftSaveResult draftSaveResult) {
        Object c098200Yq;
        if (C0CH1.LIZJ()) {
            try {
                C570220MYa.LJIIJJI(draftSaveResult.creationId, draftSaveResult, null, C570240MYc.LJIIIIZZ(null), null, 40);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        C570230MYb.LIZ(draftSaveResult);
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIIJ(DraftRestoreResult draftRestoreResult) {
        C556880Lsk.LIZ.getClass();
        int i = !draftRestoreResult.isSuc() ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJI(C570260MYe.LIZIZ(draftRestoreResult));
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJIIJ(draftRestoreResult.creativeModel, c0lab);
        C20684815ws.LJIILLIIL("draft_load", c0lab.LIZ);
        if (draftRestoreResult.isSuc()) {
            return;
        }
        C15O7.LIZJ(new ACallableS415S0100000_8(draftRestoreResult, 20));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIILJJIL(DraftRestoreResult draftRestoreResult) {
        C570300MYi.LIZ.getClass();
        C570300MYi.LIZIZ(draftRestoreResult);
    }

    @Override // X.InterfaceC570320MYk
    public final void LIZLLL(DraftDeleteResult draftDeleteResult, AwemeDraft awemeDraft) {
        C556880Lsk.LIZ.getClass();
        int i = !draftDeleteResult.isSuc() ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(draftDeleteResult.isEntryFromEditorTab(), "is_from_edit_tab");
        c0lab.LJ("enter_from", awemeDraft.LIZ.draftBoxModel.draftEnterFrom);
        c0lab.LJI(C570260MYe.LIZ(draftDeleteResult));
        C562560M4o.LIZJ(c0lab, draftDeleteResult.aiLivePhotoModel, null);
        C20684815ws.LJIILLIIL("draft_delete", c0lab.LIZ);
    }

    @Override // X.InterfaceC570320MYk
    public final void LJFF(VideoPublishEditModel videoPublishEditModel, String str) {
        Object c098200Yq;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LJ(videoPublishEditModel.getCreationId(), "");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        C570230MYb.LJ(new DraftOperationEvent(null, "publishDraft", videoPublishEditModel.getCreationId(), 0, C570230MYb.LIZIZ(), str, 0, null, new PublishParams(C1428470nHB.LJIIJJI(videoPublishEditModel), videoPublishEditModel.creativeModel.draftInfoModel.isDraft, "", "", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()), null, 713, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIIIIZZ(DraftRestoreResult draftRestoreResult, String str) {
        Object c098200Yq;
        String str2;
        String stackTraceString;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LJI(draftRestoreResult.creationId, draftRestoreResult, str);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        int i = draftRestoreResult.draftAwemeType;
        if (draftRestoreResult.isSuc()) {
            str2 = "finish";
        } else if (!draftRestoreResult.checkResult.isSuc()) {
            str2 = "fileCheck";
        } else if (!draftRestoreResult.restoreFileResults.isSuc()) {
            str2 = "fileRestore";
        } else {
            str2 = "unkonw";
        }
        DraftOperationParams draftOperationParams = new DraftOperationParams(i, str2, draftRestoreResult.draftVersion, draftRestoreResult.fileTreeInfo, null);
        String str3 = draftRestoreResult.creationId;
        String strLIZIZ = C570230MYb.LIZIZ();
        String str4 = draftRestoreResult.restoreScene;
        int errorCode = draftRestoreResult.getErrorCode();
        String strLIZLLL = "";
        if (draftRestoreResult.getErrorCode() != 0) {
            if (draftRestoreResult.checkResult.isSuc() && !(!draftRestoreResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
                if (!draftRestoreResult.restoreFileResults.isSuc() || (!draftRestoreResult.restoreFileResults.notBlockCreativeList.isEmpty())) {
                    strLIZLLL = C570260MYe.LIZLLL(draftRestoreResult.restoreFileResults, 6);
                }
            } else {
                strLIZLLL = C570260MYe.LIZLLL(draftRestoreResult.checkResult, 6);
            }
            if (draftRestoreResult.codeException != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZLLL);
                if (strLIZLLL != null && strLIZLLL.length() != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("; ");
                    sbLIZ2.append(Log.getStackTraceString(draftRestoreResult.codeException));
                    stackTraceString = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    stackTraceString = Log.getStackTraceString(draftRestoreResult.codeException);
                }
                sbLIZ.append(stackTraceString);
                strLIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strLIZLLL.length() == 0) {
                strLIZLLL = null;
            }
        }
        C570230MYb.LJ(new DraftOperationEvent(null, "loadDraft", str3, 0, strLIZIZ, str4, errorCode, strLIZLLL, draftOperationParams, null, 521, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIIIZ(String str, String str2) {
        Object c098200Yq;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LIZIZ(str, str2, C201955140j.LJIIJJI(new Throwable()));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        C570230MYb.LJ(new DraftOperationEvent(null, "clearRecordFile", str, 0, C570230MYb.LIZIZ(), "clearRecordFile", 0, null, new ClearCacheParams(str2, Log.getStackTraceString(new Throwable()), null), null, 713, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIIL(DraftDeleteResult draftDeleteResult, String str) {
        Object c098200Yq;
        String str2;
        String stackTraceString;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LIZLLL(draftDeleteResult.creationId, draftDeleteResult, str);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        int i = draftDeleteResult.draftAwemeType;
        if (draftDeleteResult.isSuc()) {
            str2 = "finish";
        } else if (!draftDeleteResult.deleteFileResult.isSuc()) {
            str2 = "deleteFile";
        } else if (!draftDeleteResult.deleteDBResult.isSuc()) {
            str2 = "deleteDB";
        } else {
            str2 = "unkonw";
        }
        DraftOperationParams draftOperationParams = new DraftOperationParams(i, str2, 0, null, null);
        String str3 = draftDeleteResult.creationId;
        String strLIZIZ = C570230MYb.LIZIZ();
        String str4 = draftDeleteResult.deleteScene;
        int errorCode = draftDeleteResult.getErrorCode();
        if (!draftDeleteResult.deleteFileResult.isSuc()) {
            stackTraceString = Log.getStackTraceString(draftDeleteResult.deleteFileResult.deleteException.throwable);
        } else if (!draftDeleteResult.deleteDBResult.isSuc()) {
            stackTraceString = Log.getStackTraceString(draftDeleteResult.deleteDBResult.deleteException.throwable);
        } else {
            stackTraceString = "";
        }
        if (stackTraceString.length() == 0) {
            stackTraceString = null;
        }
        C570230MYb.LJ(new DraftOperationEvent(null, "deleteDraft", str3, 0, strLIZIZ, str4, errorCode, stackTraceString, draftOperationParams, null, 521, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIILIIL(String str, Exception exc) {
        Object c098200Yq;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LJFF(str, exc);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        C570230MYb.LJ(new DraftOperationEvent(null, "dataBaseOperation", null, 0, C570230MYb.LIZIZ(), "clearCache", 0, null, new DataBaseParams("query", str, exc), null, 717, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LIZIZ(AwemeDraft awemeDraft, String str, String str2) {
        Object c098200Yq;
        int previewVideoLength;
        if (C0CH1.LIZJ()) {
            try {
                C570240MYc.LJ(awemeDraft.LIZ(), str2);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        boolean z = awemeDraft.LIZ.draftInfoModel.isDraft;
        EditPreviewInfo editPreviewInfoLJ = C0MZ9.LJ(awemeDraft, false);
        if (editPreviewInfoLJ != null) {
            previewVideoLength = editPreviewInfoLJ.getPreviewVideoLength();
        } else {
            previewVideoLength = -1;
        }
        C570230MYb.LJ(new DraftOperationEvent(null, "publishDraft", awemeDraft.LIZ(), 0, C570230MYb.LIZIZ(), str, 0, null, new PublishParams(0, z, "", str2, previewVideoLength), null, 713, null));
    }

    @Override // X.InterfaceC570320MYk
    public final void LJIIJJI(DraftSaveResult draftSaveResult, AwemeDraft awemeDraft, AwemeDraft awemeDraft2, String str) {
        Object c098200Yq;
        boolean z;
        if (C0CH1.LIZJ()) {
            try {
                String strLIZ = awemeDraft2.LIZ();
                if (C0CH1.LIZIZ()) {
                    List listLJIIIIZZ = C570240MYc.LJIIIIZZ(str);
                    if (awemeDraft == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!C0CH1.LIZ()) {
                        C570220MYa.LJIIJJI(strLIZ, draftSaveResult, null, listLJIIIIZZ, Boolean.valueOf(z), 8);
                    } else {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2393109Zh(awemeDraft, awemeDraft2, strLIZ, draftSaveResult, listLJIIIIZZ, z, null), 3);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C570230MYb.LIZ.getClass();
        C570230MYb.LIZ(draftSaveResult);
    }
}
