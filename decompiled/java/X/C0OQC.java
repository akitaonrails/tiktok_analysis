package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OQC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQC implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public transient String LLILZIL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OQC)) {
            return false;
        }
        C0OQC c0oqc = (C0OQC) obj;
        return Intrinsics.LJFF(this.LL, c0oqc.LL) && this.LLILLJJLI == c0oqc.LLILLJJLI && this.LLILLL == c0oqc.LLILLL && this.LLILZ == c0oqc.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentEntryItem(itemId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasComment=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enableComment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0OQC) {
            C0OQC c0oqc = (C0OQC) interfaceC1891350zJl;
            if (c0oqc.LLILLJJLI == this.LLILLJJLI && c0oqc.LLILLL == this.LLILLL && c0oqc.LLILZ == this.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0OQC) && Intrinsics.LJFF(((C0OQC) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        if (interfaceC1891350zJl instanceof C0OQC) {
            C0OQC c0oqc = (C0OQC) interfaceC1891350zJl;
            boolean z3 = true;
            if (c0oqc.LLILLJJLI != this.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            if (c0oqc.LLILLL != this.LLILLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c0oqc.LLILZ == this.LLILZ) {
                z3 = false;
            }
            return new C1867407Tc(z, z2, z3);
        }
        return null;
    }

    public C0OQC(String str, int i, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
