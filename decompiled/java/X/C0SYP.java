package X;

import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0SYP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYP {
    public static final C0SYP LIZ = new C0SYP();

    public static boolean LIZ(Aweme aweme) {
        char c;
        if ((AwemeExtKt.isAdTraffic(aweme) || !C1017070cZd.LLLIIII(aweme)) && (aweme.isCmtSwt() || C1017070cZd.LJJLIL(aweme))) {
            c = 4;
        } else {
            c = 0;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) || c != 0) {
            return false;
        }
        return true;
    }
}
