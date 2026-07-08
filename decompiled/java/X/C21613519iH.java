package X;

import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21613519iH implements InterfaceC21586919dz {
    public final /* synthetic */ C21613419iG LIZ;

    @Override // X.InterfaceC21586919dz
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC21586919dz
    public final void LLLLLZ() {
        C21613419iG c21613419iG = this.LIZ;
        if (!c21613419iG.LLJILLL) {
            c21613419iG.LLJILLL = !c21613419iG.LLJJ;
        }
        c21613419iG.LLJIJIL = 0.0f;
        c21613419iG.LJIJI();
        C21613419iG c21613419iG2 = this.LIZ;
        C21613619iI c21613619iI = c21613419iG2.LLILZIL.get(c21613419iG2.LLILZ);
        if (c21613619iI != null) {
            c21613619iI.LIZ.RM();
        }
        C21613419iG c21613419iG3 = this.LIZ;
        Iterator<InterfaceC21613819iK> it2 = c21613419iG3.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().xv(c21613419iG3.LLJJI);
        }
        this.LIZ.getClass();
        C1389330mG3.LIZ = 0;
    }

    @Override // X.InterfaceC21586919dz
    public final void S0() {
        C21613419iG c21613419iG = this.LIZ;
        c21613419iG.LLJILLL = false;
        c21613419iG.LLJJ = false;
        c21613419iG.LLJJI = false;
        c21613419iG.LLJIJIL = 1.0f;
        DrawerLayout drawerLayout = c21613419iG.LLIZLLLIL;
        if (drawerLayout != null) {
            drawerLayout.setSplitDragType(2);
        }
        C21613419iG c21613419iG2 = this.LIZ;
        C21613619iI c21613619iI = c21613419iG2.LLILZIL.get(c21613419iG2.LLILZ);
        if (c21613619iI != null) {
            c21613619iI.LIZ.Ml();
        }
        C21613419iG c21613419iG3 = this.LIZ;
        Iterator<InterfaceC21613819iK> it2 = c21613419iG3.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().iG(c21613419iG3.LJIIZILJ(false));
        }
        C1389330mG3.LIZ = 1;
    }

    public C21613519iH(C21613419iG c21613419iG) {
        this.LIZ = c21613419iG;
    }

    @Override // X.InterfaceC21586919dz
    public final void LIZ(float f) {
        double d = f;
        if (0.0d <= d && d <= 1.0d) {
            C21613419iG c21613419iG = this.LIZ;
            if (c21613419iG.LLJIJIL == 0.0f) {
                for (InterfaceC21613819iK interfaceC21613819iK : c21613419iG.LLILZLL) {
                    c21613419iG.LJIIZILJ(false);
                    interfaceC21613819iK.FC();
                }
            }
            C21613419iG c21613419iG2 = this.LIZ;
            c21613419iG2.LLJIJIL = f;
            c21613419iG2.LJIILLIIL(f);
            C21613419iG c21613419iG3 = this.LIZ;
            Iterator<InterfaceC21613819iK> it2 = c21613419iG3.LLILZLL.iterator();
            while (it2.hasNext()) {
                it2.next().lQ(f, c21613419iG3.LJIIZILJ(false));
            }
        }
    }
}
