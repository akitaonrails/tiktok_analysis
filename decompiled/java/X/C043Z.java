package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.043Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043Z {
    public final boolean LIZ;
    public final Map<String, Object> LIZIZ;

    public C043Z() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C043Z)) {
            return false;
        }
        C043Z c043z = (C043Z) obj;
        return this.LIZ == c043z.LIZ && Intrinsics.LJFF(this.LIZIZ, c043z.LIZIZ);
    }

    public /* synthetic */ C043Z(int i) {
        this(false, null);
    }

    public C043Z(boolean z, Map<String, ? extends Object> map) {
        this.LIZ = z;
        this.LIZIZ = map;
    }
}
