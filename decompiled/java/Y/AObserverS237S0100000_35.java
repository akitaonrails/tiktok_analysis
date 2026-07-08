package Y;

import X.C0P5S;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C1954807lC;
import X.C1EBI;
import X.C1EBJ;
import X.C1EBL;
import X.C1EBM;
import X.C1EBN;
import X.C1EBO;
import X.C1EBP;
import X.C1EBQ;
import X.C1EBR;
import X.C1EBS;
import X.C1EBT;
import X.C2260891DeR;
import X.C644560PPy;
import X.EnumC1782600wUM;
import X.InterfaceC1212360hec;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.ecom.data.ShopTabInfo;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;

/* JADX INFO: loaded from: classes36.dex */
public class AObserverS237S0100000_35 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObserverS237S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS237S0100000_35 aObserverS237S0100000_35, Object obj) {
        C1EBL c1ebl = (C1EBL) obj;
        if (c1ebl instanceof C1EBT) {
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).LJ();
            return;
        }
        if (c1ebl instanceof C1EBN) {
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).Uq2(((C1EBN) c1ebl).LIZ);
            return;
        }
        if (c1ebl instanceof C1EBQ) {
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).Ng1();
            return;
        }
        if (c1ebl instanceof C1EBJ) {
            C1EBJ c1ebj = (C1EBJ) c1ebl;
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).LLJJJIL(c1ebj.LIZ, c1ebj.LIZIZ);
            return;
        }
        if (c1ebl instanceof C1EBS) {
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).showLoadMoreLoading();
            return;
        }
        if (c1ebl instanceof C1EBP) {
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).Wi(((C1EBP) c1ebl).LIZ);
            return;
        }
        if (c1ebl instanceof C1EBI) {
            C1EBI c1ebi = (C1EBI) c1ebl;
            ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).Pj(c1ebi.LIZ, c1ebi.LIZIZ);
        } else {
            if (c1ebl instanceof C1EBR) {
                ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).Jm();
                return;
            }
            if (c1ebl instanceof C1EBO) {
                ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).bD1(((C1EBO) c1ebl).LIZ);
            } else {
                if (c1ebl instanceof C1EBM) {
                    C1EBM c1ebm = (C1EBM) c1ebl;
                    ((InterfaceC1212360hec) aObserverS237S0100000_35.l0).mE(c1ebm.LIZ, c1ebm.LIZIZ);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    public static final void onChanged$1(AObserverS237S0100000_35 aObserverS237S0100000_35, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObserverS237S0100000_35.l0;
        C0P5S c0p5s = (C0P5S) obj;
        searchContainerFragment.getClass();
        ShopTabInfo shopTabInfo = c0p5s.LIZ;
        if (!c0p5s.LIZIZ && shopTabInfo != null && shopTabInfo.shopTabType != EnumC1782600wUM.UNKNOWN.getType()) {
            c0p5s.LIZIZ = true;
            C1846060y8i c1846060y8i = searchContainerFragment.LLIZ;
            C644560PPy.LIZ.getClass();
            C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(C644560PPy.LJIIZILJ());
            if (c1845940y8WLJII != null) {
                C2260891DeR c2260891DeR = searchContainerFragment.LLLFZ;
                c2260891DeR.LIZJ = false;
                c2260891DeR.LIZIZ = false;
                c2260891DeR.LIZ = null;
                c2260891DeR.LIZLLL = false;
                c2260891DeR.LJ = null;
                c2260891DeR.LJFF = null;
                if (shopTabInfo.shopTabType != EnumC1782600wUM.ALIENATION.getType() && !c2260891DeR.LJI) {
                    return;
                }
                HandlerHook.viewPostDelay(searchContainerFragment.LLIZ, new ARunnableS104S0200000_35(searchContainerFragment, shopTabInfo, c1845940y8WLJII, 6), 1000L);
            }
        }
    }
}
