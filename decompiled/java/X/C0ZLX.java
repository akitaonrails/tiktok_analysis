package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLX {
    public final Boolean LIZ;

    public C0ZLX() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZLX) && Intrinsics.LJFF(this.LIZ, ((C0ZLX) obj).LIZ);
    }

    public C0ZLX(Boolean bool) {
        this.LIZ = bool;
    }
}
