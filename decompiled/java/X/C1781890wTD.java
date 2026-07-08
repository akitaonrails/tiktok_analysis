package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781890wTD extends AbstractC1781930wTH implements InterfaceC1785270wYf, InterfaceC1781940wTI {
    public final long LL;
    public final String LLILLJJLI;
    public List<C1781880wTC> LLILLL;
    public final int LLILZ;
    public final EnumC1785280wYg LLILZIL = EnumC1785280wYg.COURSE;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781890wTD)) {
            return false;
        }
        C1781890wTD c1781890wTD = (C1781890wTD) obj;
        return this.LL == c1781890wTD.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781890wTD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781890wTD.LLILLL) && this.LLILZ == c1781890wTD.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CourseSection(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sectionTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", courses=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", submitButtonRes=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1781940wTI
    public final InterfaceC1785270wYf LIZIZ() {
        return (InterfaceC1785270wYf) C13LP.LJJJJZI(this.LLILLL);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLILZ);
    }

    @Override // X.InterfaceC1781940wTI
    public final InterfaceC1785270wYf[] getItems() {
        return C1781920wTG.LIZ(this);
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1781940wTI
    public final void LJI(InterfaceC1785270wYf[] interfaceC1785270wYfArr) {
        C1781920wTG.LIZIZ(this, interfaceC1785270wYfArr);
    }

    public C1781890wTD(int i, long j, String str, List list) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = i;
    }
}
