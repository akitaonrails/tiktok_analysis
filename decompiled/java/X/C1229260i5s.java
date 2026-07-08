package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0i5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229260i5s {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC1228830i5B LIZLLL;
    public final InterfaceC1631620sYq<C0Y8T, Function0<Unit>, GroupPreviewDisplayMeta, Unit> LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;

    public C1229260i5s(C1228780i56 c1228780i56, GroupListViewModel groupListViewModel) {
        boolean z;
        boolean z2;
        InterfaceC1631620sYq<C0Y8T, Function0<Unit>, GroupPreviewDisplayMeta, Unit> interfaceC1631620sYq;
        C1228470i4b c1228470i4b;
        C1228810i59 c1228810i59;
        C1228470i4b c1228470i4b2;
        C1228810i59 c1228810i592;
        C1228470i4b c1228470i4b3;
        C1228810i59 c1228810i593;
        EnumC1228830i5B enumC1228830i5B;
        C1228470i4b c1228470i4b4;
        C1228810i59 c1228810i594;
        C1229270i5t c1229270i5t = (c1228780i56 == null || (c1228470i4b4 = c1228780i56.LL) == null || (c1228810i594 = c1228470i4b4.LIZIZ) == null || (c1229270i5t = c1228810i594.LJIJJLI) == null) ? new C1229270i5t(0, false, null, null, null, null, 0, null, 1023) : c1229270i5t;
        boolean z3 = false;
        if (c1229270i5t.LIZIZ && groupListViewModel.zQ2()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        if (c1229270i5t.LIZJ && groupListViewModel.zQ2()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZIZ = z2;
        this.LIZJ = c1229270i5t.LIZLLL && groupListViewModel.zQ2();
        this.LIZLLL = (c1228780i56 == null || (c1228470i4b3 = c1228780i56.LL) == null || (c1228810i593 = c1228470i4b3.LIZIZ) == null || (enumC1228830i5B = c1228810i593.LJIIIIZZ) == null) ? EnumC1228830i5B.DEFAULT : enumC1228830i5B;
        if (c1228780i56 != null && (c1228470i4b2 = c1228780i56.LL) != null && (c1228810i592 = c1228470i4b2.LIZIZ) != null) {
            interfaceC1631620sYq = c1228810i592.LJIJ;
        } else {
            interfaceC1631620sYq = null;
        }
        this.LJ = interfaceC1631620sYq;
        if (c1228780i56 != null && (c1228470i4b = c1228780i56.LL) != null && (c1228810i59 = c1228470i4b.LIZIZ) != null) {
            z3 = c1228810i59.LJIJI;
        }
        this.LJFF = z3;
        this.LJI = c1229270i5t.LJII;
        String strLJIIJ = c1229270i5t.LJFF;
        if (strLJIIJ == null) {
            if (groupListViewModel.zQ2()) {
                strLJIIJ = C1383370m6R.LJIIJ(2131831856);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(2131831864);
            }
        }
        this.LJII = strLJIIJ;
        this.LJIIIIZZ = c1229270i5t.LJI;
    }
}
