package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.1AON, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AON implements InterfaceC2178591AOb {
    public final SparseArray<TreeSet<C1AOO>> LIZ = new SparseArray<>();
    public final SparseArray<TreeSet<C1AOO>> LIZIZ = new SparseArray<>();
    public final SparseArray<C1AOO> LIZJ = new SparseArray<>();
    public final TreeSet<C1AOO> LIZLLL;
    public C2178641AOg LJ;
    public final Map<Class<? extends InterfaceC2178601AOc>, InterfaceC2178601AOc> LJFF;
    public boolean LJI;
    public boolean LJII;
    public final Set<Integer> LJIIIIZZ;
    public boolean LJIIIZ;

    public C1AON() {
        new SparseArray();
        this.LIZLLL = new TreeSet<>();
        this.LJFF = new HashMap();
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = new LinkedHashSet();
        this.LJIIIZ = false;
    }

    public final boolean LIZ(C1AOU c1aou) {
        boolean zLIZJ;
        InterfaceC1471800oP4 videoStateInquirer;
        InterfaceC1471800oP4 videoStateInquirer2;
        if (c1aou == null || this.LIZ == null) {
            return false;
        }
        if (this.LJIIIIZZ.isEmpty() && !this.LJI) {
            for (C1AOO c1aoo : this.LIZLLL) {
                if (!c1aoo.isActivated()) {
                    c1aoo.setActivated(true);
                }
            }
        }
        this.LJIIIIZZ.add(Integer.valueOf(c1aou.getType()));
        if (this.LJI) {
            TreeSet<C1AOO> treeSet = this.LIZIZ.get(c1aou.getType());
            if (treeSet != null && !treeSet.isEmpty()) {
                TreeSet<C1AOO> treeSet2 = new TreeSet();
                for (C1AOO c1aoo2 : treeSet) {
                    if (c1aoo2 != null) {
                        treeSet2.add(c1aoo2);
                    }
                }
                for (C1AOO c1aoo3 : treeSet2) {
                    if (!c1aoo3.isActivated()) {
                        c1aoo3.setActivated(true);
                        List<Integer> listSingletonList = Collections.singletonList(Integer.valueOf(c1aou.getType()));
                        C2178641AOg c2178641AOg = this.LJ;
                        if (c2178641AOg != null) {
                            videoStateInquirer2 = c2178641AOg.getVideoStateInquirer();
                        } else {
                            videoStateInquirer2 = null;
                        }
                        c1aoo3.onActivate(listSingletonList, videoStateInquirer2);
                    }
                }
            }
            if (!this.LJIIIZ && this.LJII) {
                for (C1AOO c1aoo4 : this.LIZLLL) {
                    if (c1aoo4 != null && c1aoo4.getActivateEvents() == null && !c1aoo4.isActivated()) {
                        c1aoo4.setActivated(true);
                        List<Integer> listSingletonList2 = Collections.singletonList(Integer.valueOf(c1aou.getType()));
                        C2178641AOg c2178641AOg2 = this.LJ;
                        if (c2178641AOg2 != null) {
                            videoStateInquirer = c2178641AOg2.getVideoStateInquirer();
                        } else {
                            videoStateInquirer = null;
                        }
                        c1aoo4.onActivate(listSingletonList2, videoStateInquirer);
                    }
                }
                this.LJIIIZ = true;
            }
        }
        TreeSet<C1AOO> treeSet3 = this.LIZ.get(c1aou.getType());
        if (treeSet3 != null && !treeSet3.isEmpty()) {
            TreeSet<C1AOO> treeSet4 = new TreeSet();
            for (C1AOO c1aoo5 : treeSet3) {
                if (c1aoo5 != null) {
                    treeSet4.add(c1aoo5);
                }
            }
            loop5: while (true) {
                zLIZJ = false;
                for (C1AOO c1aoo6 : treeSet4) {
                    if (c1aoo6 instanceof C1AOS) {
                        if (!((C1AOS) c1aoo6).LIZJ(c1aou) && !zLIZJ) {
                            break;
                        }
                    } else if ((!this.LJI || c1aoo6.isActivated()) && (c1aoo6 instanceof C1AOM)) {
                        zLIZJ = ((C1AOM) c1aoo6).LIZJ(c1aou);
                    } else if (!this.LJI || c1aoo6.isActivated()) {
                        if (c1aoo6.handleVideoEvent(c1aou)) {
                        }
                    }
                    zLIZJ = true;
                }
            }
        } else {
            zLIZJ = false;
        }
        if (c1aou.getType() == 101) {
            this.LJIIIIZZ.clear();
            if (this.LJI && this.LJII) {
                for (C1AOO c1aoo7 : this.LIZLLL) {
                    if (c1aoo7 != null) {
                        c1aoo7.setActivated(false);
                    }
                }
                this.LJIIIZ = false;
            }
        }
        return zLIZJ;
    }
}
