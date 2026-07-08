package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: X.0vu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1760070vu1 implements InterfaceC1760150vu9<C1760020vtw> {
    public final C1760050vtz LIZIZ;
    public final ViewGroup LIZJ;
    public final C1760020vtw LIZLLL;
    public final String LJ = UUID.randomUUID().toString();
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;

    public final void LIZJ() {
        ViewGroup viewGroup;
        this.LJI = true;
        View viewLJ = LJ();
        if (viewLJ == null || viewLJ.getParent() == null) {
            return;
        }
        ViewParent parent = viewLJ.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewLJ, viewGroup);
    }

    public abstract void LIZLLL();

    public abstract View LJ();

    @Override // X.InterfaceC1760150vu9
    public final /* bridge */ /* synthetic */ C1760020vtw LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1760150vu9
    public final String LJJJ() {
        return this.LJ;
    }

    public final void LIZIZ(String str, InterfaceC1760140vu8<C1760020vtw> interfaceC1760140vu8) {
        C1741570vQB c1741570vQBLIZIZ;
        if (interfaceC1760140vu8 != null) {
            c1741570vQBLIZIZ = interfaceC1760140vu8.LIZIZ(this.LIZLLL, this.LJ, new LinkedHashMap());
        } else {
            c1741570vQBLIZIZ = null;
        }
        if (this.LJII) {
            if (c1741570vQBLIZIZ != null) {
                ((C1760080vu2) interfaceC1760140vu8).LIZ(c1741570vQBLIZIZ, false, "has destroyed");
                return;
            }
            return;
        }
        this.LJII = true;
        if (!this.LJI) {
            LIZJ();
        }
        LIZLLL();
        if (!this.LJIIIIZZ) {
            LJFF(this, "dismiss_unfinish", false, str, 8);
        }
        if (c1741570vQBLIZIZ != null) {
            interfaceC1760140vu8.LIZ(c1741570vQBLIZIZ, true, null);
        }
    }

    public AbstractC1760070vu1(C1760050vtz c1760050vtz, ViewGroup viewGroup, C1760020vtw c1760020vtw) {
        this.LIZIZ = c1760050vtz;
        this.LIZJ = viewGroup;
        this.LIZLLL = c1760020vtw;
    }

    public static void LJFF(AbstractC1760070vu1 abstractC1760070vu1, String str, boolean z, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        abstractC1760070vu1.LJIIIIZZ = true;
        C1741570vQB c1741570vQB = abstractC1760070vu1.LIZLLL.LJII;
        if (c1741570vQB != null) {
            c1741570vQB.LIZ(str, str2, null, z);
        }
        abstractC1760070vu1.LIZLLL.LJII = null;
    }
}
