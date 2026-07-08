package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156980gDI extends AbstractC1156990gDJ {
    public final Integer LL;

    public C1156980gDI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156980gDI) && Intrinsics.LJFF(this.LL, ((C1156980gDI) obj).LL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TodayDayItem(day=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156980gDI(int i) {
        this.LL = null;
    }

    @Override // X.AbstractC1156990gDJ, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!C0BWX.LIZ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if ((interfaceC1891350zJl instanceof C1156980gDI) && this == interfaceC1891350zJl) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1156990gDJ, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!C0BWX.LIZ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if ((interfaceC1891350zJl instanceof C1156980gDI) && this == interfaceC1891350zJl) {
            return true;
        }
        return false;
    }
}
