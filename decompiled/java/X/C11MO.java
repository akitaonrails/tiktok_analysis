package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11MO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MO<T> implements Callable<List<T>> {
    public final int LL = 16;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList(this.LL);
    }
}
