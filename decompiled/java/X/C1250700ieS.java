package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ieS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250700ieS implements InterfaceC0148002o {
    public final EnumC1250760ieY LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<EnumC1164360gPC> LLILLL;
    public final EnumC1250710ieT LLILZ;

    public C1250700ieS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250700ieS)) {
            return false;
        }
        C1250700ieS c1250700ieS = (C1250700ieS) obj;
        return this.LL == c1250700ieS.LL && Intrinsics.LJFF(this.LLILLJJLI, c1250700ieS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1250700ieS.LLILLL) && this.LLILZ == c1250700ieS.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<EnumC1164360gPC> c291001Au2 = this.LLILLL;
        return ((iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HomepageRecommendState(uiState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", triggerRefresh=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toastEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", expandReason=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1250700ieS(int i) {
        this(EnumC1250760ieY.HIDE, null, null, EnumC1250710ieT.UNINITIALIZED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1250700ieS(EnumC1250760ieY enumC1250760ieY, C291001Au<Unit> c291001Au, C291001Au<? extends EnumC1164360gPC> c291001Au2, EnumC1250710ieT enumC1250710ieT) {
        this.LL = enumC1250760ieY;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = enumC1250710ieT;
    }

    public static C1250700ieS LIZ(C1250700ieS c1250700ieS, EnumC1250760ieY enumC1250760ieY, C291001Au c291001Au, C291001Au c291001Au2, EnumC1250710ieT enumC1250710ieT, int i) {
        if ((i & 1) != 0) {
            enumC1250760ieY = c1250700ieS.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1250700ieS.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1250700ieS.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1250710ieT = c1250700ieS.LLILZ;
        }
        c1250700ieS.getClass();
        return new C1250700ieS(enumC1250760ieY, c291001Au, c291001Au2, enumC1250710ieT);
    }
}
