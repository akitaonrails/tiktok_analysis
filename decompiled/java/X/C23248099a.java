package X;

import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23248099a {
    public static final Object LIZ(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            C098200Yq c098200Yq = new C098200Yq(((CompletedExceptionally) obj).cause);
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        C189200o6.m2constructorimpl(obj);
        return obj;
    }
}
