package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0WQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQQ {
    public static final void LIZ(AbstractC2252651DEx abstractC2252651DEx, CoroutineContext coroutineContext, Runnable runnable) {
        if (C0WP5.LIZ && C0WP5.LJI) {
            abstractC2252651DEx.dispatch(coroutineContext, C0T5C.LIZ(runnable));
        } else {
            abstractC2252651DEx.dispatch(coroutineContext, runnable);
        }
    }
}
