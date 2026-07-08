package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.ECLynxCardViewOptHolder;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0wFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773520wFi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0wFj] */
    public static final ECHybridAdapter LIZ(InterfaceC1773310wFN interfaceC1773310wFN, InterfaceC1774140wGi interfaceC1774140wGi) {
        HashMap map = new HashMap();
        ECHybridAdapter eCHybridAdapter = new ECHybridAdapter(interfaceC1774140wGi, interfaceC1773310wFN, map);
        if (interfaceC1773310wFN.LJII().LIZ() == 0) {
            ?? r2 = new AbstractC1773820wGC<C1773330wFP, ECLynxCardViewOptHolder>() { // from class: X.0wFj
                @Override // X.InterfaceC1773840wGE
                public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC1773310wFN interfaceC1773310wFN2) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LynxCardItemBinder onCreateViewHolder, ");
                    sbLIZ.append(((ECHybridAdapter) this.LIZ).LLIZLLLIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                    return new ECLynxCardViewOptHolder(C20161913uj.LIZ(viewGroup), new C1773610wFr(viewGroup.getContext(), interfaceC1773310wFN2), interfaceC1773310wFN2, (C1773800wGA) ((ECHybridAdapter) this.LIZ).LLILZLL.getValue());
                }
            };
            AbstractC1773820wGC[] abstractC1773820wGCArr = {r2};
            final AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26((C1773530wFj) r2, (C1773530wFj) map, (HashMap<Integer, C0J8P<?, ?>>) 200);
            eCHybridAdapter.LLILLJJLI.LIZJ(C1773330wFP.class);
            C1117380fBQ c1117380fBQ = new C1117380fBQ(eCHybridAdapter, C1773330wFP.class);
            C1773740wG4 c1773740wG4 = abstractC1773820wGCArr[0];
            c1773740wG4.LIZIZ = eCHybridAdapter.LLILLL;
            c1773740wG4.LJ = eCHybridAdapter.LLILZ;
            c1117380fBQ.LIZJ = (C0J8P[]) Arrays.copyOf(abstractC1773820wGCArr, 1);
            c1117380fBQ.LIZ(new InterfaceC1112620f3k() { // from class: X.00wx
                @Override // X.InterfaceC1112620f3k
                public final int LIZ(Object obj) {
                    return awS392S0200000_26.invoke(obj).intValue();
                }
            });
        } else {
            eCHybridAdapter.LLLIIIIL(C1773330wFP.class, new AbstractC1773820wGC<C1773330wFP, ECLynxCardViewOptHolder>() { // from class: X.0wFj
                @Override // X.InterfaceC1773840wGE
                public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC1773310wFN interfaceC1773310wFN2) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LynxCardItemBinder onCreateViewHolder, ");
                    sbLIZ.append(((ECHybridAdapter) this.LIZ).LLIZLLLIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                    return new ECLynxCardViewOptHolder(C20161913uj.LIZ(viewGroup), new C1773610wFr(viewGroup.getContext(), interfaceC1773310wFN2), interfaceC1773310wFN2, (C1773800wGA) ((ECHybridAdapter) this.LIZ).LLILZLL.getValue());
                }
            });
        }
        eCHybridAdapter.LLLIIIIL(C1773340wFQ.class, new AbstractC1773820wGC<C1773340wFQ, C1773410wFX>() { // from class: X.0wFq
            @Override // X.InterfaceC1773840wGE
            public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC1773310wFN interfaceC1773310wFN2) {
                C1773610wFr c1773610wFr = new C1773610wFr(layoutInflater.getContext(), interfaceC1773310wFN2);
                C1773410wFX c1773410wFX = new C1773410wFX(c1773610wFr, interfaceC1773310wFN2);
                c1773610wFr.setVHRef(c1773410wFX);
                return c1773410wFX;
            }
        });
        eCHybridAdapter.LLLIIIIL(C1773710wG1.class, new AbstractC1773820wGC<C1773710wG1, C1773450wFb>() { // from class: X.0wFg
            @Override // X.InterfaceC1773840wGE
            public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC1773310wFN interfaceC1773310wFN2) {
                RecyclerView recyclerView;
                C1773450wFb c1773450wFb = new C1773450wFb(C786410Ut5.Td(layoutInflater, R.layout.bq0, viewGroup, false), interfaceC1773310wFN2);
                c1773450wFb.LLJJIJIIJIL.setAdapter(new C1773170wF9(interfaceC1773310wFN2));
                interfaceC1773310wFN2.LIZLLL().LJ.getBodyList().setViewPager(c1773450wFb.LLJJIJIIJIL);
                View childAt = c1773450wFb.LLJJIJIIJIL.getChildAt(0);
                if ((childAt instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt) != null) {
                    recyclerView.setItemAnimator(null);
                }
                c1773450wFb.LLJJIJIIJIL.LIZIZ(new C1775700wJE(c1773450wFb, 5));
                return c1773450wFb;
            }
        });
        eCHybridAdapter.LLLIIIIL(C1774040wGY.class, new AbstractC1773820wGC<C1774040wGY, C1774420wHA>() { // from class: X.0wFh
            @Override // X.InterfaceC1773840wGE
            public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, final InterfaceC1773310wFN interfaceC1773310wFN2) {
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                C1774480wHG c1774480wHG = new C1774480wHG(viewGroup.getContext(), 0);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1774480wHG);
                c1774480wHG.setLayoutParams(layoutParams);
                c1774480wHG.setId(R.id.gij);
                frameLayout.addView(c1774480wHG);
                final int scaledTouchSlop = ViewConfiguration.get(c1774480wHG.getContext()).getScaledTouchSlop();
                c1774480wHG.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0wDB
                    public int LL;
                    public int LLILLJJLI;
                    public boolean LLILLL;
                    public int LLILZ;

                    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x0152 A[PHI: r7
                      0x0152: PHI (r7v1 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem) = 
                      (r7v0 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
                      (r7v3 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
                      (r7v3 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem)
                     binds: [B:71:0x014e, B:41:0x008f, B:43:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
                    @Override // X.AbstractC1585810rMx
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJJIIJ(androidx.recyclerview.widget.RecyclerView r16, int r17) {
                        /*
                            Method dump skipped, instruction units count: 360
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1771950wDB.LJJIIJ(androidx.recyclerview.widget.RecyclerView, int):void");
                    }

                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                        this.LL += i;
                        if (i != 0) {
                            this.LLILLJJLI = i;
                        }
                    }
                });
                return new C1774420wHA(frameLayout, interfaceC1773310wFN2);
            }
        });
        eCHybridAdapter.LLLIIIIL(C1772720wEQ.class, new AbstractC1773820wGC<C1772720wEQ, C1773470wFd>() { // from class: X.0wG4
            @Override // X.InterfaceC1773840wGE
            public final AbstractC1773460wFc LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, InterfaceC1773310wFN interfaceC1773310wFN2) {
                return new C1773470wFd(C786410Ut5.Td(layoutInflater, R.layout.bpz, viewGroup, false), interfaceC1773310wFN2);
            }
        });
        Map<Class<? extends AbstractC1773210wFD>, InterfaceC1773840wGE<? extends AbstractC1773210wFD>> map2 = interfaceC1773310wFN.LIZLLL().LJFF;
        if (map2 != null) {
            for (Map.Entry<Class<? extends AbstractC1773210wFD>, InterfaceC1773840wGE<? extends AbstractC1773210wFD>> entry : map2.entrySet()) {
                eCHybridAdapter.LLLIIIIL(entry.getKey(), (AbstractC1773820wGC) entry.getValue());
            }
        }
        return eCHybridAdapter;
    }
}
