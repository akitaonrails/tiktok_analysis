package X;

import Y.AComparatorS31S0000000_12;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Tjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755140Tjk {
    public final EnumC755280Tjy LIZ;
    public final InterfaceC752920TgA LIZIZ;
    public final List<C755180Tjo> LIZJ = new ArrayList();
    public final List<C755180Tjo> LIZLLL = new ArrayList();
    public final List<C755180Tjo> LJ = new ArrayList();
    public final List<C755180Tjo> LJFF = new ArrayList();

    public static boolean LIZIZ(List list) {
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            return true;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (((C755180Tjo) it2.next()).LJIIIIZZ()) {
                return false;
            }
        }
        return true;
    }

    public static void LIZLLL(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(16));
        }
    }

    public final void LIZ(List<Pair<AbstractC755190Tjp, AbstractC752950TgD>> list) {
        if (list != null) {
            for (Pair<AbstractC755190Tjp, AbstractC752950TgD> pair : list) {
                pair.getSecond().LLILLL = this.LIZIZ;
                int i = C755220Tjs.LIZ[pair.getFirst().LJII.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ((ArrayList) this.LJFF).add(new C755180Tjo(pair.getFirst(), pair.getSecond(), this.LIZ));
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            ((ArrayList) this.LJ).add(new C755180Tjo(pair.getFirst(), pair.getSecond(), this.LIZ));
                        }
                    } else {
                        ((ArrayList) this.LIZLLL).add(new C755180Tjo(pair.getFirst(), pair.getSecond(), this.LIZ));
                    }
                } else {
                    ((ArrayList) this.LIZJ).add(new C755180Tjo(pair.getFirst(), pair.getSecond(), this.LIZ));
                }
            }
        }
        LIZLLL(this.LIZJ);
        LIZLLL(this.LIZLLL);
        LIZLLL(this.LJ);
        LIZLLL(this.LJFF);
    }

    public final View LIZJ(ViewGroup viewGroup) {
        int i;
        int i2;
        int i3;
        if ((!LIZIZ(this.LIZJ) || !LIZIZ(this.LIZLLL) || !LIZIZ(this.LJ) || !LIZIZ(this.LJFF)) && viewGroup != null) {
            C01GW c01gw = C485950J3x.LIZ;
            int i4 = 0;
            View viewLIZIZ = C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.g3f, viewGroup, false);
            if (viewLIZIZ != null) {
                View viewFindViewById = viewLIZIZ.findViewById(R.id.mor);
                if (viewFindViewById != null) {
                    if (LIZIZ(this.LIZJ) || (LIZIZ(this.LIZLLL) && LIZIZ(this.LJ) && LIZIZ(this.LJFF))) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i3, viewFindViewById);
                }
                ViewGroup viewGroup2 = (ViewGroup) viewLIZIZ.findViewById(R.id.ybr);
                if (viewGroup2 != null) {
                    C500260Jjc.LJLJLJ(viewGroup2, !LIZIZ(this.LIZJ));
                }
                Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                while (it2.hasNext()) {
                    View viewLJ = ((C755180Tjo) it2.next()).LJ(viewGroup);
                    if (viewLJ != null && viewGroup2 != null) {
                        viewGroup2.addView(viewLJ);
                    }
                }
                View viewFindViewById2 = viewLIZIZ.findViewById(R.id.mos);
                if (viewFindViewById2 != null) {
                    if (LIZIZ(this.LIZLLL) || (LIZIZ(this.LJ) && LIZIZ(this.LJFF))) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
                }
                ViewGroup viewGroup3 = (ViewGroup) viewLIZIZ.findViewById(R.id.ebn);
                if (viewGroup3 != null) {
                    C500260Jjc.LJLJLJ(viewGroup3, !LIZIZ(this.LIZLLL));
                }
                Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
                while (it3.hasNext()) {
                    View viewLJ2 = ((C755180Tjo) it3.next()).LJ(viewGroup);
                    if (viewLJ2 != null && viewGroup3 != null) {
                        viewGroup3.addView(viewLJ2);
                    }
                }
                View viewFindViewById3 = viewLIZIZ.findViewById(R.id.moy);
                if (viewFindViewById3 != null) {
                    if (!LIZIZ(this.LJ) && !LIZIZ(this.LJFF)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById3);
                }
                ViewGroup viewGroup4 = (ViewGroup) viewLIZIZ.findViewById(R.id.user_manager);
                if (viewGroup4 != null) {
                    C500260Jjc.LJLJLJ(viewGroup4, !LIZIZ(this.LJ));
                }
                Iterator it4 = ((ArrayList) this.LJ).iterator();
                while (it4.hasNext()) {
                    View viewLJ3 = ((C755180Tjo) it4.next()).LJ(viewGroup);
                    if (viewLJ3 != null && viewGroup4 != null) {
                        viewGroup4.addView(viewLJ3);
                    }
                }
                ViewGroup viewGroup5 = (ViewGroup) viewLIZIZ.findViewById(R.id.uuu);
                if (viewGroup5 != null) {
                    C500260Jjc.LJLJLJ(viewGroup5, !LIZIZ(this.LJFF));
                }
                Iterator it5 = ((ArrayList) this.LJFF).iterator();
                while (it5.hasNext()) {
                    View viewLJ4 = ((C755180Tjo) it5.next()).LJ(viewGroup);
                    if (viewLJ4 != null && viewGroup5 != null) {
                        viewGroup5.addView(viewLJ4);
                    }
                }
                View viewFindViewById4 = viewLIZIZ.findViewById(R.id.cfr);
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, viewFindViewById4);
                return viewLIZIZ;
            }
        }
        return null;
    }

    public C755140Tjk(EnumC755280Tjy enumC755280Tjy, InterfaceC752920TgA interfaceC752920TgA) {
        this.LIZ = enumC755280Tjy;
        this.LIZIZ = interfaceC752920TgA;
    }
}
