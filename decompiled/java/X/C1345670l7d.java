package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentPreloadV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0l7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345670l7d {
    public static C19EG LIZ(Context context) {
        if (context == null) {
            return null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            return c19egLIZIZ;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DefaultCommentPageContainerFragment LIZIZ(Context context) {
        Fragment fragmentLJJJJZI;
        FragmentManager fragmentManagerLJIIJJI;
        C19EG c19egLIZ = LIZ(context);
        if (c19egLIZ == null) {
            return null;
        }
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(c19egLIZ);
        InterfaceC214902198i interfaceC214902198iLJIILLIIL = interfaceC214902198iLJIIIIZZ;
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZ);
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198iLJIILLIIL, false, false)) {
            if (interfaceC214902198iLJIILLIIL != 0 && (fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI((Fragment) interfaceC214902198iLJIILLIIL)) != null) {
                fragmentLJJJJZI = fragmentManagerLJIIJJI.LJJJJZI("default_comment_page");
            } else {
                fragmentLJJJJZI = null;
            }
        } else {
            fragmentLJJJJZI = c19egLIZ.getSupportFragmentManager().LJJJJZI("default_comment_page");
        }
        if (!(fragmentLJJJJZI instanceof DefaultCommentPageContainerFragment)) {
            return null;
        }
        return (DefaultCommentPageContainerFragment) fragmentLJJJJZI;
    }

    public static void LIZLLL(C1349800lEI c1349800lEI, Aweme aweme) {
        String strJsonStringToServer;
        Long lLJIILIIL;
        CommentSuggestWordList commentSuggestWordList;
        if (c1349800lEI == null) {
            return;
        }
        if (!C0C0D.LIZ() || aweme == null || (commentSuggestWordList = aweme.getCommentSuggestWordList()) == null || (strJsonStringToServer = commentSuggestWordList.jsonStringToServer()) == null) {
            strJsonStringToServer = "";
        }
        int value = EnumC1220570hrr.DEFAULT.getValue();
        C07GY.LIZ.getClass();
        if (C07GY.LIZ()) {
            C1344380l5Y c1344380l5Y = C1344380l5Y.LIZ;
            String eventType = c1349800lEI.getEventType();
            String insertCids = c1349800lEI.getInsertCids();
            c1344380l5Y.getClass();
            if (C1344380l5Y.LIZIZ(aweme, eventType, insertCids)) {
                value = EnumC1220570hrr.AUTHOR_SIDE_FIRST_COMMENT.getValue();
            }
        }
        C1346140l8O c1346140l8O = CommentPreloadV2.Companion;
        String insertCids2 = c1349800lEI.getInsertCids();
        String eventType2 = c1349800lEI.getEventType();
        if (eventType2 == null) {
            eventType2 = "unknown_log_value";
        }
        int iLJI = C1350950lG9.LIZIZ.LJI();
        boolean z = true;
        boolean z2 = !C0BJR.LIZ();
        if (!C286300BKa.LIZ() || (C286300BKa.LIZIZ() & 4) != 4) {
            z = false;
        }
        String pollId = c1349800lEI.getPollId();
        if (pollId != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(pollId);
        } else {
            lLJIILIIL = null;
        }
        C1346140l8O.LIZ(c1346140l8O, null, aweme, insertCids2, eventType2, strJsonStringToServer, LSPassThroughRecordSizeConfig.DEFAULT, 300000, 0, iLJI, z2, z, value, null, lLJIILIIL, 4097);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C19EG r7, androidx.fragment.app.Fragment r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345670l7d.LIZJ(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC1351090lGN LJ(X.C19EG r21, androidx.fragment.app.Fragment r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, X.C1349800lEI r24) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345670l7d.LJ(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, X.0lEI):X.0lGN");
    }
}
