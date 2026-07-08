package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933680aP8 implements InterfaceC0148002o {
    public C933460aOm LL;
    public C933690aP9 LLILLJJLI;
    public final C933610aP1 LLILLL;

    public C933680aP8() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C933680aP8)) {
            return false;
        }
        C933680aP8 c933680aP8 = (C933680aP8) obj;
        return Intrinsics.LJFF(this.LL, c933680aP8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c933680aP8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c933680aP8.LLILLL);
    }

    public final int hashCode() {
        C933460aOm c933460aOm = this.LL;
        int iHashCode = (c933460aOm == null ? 0 : c933460aOm.hashCode()) * 31;
        C933690aP9 c933690aP9 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c933690aP9 == null ? 0 : c933690aP9.hashCode())) * 31;
        C933610aP1 c933610aP1 = this.LLILLL;
        return iHashCode2 + (c933610aP1 != null ? c933610aP1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuidenceData(info=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hideInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C933680aP8(C933460aOm c933460aOm, C933690aP9 c933690aP9, C933610aP1 c933610aP1) {
        this.LL = c933460aOm;
        this.LLILLJJLI = c933690aP9;
        this.LLILLL = c933610aP1;
    }

    public static C933680aP8 LIZ(C933680aP8 c933680aP8, C933460aOm c933460aOm, C933690aP9 c933690aP9, C933610aP1 c933610aP1, int i) {
        if ((i & 1) != 0) {
            c933460aOm = c933680aP8.LL;
        }
        if ((i & 2) != 0) {
            c933690aP9 = c933680aP8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c933610aP1 = c933680aP8.LLILLL;
        }
        c933680aP8.getClass();
        return new C933680aP8(c933460aOm, c933690aP9, c933610aP1);
    }
}
