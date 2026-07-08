package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MYY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYY {
    public static final boolean LIZIZ(DraftFileRestoreException draftFileRestoreException) {
        String message;
        Throwable th = draftFileRestoreException.throwable;
        if (th instanceof C2089208Gk) {
            return true;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        if (a0.LJJIIZI(message, "disk is full", true) || a0.LJJIIZI(message, "No space left on device", true) || a0.LJJIIZI(message, "database or disk is full", true)) {
            return true;
        }
        return false;
    }

    public static final void LIZ(DraftRestoreResult draftRestoreResult, Context context) {
        DraftFileRestoreResult next;
        Integer num;
        if (draftRestoreResult.checkResult.isSuc() && draftRestoreResult.codeException == null) {
            DraftFileRestoreResult draftFileRestoreResult = (DraftFileRestoreResult) C13LP.LJJJLL(draftRestoreResult.restoreFileResults.blockCreativeList);
            if (draftFileRestoreResult != null) {
                Integer num2 = draftFileRestoreResult.toastStringRes;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ != null) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(iIntValue);
                        C1390380mHk.LIZ(activityLIZ, 5004, creativeToastBuilder);
                        return;
                    }
                    return;
                }
                return;
            }
            Iterator<DraftFileRestoreResult> it2 = draftRestoreResult.restoreFileResults.notBlockCreativeList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.fileType != 4) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DraftFileRestoreResult draftFileRestoreResult2 = next;
            if (draftFileRestoreResult2 != null && (num = draftFileRestoreResult2.toastStringRes) != null) {
                int iIntValue2 = num.intValue();
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (activityLIZ2 != null) {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(iIntValue2);
                    creativeToastBuilder2.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(activityLIZ2, 5004, creativeToastBuilder2);
                    return;
                }
                return;
            }
            return;
        }
        Activity activityLIZ3 = C1388190mED.LIZ(context);
        if (activityLIZ3 != null) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131836216);
            C1390380mHk.LIZ(activityLIZ3, 5004, creativeToastBuilder3);
        }
    }
}
