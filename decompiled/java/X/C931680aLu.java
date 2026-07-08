package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931680aLu implements InterfaceC0148002o {
    public final C0184003y LL;
    public final C00YI LLILLJJLI;

    public C931680aLu() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C931680aLu)) {
            return false;
        }
        C931680aLu c931680aLu = (C931680aLu) obj;
        return Intrinsics.LJFF(this.LL, c931680aLu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c931680aLu.LLILLJJLI);
    }

    public final int hashCode() {
        C0184003y c0184003y = this.LL;
        int iHashCode = (c0184003y == null ? 0 : c0184003y.hashCode()) * 31;
        C00YI c00yi = this.LLILLJJLI;
        return iHashCode + (c00yi != null ? c00yi.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestInviteInfo(applyPanelInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", guestInviteGuideExtra=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C931680aLu(C0184003y c0184003y, C00YI c00yi) {
        this.LL = c0184003y;
        this.LLILLJJLI = c00yi;
    }

    public static C931680aLu LIZ(C931680aLu c931680aLu, C0184003y c0184003y, C00YI c00yi, int i) {
        if ((i & 1) != 0) {
            c0184003y = c931680aLu.LL;
        }
        if ((i & 2) != 0) {
            c00yi = c931680aLu.LLILLJJLI;
        }
        c931680aLu.getClass();
        return new C931680aLu(c0184003y, c00yi);
    }
}
