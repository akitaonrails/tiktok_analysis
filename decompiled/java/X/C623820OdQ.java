package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623820OdQ implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C11UN LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623820OdQ)) {
            return false;
        }
        C623820OdQ c623820OdQ = (C623820OdQ) obj;
        return Intrinsics.LJFF(this.LL, c623820OdQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c623820OdQ.LLILLJJLI) && this.LLILLL == c623820OdQ.LLILLL && this.LLILZ == c623820OdQ.LLILZ && this.LLILZIL == c623820OdQ.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchFilterCheckItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C623820OdQ c623820OdQ;
        if (interfaceC1891350zJl instanceof C623820OdQ) {
            c623820OdQ = (C623820OdQ) interfaceC1891350zJl;
        } else {
            c623820OdQ = null;
        }
        if (c623820OdQ == null || c623820OdQ.LLILZ != this.LLILZ || c623820OdQ.LLILZIL != this.LLILZIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C623820OdQ c623820OdQ;
        if (interfaceC1891350zJl instanceof C623820OdQ) {
            c623820OdQ = (C623820OdQ) interfaceC1891350zJl;
        } else {
            c623820OdQ = null;
        }
        if (c623820OdQ == null || !Intrinsics.LJFF(c623820OdQ.LLILLJJLI, this.LLILLJJLI) || !Intrinsics.LJFF(c623820OdQ.LL, this.LL) || c623820OdQ.LLILLL != this.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C623820OdQ) {
            C623820OdQ c623820OdQ = (C623820OdQ) interfaceC1891350zJl;
            boolean z2 = true;
            if (c623820OdQ.LLILZ == this.LLILZ) {
                z = true;
            } else {
                z = false;
            }
            if (c623820OdQ.LLILZIL != this.LLILZIL) {
                z2 = false;
            }
            return new C623840OdS(z, z2);
        }
        return null;
    }

    public static C623820OdQ LIZ(C623820OdQ c623820OdQ, boolean z) {
        String str = c623820OdQ.LL;
        String str2 = c623820OdQ.LLILLJJLI;
        int i = c623820OdQ.LLILLL;
        C11UN c11un = c623820OdQ.LLILZIL;
        c623820OdQ.getClass();
        return new C623820OdQ(str, str2, i, z, c11un);
    }

    public C623820OdQ(String str, String str2, int i, boolean z, C11UN c11un) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = c11un;
    }
}
