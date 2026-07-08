package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0KUP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUP implements InterfaceC0148002o {
    public final C0KUR LL;
    public final C1784870wY1 LLILLJJLI;
    public final GetSubPrivilegeDetailResponse.Data LLILLL;
    public final Throwable LLILZ;
    public final boolean LLILZIL;

    public C0KUP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KUP)) {
            return false;
        }
        C0KUP c0kup = (C0KUP) obj;
        return this.LL == c0kup.LL && Intrinsics.LJFF(this.LLILLJJLI, c0kup.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0kup.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0kup.LLILZ) && this.LLILZIL == c0kup.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1784870wY1 c1784870wY1 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1784870wY1 == null ? 0 : c1784870wY1.hashCode())) * 31;
        GetSubPrivilegeDetailResponse.Data data = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Throwable th = this.LLILZ;
        return ((iHashCode3 + (th != null ? th.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioVMState(loadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cache=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", demoData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageError=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", moderatorPinCardListShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0KUP(int i) {
        this(C0KUR.BEFORE_LOAD_START, null, null, null, false);
    }

    public C0KUP(C0KUR c0kur, C1784870wY1 c1784870wY1, GetSubPrivilegeDetailResponse.Data data, Throwable th, boolean z) {
        this.LL = c0kur;
        this.LLILLJJLI = c1784870wY1;
        this.LLILLL = data;
        this.LLILZ = th;
        this.LLILZIL = z;
    }

    public static C0KUP LIZ(C0KUP c0kup, C0KUR c0kur, C1784870wY1 c1784870wY1, Throwable th, boolean z, int i) {
        GetSubPrivilegeDetailResponse.Data data;
        boolean z2 = z;
        Throwable th2 = th;
        C1784870wY1 c1784870wY12 = c1784870wY1;
        C0KUR c0kur2 = c0kur;
        if ((i & 1) != 0) {
            c0kur2 = c0kup.LL;
        }
        if ((i & 2) != 0) {
            c1784870wY12 = c0kup.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            data = c0kup.LLILLL;
        } else {
            data = null;
        }
        if ((i & 8) != 0) {
            th2 = c0kup.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c0kup.LLILZIL;
        }
        c0kup.getClass();
        return new C0KUP(c0kur2, c1784870wY12, data, th2, z2);
    }
}
