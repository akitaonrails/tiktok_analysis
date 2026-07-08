package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0lDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349300lDU {
    public static final C1349300lDU LIZ = new C1349300lDU();
    public static final C08I7<String, C1343650l4N> LIZIZ = new C08I7<>(200);
    public static final C08I7<String, Long> LIZJ = new C08I7<>(200);

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0lDa
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    C1349300lDU.LIZIZ.LIZ();
                    C1344030l4z.LIZJ("QuickCommentLikeHelper", "login or logout success, clear the cache");
                }
            }
        });
    }

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 2) {
                return "on_device";
            }
            if (num.intValue() == 1) {
                return "cloud";
            }
            return "none";
        }
        return "none";
    }

    public static void LIZLLL(int i, String str, String str2) {
        if (str == null) {
            return;
        }
        LIZIZ.LIZLLL(str, new C1343650l4N(str2, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r8, com.ss.android.ugc.aweme.comment.model.Comment r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12) {
        /*
            r7 = 0
            if (r9 == 0) goto Lb5
            java.lang.String r0 = r9.getRootCommentId()
        L7:
            r5 = 0
            if (r0 == 0) goto L9d
            int r0 = r0.length()
            if (r0 == 0) goto L9d
            if (r9 == 0) goto L9a
            java.lang.String r1 = r9.getRootCommentId()
        L16:
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9d
            if (r9 == 0) goto L98
            java.lang.String r3 = r9.getRootCommentId()
        L24:
            java.lang.String r4 = ""
        L26:
            java.lang.String r6 = LIZ(r12)
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r10)
            java.lang.String r1 = "page_type"
            java.lang.String r0 = "notification_page"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "action_type"
            r2.LJIIIIZZ(r0, r11)
            java.lang.String r0 = "position"
            r2.LIZJ(r5, r0)
            java.lang.String r0 = "model_source"
            r2.LJIIIIZZ(r0, r6)
            if (r9 == 0) goto L96
            java.lang.String r1 = r9.getCid()
        L50:
            java.lang.String r0 = "direct_replied_comment_id"
            r2.LJIIIIZZ(r0, r1)
            if (r9 == 0) goto L94
            java.lang.String r1 = r9.getCid()
        L5b:
            java.lang.String r0 = "reply_comment_id"
            r2.LJIIIIZZ(r0, r1)
            if (r9 == 0) goto L92
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getUser()
            if (r0 == 0) goto L92
            java.lang.String r1 = r0.getUid()
        L6c:
            java.lang.String r0 = "direct_reply_comment_uid"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "parent_comment_uid"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "parent_comment_id"
            r2.LJIIIIZZ(r0, r3)
            if (r8 == 0) goto L81
            java.lang.String r7 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r8)
        L81:
            boolean r1 = X.C10EU.LJIIZILJ(r7)
            java.lang.String r0 = "is_video_author"
            r2.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "suggested_reply_comment"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L92:
            r1 = r7
            goto L6c
        L94:
            r1 = r7
            goto L5b
        L96:
            r1 = r7
            goto L50
        L98:
            r3 = r7
            goto L24
        L9a:
            r1 = r7
            goto L16
        L9d:
            if (r9 == 0) goto Laf
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getUser()
            if (r0 == 0) goto Laf
            java.lang.String r4 = r0.getUid()
        La9:
            java.lang.String r3 = r9.getCid()
            goto L26
        Laf:
            r4 = r7
            if (r9 != 0) goto La9
            r3 = r7
            goto L26
        Lb5:
            r0 = r7
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1349300lDU.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    public static void LIZIZ(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String strLIZ = LIZ(num);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", str2);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c2344009Gk.LJIIIIZZ("account_type", str4);
        c2344009Gk.LJIIIIZZ("comment_id", str5);
        if (z) {
            str6 = "emoji";
        } else {
            str6 = null;
        }
        C1341320l0c.LIZIZ(c2344009Gk, "show_type", str6);
        c2344009Gk.LJIIIIZZ("model_source", strLIZ);
        C20684815ws.LJIILLIIL("show_reply_comment_button", c2344009Gk.LIZ);
    }
}
