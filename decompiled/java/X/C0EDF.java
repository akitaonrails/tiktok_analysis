package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EDF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDF extends FrameLayout implements InterfaceC497601wk {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public RecyclerView LLILLL;
    public C1295960jpS LLILZ;
    public RecyclerView LLILZIL;
    public final C0EDP LLILZLL;
    public C0ED8 LLIZ;
    public C361100EDs LLIZLLLIL;
    public C0EDS LLJ;
    public C0EDC LLJI;
    public C0EDT LLJIJIL;
    public String LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;
    public InterfaceC361290EEl LLJJ;
    public boolean LLJJI;
    public final AwS584S0100000_5 LLJJIII;
    public C1DFK LLJJIJI;
    public final CoroutineContext LLJJIJIIJIL;

    public final void LJ() {
        C0ED8 c0ed8 = this.LLIZ;
        if (c0ed8 == null || c0ed8.LJIJJLI) {
            return;
        }
        C786410Ut5.LJZL(8, getLoadingLayoutFromXml());
        C786410Ut5.LLD(8, getLottieLoadingViewFromXml());
        C786410Ut5.LJZL(8, getErrorOrEmptyLayoutFromXml());
        C786410Ut5.LLIZLLLIL(getResourceRecyclerListFromXml(), 0);
    }

    public final void LJIILIIL() {
        C0ED8 c0ed8 = this.LLIZ;
        if (c0ed8 == null || c0ed8.LJIJJLI) {
            return;
        }
        C786410Ut5.LJZL(8, getLoadingLayoutFromXml());
        C786410Ut5.LJZL(0, getErrorOrEmptyLayoutFromXml());
        C786410Ut5.R7(getErrorOrEmptyLayoutFromXml(), new ACListenerS140S0100000_5(this, 107));
        C786410Ut5.LLIZLLLIL(getResourceRecyclerListFromXml(), 8);
    }

    public final void LJIILJJIL() {
        C0ED8 c0ed8 = this.LLIZ;
        if (c0ed8 == null || c0ed8.LJIJJLI) {
            return;
        }
        C786410Ut5.LJZL(0, getLoadingLayoutFromXml());
        C786410Ut5.LJZL(8, getErrorOrEmptyLayoutFromXml());
        C786410Ut5.LLIZLLLIL(getResourceRecyclerListFromXml(), 8);
        C786410Ut5.LLD(0, getLottieLoadingViewFromXml());
        C1294250jmh.LIZIZ(getContext(), C0ED9.LJII).LIZIZ(new C0FXG(this, 0));
    }

    public final List<C0EDQ> getCurrentSelectItems() {
        ArrayList<C0EDQ> arrayList;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs == null || (arrayList = c361100EDs.LLILZLL) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0EDQ c0edq : arrayList) {
            if (c0edq.LIZJ) {
                arrayList2.add(c0edq);
            }
        }
        return arrayList2;
    }

    public final int getCurrentSelectedPosition() {
        ArrayList<C0EDQ> arrayList;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null && (arrayList = c361100EDs.LLILZLL) != null) {
            Iterator<C0EDQ> it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().LIZJ) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final LinearLayout getErrorOrEmptyLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hax);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ResourceItem getFirstItem() {
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null) {
            return (ResourceItem) C13LP.LJJJLL(c361100EDs.LLLFZ());
        }
        return null;
    }

    public final String getFirstItemEffectId() {
        ResourceItem resourceItem;
        String effectId;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        return (c361100EDs == null || (resourceItem = (ResourceItem) C13LP.LJJJLL(c361100EDs.LLLFZ())) == null || (effectId = resourceItem.getEffectId()) == null) ? "" : effectId;
    }

    public final LinearLayout getLoadingLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nl4);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1295960jpS getLottieLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nr6);
            this.LLILZ = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final List<ResourceItem> getResourceList() {
        C361100EDs c361100EDs = this.LLIZLLLIL;
        return c361100EDs != null ? c361100EDs.LLLFZ() : C13BV.INSTANCE;
    }

    public final RecyclerView getResourceRecyclerListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tct);
            this.LLILLL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final String getSecondItemEffectId() {
        ResourceItem resourceItem;
        String effectId;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        return (c361100EDs == null || (resourceItem = (ResourceItem) C13LP.LJJJLZIJ(1, c361100EDs.LLLFZ())) == null || (effectId = resourceItem.getEffectId()) == null) ? "" : effectId;
    }

    private final InterfaceC360730ECh getResourceProvider() {
        if (C0E47.LIZ()) {
            C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
            return C0E46.LIZ().LIZ().LIZ;
        }
        C0ED8 c0ed8 = this.LLIZ;
        if (c0ed8 != null) {
            return c0ed8.LJJII;
        }
        return null;
    }

    public final void LJII() {
        final C0ED8 c0ed8;
        InterfaceC360730ECh resourceProvider = getResourceProvider();
        if (resourceProvider == null || (c0ed8 = this.LLIZ) == null || c0ed8.LIZJ == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        resourceProvider.LJIIJJI(getContext(), c0ed8.LIZJ, c0ed8.LJFF, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EDL
            @Override // X.InterfaceC365520EUs
            public final void onStart() {
                this.LIZ.LJIILJJIL();
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZ(C0EDV c0edv) {
                this.LIZ.LJ();
                this.LIZ.LJIILIIL();
                C0EDS c0eds = this.LIZ.LLJ;
                if (c0eds != null) {
                    c0eds.LIZIZ(false, false);
                }
                C0EDT c0edt = this.LIZ.LLJIJIL;
                if (c0edt != null) {
                    c0edt.LIZIZ(false, System.currentTimeMillis() - jCurrentTimeMillis, false, null, null, true);
                }
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                List<ResourceItem> listLIZJ;
                this.LIZ.LJ();
                C0EDS c0eds = this.LIZ.LLJ;
                if (c0eds != null && (listLIZJ = c0eds.LIZJ(list)) != null) {
                    list = listLIZJ;
                }
                C0EDF c0edf = this.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends ResourceItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0EDQ(it2.next(), 62));
                }
                c0edf.setupList(arrayList);
                if (c0ed8.LJIILLIIL.LIZ) {
                    this.LIZ.getClass();
                }
                C0EDS c0eds2 = this.LIZ.LLJ;
                if (c0eds2 != null) {
                    c0eds2.LIZIZ(true, false);
                }
                C0EDT c0edt = this.LIZ.LLJIJIL;
                if (c0edt != null) {
                    c0edt.LIZIZ(true, System.currentTimeMillis() - jCurrentTimeMillis, false, null, null, true);
                }
            }
        });
    }

    public final void LJIIZILJ() {
        C0ED8 c0ed8;
        String str;
        InterfaceC360730ECh resourceProvider = getResourceProvider();
        if (resourceProvider == null || (c0ed8 = this.LLIZ) == null || (str = c0ed8.LIZJ) == null) {
            return;
        }
        resourceProvider.LJII(str, false, c0ed8.LJII, false, null);
    }

    public final C0EDQ getCurrentSelectItem() {
        return (C0EDQ) C13LP.LJJJLZIJ(0, getCurrentSelectItems());
    }

    public final InterfaceC360730ECh getEditorProResourceProvider() {
        return getResourceProvider();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJIJI.LIZIZ(null);
        this.LLJJIJI = C23118094a.LIZ();
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJJIJIIJIL;
    }

    public final C0EDC getOnItemClickListener() {
        return this.LLJI;
    }

    public final RecyclerView getRecyclerView() {
        return this.LLILZIL;
    }

    public final C361100EDs getResourceListAdapter() {
        return this.LLIZLLLIL;
    }

    public final C0ED8 getResourceViewConfig() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<java.lang.String> r13) {
        /*
            r12 = this;
            X.0EDs r8 = r12.LLIZLLLIL
            if (r8 == 0) goto L99
            java.util.ArrayList<X.0EDQ> r0 = r8.LLILZLL
            java.util.Iterator r11 = r0.iterator()
            r7 = 0
        Lb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r6 = r11.next()
            int r10 = r7 + 1
            if (r7 < 0) goto L94
            X.0EDQ r6 = (X.C0EDQ) r6
            com.ss.ugc.android.editor.base.resource.ResourceItem r5 = r6.LIZ
            java.util.ArrayList r1 = r5.getChildResources()
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 1
            if (r0 == 0) goto L5f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5f
        L2c:
            r0 = r13
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5d
            r0 = r13
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r5.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
        L50:
            boolean r0 = r6.LJFF
            if (r0 == r4) goto L5b
            r6.LJFF = r4
            java.lang.String r0 = "cirledot_refresh"
            r8.notifyItemChanged(r7, r0)
        L5b:
            r7 = r10
            goto Lb
        L5d:
            r4 = 0
            goto L50
        L5f:
            java.util.Iterator r9 = r1.iterator()
        L63:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r9.next()
            com.ss.ugc.android.editor.base.resource.ResourceItem r3 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r3
            r0 = r13
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L63
            r0 = r13
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L7f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r3.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7f
            goto L50
        L94:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EDF.LIZ(java.util.List):void");
    }

    public final void LIZJ(int i) {
        InterfaceC360730ECh resourceProvider;
        ArrayList<C0EDQ> arrayList;
        ArrayList<C0EDQ> arrayList2 = new ArrayList();
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null && (arrayList = c361100EDs.LLILZLL) != null) {
            int i2 = 0;
            for (C0EDQ c0edq : arrayList) {
                InterfaceC360730ECh resourceProvider2 = getResourceProvider();
                if (resourceProvider2 == null || !resourceProvider2.LIZ(c0edq.LIZ.getEffectId())) {
                    if (c0edq.LIZ.getEffectId().length() != 0) {
                        arrayList2.add(c0edq);
                        i2++;
                        if (i2 == i) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        for (C0EDQ c0edq2 : arrayList2) {
            InterfaceC360730ECh resourceProvider3 = getResourceProvider();
            if (resourceProvider3 == null || !resourceProvider3.LIZ(c0edq2.LIZ.getEffectId())) {
                if (c0edq2.LIZ.getEffectId().length() != 0 && (resourceProvider = getResourceProvider()) != null) {
                    resourceProvider.LIZJ(new InterfaceC365420EUi() { // from class: X.0EDW
                        @Override // X.InterfaceC365420EUi
                        public final void LIZ(String str, C0EDV c0edv) {
                        }

                        @Override // X.InterfaceC365420EUi
                        public final void LJJI(String str, String str2) {
                        }

                        @Override // X.InterfaceC365420EUi
                        public final void onProgress(int i3) {
                        }
                    }, c0edq2.LIZ.getEffectId());
                }
            }
        }
    }

    public final void LIZLLL(boolean z) {
        C0ED8 c0ed8;
        List<ResourceItem> listLIZ;
        Object objLIZLLL;
        String str;
        InterfaceC360730ECh resourceProvider = getResourceProvider();
        if (resourceProvider != null && (c0ed8 = this.LLIZ) != null) {
            if (Intrinsics.LJFF(c0ed8.LIZJ, "ratio")) {
                ArrayList arrayListLJ = resourceProvider.LJ();
                LJ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLJ, 10));
                Iterator it2 = arrayListLJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0EDQ((ResourceItem) it2.next(), 62));
                }
                setupList(arrayList);
                C0EDS c0eds = this.LLJ;
                if (c0eds != null) {
                    c0eds.LIZIZ(true, z);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            final C0EDG c0edg = new C0EDG(c0ed8, this, jCurrentTimeMillis, z);
            final C0EDM c0edm = new C0EDM(this, jCurrentTimeMillis, z);
            if (c0ed8.LIZJ != null) {
                if (c0ed8.LIZLLL && (str = c0ed8.LJFF) != null && (!a0.LJJJIL(str))) {
                    if (Intrinsics.LJFF(c0ed8.LJFF, "Favorite")) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        objLIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0EDJ(this, c0ed8, c0edg, c0edm, null), 3);
                    } else {
                        resourceProvider.LJIIIZ(c0ed8.LIZJ, c0ed8.LJFF, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EDN
                            @Override // X.InterfaceC365520EUs
                            public final void onStart() {
                                C0EDF c0edf = this.LIZ;
                                if (c0edf.LLJJI) {
                                    c0edf.LLJJI = false;
                                } else {
                                    c0edf.LJIILJJIL();
                                }
                            }

                            @Override // X.InterfaceC365520EUs
                            public final void LIZ(C0EDV c0edv) {
                                C0EDF c0edf = this.LIZ;
                                if (!c0edf.LLJJI) {
                                    c0edm.invoke(c0edv, Boolean.FALSE);
                                } else {
                                    c0edf.LLJJI = false;
                                }
                            }

                            @Override // X.InterfaceC365520EUs
                            public final void LIZIZ(List<? extends ResourceItem> list, boolean z2) {
                                C0EDF c0edf = this.LIZ;
                                if (!c0edf.LLJJI) {
                                    c0edg.invoke(list, Boolean.valueOf(z2));
                                } else {
                                    c0edf.LLJJI = false;
                                }
                            }
                        });
                        objLIZLLL = Unit.LIZ;
                    }
                } else {
                    resourceProvider.LJII(c0ed8.LIZJ, c0ed8.LJIIIIZZ, c0ed8.LJII, c0ed8.LJ, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EDO
                        @Override // X.InterfaceC365520EUs
                        public final void onStart() {
                            C0EDF c0edf = this.LIZ;
                            if (c0edf.LLJJI) {
                                c0edf.LLJJI = false;
                            } else {
                                c0edf.LJIILJJIL();
                            }
                        }

                        @Override // X.InterfaceC365520EUs
                        public final void LIZ(C0EDV c0edv) {
                            C0EDF c0edf = this.LIZ;
                            if (!c0edf.LLJJI) {
                                c0edm.invoke(c0edv, Boolean.FALSE);
                            } else {
                                c0edf.LLJJI = false;
                            }
                        }

                        @Override // X.InterfaceC365520EUs
                        public final void LIZIZ(List<? extends ResourceItem> list, boolean z2) {
                            C0EDF c0edf = this.LIZ;
                            if (!c0edf.LLJJI) {
                                c0edg.invoke(list, Boolean.valueOf(z2));
                            } else {
                                c0edf.LLJJI = false;
                            }
                        }
                    });
                    objLIZLLL = Unit.LIZ;
                }
                if (objLIZLLL != null) {
                    return;
                }
            }
            C0EDS c0eds2 = this.LLJ;
            if (c0eds2 != null && (listLIZ = c0eds2.LIZ()) != null) {
                c0edg.invoke(listLIZ, Boolean.FALSE);
            }
        }
    }

    public final void LJIIIIZZ(C0ED8 c0ed8) {
        C0DXR c0ejc;
        Pair pair;
        AbstractC21674919sB abstractC21674919sB;
        this.LLIZ = c0ed8;
        Boolean bool = null;
        this.LLJILJIL = null;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.byp, this, true);
        this.LLJILLL = 0L;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tct);
        this.LLILZIL = recyclerView;
        if (recyclerView != null) {
            RecyclerView.LayoutManager linearLayoutManager = c0ed8.LIZ;
            int iIntValue = 0;
            if (linearLayoutManager == null) {
                linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
            recyclerView.setItemAnimator(null);
            C0ED8 c0ed82 = this.LLIZ;
            if (c0ed82 != null) {
                InterfaceC360730ECh resourceProvider = getResourceProvider();
                if (resourceProvider != null) {
                    resourceProvider.LJI();
                    bool = Boolean.FALSE;
                }
                this.LLIZLLLIL = new C361100EDs(c0ed82, bool);
            }
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                recyclerView.setClipChildren(false);
                C361100EDs c361100EDs = this.LLIZLLLIL;
                if (c361100EDs != null && (pair = (Pair) c361100EDs.LLJI.getValue()) != null) {
                    iIntValue = ((Number) pair.getFirst()).intValue();
                }
                int iLIZJ = C390810FTz.LIZJ(recyclerView.getContext());
                c0ejc = new C0EE5(((GridLayoutManager) recyclerView.getLayoutManager()).LLILLJJLI, (int) ((((iLIZJ - (iIntValue * r4)) * 1.0f) / (r4 + 1)) / 2), true);
            } else {
                c0ejc = new C0EJC(10, true);
            }
            if (recyclerView.getItemDecorationCount() == 0) {
                C0DXR c0dxr = c0ed8.LIZIZ;
                if (c0dxr != null) {
                    c0ejc = c0dxr;
                }
                recyclerView.addItemDecoration(c0ejc);
            }
            recyclerView.setAdapter(this.LLIZLLLIL);
            C0EDP c0edp = this.LLILZLL;
            RecyclerView recyclerView2 = c0edp.LL;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(c0edp);
            }
            c0edp.LL = recyclerView;
            recyclerView.addOnScrollListener(c0edp);
            RecyclerView recyclerView3 = c0edp.LL;
            if (recyclerView3 != null) {
                HandlerHook.viewRemoveCallbacks(recyclerView3, c0edp.LLILLL);
            }
            RecyclerView recyclerView4 = c0edp.LL;
            if (recyclerView4 != null) {
                HandlerHook.viewPost(recyclerView4, c0edp.LLILLL);
            }
            this.LLILZLL.LLILLJJLI = this.LLJJIII;
            C361100EDs c361100EDs2 = this.LLIZLLLIL;
            if (c361100EDs2 != null) {
                c361100EDs2.LLILZ = new C0EDA(this);
            }
        }
    }

    public final void LJIILL(C0E17 c0e17) {
        LJIIJ(this, "", c0e17, 2);
    }

    public final void LJIILLIIL(List<? extends ResourceItem> list) {
        boolean z;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends ResourceItem> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0EDQ(it2.next(), 62));
        }
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null) {
            c361100EDs.LLILZLL.clear();
            String str = c361100EDs.LLIZLLLIL;
            String str2 = c361100EDs.LLJ;
            if (str != null || str2 != null) {
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C0EDQ c0edq = (C0EDQ) obj;
                        if ((str != null && Intrinsics.LJFF(str, c0edq.LIZ.getResourceId())) || (str2 != null && Intrinsics.LJFF(str2, c0edq.LIZ.getEffectId()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c0edq.LIZJ = z;
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            c361100EDs.LLILZLL.addAll(arrayList);
            c361100EDs.notifyDataSetChanged();
        }
    }

    public final void setErrorOrEmptyLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setLoadingLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setLottieLoadingViewFromXml(C1295960jpS c1295960jpS) {
        this.LLILZ = c1295960jpS;
    }

    public final void setOnItemClickListener(C0EDC c0edc) {
        this.LLJI = c0edc;
    }

    public final void setResourceListInitListener(C0EDS c0eds) {
        this.LLJ = c0eds;
    }

    public final void setResourceListMobListener(C0EDT c0edt) {
        this.LLJIJIL = c0edt;
    }

    public final void setResourceRecyclerListFromXml(RecyclerView recyclerView) {
        this.LLILLL = recyclerView;
    }

    public final void setupList(List<C0EDQ> list) {
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null) {
            Context context = getContext();
            c361100EDs.LLILZLL.clear();
            if (c361100EDs.LL.LJIIJ.LIZ) {
                ResourceItem resourceItem = new ResourceItem();
                resourceItem.isNullItem = true;
                resourceItem.setName(context.getString(2131846494));
                resourceItem.setIcon("");
                resourceItem.setPath("");
                c361100EDs.LLILZLL.add(new C0EDQ(resourceItem, 58));
            }
            c361100EDs.LLILZLL.addAll(list);
            if (c361100EDs.LL.LJIIZILJ.LIZ) {
                ResourceItem resourceItem2 = new ResourceItem();
                resourceItem2.setName(context.getString(2131846493));
                resourceItem2.setIcon("custom");
                resourceItem2.setPath("custom");
                C0EDQ c0edq = new C0EDQ(resourceItem2, 58);
                if (c361100EDs.LL.LJIIJ.LIZ) {
                    ListProtector.add(c361100EDs.LLILZLL, 1, c0edq);
                } else {
                    ListProtector.add(c361100EDs.LLILZLL, 0, c0edq);
                }
            }
            c361100EDs.notifyDataSetChanged();
        }
    }

    public C0EDF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new C0EDP();
        this.LLJILJILJ = -1;
        this.LLJJIII = new AwS584S0100000_5(this, 981);
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJJIJI = c1dfkLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIJIIJIL = C2107308Nj.LIZ.plus(c1dfkLIZ);
    }

    public final void LIZIZ(int i, boolean z) {
        C0EDQ c0edq;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        if (c361100EDs != null && i >= 0 && i < c361100EDs.LLILZLL.size() && (c0edq = (C0EDQ) C13LP.LJJJLZIJ(i, c361100EDs.LLILZLL)) != null) {
            c0edq.LJ = z;
            c361100EDs.notifyItemChanged(i, "enable_refresh");
        }
    }

    public final void LJI(View view, C1DRG c1drg) {
        C19A3 c19a3;
        C1DRG c1drgLJFF;
        if (c1drg != null) {
            this.LLJJ = (InterfaceC361290EEl) c1drg.LJIIL(null, InterfaceC361290EEl.class);
            return;
        }
        if (view == null) {
            view = this;
        }
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (!(sceneLIZ instanceof C19A3) || (c19a3 = (C19A3) sceneLIZ) == null || (c1drgLJFF = C1664600tQ2.LJ(c19a3).LJFF()) == null) {
            return;
        }
        this.LLJJ = (InterfaceC361290EEl) c1drgLJFF.LJIIL(null, InterfaceC361290EEl.class);
    }

    public final void LJIIIZ(final C0EDQ c0edq, final int i, final C0EDQ c0edq2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJILJIL = c0edq.LIZ.getEffectId();
        if (C0EDR.LIZ(this.LLIZ, getResourceProvider(), c0edq)) {
            C0EDC c0edc = this.LLJI;
            if (c0edc != null) {
                c0edc.LIZIZ(i, c0edq.LIZ, true);
            }
            C0EDT c0edt = this.LLJIJIL;
            if (c0edt != null) {
                c0edt.LIZ(true, true, System.currentTimeMillis() - jCurrentTimeMillis, null, null, c0edq2.LIZ);
                return;
            }
            return;
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        InterfaceC360730ECh resourceProvider = getResourceProvider();
        if (resourceProvider == null) {
            return;
        }
        resourceProvider.LIZJ(new InterfaceC365420EUi() { // from class: X.0EDK
            @Override // X.InterfaceC365420EUi
            public final void onProgress(int i2) {
                c0edq.LIZIZ = EnumC361070EDp.LOADING;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onProgress::progress=");
                sbLIZ.append(i2);
                C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C0EDQ c0edq3 = c0edq;
                c0edq3.LIZLLL = i2;
                C361100EDs c361100EDs = this.LIZ.LLIZLLLIL;
                if (c361100EDs != null) {
                    c361100EDs.notifyItemChanged(c361100EDs.LLILZLL.indexOf(c0edq3), "download_refresh");
                }
            }

            @Override // X.InterfaceC365420EUi
            public final void LIZ(String str, C0EDV c0edv) {
                C0EDQ c0edq3 = c0edq;
                c0edq3.LIZIZ = EnumC361070EDp.INIT;
                C361100EDs c361100EDs = this.LIZ.LLIZLLLIL;
                if (c361100EDs != null) {
                    c361100EDs.notifyItemChanged(c361100EDs.LLILZLL.indexOf(c0edq3), "download_refresh");
                }
                C0EDC c0edc2 = this.LIZ.LLJI;
                if (c0edc2 != null) {
                    c0edc2.LIZIZ(i, c0edq2.LIZ, false);
                }
                C0EDT c0edt2 = this.LIZ.LLJIJIL;
                if (c0edt2 != null) {
                    c0edt2.LIZ(false, false, System.currentTimeMillis() - jCurrentTimeMillis2, c0edv.LIZ, Integer.valueOf(c0edv.LIZIZ), c0edq2.LIZ);
                }
            }

            @Override // X.InterfaceC365420EUi
            public final void LJJI(String str, String str2) {
                ArrayList<C0EDQ> arrayList;
                C0EDQ next;
                ArrayList<C0EDQ> arrayList2;
                Integer numValueOf;
                C0EDF c0edf = this.LIZ;
                String str3 = c0edf.LLJILJIL;
                if (str3 != null) {
                    long j = jCurrentTimeMillis2;
                    C0EDQ c0edq3 = c0edq2;
                    int i2 = i;
                    C361100EDs c361100EDs = c0edf.LLIZLLLIL;
                    if (c361100EDs != null && (arrayList = c361100EDs.LLILZLL) != null) {
                        Iterator<C0EDQ> it2 = arrayList.iterator();
                        do {
                            next = null;
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                next = it2.next();
                            }
                        } while (!Intrinsics.LJFF(next.LIZ.getEffectId(), str));
                        C0EDQ c0edq4 = next;
                        if (c0edq4 != null) {
                            c0edq4.LIZIZ = EnumC361070EDp.SUCCESS;
                            C361100EDs c361100EDs2 = c0edf.LLIZLLLIL;
                            if (c361100EDs2 != null && (arrayList2 = c361100EDs2.LLILZLL) != null && (numValueOf = Integer.valueOf(arrayList2.indexOf(c0edq4))) != null) {
                                numValueOf.intValue();
                                C361100EDs c361100EDs3 = c0edf.LLIZLLLIL;
                                if (c361100EDs3 != null) {
                                    c361100EDs3.notifyItemChanged(numValueOf.intValue(), "download_refresh");
                                }
                            }
                        }
                    }
                    if (Intrinsics.LJFF(str3, str) && (!a0.LJJJIL(str))) {
                        C0EDT c0edt2 = c0edf.LLJIJIL;
                        if (c0edt2 != null) {
                            c0edt2.LIZ(true, false, System.currentTimeMillis() - j, null, null, c0edq3.LIZ);
                        }
                        C0EDC c0edc2 = c0edf.LLJI;
                        if (c0edc2 != null) {
                            c0edc2.LIZIZ(i2, c0edq3.LIZ, true);
                        }
                    }
                }
            }
        }, c0edq.LIZ.getEffectId());
    }

    public final ResourceItem LJIIJJI(Function1<? super C0EDQ, Boolean> function1, C0E17 c0e17, Function0<Unit> function0) {
        String resourceId;
        C361100EDs c361100EDs = this.LLIZLLLIL;
        String effectId = null;
        if (c361100EDs == null) {
            return null;
        }
        ResourceItem resourceItem = null;
        int i = 0;
        int i2 = 0;
        for (C0EDQ c0edq : c361100EDs.LLILZLL) {
            int i3 = i + 1;
            if (i >= 0) {
                C0EDQ c0edq2 = c0edq;
                if (function1.invoke(c0edq2).booleanValue()) {
                    c0edq2.LIZJ = true;
                    resourceItem = c0edq2.LIZ;
                    i2 = i;
                } else {
                    c0edq2.LIZJ = false;
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (resourceItem != null) {
            resourceId = resourceItem.getResourceId();
            effectId = resourceItem.getEffectId();
        } else {
            resourceId = null;
        }
        c361100EDs.LLIZLLLIL = resourceId;
        c361100EDs.LLJ = effectId;
        c361100EDs.notifyItemChanged(i2, "select_refresh");
        int i4 = this.LLJILJILJ;
        if (i2 != i4) {
            c361100EDs.notifyItemChanged(i4, "select_refresh");
        }
        this.LLJILJILJ = i2;
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            int i5 = C0E18.LIZ[c0e17.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    recyclerView.scrollToPosition(i2);
                }
            } else {
                recyclerView.smoothScrollToPosition(i2);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
        return resourceItem;
    }

    public static void LJIIJ(C0EDF c0edf, String str, C0E17 c0e17, int i) {
        if ((i & 4) != 0) {
            c0e17 = C0E17.SMOOTH_SCROLL;
        }
        c0edf.getClass();
        c0edf.LJIIJJI(new AwS56S1000000_5(str, 16), c0e17, null);
    }

    public static ResourceItem LJIIL(C0EDF c0edf, String str, C0E17 c0e17, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c0e17 = C0E17.SMOOTH_SCROLL;
        }
        c0edf.getClass();
        return c0edf.LJIIJJI(new C0E1D(str, z), c0e17, null);
    }

    public static void LJFF(C0EDF c0edf, C0ED8 c0ed8, View view, C1DRG c1drg, int i) {
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            c1drg = null;
        }
        if (c0ed8.LJI) {
            c0edf.LJI(view, c1drg);
        }
        c0edf.LJIIIIZZ(c0ed8);
        c0edf.LIZLLL(false);
    }
}
