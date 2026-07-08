package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.helper.AutoRemoveLifecycleObserver;

/* JADX INFO: renamed from: X.01y7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C506101y7 {
    public static final void LIZ(Lifecycle lifecycle, Runnable runnable) {
        lifecycle.addObserver(new AutoRemoveLifecycleObserver(lifecycle, runnable));
    }
}
