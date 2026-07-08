package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.0Phl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651990Phl implements LifecycleOwner {
    public static final C651990Phl LL = new C651990Phl();
    public static final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(LL);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return LLILLJJLI;
    }
}
