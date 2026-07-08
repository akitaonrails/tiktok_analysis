package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qtw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567820qtw<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1567820qtw) && Intrinsics.LJFF(this.LIZ, ((C1567820qtw) obj).LIZ);
    }

    public C1567820qtw(T t) {
        this.LIZ = t;
    }
}
