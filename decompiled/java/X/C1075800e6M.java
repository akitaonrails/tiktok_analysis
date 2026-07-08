package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075800e6M {
    public static final /* synthetic */ int LJI = 0;
    public final AbstractC1623806Xk<C626160OhC> LIZ;
    public final AbstractC1623806Xk<C626160OhC> LIZIZ;
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LIZJ;
    public final int LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    public C1075800e6M() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075800e6M)) {
            return false;
        }
        C1075800e6M c1075800e6M = (C1075800e6M) obj;
        return Intrinsics.LJFF(this.LIZ, c1075800e6M.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1075800e6M.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1075800e6M.LIZJ);
    }

    public final boolean LIZ() {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = this.LIZIZ;
        if (abstractC1623806Xk instanceof C491101vh) {
            C626160OhC c626160OhCLIZ = this.LIZ.LIZ();
            return c626160OhCLIZ != null && c626160OhCLIZ.LIZIZ;
        }
        C626160OhC c626160OhCLIZ2 = abstractC1623806Xk.LIZ();
        if (c626160OhCLIZ2 != null && c626160OhCLIZ2.LIZIZ) {
            return true;
        }
        if (C0BV8.LIZ()) {
            return (C0BV7.LIZIZ() == 2 || C0BV7.LIZIZ() == 3) && (this.LIZIZ instanceof C1623706Xj);
        }
        return false;
    }

    public final int LIZIZ() {
        return ((Number) this.LJ.getValue()).intValue();
    }

    public final boolean LIZJ() {
        List<InterfaceC1891350zJl> listLIZ;
        if (!(this.LIZ instanceof C1623606Xi)) {
            return true;
        }
        AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk = this.LIZJ;
        if ((abstractC1623806Xk instanceof C491101vh) || (listLIZ = abstractC1623806Xk.LIZ()) == null) {
            return true;
        }
        return listLIZ.isEmpty();
    }

    public final boolean LJ() {
        return !(this.LIZJ instanceof C491101vh);
    }

    public final boolean LIZLLL() {
        return LIZIZ() == 0;
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCardState(refreshState=");
        sbLIZ.append(LJFF(this.LIZ));
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(LJFF(this.LIZIZ));
        sbLIZ.append(", data=");
        AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk = this.LIZJ;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Success(size:");
            sbLIZ2.append(((List) ((C1623606Xi) abstractC1623806Xk).LIZ).size());
            sbLIZ2.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (abstractC1623806Xk instanceof C491001vg) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Fail(");
            sbLIZ3.append(((C491001vg) abstractC1623806Xk).LIZ.getMessage());
            sbLIZ3.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (abstractC1623806Xk instanceof C1623706Xj) {
            strLIZIZ = "Loading";
        } else {
            if (!Intrinsics.LJFF(abstractC1623806Xk, C491101vh.LIZ)) {
                throw new C1954807lC();
            }
            strLIZIZ = "Uninitialized";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJFF(AbstractC1623806Xk abstractC1623806Xk) {
        if (abstractC1623806Xk instanceof C1623606Xi) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Success(next:");
            sbLIZ.append(((C626160OhC) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (abstractC1623806Xk instanceof C491001vg) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Fail(");
            sbLIZ2.append(((C491001vg) abstractC1623806Xk).LIZ.getMessage());
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (abstractC1623806Xk instanceof C1623706Xj) {
            return "Loading";
        }
        if (Intrinsics.LJFF(abstractC1623806Xk, C491101vh.LIZ)) {
            return "Uninitialized";
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1075800e6M(C1623606Xi c1623606Xi, int i) {
        C491101vh c491101vh;
        if ((i & 1) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        this(c491101vh, (i & 2) != 0 ? C491101vh.LIZ : null, (i & 4) != 0 ? C491101vh.LIZ : c1623606Xi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1075800e6M(AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk3) {
        int size;
        this.LIZ = abstractC1623806Xk;
        this.LIZIZ = abstractC1623806Xk2;
        this.LIZJ = abstractC1623806Xk3;
        List list = (List) abstractC1623806Xk3.LIZ();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        this.LIZLLL = size;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJ = C452501pT.LIZ(enumC452301pR, new C1075790e6L(this));
        this.LJFF = C452501pT.LIZ(enumC452301pR, new C1075810e6N(this));
    }
}
