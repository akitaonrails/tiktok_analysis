package X;

import Y.ARunnableS110S0100000_10;
import Y.AsS37S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.arch.Inset;
import com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStickyLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStyle;
import com.ss.android.ugc.aweme.ecommerce.arch.SpaceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678140Qiq {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJI;
    public Context LIZ;
    public LifecycleOwner LIZIZ;
    public C0HA4 LIZJ;
    public LinearLayout LIZLLL;
    public Map<String, Object> LJ;
    public List<? extends Class<? extends MixAssemPowerCell<?, ?>>> LJI;
    public Class<? extends PowerCell<? extends C14NM>> LJII;
    public MixPageViewModel LJIIL;
    public MixStickyLayoutManager LJIILIIL;
    public C15WQ LJIILJJIL;
    public AbstractC677860QiO LJIILL;
    public AbstractC677860QiO LJIILLIIL;
    public C1540620qC4 LJIIZILJ;
    public String LJIJ;
    public AnonymousClass0956 LJIL;
    public AnonymousClass0956 LJJ;
    public Map<Integer, InterfaceC677850QiN<AbstractC677870QiP, AbstractC677840QiM>> LJFF = new LinkedHashMap();
    public Set<C13IQ<Object>> LJIIIIZZ = new LinkedHashSet();
    public boolean LJIIIZ = true;
    public int LJIIJ = 2;
    public int LJIIJJI = 8;
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(61));
    public final C01GW LJIJJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(62));
    public final C15WR LJIJJLI = new C15WS() { // from class: X.15WR
        @Override // X.C15WS
        public final void LIZ(int i) {
        }

        @Override // X.C15WS
        public final void LIZJ(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            int iLJ;
            int iLJJJJZI;
            Iterator it2 = ((List) this.LIZ.LJIJJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((C15WS) it2.next()).LIZJ(c21673319rv, c21673919s1);
            }
            C15WQ c15wq = this.LIZ.LJIILJJIL;
            if (c15wq != null) {
                try {
                    if (!((ArrayList) c15wq.LJII).isEmpty() && !((ArrayList) c15wq.LJIIIIZZ).isEmpty() && (iLJ = c15wq.LJ(0)) >= 0 && iLJ <= ((Number) C13LP.LJJLJ(c15wq.LJII)).intValue() + 2) {
                        if (iLJ <= ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue() && (iLJJJJZI = C13LQ.LJJJJZI(c15wq.LIZJ.LJIILL(null))) >= 0) {
                            if (iLJJJJZI <= ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue()) {
                                c15wq.LJIIJJI(true);
                                return;
                            }
                            if (iLJJJJZI == 0) {
                                List<Integer> list = c15wq.LJIIIIZZ;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : (ArrayList) list) {
                                    if (((ArrayList) c15wq.LJI).contains(Integer.valueOf(((Number) obj).intValue()))) {
                                        arrayList.add(obj);
                                    }
                                }
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    int iIntValue = ((Number) it3.next()).intValue();
                                    Integer num = (Integer) ((LinkedHashMap) c15wq.LJIIJ).get(Integer.valueOf(iIntValue));
                                    if (num != null && num.intValue() != 0) {
                                        c15wq.LJIIJ.put(Integer.valueOf(iIntValue), 0);
                                    }
                                    c15wq.LJIIJ(iIntValue);
                                }
                            }
                        }
                        if (iLJ < ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue()) {
                            c15wq.LJIIJJI(false);
                        } else if (((ArrayList) c15wq.LJII).contains(Integer.valueOf(iLJ))) {
                            ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue();
                            ((Number) C13LP.LJJLJ(c15wq.LJII)).intValue();
                            c15wq.LJIIIIZZ(c21673319rv);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }

        @Override // X.C15WS
        public final int LIZIZ(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            int iLJ;
            Iterator it2 = ((List) this.LIZ.LJIJJ.getValue()).iterator();
            while (it2.hasNext()) {
                if (((C15WS) it2.next()).LIZIZ(i, c21673319rv, c21673919s1) > 0) {
                    return 1;
                }
            }
            C15WQ c15wq = this.LIZ.LJIILJJIL;
            if (c15wq == null) {
                return -1;
            }
            try {
                if (!((ArrayList) c15wq.LJII).isEmpty() && (iLJ = c15wq.LJ(i)) >= 0) {
                    if (i > 0) {
                        int iIntValue = ((Number) C13LP.LJJLJ(c15wq.LJII)).intValue();
                        if (iLJ > iIntValue + 2) {
                            c15wq.LIZ(i, iLJ);
                            return 1;
                        }
                        int i2 = iIntValue + 1;
                        if (iLJ >= iIntValue + 3 || i2 > iLJ) {
                            if (((ArrayList) c15wq.LJII).contains(Integer.valueOf(iLJ))) {
                                ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue();
                                c15wq.LJIIIIZZ(c21673319rv);
                            }
                        } else if (((ArrayList) c15wq.LJIIIIZZ).isEmpty() || c15wq.LIZIZ.getChildCount() == 0) {
                            ((ArrayList) c15wq.LJIIIIZZ).clear();
                            C786410Ut5.LJJJJJL(c15wq.LIZIZ);
                            ((LinkedHashMap) c15wq.LJIIJJI).clear();
                            ((LinkedHashMap) c15wq.LJIIIZ).clear();
                            ((LinkedHashMap) c15wq.LJIIJ).clear();
                            ((Number) C13LP.LJJZZIII(c15wq.LJII)).intValue();
                            c15wq.LJIIIIZZ(c21673319rv);
                        }
                        c15wq.LIZ(i, iLJ);
                        return 0;
                    }
                    if (i < 0) {
                        if (c15wq.LJIILIIL()) {
                            c15wq.LJIIJJI(false);
                        }
                        c15wq.LIZ(i, iLJ);
                        return 0;
                    }
                    return 0;
                }
                return -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
    };

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C678140Qiq.class, "vm", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C678140Qiq.class, "vm", "<v#1>", 0);
        c09r3.getClass();
        LJJI = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
    }

    public final void LIZIZ() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iIntValue;
        View viewFindViewByPosition;
        try {
            C0HA4 c0ha4 = this.LIZJ;
            if (c0ha4 == null) {
                c0ha4 = null;
            }
            RecyclerView.LayoutManager layoutManager = c0ha4.getLayoutManager();
            if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null) {
                return;
            }
            C0HA4 c0ha42 = this.LIZJ;
            if (c0ha42 == null) {
                c0ha42 = null;
            }
            int paddingTop = c0ha42.getPaddingTop();
            if (paddingTop <= 0) {
                return;
            }
            int[] iArrLJIJ = staggeredGridLayoutManager.LJIJ(null);
            ArrayList arrayList = new ArrayList();
            for (int i : iArrLJIJ) {
                if (i >= 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            Integer num = (Integer) C13LP.LJJLL(arrayList);
            if (num == null || (viewFindViewByPosition = staggeredGridLayoutManager.findViewByPosition((iIntValue = num.intValue()))) == null) {
                return;
            }
            int top = viewFindViewByPosition.getTop();
            if (iIntValue == 0) {
                int i2 = paddingTop - top;
                if (i2 < 0 || i2 <= 0) {
                    return;
                }
                staggeredGridLayoutManager.offsetChildrenVertical(i2);
                C0HA4 c0ha43 = this.LIZJ;
                (c0ha43 != null ? c0ha43 : null).invalidate();
                return;
            }
            if (iIntValue != 1 || Math.abs(top - paddingTop) > 4) {
                return;
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(0, paddingTop);
            C0HA4 c0ha44 = this.LIZJ;
            if (c0ha44 == null) {
                c0ha44 = null;
            }
            c0ha44.requestLayout();
            C0HA4 c0ha45 = this.LIZJ;
            (c0ha45 != null ? c0ha45 : null).invalidate();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ() {
        MixPageViewModel mixPageViewModel = this.LJIIL;
        if (mixPageViewModel == null) {
            mixPageViewModel = null;
        }
        C0HA4 c0ha4 = this.LIZJ;
        if (c0ha4 == null) {
            c0ha4 = null;
        }
        mixPageViewModel.LL = String.valueOf(c0ha4.hashCode());
        List<? extends Class<? extends MixAssemPowerCell<?, ?>>> list = this.LJI;
        if (list == null) {
            list = null;
        }
        for (Class<? extends MixAssemPowerCell<?, ?>> cls : list) {
            C0HA4 c0ha42 = this.LIZJ;
            if (c0ha42 == null) {
                c0ha42 = null;
            }
            c0ha42.LJIILJJIL(cls);
        }
        MixStickyLayoutManager mixStickyLayoutManager = new MixStickyLayoutManager(this.LJIIJ, this.LJIJJLI);
        this.LJIILIIL = mixStickyLayoutManager;
        C0HA4 c0ha43 = this.LIZJ;
        if (c0ha43 == null) {
            c0ha43 = null;
        }
        c0ha43.setLayoutManager(mixStickyLayoutManager);
        C0HA4 c0ha44 = this.LIZJ;
        if (c0ha44 == null) {
            c0ha44 = null;
        }
        c0ha44.addItemDecoration(new C0DXR() { // from class: X.0Qix
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                List<InterfaceC1891350zJl> listItems;
                InterfaceC1891350zJl interfaceC1891350zJl;
                AbstractC677840QiM abstractC677840QiM;
                int i;
                Long lValueOf;
                Inset inset;
                AbstractC677840QiM abstractC677840QiM2;
                AbstractC677870QiP abstractC677870QiP;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                Long lValueOf2 = null;
                if ((recyclerView instanceof C0HA4) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null) {
                    listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems();
                    if (listItems != null) {
                        interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(childAdapterPosition, listItems);
                    }
                    if (!(interfaceC1891350zJl instanceof AbstractC677840QiM) && (abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl) != null && abstractC677840QiM.LLILLJJLI != null) {
                        C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
                        MixStyle mixStyle = abstractC677840QiM.LLILLJJLI;
                        if (mixStyle == null || (i = mixStyle.column) == 0) {
                            return;
                        }
                        if (i == 1) {
                            Inset inset2 = mixStyle.marginInfo;
                            if (inset2 != null) {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(inset2.marginLeft)));
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(inset2.marginRight)));
                            }
                        } else if (c21681819tI.LIZ() % mixStyle.column == 0) {
                            SpaceInfo spaceInfo = mixStyle.spaceInfo;
                            if (spaceInfo != null) {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo.colSpace)));
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo.colSpace / 2)));
                            }
                        } else {
                            int iLIZ = c21681819tI.LIZ();
                            int i2 = mixStyle.column;
                            if (iLIZ % i2 == i2 - 1) {
                                SpaceInfo spaceInfo2 = mixStyle.spaceInfo;
                                if (spaceInfo2 != null) {
                                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo2.colSpace / 2)));
                                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo2.colSpace)));
                                }
                            } else {
                                SpaceInfo spaceInfo3 = mixStyle.spaceInfo;
                                if (spaceInfo3 != null) {
                                    float f = 2;
                                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo3.colSpace / f)));
                                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo3.colSpace / f)));
                                }
                            }
                        }
                        AbstractC677870QiP abstractC677870QiP2 = abstractC677840QiM.LL;
                        if (abstractC677870QiP2 != null) {
                            lValueOf = Long.valueOf(abstractC677870QiP2.LJ);
                        } else {
                            lValueOf = null;
                        }
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(childAdapterPosition - mixStyle.column, listItems);
                        if ((objLJJJLZIJ instanceof AbstractC677840QiM) && (abstractC677840QiM2 = (AbstractC677840QiM) objLJJJLZIJ) != null && (abstractC677870QiP = abstractC677840QiM2.LL) != null) {
                            lValueOf2 = Long.valueOf(abstractC677870QiP.LJ);
                        }
                        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                            Inset inset3 = mixStyle.marginInfo;
                            if (inset3 != null) {
                                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(inset3.marginTop)));
                            }
                        } else {
                            SpaceInfo spaceInfo4 = mixStyle.spaceInfo;
                            if (spaceInfo4 != null) {
                                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo4.rowSpace / 2)));
                            }
                        }
                        SpaceInfo spaceInfo5 = mixStyle.spaceInfo;
                        if (spaceInfo5 != null) {
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(spaceInfo5.rowSpace / 2)));
                        }
                        if (mixStyle.spaceInfo == null && (inset = mixStyle.marginInfo) != null) {
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(inset.marginBottom)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                listItems = null;
                interfaceC1891350zJl = null;
                if (!(interfaceC1891350zJl instanceof AbstractC677840QiM)) {
                }
            }
        });
        C0HA4 c0ha45 = this.LIZJ;
        if (c0ha45 == null) {
            c0ha45 = null;
        }
        C20600815jK<InterfaceC1891350zJl> state = c0ha45.getState();
        if (state != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        C0HA4 c0ha46 = this.LIZJ;
        if (c0ha46 == null) {
            c0ha46 = null;
        }
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        MixStickyLayoutManager mixStickyLayoutManager2 = this.LJIILIIL;
        if (mixStickyLayoutManager2 == null) {
            mixStickyLayoutManager2 = null;
        }
        this.LJIILJJIL = new C15WQ(c0ha46, linearLayout, mixStickyLayoutManager2);
        C0HA4 c0ha47 = this.LIZJ;
        (c0ha47 != null ? c0ha47 : null).addOnScrollListener(new AsS37S0100000_10(this, 0));
    }

    public final void LIZLLL() {
        MixPageViewModel mixPageViewModel = this.LJIIL;
        AnonymousClass0956 anonymousClass0956LJI = null;
        if (mixPageViewModel == null) {
            mixPageViewModel = null;
        }
        if (Intrinsics.LJFF(mixPageViewModel.getState().LL, C677990Qib.LIZ)) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            MixPageViewModel mixPageViewModel2 = this.LJIIL;
            C1396605dM c1396605dM = (mixPageViewModel2 == null ? null : mixPageViewModel2).LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            if (c1396605dM.LIZLLL.LIZJ <= 0) {
                (mixPageViewModel2 != null ? mixPageViewModel2 : null).LLJ.postValue(Integer.valueOf(EnumC677800QiI.NO_MORE.getValue()));
                return;
            }
            C1396605dM c1396605dM2 = (mixPageViewModel2 == null ? null : mixPageViewModel2).LLILZ;
            if (c1396605dM2 == null) {
                c1396605dM2 = null;
            }
            long j = c1396605dM2.LIZLLL.LIZLLL;
            if (mixPageViewModel2 == null) {
                mixPageViewModel2 = null;
            }
            C1396605dM c1396605dM3 = mixPageViewModel2.LLILZ;
            if (c1396605dM3 == null) {
                c1396605dM3 = null;
            }
            int i = c1396605dM3.LIZLLL.LJ;
            AbstractC677860QiO abstractC677860QiO = this.LJIILLIIL;
            if (abstractC677860QiO == null) {
                abstractC677860QiO = null;
            }
            C675270QeD c675270QeDLIZ = abstractC677860QiO.LIZ();
            if (c675270QeDLIZ != null) {
                c675270QeDLIZ.LIZ = j;
                c675270QeDLIZ.LIZIZ = i;
                c675270QeDLIZ.LIZJ = EnumC675700Qeu.LOAD_MORE.getValue();
            } else {
                c675270QeDLIZ = null;
            }
            InterfaceC677290QhT interfaceC677290QhT = new InterfaceC677290QhT() { // from class: X.0Qj5
                @Override // X.InterfaceC677290QhT
                public final void LIZ(C675270QeD c675270QeD, C1422405hW c1422405hW) {
                }

                @Override // X.InterfaceC677290QhT
                public final void onStart() {
                }

                @Override // X.InterfaceC677290QhT
                public final void LIZIZ(C675270QeD c675270QeD, C676770Qgd c676770Qgd) {
                    AnonymousClass0956 anonymousClass09562 = this.LIZ.LJIL;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                }
            };
            AnonymousClass0956 anonymousClass09562 = this.LJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            if (c675270QeDLIZ != null) {
                MixPageViewModel mixPageViewModel3 = this.LJIIL;
                if (mixPageViewModel3 == null) {
                    mixPageViewModel3 = null;
                }
                Context context = this.LIZ;
                if (context == null) {
                    context = null;
                }
                AbstractC677860QiO abstractC677860QiO2 = this.LJIILLIIL;
                AbstractC677860QiO abstractC677860QiO3 = abstractC677860QiO2 != null ? abstractC677860QiO2 : null;
                mixPageViewModel3.getClass();
                anonymousClass0956LJI = C948503nH.LJI(mixPageViewModel3, C0PEM.LIZJ, new C677730QiB(abstractC677860QiO3, context, mixPageViewModel3, c675270QeDLIZ, interfaceC677290QhT, null));
            }
            this.LJIL = anonymousClass0956LJI;
        }
    }

    public final void LJFF() {
        AnonymousClass0956 anonymousClass0956 = this.LJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIL = null;
        C15WQ c15wq = this.LJIILJJIL;
        if (c15wq != null) {
            c15wq.LJIIL();
        }
        MixPageViewModel mixPageViewModel = this.LJIIL;
        if (mixPageViewModel == null) {
            mixPageViewModel = null;
        }
        mixPageViewModel.LLJILJIL.setValue(0);
        MixPageViewModel mixPageViewModel2 = this.LJIIL;
        if (mixPageViewModel2 == null) {
            mixPageViewModel2 = null;
        }
        C1396605dM c1396605dM = mixPageViewModel2.LLILZ;
        if (c1396605dM == null) {
            c1396605dM = null;
        }
        C1397505dV c1397505dV = c1396605dM.LIZLLL;
        c1397505dV.LIZ.clear();
        c1397505dV.LIZIZ.clear();
        c1397505dV.LIZJ = -1;
        c1397505dV.LIZLLL = -1L;
        c1397505dV.LJ = 0;
        c1397505dV.LJFF = null;
        c1397505dV.LJI = null;
    }

    public static String LJII(AbstractC677840QiM abstractC677840QiM) {
        AbstractC677870QiP abstractC677870QiP;
        if (abstractC677840QiM != null && (abstractC677870QiP = abstractC677840QiM.LL) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(abstractC677870QiP.LIZIZ);
            sbLIZ.append(':');
            sbLIZ.append(abstractC677870QiP.LIZJ);
            sbLIZ.append(':');
            sbLIZ.append(abstractC677870QiP.LJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public final List<AbstractC677840QiM> LIZ(List<? extends AbstractC677840QiM> list) {
        ArrayList arrayList = new ArrayList(list);
        MixPageViewModel mixPageViewModel = this.LJIIL;
        if (mixPageViewModel == null) {
            mixPageViewModel = null;
        }
        C678110Qin value = mixPageViewModel.LLJI.getValue();
        if (value != null && value.LIZ == 1) {
            ArrayList<AbstractC677840QiM> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((AbstractC677840QiM) obj).LLILZ != null) {
                    arrayList2.add(obj);
                }
            }
            for (AbstractC677840QiM abstractC677840QiM : arrayList2) {
                int iIndexOf = arrayList.indexOf(abstractC677840QiM);
                int iIndexOf2 = arrayList.indexOf(abstractC677840QiM.LLILZ);
                if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf != iIndexOf2 + 1) {
                    Object objRemove = ListProtector.remove(arrayList, iIndexOf);
                    int iIndexOf3 = arrayList.indexOf(abstractC677840QiM.LLILZ) + 1;
                    if (iIndexOf3 < arrayList.size()) {
                        ListProtector.add(arrayList, iIndexOf3, objRemove);
                    } else {
                        arrayList.add(objRemove);
                    }
                }
            }
        }
        Iterator it2 = ((List) this.LJIJI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC678410QjH) it2.next()).LIZIZ(arrayList);
        }
        return arrayList;
    }

    public final void LJI(String str, List list) {
        try {
            if (!((Boolean) C136800fe.LIZ.getValue()).booleanValue()) {
                return;
            }
            String strLJII = LJII((AbstractC677840QiM) C13LP.LJJJLL(list));
            if (str != null && !Intrinsics.LJFF(strLJII, str) && Intrinsics.LJFF(LJII((AbstractC677840QiM) C13LP.LJJJLZIJ(1, list)), str)) {
                C0HA4 c0ha4 = this.LIZJ;
                if (c0ha4 == null) {
                    c0ha4 = null;
                }
                HandlerHook.viewPost(c0ha4, new ARunnableS110S0100000_10(this, 98));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final AnonymousClass0956 LJ(Context context, C675150Qe1 c675150Qe1, InterfaceC677290QhT interfaceC677290QhT) {
        MixPageViewModel mixPageViewModel = this.LJIIL;
        if (mixPageViewModel == null) {
            mixPageViewModel = null;
        }
        AbstractC677860QiO abstractC677860QiO = this.LJIILL;
        if (abstractC677860QiO == null) {
            abstractC677860QiO = null;
        }
        mixPageViewModel.getClass();
        return C948503nH.LJI(mixPageViewModel, C2126308Ur.LJ, new C677720QiA(abstractC677860QiO, context, mixPageViewModel, c675150Qe1, interfaceC677290QhT, null));
    }
}
