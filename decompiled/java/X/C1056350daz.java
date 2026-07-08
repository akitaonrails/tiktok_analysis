package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0daz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056350daz implements InterfaceC0148002o {
    public final C291001Au<Set<EnumC1070410dxf>> LL;
    public final AbstractC1623806Xk<Unit> LLILLJJLI;
    public final List<InterfaceC1891350zJl> LLILLL;

    public C1056350daz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056350daz)) {
            return false;
        }
        C1056350daz c1056350daz = (C1056350daz) obj;
        return Intrinsics.LJFF(this.LL, c1056350daz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1056350daz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1056350daz.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Set<EnumC1070410dxf>> c291001Au = this.LL;
        return ((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecFriendsVMState(triggerUserCardRefresh=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topChunkItems=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1056350daz(int i) {
        this(null, new C1623706Xj(), C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1056350daz(C291001Au<? extends Set<? extends EnumC1070410dxf>> c291001Au, AbstractC1623806Xk<Unit> abstractC1623806Xk, List<? extends InterfaceC1891350zJl> list) {
        this.LL = c291001Au;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = list;
    }

    public static C1056350daz LIZ(C1056350daz c1056350daz, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, List list, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1056350daz.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1056350daz.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c1056350daz.LLILLL;
        }
        c1056350daz.getClass();
        return new C1056350daz(c291001Au, abstractC1623806Xk, list);
    }
}
