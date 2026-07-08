package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0by1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993750by1 implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;

    public C993750by1() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C993750by1)) {
            return false;
        }
        C993750by1 c993750by1 = (C993750by1) obj;
        return this.LL == c993750by1.LL && Intrinsics.LJFF(this.LLILLJJLI, c993750by1.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationTitle(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
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

    public C993750by1(int i, int i2) {
        String str;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 2) != 0) {
            str = "";
        } else {
            str = null;
        }
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
