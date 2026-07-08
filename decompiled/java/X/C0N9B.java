package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N9B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N9B {
    public final List<Object> LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return C13LP.LJJLIIIJ(this.LIZ, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56);
    }

    public C0N9B(List<Object> list) {
        this.LIZ = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(C0N9B.class, obj.getClass())) {
            return Intrinsics.LJFF(this.LIZ, ((C0N9B) obj).LIZ);
        }
        return false;
    }
}
