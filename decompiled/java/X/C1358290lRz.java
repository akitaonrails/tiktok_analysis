package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.widget.RightSwipeDismissBehavior;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358290lRz {
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090 A[PHI: r3
      0x0090: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v3 java.lang.Integer), (r3v3 java.lang.Integer), (r3v3 java.lang.Integer) binds: [B:50:0x008d, B:31:0x0053, B:33:0x0057, B:35:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            if (r5 == 0) goto L94
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r5.baseFeedPageParams
            if (r0 == 0) goto L94
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L94
            java.util.HashMap r1 = r0.getInboxLogExtra()
            if (r1 == 0) goto L94
            java.lang.String r0 = "from_inner_user_num"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L94
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
        L24:
            r4 = 0
            if (r0 <= 0) goto L8b
            if (r5 == 0) goto L92
            java.lang.String r1 = r5.mEventType
        L2b:
            java.lang.String r0 = "notification_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8b
            if (r5 == 0) goto L8c
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r5.baseFeedPageParams
            if (r0 == 0) goto L8c
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L8c
            java.util.HashMap r1 = r0.getInboxLogExtra()
            if (r1 == 0) goto L8c
            java.lang.String r0 = "notice_message_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L8c
            java.lang.Integer r3 = X.C2095008Iq.LJIIJJI(r0)
        L51:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r5.baseFeedPageParams
            if (r0 == 0) goto L90
            X.1An6 r0 = r0.param
            if (r0 == 0) goto L90
            java.util.HashMap r1 = r0.getInboxLogExtra()
            if (r1 == 0) goto L90
            java.lang.String r0 = "account_type"
            java.lang.Object r2 = r1.get(r0)
        L65:
            if (r3 == 0) goto L6f
            int r1 = r3.intValue()
            r0 = 20119(0x4e97, float:2.8193E-41)
            if (r1 == r0) goto L96
        L6f:
            java.lang.String r0 = "social_upvote_digg_ui"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L96
            if (r3 == 0) goto L81
            int r1 = r3.intValue()
            r0 = 20120(0x4e98, float:2.8194E-41)
            if (r1 == r0) goto L89
        L81:
            java.lang.String r0 = "social_upvote_reply_like_ui"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L8b
        L89:
            java.lang.String r4 = "notice_like_repost_reply_aggregate"
        L8b:
            return r4
        L8c:
            r3 = r4
            if (r5 == 0) goto L90
            goto L51
        L90:
            r2 = r4
            goto L65
        L92:
            r1 = r4
            goto L2b
        L94:
            r0 = 0
            goto L24
        L96:
            java.lang.String r4 = "notice_like_repost_aggregate"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358290lRz.LIZ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):java.lang.String");
    }

    public static int LIZIZ(int i, int i2) {
        int iLIZIZ;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3 || (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(398))) > i2) {
                    return i2;
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(338));
                if (iLIZIZ > i2) {
                    return i2;
                }
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(308));
            if (iLIZIZ > i2) {
                return i2;
            }
        }
        return iLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static void LIZJ(C1358290lRz c1358290lRz, Aweme aweme, C1358560lSQ c1358560lSQ, VideoItemParams videoItemParams, C19EG c19eg, String str, String str2, String str3, String str4, Long l, String str5, Function0 function0, int i) {
        String str6;
        String strLIZIZ;
        String str7;
        Function0 function02 = function0;
        String str8 = str5;
        Long l2 = l;
        String str9 = str4;
        String str10 = str3;
        String strLIZIZ2 = str2;
        String str11 = str;
        String uid = null;
        if ((i & 16) != 0) {
            str11 = null;
        }
        if ((i & 32) != 0) {
            strLIZIZ2 = null;
        }
        if ((i & 64) != 0) {
            str10 = null;
        }
        if ((i & 128) != 0) {
            str9 = null;
        }
        if ((i & 256) != 0) {
            l2 = null;
        }
        if ((i & 512) != 0) {
            str8 = "bubble";
        }
        if ((i & 1024) != 0) {
            function02 = null;
        }
        c1358290lRz.getClass();
        if (videoItemParams != null) {
            str6 = videoItemParams.mEventType;
        } else {
            str6 = null;
        }
        if (C123100dR.LIZ(strLIZIZ2)) {
            strLIZIZ = strLIZIZ2;
        } else {
            UpvotePanelListViewModel.LLJJIJI.getClass();
            strLIZIZ = C1358120lRi.LIZIZ(videoItemParams, str11);
        }
        String aid = aweme.getAid();
        if (l2 == null) {
            C1358230lRt.LIZ = 0L;
            C1358230lRt.LJII = true;
        } else {
            C1358230lRt.LIZ = l2.longValue();
            C1358230lRt.LIZIZ = 0L;
            C1358230lRt.LIZJ = 0L;
            C1358230lRt.LIZLLL = 0L;
            C1358230lRt.LJ = 0L;
            C1358230lRt.LJFF = 0L;
            C1358230lRt.LJI = 0L;
            C1358230lRt.LJII = false;
            C1358230lRt.LJIIIIZZ = str6;
            C1358230lRt.LJIIIZ = strLIZIZ;
            C1358230lRt.LJIIJ = aid;
        }
        if (C1358180lRo.LIZJ()) {
            C21146717pB.LIZJ(c19eg, R.layout.i6f);
            C21146717pB.LIZJ(c19eg, R.layout.i6t);
        }
        RepostInteractPanel repostInteractPanel = new RepostInteractPanel();
        repostInteractPanel.LLIZ = aweme;
        repostInteractPanel.LLIZLLLIL = videoItemParams;
        repostInteractPanel.LLJ = c1358560lSQ;
        repostInteractPanel.LLJI = str11;
        repostInteractPanel.LLJIJIL = str10;
        repostInteractPanel.LLJILJIL = strLIZIZ2;
        repostInteractPanel.LLJILJILJ = str9;
        repostInteractPanel.LLJILLL = l2;
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(4);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJJIJI = repostInteractPanel;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1402050maZ(videoItemParams, function02, c259800zU, 1);
        RepostPublicInteractExp.LIZ.getClass();
        RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
        if (repostPublicInteractConfigLIZIZ != null && repostPublicInteractConfigLIZIZ.panelSwipeDismiss) {
            c1390920mIc.LIZ.LLLIIII = new RightSwipeDismissBehavior();
        }
        ?? r0 = c1390920mIc.LIZ;
        c259800zU.element = r0;
        C2211631BhB.LJIIJ(r0);
        ((DialogFragment) c259800zU.element).show(c19eg.getSupportFragmentManager(), "RepostReplyPanel");
        C1391850mK7.LIZIZ(c259800zU.element, "upvote_panel");
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        if (videoItemParams != null) {
            str7 = videoItemParams.mEventType;
        } else {
            str7 = null;
        }
        if (!C123100dR.LIZ(strLIZIZ2)) {
            UpvotePanelListViewModel.LLJJIJI.getClass();
            strLIZIZ2 = C1358120lRi.LIZIZ(videoItemParams, str11);
        }
        String aid2 = aweme.getAid();
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        }
        UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(aweme.getAid());
        String strLIZ = LIZ(videoItemParams);
        c1358550lSP.getClass();
        C1358550lSP.LIZIZ(str7, strLIZIZ2, aid2, uid, str11, upvoteListLJIIIIZZ, str10, strLIZ, str8);
    }
}
