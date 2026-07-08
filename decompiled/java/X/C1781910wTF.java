package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781910wTF extends AbstractC1781930wTH implements InterfaceC1785270wYf, InterfaceC1781940wTI {
    public final long LL;
    public final String LLILLJJLI;
    public List<C1781730wSx> LLILLL;
    public final EnumC1785280wYg LLILZ = EnumC1785280wYg.FORM;
    public final int LLILZIL = 2131855872;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781910wTF)) {
            return false;
        }
        C1781910wTF c1781910wTF = (C1781910wTF) obj;
        return this.LL == c1781910wTF.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781910wTF.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781910wTF.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FormSection(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sectionTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forms=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1781940wTI
    public final InterfaceC1785270wYf LIZIZ() {
        return (InterfaceC1785270wYf) C13LP.LJJJJZI(this.LLILLL);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLILZIL);
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
        return this.LLILZ;
    }

    @Override // X.InterfaceC1781940wTI
    public final void LJI(InterfaceC1785270wYf[] interfaceC1785270wYfArr) {
        C1781920wTG.LIZIZ(this, interfaceC1785270wYfArr);
    }

    public C1781910wTF(long j, String str, List<C1781730wSx> list) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }
}
