package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC570320MYk {
    void LIZ(DraftSaveResult draftSaveResult);

    void LIZIZ(AwemeDraft awemeDraft, String str, String str2);

    void LIZJ(DraftDeleteResult draftDeleteResult);

    void LIZLLL(DraftDeleteResult draftDeleteResult, AwemeDraft awemeDraft);

    void LJ(DraftSaveResult draftSaveResult);

    void LJFF(VideoPublishEditModel videoPublishEditModel, String str);

    String LJI(int i);

    void LJII(DraftSaveResult draftSaveResult);

    void LJIIIIZZ(DraftRestoreResult draftRestoreResult, String str);

    void LJIIIZ(String str, String str2);

    void LJIIJ(DraftRestoreResult draftRestoreResult);

    void LJIIJJI(DraftSaveResult draftSaveResult, AwemeDraft awemeDraft, AwemeDraft awemeDraft2, String str);

    void LJIIL(DraftDeleteResult draftDeleteResult, String str);

    void LJIILIIL(String str, Exception exc);

    void LJIILJJIL(DraftRestoreResult draftRestoreResult);
}
