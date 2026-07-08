package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888970Yu7 implements InterfaceC1891350zJl {
    public final EnumC888990Yu9 LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C888970Yu7)) {
            return false;
        }
        C888970Yu7 c888970Yu7 = (C888970Yu7) obj;
        return this.LL == c888970Yu7.LL && Intrinsics.LJFF(this.LLILLJJLI, c888970Yu7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c888970Yu7.LLILLL) && this.LLILZ == c888970Yu7.LLILZ && this.LLILZIL == c888970Yu7.LLILZIL && this.LLILZLL == c888970Yu7.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchiveSettingPageItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", switchOn=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTopOfAChunk=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isBottomOfAChunk=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C888970Yu7 c888970Yu7;
        EnumC888990Yu9 enumC888990Yu9 = null;
        if ((interfaceC1891350zJl instanceof C888970Yu7) && (c888970Yu7 = (C888970Yu7) interfaceC1891350zJl) != null) {
            enumC888990Yu9 = c888970Yu7.LL;
        }
        if (enumC888990Yu9 == this.LL) {
            return true;
        }
        return false;
    }

    public C888970Yu7(EnumC888990Yu9 enumC888990Yu9, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.LL = enumC888990Yu9;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }

    public /* synthetic */ C888970Yu7(EnumC888990Yu9 enumC888990Yu9, String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        this(enumC888990Yu9, str, str2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }
}
