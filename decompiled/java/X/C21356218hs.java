package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21356218hs extends AbstractC21356318ht {
    public boolean LJIJ;

    @Override // X.AbstractC21356318ht
    public final void LJII() {
        RecyclerView recyclerView;
        if (!this.LJIJ || (recyclerView = this.LJIIJ) == null) {
            return;
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS131S0100000_31(this, 201));
    }

    @Override // X.AbstractC21356318ht
    public final void LIZJ() {
        View viewLIZ = LIZ();
        if (viewLIZ != null) {
            LJIIL();
            C786410Ut5.LJLLLLLL(8, viewLIZ);
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LIZLLL() {
        View viewLIZ = LIZ();
        if (viewLIZ != null) {
            C786410Ut5.T4(viewLIZ, 0.4f);
        }
    }

    public final void LJIIL() {
        View viewLIZ = LIZ();
        if (viewLIZ != null) {
            C786410Ut5.LJLLLLLL(8, viewLIZ);
        }
        C21356518hv c21356518hv = this.LJIIIZ;
        View view = (c21356518hv == null || true != c21356518hv.LIZJ) ? this.LJIILIIL : this.LJIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C21356518hv c21356518hv2 = this.LJIIIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if ((c21356518hv2 == null || c21356518hv2.LIZJ) ? false : true) {
            View view2 = this.LIZIZ;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.ac6);
            }
            ViewGroup viewGroup = this.LJ;
            ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = 0;
            }
            ViewGroup viewGroup2 = this.LJ;
            if (viewGroup2 != null) {
                C786410Ut5.X5(marginLayoutParams, viewGroup2);
            }
        } else {
            RecyclerView recyclerView = this.LJIIJ;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    Activity activity = this.LJIIJJI;
                    marginLayoutParams.rightMargin = activity != null ? Integer.valueOf((int) C11VU.LIZIZ(16.0f, activity)).intValue() : 0;
                }
                C786410Ut5.p6(recyclerView, marginLayoutParams);
            }
        }
        this.LJIJ = false;
    }

    public final void LJIILIIL() {
        View viewLIZ = LIZ();
        if (viewLIZ != null) {
            C786410Ut5.LJLLLLLL(0, viewLIZ);
        }
        C21356518hv c21356518hv = this.LJIIIZ;
        View view = (c21356518hv == null || true != c21356518hv.LIZJ) ? this.LJIILIIL : this.LJIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C21356518hv c21356518hv2 = this.LJIIIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!((c21356518hv2 == null || c21356518hv2.LIZJ) ? false : true)) {
            RecyclerView recyclerView = this.LJIIJ;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.rightMargin = 0;
                }
                C786410Ut5.p6(recyclerView, marginLayoutParams);
                return;
            }
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.ac7);
        }
        ViewGroup viewGroup = this.LJ;
        ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            Activity activity = this.LJIIJJI;
            marginLayoutParams.rightMargin = activity != null ? (int) C11VU.LIZIZ(50.0f, activity) : 0;
        }
        ViewGroup viewGroup2 = this.LJ;
        if (viewGroup2 != null) {
            C786410Ut5.X5(marginLayoutParams, viewGroup2);
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LJ() {
        LJIIL();
    }

    @Override // X.AbstractC21356318ht
    public final void LJI(List<C1621190sI1> list) {
        int iLLLII;
        int i;
        C21355718hn c21355718hn = this.LJIILJJIL;
        if (c21355718hn != null) {
            iLLLII = c21355718hn.LLLII();
        } else {
            iLLLII = 0;
        }
        C1624230sMv c1624230sMv = this.LJIIZILJ;
        if (c1624230sMv != null) {
            i = c1624230sMv.LIZJ;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (iLLLII >= i) {
            View viewLIZ = LIZ();
            if (viewLIZ != null) {
                C786410Ut5.T4(viewLIZ, 1.0f);
                return;
            }
            return;
        }
        View viewLIZ2 = LIZ();
        if (viewLIZ2 == null) {
            return;
        }
        C786410Ut5.T4(viewLIZ2, 0.4f);
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIIZ(int i) {
        int i2;
        float f;
        C1624230sMv c1624230sMv = this.LJIIZILJ;
        boolean z = true;
        int iLLLII = 0;
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            if (this.LJIJ) {
                LJIILIIL();
                z = false;
            }
            this.LJIJ = z;
            View viewLIZ = LIZ();
            if (viewLIZ != null) {
                C21355718hn c21355718hn = this.LJIILJJIL;
                if (c21355718hn != null) {
                    iLLLII = c21355718hn.LLLII();
                }
                C1624230sMv c1624230sMv2 = this.LJIIZILJ;
                if (c1624230sMv2 != null) {
                    i2 = c1624230sMv2.LIZJ;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                if (iLLLII >= i2) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                C786410Ut5.T4(viewLIZ, f);
                return;
            }
            return;
        }
        LJIIL();
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIJJI(boolean z) {
        C1624230sMv c1624230sMv = this.LJIIZILJ;
        if (c1624230sMv != null && c1624230sMv.LIZIZ) {
            if (z) {
                View viewLIZ = LIZ();
                if (viewLIZ != null) {
                    C21357918i9.LIZIZ(viewLIZ);
                    return;
                }
                return;
            }
            View viewLIZ2 = LIZ();
            if (viewLIZ2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewLIZ2);
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIJ(final Effect effect, boolean z) {
        if (z) {
            View viewLIZ = LIZ();
            if (viewLIZ != null) {
                C786410Ut5.I7(null, viewLIZ);
                return;
            }
            return;
        }
        final View viewLIZ2 = LIZ();
        if (viewLIZ2 != null) {
            C786410Ut5.I7(new View.OnClickListener(viewLIZ2, this, effect) { // from class: X.18hq
                public final /* synthetic */ View LL;
                public final /* synthetic */ C21356218hs LLILLJJLI;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Map<C21356918hz, Integer> map;
                    Set setKeySet;
                    C21356218hs c21356218hs;
                    InterfaceC212356188k interfaceC212356188k;
                    List<C1621190sI1> listLLLIIIIL;
                    if (this.LL.getAlpha() == 1.0f && (interfaceC212356188k = (c21356218hs = this.LLILLJJLI).LIZLLL) != null) {
                        C21355718hn c21355718hn = c21356218hs.LJIILJJIL;
                        if (c21355718hn != null) {
                            listLLLIIIIL = c21355718hn.LLLIIIIL();
                        } else {
                            listLLLIIIIL = C13BV.INSTANCE;
                        }
                        interfaceC212356188k.LJFF(listLLLIIIIL);
                    }
                    C21355718hn c21355718hn2 = this.LLILLJJLI.LJIILJJIL;
                    if (c21355718hn2 != null && (map = c21355718hn2.LLJ) != null && (setKeySet = ((LinkedHashMap) map).keySet()) != null) {
                        ArrayList arrayList = new ArrayList(setKeySet);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((C21356918hz) obj).LJI == 2) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList2.isEmpty();
                        if (arrayList != null && (!arrayList.isEmpty())) {
                        }
                    }
                    C21356218hs c21356218hs2 = this.LLILLJJLI;
                    InterfaceC21358118iB interfaceC21358118iB = c21356218hs2.LIZJ;
                    if (interfaceC21358118iB != null) {
                        C21355718hn c21355718hn3 = c21356218hs2.LJIILJJIL;
                        if (c21355718hn3 != null) {
                            ((ArrayList) c21355718hn3.LLLIIIIL()).size();
                        }
                        interfaceC21358118iB.onComplete();
                    }
                }
            }, viewLIZ2);
        }
    }
}
