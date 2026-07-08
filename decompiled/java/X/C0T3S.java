package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T3S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3S {
    public final WeakReference<View> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T3S)) {
            return false;
        }
        C0T3S c0t3s = (C0T3S) obj;
        return Intrinsics.LJFF(this.LIZ, c0t3s.LIZ) && this.LIZIZ == c0t3s.LIZIZ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZIZ);
        return sb.toString();
    }

    public C0T3S(long j, WeakReference weakReference) {
        this.LIZ = weakReference;
        this.LIZIZ = j;
    }
}
