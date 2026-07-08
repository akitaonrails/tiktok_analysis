package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899290ZPr implements InterfaceC0148002o {
    public final EnumC899300ZPs LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899290ZPr)) {
            return false;
        }
        C899290ZPr c899290ZPr = (C899290ZPr) obj;
        return this.LL == c899290ZPr.LL && Intrinsics.LJFF(this.LLILLJJLI, c899290ZPr.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewModeState(previewState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupCreationAction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899290ZPr(EnumC899300ZPs enumC899300ZPs, C291001Au<Boolean> c291001Au) {
        this.LL = enumC899300ZPs;
        this.LLILLJJLI = c291001Au;
    }

    public static C899290ZPr LIZ(C899290ZPr c899290ZPr, EnumC899300ZPs enumC899300ZPs, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            enumC899300ZPs = c899290ZPr.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c899290ZPr.LLILLJJLI;
        }
        c899290ZPr.getClass();
        return new C899290ZPr(enumC899300ZPs, c291001Au);
    }
}
