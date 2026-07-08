package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H93, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H93 extends C0H94 {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H93)) {
            return false;
        }
        C0H93 c0h93 = (C0H93) obj;
        return Intrinsics.LJFF(this.LL, c0h93.LL) && this.LLILLJJLI == c0h93.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0h93.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextContentSlotItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSentBySelf=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H93) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C0H93 c0h93 = (C0H93) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLL, c0h93.LLILLL) || this.LLILLJJLI != c0h93.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0H93) {
            return Intrinsics.LJFF(this.LL, ((C0H93) interfaceC1891350zJl).LL);
        }
        return false;
    }

    public C0H93(String str, boolean z, String str2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
    }
}
