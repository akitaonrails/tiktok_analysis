package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.TopliveNoticeListResponse;

/* JADX INFO: renamed from: X.0Iyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484290Iyx {
    public final C05XL<TopliveNoticeListResponse> LIZ;
    public final long LIZIZ;
    public final EnumC484320Iz0 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C484290Iyx)) {
            return false;
        }
        C484290Iyx c484290Iyx = (C484290Iyx) obj;
        return Intrinsics.LJFF(this.LIZ, c484290Iyx.LIZ) && this.LIZIZ == c484290Iyx.LIZIZ && this.LIZJ == c484290Iyx.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestEntry(deferred=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C484290Iyx(C099F c099f, long j, EnumC484320Iz0 enumC484320Iz0) {
        this.LIZ = c099f;
        this.LIZIZ = j;
        this.LIZJ = enumC484320Iz0;
    }
}
