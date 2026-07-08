package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QOO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOO implements InterfaceC111300bX {
    public final InterfaceC669910QPl LL;
    public final InterfaceC671320QUw LLILLJJLI;
    public final C0QER LLILLL;
    public final C671330QUx LLILZ;
    public final Set<String> LLILZIL;
    public final C0Q7B LLILZLL;

    public C0QOO() {
        this(null, null, null, null, null, C0Q7B.NORMAL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QOO)) {
            return false;
        }
        C0QOO c0qoo = (C0QOO) obj;
        return Intrinsics.LJFF(this.LL, c0qoo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qoo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0qoo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0qoo.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0qoo.LLILZIL) && this.LLILZLL == c0qoo.LLILZLL;
    }

    public final int hashCode() {
        InterfaceC669910QPl interfaceC669910QPl = this.LL;
        int iHashCode = (interfaceC669910QPl == null ? 0 : interfaceC669910QPl.hashCode()) * 31;
        InterfaceC671320QUw interfaceC671320QUw = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (interfaceC671320QUw == null ? 0 : interfaceC671320QUw.hashCode())) * 31;
        C0QER c0qer = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c0qer == null ? 0 : c0qer.hashCode())) * 31;
        C671330QUx c671330QUx = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c671330QUx == null ? 0 : c671330QUx.hashCode())) * 31;
        Set<String> set = this.LLILZIL;
        return ((iHashCode4 + (set != null ? set.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkinConfig(searchResultTabIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", middleStateObservables=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchEnterParam=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skinViews=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", verticalResultTabNames=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QOO(InterfaceC669910QPl interfaceC669910QPl, InterfaceC671320QUw interfaceC671320QUw, C0QER c0qer, C671330QUx c671330QUx, Set<String> set, C0Q7B c0q7b) {
        this.LL = interfaceC669910QPl;
        this.LLILLJJLI = interfaceC671320QUw;
        this.LLILLL = c0qer;
        this.LLILZ = c671330QUx;
        this.LLILZIL = set;
        this.LLILZLL = c0q7b;
    }
}
