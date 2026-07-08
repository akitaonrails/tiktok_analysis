package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C062S implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;

    public C062S() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C062S)) {
            return false;
        }
        C062S c062s = (C062S) obj;
        return Intrinsics.LJFF(this.LL, c062s.LL) && this.LLILLJJLI == c062s.LLILLJJLI;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiShareButtonHierarchyData(enterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldShowIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C062S(String str, int i) {
        boolean z;
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(str, z);
    }

    public C062S(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
