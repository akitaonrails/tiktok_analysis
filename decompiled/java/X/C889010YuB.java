package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889010YuB implements InterfaceC0148002o {
    public final List<C888970Yu7> LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C889010YuB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889010YuB)) {
            return false;
        }
        C889010YuB c889010YuB = (C889010YuB) obj;
        return Intrinsics.LJFF(this.LL, c889010YuB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889010YuB.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchiveSettingPageState(settingItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorToastEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C889010YuB(int i) {
        this(null, C13BV.INSTANCE);
    }

    public C889010YuB(C291001Au c291001Au, List list) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
    }
}
