package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690900R8e implements InterfaceC0148002o {
    public final C291001Au<C1361350lWv> LL;

    public C690900R8e() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C690900R8e) && Intrinsics.LJFF(this.LL, ((C690900R8e) obj).LL);
    }

    public final int hashCode() {
        C291001Au<C1361350lWv> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3RepostEntranceState(entranceInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C690900R8e(C291001Au<C1361350lWv> c291001Au) {
        this.LL = c291001Au;
    }
}
