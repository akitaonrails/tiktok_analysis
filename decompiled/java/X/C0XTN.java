package X;

import Y.ARunnableS18S1100000_13;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;

/* JADX INFO: renamed from: X.0XTN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XTN {
    public static final C0XTN LIZ = new C0XTN();

    public static final CommentRethinkPopup LJ(Exception exc) {
        CommentResponse commentResponse;
        CommentRethinkPopup commentRethinkPopup;
        if (exc instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) exc;
            if (c0xir.getErrorCode() == 3017002 || c0xir.getErrorCode() == 3002564) {
                Object rawResponse = c0xir.getRawResponse();
                if (!(rawResponse instanceof CommentResponse) || (commentResponse = (CommentResponse) rawResponse) == null || (commentRethinkPopup = commentResponse.commentRethinkPopup) == null) {
                    return new CommentRethinkPopup("", "", "", "", 0, 0);
                }
                return commentRethinkPopup;
            }
        }
        return null;
    }

    public static void LIZ(Context context, int i, boolean z) {
        if (z || i == 0) {
            return;
        }
        LIZIZ(context, context.getResources().getString(i), z);
    }

    public static void LIZIZ(Context context, String str, boolean z) {
        if (z) {
            return;
        }
        C2487409ou.LIZJ(new ARunnableS18S1100000_13(context, str, 22));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(android.content.Context r5, java.lang.Exception r6, int r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XTN.LIZJ(android.content.Context, java.lang.Exception, int, boolean, boolean):boolean");
    }
}
