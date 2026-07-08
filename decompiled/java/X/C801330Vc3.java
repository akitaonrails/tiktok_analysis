package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Vc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801330Vc3<T> {
    public final ConcurrentHashMap<String, WeakReference<T>> LIZ = new ConcurrentHashMap<>();
    public final ReferenceQueue<T> LIZIZ = new ReferenceQueue<>();
}
