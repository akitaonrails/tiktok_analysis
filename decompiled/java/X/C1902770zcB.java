package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceBizParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902770zcB {
    public static boolean LIZ(InboxEntranceCell inboxEntranceCell) {
        InboxEntranceBizParams inboxEntranceBizParamsLIZIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_follower_merge_user_tiering", true) < 1 || (inboxEntranceBizParamsLIZIZ = LIZIZ(inboxEntranceCell)) == null || inboxEntranceBizParamsLIZIZ.keepBubbleStyle != 1) {
            return false;
        }
        return true;
    }

    public static InboxEntranceBizParams LIZIZ(InboxEntranceCell inboxEntranceCell) {
        Object c098200Yq;
        String str = inboxEntranceCell.bizParams;
        Object obj = null;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        try {
            c098200Yq = (InboxEntranceBizParams) C08JS.LIZ(str, InboxEntranceBizParams.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InboxEntranceBizParams) obj;
    }
}
