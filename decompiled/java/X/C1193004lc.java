package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1193004lc implements InterfaceC1193104ld {
    public final Object LL;
    public final Object LLILLJJLI;
    public final Map<String, String> LLILLL = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193004lc)) {
            return false;
        }
        C1193004lc c1193004lc = (C1193004lc) obj;
        return Intrinsics.LJFF(this.LL, c1193004lc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1193004lc.LLILLJJLI);
    }

    public final int hashCode() {
        Object obj = this.LL;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.LLILLJJLI;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckOrderResult(pollingResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imMessage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1193104ld
    public final Map<String, String> getLogMap() {
        return this.LLILLL;
    }

    public C1193004lc(Object obj, Object obj2) {
        this.LL = obj;
        this.LLILLJJLI = obj2;
    }
}
