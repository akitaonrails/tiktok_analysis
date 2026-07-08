package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556630qbt implements InterfaceC0148002o {
    public final EnumC1236410iHP LL;
    public final C1556000qas LLILLJJLI;
    public final boolean LLILLL;

    public C1556630qbt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556630qbt)) {
            return false;
        }
        C1556630qbt c1556630qbt = (C1556630qbt) obj;
        return this.LL == c1556630qbt.LL && Intrinsics.LJFF(this.LLILLJJLI, c1556630qbt.LLILLJJLI) && this.LLILLL == c1556630qbt.LLILLL;
    }

    public final int hashCode() {
        EnumC1236410iHP enumC1236410iHP = this.LL;
        int iHashCode = (enumC1236410iHP == null ? 0 : enumC1236410iHP.hashCode()) * 31;
        C1556000qas c1556000qas = this.LLILLJJLI;
        return ((iHashCode + (c1556000qas != null ? c1556000qas.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressMapDetailState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mapLocationVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isReturnFromAssociate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556630qbt(int i) {
        this(null, null, false);
    }

    public C1556630qbt(EnumC1236410iHP enumC1236410iHP, C1556000qas c1556000qas, boolean z) {
        this.LL = enumC1236410iHP;
        this.LLILLJJLI = c1556000qas;
        this.LLILLL = z;
    }

    public static C1556630qbt LIZ(C1556630qbt c1556630qbt, EnumC1236410iHP enumC1236410iHP, C1556000qas c1556000qas, int i) {
        boolean z;
        if ((i & 1) != 0) {
            enumC1236410iHP = c1556630qbt.LL;
        }
        if ((i & 2) != 0) {
            c1556000qas = c1556630qbt.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1556630qbt.LLILLL;
        } else {
            z = false;
        }
        c1556630qbt.getClass();
        return new C1556630qbt(enumC1236410iHP, c1556000qas, z);
    }
}
