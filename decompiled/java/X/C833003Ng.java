package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C833003Ng {
    public final boolean LIZ;
    public final Map<String, Object> LIZIZ;

    public C833003Ng() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C833003Ng)) {
            return false;
        }
        C833003Ng c833003Ng = (C833003Ng) obj;
        return this.LIZ == c833003Ng.LIZ && Intrinsics.LJFF(this.LIZIZ, c833003Ng.LIZIZ);
    }

    public /* synthetic */ C833003Ng(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (Map<String, ? extends Object>) null);
    }

    public C833003Ng(boolean z, Map<String, ? extends Object> map) {
        this.LIZ = z;
        this.LIZIZ = map;
    }
}
