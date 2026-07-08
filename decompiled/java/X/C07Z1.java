package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z1 implements InterfaceC1891350zJl {
    public final EnumC1981507pV LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z1)) {
            return false;
        }
        C07Z1 c07z1 = (C07Z1) obj;
        return this.LL == c07z1.LL && this.LLILLJJLI == c07z1.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatePostPowerItemFor3Columns(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", postCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C07Z1(EnumC1981507pV enumC1981507pV, int i) {
        this.LL = enumC1981507pV;
        this.LLILLJJLI = i;
    }
}
