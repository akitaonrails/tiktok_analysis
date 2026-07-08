package X;

import com.ss.android.ugc.feed.platform.ab.UnifyTouchDelegateScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695780RQy {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0RR0());

    public static UnifyTouchDelegateScope LIZIZ() {
        return (UnifyTouchDelegateScope) LIZ.getValue();
    }

    public static boolean LIZ() {
        UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ = LIZIZ();
        if (unifyTouchDelegateScopeLIZIZ != null) {
            return Intrinsics.LJFF(unifyTouchDelegateScopeLIZIZ.enable, Boolean.TRUE);
        }
        return false;
    }
}
