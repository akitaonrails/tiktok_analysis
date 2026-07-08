package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169650gXj implements InterfaceC0148002o {
    public final EnumC1169660gXk LL;
    public final C291001Au<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169650gXj)) {
            return false;
        }
        C1169650gXj c1169650gXj = (C1169650gXj) obj;
        return this.LL == c1169650gXj.LL && Intrinsics.LJFF(this.LLILLJJLI, c1169650gXj.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarAndNicknamePopupState(page=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", close=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1169650gXj(EnumC1169660gXk enumC1169660gXk, C291001Au<Unit> c291001Au) {
        this.LL = enumC1169660gXk;
        this.LLILLJJLI = c291001Au;
    }
}
