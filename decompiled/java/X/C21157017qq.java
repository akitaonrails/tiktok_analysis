package X;

import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.17qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21157017qq {
    public final C1771760wCs LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final List<C1775130wIJ> LIZLLL;
    public C21155517qb LJ;

    public C21157017qq(C1771760wCs c1771760wCs, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.LIZ = c1771760wCs;
        this.LIZIZ = frameLayout;
        this.LIZJ = frameLayout2;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        C1775130wIJ c1775130wIJLIZ = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallPopupTaskSubmit", new AwS681S0100000_32(this, 33));
        if (c1775130wIJLIZ != null) {
            arrayList.add(c1775130wIJLIZ);
        }
        C1775130wIJ c1775130wIJLIZ2 = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallPopupTaskDismiss", new AwS681S0100000_32(this, 34));
        if (c1775130wIJLIZ2 != null) {
            arrayList.add(c1775130wIJLIZ2);
        }
        C1775130wIJ c1775130wIJLIZ3 = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallPopupTaskRelease", new AwS681S0100000_32(this, 35));
        if (c1775130wIJLIZ3 != null) {
            arrayList.add(c1775130wIJLIZ3);
        }
    }

    public static void LIZ(C21157017qq c21157017qq, InterfaceC21154317qP interfaceC21154317qP, boolean z, Pair pair, C21156517ql c21156517ql, int i) {
        C21156517ql c21156517ql2 = c21156517ql;
        if ((i & 16) != 0) {
            c21156517ql2 = null;
        }
        C21155517qb c21155517qb = c21157017qq.LJ;
        if (c21155517qb != null) {
            c21155517qb.LIZIZ(false, interfaceC21154317qP, z, pair, c21156517ql2);
        }
    }
}
