package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0K6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512200K6w {
    public static final void LIZIZ(String str) {
        Object c098200Yq;
        if (str != null && str.length() > 0) {
            C0JCX.LIZLLL(str);
            return;
        }
        C512160K6s.LIZ(new C221700tL(str));
        try {
            IPgcSubscribeSuccessLegacyBridge iPgcSubscribeSuccessLegacyBridgeLIZ = C0K2R.LIZ();
            if (iPgcSubscribeSuccessLegacyBridgeLIZ != null) {
                iPgcSubscribeSuccessLegacyBridgeLIZ.LJ(str);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[PHI: r6
      0x0060: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:21:0x005e, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[PHI: r6
      0x0098: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:21:0x005e, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C0KFM r13, com.bytedance.android.live.base.model.user.SubscribeBadge r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C512200K6w.LIZ(X.0KFM, com.bytedance.android.live.base.model.user.SubscribeBadge):void");
    }
}
