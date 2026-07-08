package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440930HQt implements InterfaceC1891350zJl {
    public final EnumC441640HTm LL;
    public final EnumC440380HOq LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440930HQt)) {
            return false;
        }
        C440930HQt c440930HQt = (C440930HQt) obj;
        return this.LL == c440930HQt.LL && this.LLILLJJLI == c440930HQt.LLILLJJLI && this.LLILLL == c440930HQt.LLILLL;
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
        sbLIZ.append("LastItem(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isNewUser=");
        sbLIZ.append(this.LLILLL);
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

    public C440930HQt(EnumC441640HTm enumC441640HTm, EnumC440380HOq enumC440380HOq, boolean z) {
        this.LL = enumC441640HTm;
        this.LLILLJJLI = enumC440380HOq;
        this.LLILLL = z;
    }
}
