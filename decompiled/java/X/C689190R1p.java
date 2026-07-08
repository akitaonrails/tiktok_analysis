package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689190R1p {
    public final Integer LIZ;

    public C689190R1p() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C689190R1p) && Intrinsics.LJFF(this.LIZ, ((C689190R1p) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public C689190R1p(Integer num) {
        this.LIZ = num;
    }
}
