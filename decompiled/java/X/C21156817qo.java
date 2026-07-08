package X;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.17qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21156817qo {
    public static final /* synthetic */ int LJI = 0;
    public final C1771760wCs LIZ;
    public final C19EG LIZIZ;
    public final FrameLayout LIZJ;
    public final View LIZLLL;
    public final List<C1775130wIJ> LJ;
    public C21155417qa LJFF;

    public C21156817qo(C1771760wCs c1771760wCs, C19EG c19eg, FrameLayout frameLayout, C1773630wFt c1773630wFt) {
        this.LIZ = c1771760wCs;
        this.LIZIZ = c19eg;
        this.LIZJ = frameLayout;
        this.LIZLLL = c1773630wFt;
        ArrayList arrayList = new ArrayList();
        this.LJ = arrayList;
        C1775130wIJ c1775130wIJLIZ = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallBubbleSubmit", new AwS681S0100000_32(this, 26));
        if (c1775130wIJLIZ != null) {
            arrayList.add(c1775130wIJLIZ);
        }
        C1775130wIJ c1775130wIJLIZ2 = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallBubbleDismiss", new AwS681S0100000_32(this, 27));
        if (c1775130wIJLIZ2 != null) {
            arrayList.add(c1775130wIJLIZ2);
        }
        C1775130wIJ c1775130wIJLIZ3 = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallBubbleRelease", new AwS681S0100000_32(this, 28));
        if (c1775130wIJLIZ3 != null) {
            arrayList.add(c1775130wIJLIZ3);
        }
        C1775130wIJ c1775130wIJLIZ4 = C0NOE.LIZ(c1771760wCs.LIZ, "ecMixMallBubbleSetVisibility", new AwS681S0100000_32(this, 29));
        if (c1775130wIJLIZ4 != null) {
            arrayList.add(c1775130wIJLIZ4);
        }
    }

    public static void LIZ(C21156817qo c21156817qo, int i, boolean z, boolean z2, Pair pair, C21156717qn c21156717qn, int i2) {
        C21156717qn c21156717qn2 = c21156717qn;
        if ((i2 & 32) != 0) {
            c21156717qn2 = null;
        }
        C21155417qa c21155417qa = c21156817qo.LJFF;
        if (c21155417qa != null) {
            c21155417qa.LIZ(false, i, z, z2, pair, c21156717qn2);
        }
    }

    public static void LIZIZ(C21156817qo c21156817qo, InterfaceC21155017qW interfaceC21155017qW, int i, boolean z, boolean z2, Pair pair, InterfaceC21154617qS interfaceC21154617qS, int i2) {
        InterfaceC21154617qS interfaceC21154617qS2 = interfaceC21154617qS;
        if ((i2 & 64) != 0) {
            interfaceC21154617qS2 = null;
        }
        C21155417qa c21155417qa = c21156817qo.LJFF;
        if (c21155417qa != null) {
            c21155417qa.LIZIZ(false, interfaceC21155017qW, i, z, z2, pair, interfaceC21154617qS2);
        }
    }
}
