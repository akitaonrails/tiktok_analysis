package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TUM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUM {
    public static final C0TUM LIZ = new C0TUM();

    public static void LIZIZ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("show", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("skip_reason", str);
        if (Intrinsics.LJFF(str, "easter_egg_showing")) {
            if (z) {
                str2 = "1";
            }
            c2344009Gk.LJFF("is_first_comment", str2);
        }
        C20684815ws.LJIILLIIL("comment_skip_rethink", c2344009Gk.LIZ);
    }

    public static C2344009Gk LIZ(int i, String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJ(Boolean.valueOf(z), "resend_same_cmt");
        c2344009Gk.LIZJ(i, "pop_type");
        return c2344009Gk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.tux.sheet.sheet.TuxSheet LIZJ(final android.content.Context r23, com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup r24, final X.C0TUL r25, boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TUM.LIZJ(android.content.Context, com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup, X.0TUL, boolean, java.lang.String, java.lang.String):com.bytedance.tux.sheet.sheet.TuxSheet");
    }
}
