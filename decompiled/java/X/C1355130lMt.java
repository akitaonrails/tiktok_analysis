package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355130lMt {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final Aweme LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            X.0Sti r3 = X.C735840Sti.LIZ
            X.11uW r2 = X.C19651011uW.LIZIZ
            X.0lQx r1 = new X.0lQx
            r1.<init>()
            java.lang.String r0 = "url_form"
            r1.LLFII = r0
            java.lang.String r0 = r4.LIZ
            r1.LIZLLL = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            r1.LJIJI(r0)
            java.lang.String r0 = "share_panel"
            r1.LJLI = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
        L22:
            java.lang.String r0 = X.C735370Ssx.LJIJJLI(r0)
            r1.LLIILZL = r0
            r1.LJJLIIIJJI = r5
            com.ss.android.ugc.aweme.share.ShareExtService r0 = X.C621180OYa.LIZIZ
            X.00c0 r0 = r0.LJJLIIIJLLLLLLLZ(r5)
            int r0 = r0.ordinal()
            r1.LJJLIIIJJIZ = r0
            java.lang.String r0 = "1"
            r1.LLIILII = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            X.C1357660lQy.LJFF(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            X.C1357660lQy.LJII(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            java.lang.Object r2 = r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            r3.getClass()
            X.C735840Sti.LIZIZ(r0, r2)
            X.0mAt r2 = (X.AbstractC1386130mAt) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            if (r0 == 0) goto L68
            boolean r0 = r0.getIsCommentPostVideo()
            r1 = 1
            if (r0 != r1) goto L68
        L5f:
            java.lang.String r0 = "is_comment_post_video"
            r2.LIZLLL(r1, r0)
            r2.LJIILJJIL()
            return
        L68:
            r1 = 0
            goto L5f
        L6a:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1355130lMt.LIZIZ(java.lang.String):void");
    }

    public C1355130lMt(String str, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = aweme;
    }

    public final void LIZ(String str, String str2) {
        String authorUid;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", this.LIZ);
        Aweme aweme = this.LIZIZ;
        String aid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        pairArr[1] = new Pair("author_id", authorUid);
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        }
        pairArr[2] = new Pair("group_id", aid);
        pairArr[3] = new Pair("action_type", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str2 != null) {
            mapLJIIJ.put("platform", str2);
        }
        C20684815ws.LJIILLIIL("invite_to_watch", mapLJIIJ);
    }
}
