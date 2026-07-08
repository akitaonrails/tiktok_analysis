package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0opf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488290opf<T> extends WeakReference<T> {
    public final String LIZ;

    public C1488290opf(String str, T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.LIZ = str;
    }
}
