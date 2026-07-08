package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Snm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732160Snm implements InterfaceC0148002o {
    public final C731910SnN LL;

    public C732160Snm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C732160Snm) && Intrinsics.LJFF(this.LL, ((C732160Snm) obj).LL);
    }

    public final int hashCode() {
        C731910SnN c731910SnN = this.LL;
        if (c731910SnN == null) {
            return 0;
        }
        return c731910SnN.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoRepostState(displayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C732160Snm(C731910SnN c731910SnN) {
        this.LL = c731910SnN;
    }
}
