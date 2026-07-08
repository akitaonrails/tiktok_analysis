package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423900Gjk implements InterfaceC1606880ruw {
    public final EnumC428990Grx LL;
    public final String LLILLJJLI;
    public final List<String> LLILLL;

    public C423900Gjk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423900Gjk)) {
            return false;
        }
        C423900Gjk c423900Gjk = (C423900Gjk) obj;
        return this.LL == c423900Gjk.LL && Intrinsics.LJFF(this.LLILLJJLI, c423900Gjk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c423900Gjk.LLILLL);
    }

    public final int hashCode() {
        EnumC428990Grx enumC428990Grx = this.LL;
        int iHashCode = (enumC428990Grx == null ? 0 : enumC428990Grx.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.LLILLL;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarInteractionState(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", socialAvatarUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1606880ruw
    public final String getString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(C423900Gjk.class).LJI());
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C423900Gjk(EnumC428990Grx enumC428990Grx, String str, List list, int i) {
        str = (i & 2) != 0 ? null : str;
        list = (i & 4) != 0 ? null : list;
        this.LL = enumC428990Grx;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }
}
