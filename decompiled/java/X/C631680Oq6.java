package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631680Oq6 implements InterfaceC1891350zJl {
    public final int LL = 2131834401;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631680Oq6)) {
            return false;
        }
        C631680Oq6 c631680Oq6 = (C631680Oq6) obj;
        return this.LL == c631680Oq6.LL && this.LLILLJJLI == c631680Oq6.LLILLJJLI && this.LLILLL == c631680Oq6.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicFanSpotlightTitleItem(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isExpand=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showExpand=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631680Oq6) {
            C631680Oq6 c631680Oq6 = (C631680Oq6) interfaceC1891350zJl;
            if (c631680Oq6.LL == this.LL && c631680Oq6.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631680Oq6) {
            if (((C631680Oq6) interfaceC1891350zJl).LL == this.LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C631680Oq6(boolean z, boolean z2) {
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
