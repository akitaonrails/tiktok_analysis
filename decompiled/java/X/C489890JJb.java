package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489890JJb implements InterfaceC0148002o {
    public final EnumC489910JJd LL;
    public final Object LLILLJJLI;

    public C489890JJb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C489890JJb)) {
            return false;
        }
        C489890JJb c489890JJb = (C489890JJb) obj;
        return this.LL == c489890JJb.LL && Intrinsics.LJFF(this.LLILLJJLI, c489890JJb.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Object obj = this.LLILLJJLI;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CalendlyMeetingDmVMState(loadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C489890JJb(int i) {
        this(EnumC489910JJd.IS_LOADING, null);
    }

    public C489890JJb(EnumC489910JJd enumC489910JJd, Object obj) {
        this.LL = enumC489910JJd;
        this.LLILLJJLI = obj;
    }
}
