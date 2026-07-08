package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RAO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RAO {
    public int hashCode() {
        return getClass().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0RAO)) {
            return false;
        }
        return Intrinsics.LJFF(toString(), obj.toString());
    }
}
