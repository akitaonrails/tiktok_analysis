package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.07xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2031907xd extends WeakReference<Object> {
    public final long LIZ;

    @Override // java.lang.ref.Reference
    public final Object get() {
        throw new IllegalStateException("Calling KeyedWeakReference.get() is a mistake as it revives the reference");
    }

    public final Object LIZ() {
        return super.get();
    }

    public C2031907xd(Object obj, long j, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.LIZ = j;
    }
}
