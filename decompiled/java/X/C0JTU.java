package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JTU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTU implements InterfaceC111300bX {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JTU)) {
            return false;
        }
        C0JTU c0jtu = (C0JTU) obj;
        return this.LL == c0jtu.LL && Intrinsics.LJFF(this.LLILLJJLI, c0jtu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jtu.LLILLL);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubWaveEmoteHierarchyData(uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", seUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JTU(long j, String str, String str2) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
