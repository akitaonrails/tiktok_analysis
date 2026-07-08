package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818490xQF extends AbstractC1818500xQG {
    public final int LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1818490xQF)) {
            return false;
        }
        C1818490xQF c1818490xQF = (C1818490xQF) obj;
        return this.LL == c1818490xQF.LL && this.LLILLJJLI == c1818490xQF.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryLayoutTypeCellData(mode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818490xQF) {
            C1818490xQF c1818490xQF = (C1818490xQF) interfaceC1891350zJl;
            int i = c1818490xQF.LL;
            int i2 = this.LL;
            if (i == i2 && i == 0) {
                return true;
            }
            if (c1818490xQF.LLILLJJLI == this.LLILLJJLI && i == i2) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818490xQF) {
            if (((C1818490xQF) interfaceC1891350zJl).LL == this.LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1818490xQF) {
            if (((C1818490xQF) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            return new C1818510xQH(z);
        }
        return null;
    }

    public C1818490xQF(int i, boolean z) {
        this.LL = i;
        this.LLILLJJLI = z;
    }
}
