package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159280gH0 implements InterfaceC0148002o {
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<C0YMW> LLILZIL;

    public C1159280gH0() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159280gH0)) {
            return false;
        }
        C1159280gH0 c1159280gH0 = (C1159280gH0) obj;
        return this.LL == c1159280gH0.LL && Intrinsics.LJFF(this.LLILLJJLI, c1159280gH0.LLILLJJLI) && this.LLILLL == c1159280gH0.LLILLL && Intrinsics.LJFF(this.LLILZ, c1159280gH0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1159280gH0.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C0YMW> c291001Au2 = this.LLILZIL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditJoinQuestionState(enableDone=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", curEditingJoinQuestion=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateSuccess=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateFailed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159280gH0(String str, int i) {
        this(false, (i & 2) != 0 ? "" : str, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159280gH0(boolean z, String str, boolean z2, C291001Au<Unit> c291001Au, C291001Au<? extends C0YMW> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
    }

    public static C1159280gH0 LIZ(C1159280gH0 c1159280gH0, boolean z, String str, boolean z2, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        boolean z3 = z2;
        String str2 = str;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c1159280gH0.LL;
        }
        if ((i & 2) != 0) {
            str2 = c1159280gH0.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c1159280gH0.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1159280gH0.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c1159280gH0.LLILZIL;
        }
        c1159280gH0.getClass();
        return new C1159280gH0(z4, str2, z3, c291001Au4, c291001Au3);
    }
}
