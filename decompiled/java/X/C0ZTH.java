package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTH implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final InterfaceC1673306gt LLILZIL;
    public final C1622006Ws<Function0<Unit>> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZTH)) {
            return false;
        }
        C0ZTH c0zth = (C0ZTH) obj;
        return this.LL == c0zth.LL && this.LLILLJJLI == c0zth.LLILLJJLI && this.LLILLL == c0zth.LLILLL && this.LLILZ == c0zth.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0zth.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0zth.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31;
        this.LLILZLL.getClass();
        return iZ2;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollapseInlineData(groupId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", botPadding=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClickAction=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0ZTH) && ((C0ZTH) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    public C0ZTH(int i, boolean z, int i2, int i3, EnumC912210ZqV enumC912210ZqV, C1622006Ws c1622006Ws) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = enumC912210ZqV;
        this.LLILZLL = c1622006Ws;
    }
}
