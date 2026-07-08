package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MYX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYX {
    public static final boolean LIZ(DraftSaveResult draftSaveResult) {
        String message;
        if (draftSaveResult.isSuc() || draftSaveResult.saveFileResults.isSuc()) {
            return false;
        }
        Throwable th = ((DraftFileSaveResult) C13LP.LJJJJZI(draftSaveResult.saveFileResults.blockCreativeList)).saveException.throwable;
        if (th instanceof C2089308Gl) {
            return true;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        if (!a0.LJJIIZI(message, "disk is full", true) && !a0.LJJIIZI(message, "No space left on device", true) && !a0.LJJIIZI(message, "database or disk is full", true)) {
            return false;
        }
        return true;
    }
}
