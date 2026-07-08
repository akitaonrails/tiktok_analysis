package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995660c16 implements InterfaceC0148002o {
    public final List<InterfaceC1164430gPJ> LL;

    public C995660c16() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995660c16) && Intrinsics.LJFF(this.LL, ((C995660c16) obj).LL);
    }

    public final int hashCode() {
        List<InterfaceC1164430gPJ> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeNavTopState(tabListData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C995660c16(List<? extends InterfaceC1164430gPJ> list) {
        this.LL = list;
    }
}
