package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0htP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221530htP implements InterfaceC111300bX {
    public final EnumC1221910hu1 LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final EnumC1221200hss LLILZ;
    public final C19EG LLILZIL;
    public final Function0<Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1221530htP)) {
            return false;
        }
        C1221530htP c1221530htP = (C1221530htP) obj;
        return this.LL == c1221530htP.LL && Intrinsics.LJFF(this.LLILLJJLI, c1221530htP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1221530htP.LLILLL) && this.LLILZ == c1221530htP.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1221530htP.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1221530htP.LLILZLL);
    }

    public final int hashCode() {
        EnumC1221910hu1 enumC1221910hu1 = this.LL;
        int iHashCode = (enumC1221910hu1 == null ? 0 : enumC1221910hu1.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C19EG c19eg = this.LLILZIL;
        return ((iHashCode3 + (c19eg != null ? c19eg.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseAvatarAssemHierarchyData(entrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", actionButtonState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onBackButtonPressed=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1221530htP(EnumC1221910hu1 enumC1221910hu1, String str, String str2, EnumC1221200hss enumC1221200hss, C19EG c19eg, AwS563S0100000_19 awS563S0100000_19) {
        this.LL = enumC1221910hu1;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = enumC1221200hss;
        this.LLILZIL = c19eg;
        this.LLILZLL = awS563S0100000_19;
    }
}
