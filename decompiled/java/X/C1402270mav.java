package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelFragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402270mav implements InterfaceC1585190rLx {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        switch (this.$t) {
            case 0:
                p1$0(this, str, str2);
                break;
            case 1:
                p1$1(this, str, str2);
                break;
            case 2:
                p1$2(this, str, str2);
                break;
            case 3:
                p1$3(this, str, str2);
                break;
        }
    }

    public C1402270mav(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void p1$0(C1402270mav c1402270mav, String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((UpvotePanelFragment) c1402270mav.l0, C343970De7.LIZ);
    }

    public static final void p1$1(C1402270mav c1402270mav, String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((RepostInteractPanel) c1402270mav.l0, C343970De7.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p1$2(X.C1402270mav r6, java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r8)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r0 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r3 = r0.mEventType
            if (r3 != 0) goto L16
            return
        L16:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L35
            java.lang.String r5 = "For You"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r5)
            if (r0 == 0) goto L98
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L98
            r1.LLLLIIL = r4
            r1.qq()
        L35:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L52
            java.lang.String r5 = "Following"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r5)
            if (r0 == 0) goto L84
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L84
            r1.LLLLIIL = r4
            r1.qq()
        L52:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L6f
            java.lang.String r3 = "FRIENDS_FEED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r3)
            if (r0 == 0) goto L70
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L70
            r1.LLLLIIL = r4
            r1.qq()
        L6f:
            return
        L70:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r3)
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L6f
            r1.LLLLIIL = r2
            r1.qq()
            return
        L84:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r5)
            if (r0 == 0) goto L52
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L52
            r1.LLLLIIL = r2
            r1.qq()
            goto L52
        L98:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r5)
            if (r0 == 0) goto L35
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r1 = (com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew) r1
            boolean r0 = r1.LLLLIILL
            if (r0 == 0) goto L35
            r1.LLLLIIL = r2
            r1.qq()
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402270mav.p1$2(X.0mav, java.lang.String, java.lang.String):void");
    }

    public static final void p1$3(C1402270mav c1402270mav, String str, String str2) {
        DialogC1393760mNC dialogC1393760mNC = (DialogC1393760mNC) c1402270mav.l0;
        dialogC1393760mNC.dismiss();
        C785410UrT.LIZ(dialogC1393760mNC);
    }
}
