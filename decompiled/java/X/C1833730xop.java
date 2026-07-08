package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833730xop implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final List<C1834580xqC> LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833730xop)) {
            return false;
        }
        C1833730xop c1833730xop = (C1833730xop) obj;
        return Intrinsics.LJFF(this.LL, c1833730xop.LL) && this.LLILLJJLI == c1833730xop.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1833730xop.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1833730xop.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHighlightPagerItem(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emptyText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LLILLL.size();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1833730xop c1833730xop;
        List<C1834580xqC> list;
        if (interfaceC1891350zJl instanceof C1833730xop) {
            c1833730xop = (C1833730xop) interfaceC1891350zJl;
        } else {
            c1833730xop = null;
        }
        if (c1833730xop == null || (list = c1833730xop.LLILLL) == null || this.LLILLL.size() != list.size()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1833730xop c1833730xop;
        if (interfaceC1891350zJl instanceof C1833730xop) {
            c1833730xop = (C1833730xop) interfaceC1891350zJl;
        } else {
            c1833730xop = null;
        }
        if (c1833730xop == null || this.LLILLJJLI != c1833730xop.LLILLJJLI) {
            return false;
        }
        return true;
    }

    public C1833730xop(String str, int i, List<C1834580xqC> list, String str2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = str2;
    }

    public static C1833730xop LIZ(C1833730xop c1833730xop, String str, List list, int i) {
        int i2;
        String str2;
        if ((i & 1) != 0) {
            str = c1833730xop.LL;
        }
        if ((i & 2) != 0) {
            i2 = c1833730xop.LLILLJJLI;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            list = c1833730xop.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c1833730xop.LLILZ;
        } else {
            str2 = null;
        }
        return new C1833730xop(str, i2, list, str2);
    }
}
