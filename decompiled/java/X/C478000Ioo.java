package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: renamed from: X.0Ioo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478000Ioo implements InterfaceC0148002o {
    public final C291001Au<EnumC478020Ioq> LL;
    public final List<GameDrawerCategory> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478000Ioo)) {
            return false;
        }
        C478000Ioo c478000Ioo = (C478000Ioo) obj;
        return Intrinsics.LJFF(this.LL, c478000Ioo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c478000Ioo.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameDrawerCategoryVMState(refreshState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dataList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C478000Ioo(C291001Au<? extends EnumC478020Ioq> c291001Au, List<GameDrawerCategory> list) {
        this.LL = c291001Au;
        this.LLILLJJLI = list;
    }
}
