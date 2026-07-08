package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159290gH1 implements InterfaceC0148002o {
    public final Boolean LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final boolean LLILLL;
    public final Object LLILZ;
    public final C291001Au<String> LLILZIL;
    public final boolean LLILZLL;

    public C1159290gH1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159290gH1)) {
            return false;
        }
        C1159290gH1 c1159290gH1 = (C1159290gH1) obj;
        return Intrinsics.LJFF(this.LL, c1159290gH1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159290gH1.LLILLJJLI) && this.LLILLL == c1159290gH1.LLILLL && Intrinsics.LJFF(this.LLILZ, c1159290gH1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1159290gH1.LLILZIL) && this.LLILZLL == c1159290gH1.LLILZLL;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (((((bool == null ? 0 : bool.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Object obj = this.LLILZ;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C291001Au<String> c291001Au = this.LLILZIL;
        return ((iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCAddCardState(bottomButtonEnableState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", powerItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needSave=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bindErrorMessage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159290gH1(int i) {
        this(null, new ArrayList(), false, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159290gH1(Boolean bool, List<? extends InterfaceC1891350zJl> list, boolean z, Object obj, C291001Au<String> c291001Au, boolean z2) {
        this.LL = bool;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = obj;
        this.LLILZIL = c291001Au;
        this.LLILZLL = z2;
    }

    public static C1159290gH1 LIZ(C1159290gH1 c1159290gH1, Boolean bool, List list, boolean z, Object obj, C291001Au c291001Au, boolean z2, int i) {
        boolean z3 = z2;
        C291001Au c291001Au2 = c291001Au;
        Object obj2 = obj;
        boolean z4 = z;
        List list2 = list;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            bool2 = c1159290gH1.LL;
        }
        if ((i & 2) != 0) {
            list2 = c1159290gH1.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z4 = c1159290gH1.LLILLL;
        }
        if ((i & 8) != 0) {
            obj2 = c1159290gH1.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1159290gH1.LLILZIL;
        }
        if ((i & 32) != 0) {
            z3 = c1159290gH1.LLILZLL;
        }
        c1159290gH1.getClass();
        return new C1159290gH1(bool2, list2, z4, obj2, c291001Au2, z3);
    }
}
