package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Q17, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q17 {
    public Boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public C0Q18 LJFF;
    public final String LIZ = "BSHEasterEggStateManager";
    public final ArrayList<C0PX8> LJI = new ArrayList<>();

    public final void LIZIZ() {
        LJI(false);
        C0Q18 c0q18 = this.LJFF;
        IAnoleManager iAnoleManagerRi = c0q18 != null ? c0q18.Ri() : null;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBSHSearchItemModel model=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", anoleManager = ");
        sbLIZ.append(iAnoleManagerRi);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (iAnoleManagerRi != null) {
            iAnoleManagerRi.LJIIZILJ(new C990000bry());
        }
    }

    public final void LIZLLL() {
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = false;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : notifyRequestSuccess, hasEasterEgg: ");
        sbLIZ.append(false);
        sbLIZ.append(", fragmentVisible: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasChangeInVisible: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasVerticalSlide: ");
        sbLIZ.append(this.LIZLLL);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZJ() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : isShowBSHEasterEggAd=");
        sbLIZ.append(this.LJ);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return this.LJ;
    }

    public final void LJ() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : notifyVerticalSlide");
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = true;
    }

    public final boolean LIZ(Context context) {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : canShowEasterEgg: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZLLL && !this.LIZJ) {
            boolean z = false;
            ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
            if (iSearchService != null && iSearchService.LLLLLLIL(context)) {
                z = true;
            }
            String str2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(hashCode());
            sbLIZ2.append(" : searchSevenSplitScreenIsShowing: ");
            sbLIZ2.append(z);
            C1022620cia.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJFF(C0PX8 c0px8) {
        if (c0px8 == null) {
            return;
        }
        if (this.LJI.isEmpty()) {
            this.LJI.add(c0px8);
        } else {
            if (this.LJI.contains(c0px8)) {
                return;
            }
            this.LJI.add(c0px8);
        }
    }

    public final void LJI(boolean z) {
        if (z != this.LJ) {
            this.LJ = z;
            if (this.LJI.isEmpty()) {
                C1022620cia.LIZ(this.LIZ, "visibleChangedCallback is empty");
                return;
            }
            Iterator it2 = new ArrayList(this.LJI).iterator();
            while (it2.hasNext()) {
                ((C0PX8) it2.next()).LIZIZ(z);
            }
            String str = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("visibleChangedCallback notify finished target = ");
            sbLIZ.append(z);
            C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJII(C0Q18 c0q18) {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBSHSearchItemModel model=");
        sbLIZ.append(c0q18);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = c0q18;
    }

    public final void LJIIIIZZ(boolean z) {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : updateFragmentVisible: ");
        sbLIZ.append(z);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = Boolean.valueOf(z);
        if (z) {
            return;
        }
        this.LIZJ = true;
        if (this.LJ) {
            LIZIZ();
        }
    }

    public final void LJIIIZ(boolean z) {
        if (this.LJ == z) {
            return;
        }
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(hashCode());
        sbLIZ.append(" : updateShowBSHEasterEggAd cur=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", target = ");
        sbLIZ.append(z);
        C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LJI(z);
    }
}
