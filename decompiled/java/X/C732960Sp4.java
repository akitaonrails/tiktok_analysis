package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732960Sp4 extends C09AY implements Function1<C733080SpG, Unit> {
    public final /* synthetic */ VideoCommentVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732960Sp4(VideoCommentVM videoCommentVM) {
        super(1);
        this.LL = videoCommentVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C733080SpG r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.setting.services.IVideoGiftService r1 = com.ss.android.ugc.aweme.setting.services.VideoGiftService.LJI()
            com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM r0 = r6.LL
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r5 = 0
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L13:
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM r0 = r6.LL
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.getAweme()
            if (r4 == 0) goto La7
            java.lang.String r0 = r4.getAid()
            if (r0 == 0) goto Laa
            java.lang.String r1 = r4.getAid()
            java.util.HashSet<java.lang.String> r0 = X.C733300Spc.LIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Laa
            java.lang.String r2 = "show_gift_icon"
            boolean r0 = X.C20684815ws.LJI(r2)
            if (r0 == 0) goto L9c
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM r0 = r6.LL
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L54
            java.lang.String r5 = r0.mEventType
        L54:
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r5)
            java.lang.String r1 = X.C735370Ssx.LIZJ(r4)
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r1 = X.C735370Ssx.LIZLLL(r4)
            java.lang.String r0 = "author_id"
            r3.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r3.LJIIIIZZ(r0, r1)
            int r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getFollowStatus(r4)
            r1 = 1
            if (r0 == r1) goto L82
            r1 = 0
        L82:
            java.lang.String r0 = "is_follow"
            r3.LIZJ(r1, r0)
            boolean r1 = r4.isLike()
            java.lang.String r0 = "is_like"
            r3.LIZJ(r1, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "show"
            r3.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
        L9c:
            com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM r1 = r6.LL
            r0 = 623(0x26f, float:8.73E-43)
            kotlin.jvm.internal.AFwS243S0000000_11 r0 = kotlin.jvm.internal.AFwS243S0000000_11.get$arr$(r0)
            r1.setState(r0)
        La7:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Laa:
            java.lang.String r1 = r4.getAid()
            if (r1 == 0) goto La7
            java.util.HashSet<java.lang.String> r0 = X.C733300Spc.LIZ
            r0.add(r1)
            goto La7
        Lb6:
            r0 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C732960Sp4.invoke(java.lang.Object):java.lang.Object");
    }
}
