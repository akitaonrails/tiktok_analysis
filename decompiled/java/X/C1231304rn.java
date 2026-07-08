package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.04rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231304rn {
    public static final C1231304rn LIZ = new C1231304rn();
    public static final List<String> LIZIZ = Collections.singletonList("smart_reply");

    public static List LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (List) C0C64.LJIILLIIL().LJJII(List.class, LIZIZ, "chat_list_visual_poet_bot_white_list", false);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        return list == null ? LIZIZ : list;
    }
}
