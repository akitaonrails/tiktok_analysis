package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218000hni implements InterfaceC1891350zJl {
    public final C1218180ho0 LL;
    public final EnumC1217960hne LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218000hni)) {
            return false;
        }
        C1218000hni c1218000hni = (C1218000hni) obj;
        return Intrinsics.LJFF(this.LL, c1218000hni.LL) && this.LLILLJJLI == c1218000hni.LLILLJJLI && this.LLILLL == c1218000hni.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuditRequestItem(info=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1218000hni)) {
            return false;
        }
        C1218000hni c1218000hni = (C1218000hni) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1218000hni.LL) || this.LLILLJJLI != c1218000hni.LLILLJJLI || this.LLILLL != c1218000hni.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1218000hni)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.LIZIZ, ((C1218000hni) interfaceC1891350zJl).LL.LIZIZ);
    }

    public C1218000hni(C1218180ho0 c1218180ho0, EnumC1217960hne enumC1217960hne, boolean z) {
        this.LL = c1218180ho0;
        this.LLILLJJLI = enumC1217960hne;
        this.LLILLL = z;
    }

    public static C1218000hni LIZ(C1218000hni c1218000hni, EnumC1217960hne enumC1217960hne, boolean z, int i) {
        C1218180ho0 c1218180ho0;
        if ((i & 1) != 0) {
            c1218180ho0 = c1218000hni.LL;
        } else {
            c1218180ho0 = null;
        }
        if ((i & 2) != 0) {
            enumC1217960hne = c1218000hni.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1218000hni.LLILLL;
        }
        c1218000hni.getClass();
        return new C1218000hni(c1218180ho0, enumC1217960hne, z);
    }
}
