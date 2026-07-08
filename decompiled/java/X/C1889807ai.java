package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889807ai {
    public final long LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889807ai)) {
            return false;
        }
        C1889807ai c1889807ai = (C1889807ai) obj;
        return this.LIZ == c1889807ai.LIZ && Intrinsics.LJFF(this.LIZIZ, c1889807ai.LIZIZ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        return iY2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalPendingPublishedMeta(createTimeSec=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", privateStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889807ai(long j, Integer num) {
        this.LIZ = j;
        this.LIZIZ = num;
    }
}
