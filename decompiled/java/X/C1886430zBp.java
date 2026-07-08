package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886430zBp implements InterfaceC0148002o {
    public final List<C1887220zD6> LL;
    public final boolean LLILLJJLI;
    public final EnumC1886450zBr LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C1886430zBp() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1886430zBp)) {
            return false;
        }
        C1886430zBp c1886430zBp = (C1886430zBp) obj;
        return Intrinsics.LJFF(this.LL, c1886430zBp.LL) && this.LLILLJJLI == c1886430zBp.LLILLJJLI && this.LLILLL == c1886430zBp.LLILLL && Intrinsics.LJFF(this.LLILZ, c1886430zBp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1886430zBp.LLILZIL);
    }

    public final int hashCode() {
        List<C1887220zD6> list = this.LL;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PasskeyManagementState(passkeyItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasPassword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", passkeyToDelete=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", passkeyToDeleteName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1886430zBp(boolean z, int i) {
        EnumC1886450zBr enumC1886450zBr;
        boolean z2 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            enumC1886450zBr = EnumC1886450zBr.PAGE_LOADED;
        } else {
            enumC1886450zBr = null;
        }
        this(null, z2, enumC1886450zBr, null, null);
    }

    public C1886430zBp(List<C1887220zD6> list, boolean z, EnumC1886450zBr enumC1886450zBr, String str, String str2) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1886450zBr;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    public static C1886430zBp LIZ(C1886430zBp c1886430zBp, List list, EnumC1886450zBr enumC1886450zBr, String str, String str2, int i) {
        boolean z;
        String str3 = str2;
        String str4 = str;
        EnumC1886450zBr enumC1886450zBr2 = enumC1886450zBr;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1886430zBp.LL;
        }
        if ((i & 2) != 0) {
            z = c1886430zBp.LLILLJJLI;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            enumC1886450zBr2 = c1886430zBp.LLILLL;
        }
        if ((i & 8) != 0) {
            str4 = c1886430zBp.LLILZ;
        }
        if ((i & 16) != 0) {
            str3 = c1886430zBp.LLILZIL;
        }
        c1886430zBp.getClass();
        return new C1886430zBp(list2, z, enumC1886450zBr2, str4, str3);
    }
}
