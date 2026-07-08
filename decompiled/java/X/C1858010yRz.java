package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858010yRz extends C1857080yQU implements InterfaceC1891350zJl {
    public final C326960Crm LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1858010yRz) && Intrinsics.LJFF(this.LLILLL, ((C1858010yRz) obj).LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugListItem(sug=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1858010yRz(C326960Crm c326960Crm) {
        super(c326960Crm);
        this.LLILLL = c326960Crm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858010yRz) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLILLJJLI.sugList, ((C1857080yQU) interfaceC1891350zJl).LLILLJJLI.sugList)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858010yRz) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857080yQU) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
