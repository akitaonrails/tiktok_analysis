package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NYZ {
    public final boolean LIZ;
    public final WeakReference<C0NYY> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NYZ)) {
            return false;
        }
        C0NYZ c0nyz = (C0NYZ) obj;
        return this.LIZ == c0nyz.LIZ && Intrinsics.LJFF(this.LIZIZ, c0nyz.LIZIZ);
    }

    public C0NYZ(WeakReference weakReference, boolean z) {
        this.LIZ = z;
        this.LIZIZ = weakReference;
    }
}
