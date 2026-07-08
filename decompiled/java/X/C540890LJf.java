package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540890LJf implements InterfaceC1891350zJl {
    public final String LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public final C05YD<AbstractC540910LJh> LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C540890LJf)) {
            return false;
        }
        C540890LJf c540890LJf = (C540890LJf) obj;
        return Intrinsics.LJFF(this.LL, c540890LJf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c540890LJf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c540890LJf.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Function1<Integer, Unit> function1 = this.LLILLJJLI;
        return ((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaygroundTopTabItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", setPageSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C540890LJf c540890LJf;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C540890LJf) && (c540890LJf = (C540890LJf) interfaceC1891350zJl) != null) {
            str2 = c540890LJf.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C540890LJf(String str, Function1<? super Integer, Unit> function1, C05YD<? extends AbstractC540910LJh> c05yd) {
        this.LL = str;
        this.LLILLJJLI = function1;
        this.LLILLL = c05yd;
    }
}
