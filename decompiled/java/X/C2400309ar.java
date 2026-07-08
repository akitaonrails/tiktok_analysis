package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.09ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2400309ar {
    public static final String LIZ(AwemeDraft awemeDraft) {
        Object c098200Yq;
        try {
            c098200Yq = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIZILJ(awemeDraft.LIZIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            awemeDraft.LIZ();
            c098200Yq = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot();
        }
        return (String) c098200Yq;
    }
}
