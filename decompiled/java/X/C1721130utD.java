package X;

import X.C08C9;
import X.C1194810hCJ;
import X.C1721130utD;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS31S0201000_26;
import Y.ARunnableS34S0400000_26;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.card.carousel.CarouselFragment;
import com.bytedance.pipo.stellar.base.card.carousel.CarouselFragmentData;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselV2DO;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0utD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721130utD extends AbstractC1720840usk<CarouselV2DO> {
    public int LLILZ;
    public ViewOnAttachStateChangeListenerC20631115oD LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1721070ut7 LLJILJIL;
    public C1194810hCJ LLJILJILJ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public List<Long> LLILZLL = C13BV.INSTANCE;
    public int LLJIJIL = -1;
    public final ARunnableS126S0100000_26 LLJILLL = new ARunnableS126S0100000_26(this, 13);

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII() {
        this.LLILZIL.removeCallbacks(this.LLJILLL);
        CarouselV2DO carouselV2DO = (CarouselV2DO) this.LLILLL;
        if (carouselV2DO == null || !Intrinsics.LJFF(carouselV2DO.getAutoPlay(), "1") || this.LLIZLLLIL || this.LLJ) {
            return;
        }
        if (this.LLILZ < (carouselV2DO.getItems() != null ? r0.size() - 1 : 0)) {
            BPEAHandler bPEAHandler = this.LLILZIL;
            ARunnableS126S0100000_26 aRunnableS126S0100000_26 = this.LLJILLL;
            Long l = (Long) C13LP.LJJJLZIJ(this.LLILZ, this.LLILZLL);
            C786410Ut5.LJLIIL(l != null ? l.longValue() : 3000L, bPEAHandler, aRunnableS126S0100000_26);
        }
    }

    public final void LJIIIZ(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, int i) {
        ViewGroup viewGroup;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        View childAt = viewOnAttachStateChangeListenerC20631115oD.getChildAt(0);
        if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
            View childAt2 = viewGroup.getChildAt(0);
            if ((childAt2 instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt2) != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem())) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                View viewFindViewById = view.findViewById(R.id.deb);
                if (viewFindViewById != null) {
                    view = viewFindViewById;
                }
                Integer numValueOf = Integer.valueOf(viewOnAttachStateChangeListenerC20631115oD.getWidth());
                if (numValueOf.intValue() <= 0) {
                    View view3 = this.LLILLJJLI;
                    if (view3 != null) {
                        numValueOf = Integer.valueOf(view3.getWidth());
                        if (numValueOf.intValue() <= 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(numValueOf.intValue(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                if (measuredHeight <= 0) {
                    if (i > 0) {
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS31S0201000_26(i, this, viewOnAttachStateChangeListenerC20631115oD, 3));
                        return;
                    }
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewOnAttachStateChangeListenerC20631115oD.getLayoutParams();
                if (layoutParams2 != null && layoutParams2.height != measuredHeight) {
                    layoutParams2.height = measuredHeight;
                    C786410Ut5.W5(viewOnAttachStateChangeListenerC20631115oD, layoutParams2);
                }
                Object parent = viewOnAttachStateChangeListenerC20631115oD.getParent();
                if ((parent instanceof View) && (view2 = (View) parent) != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.height != measuredHeight) {
                    layoutParams.height = measuredHeight;
                    C786410Ut5.W5(view2, layoutParams);
                }
                View view4 = this.LLILLJJLI;
                if (view4 != null) {
                    view4.requestLayout();
                    return;
                }
                return;
            }
        }
        if (i > 0) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS31S0201000_26(i, this, viewOnAttachStateChangeListenerC20631115oD, 4));
        }
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, CarouselV2DO carouselV2DO, EnumC1720670usT enumC1720670usT) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        long jLongValue;
        CarouselV2DO carouselV2DO2 = carouselV2DO;
        super.LJFF(view, carouselV2DO2, enumC1720670usT);
        CarouselFragment.LLILLL = this.LL;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = -1;
        C1846060y8i c1846060y8i = (C1846060y8i) view.findViewById(R.id.dgv);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.dgw);
        List<CardDO> items = carouselV2DO2.getItems();
        if (items == null) {
            items = C13BV.INSTANCE;
        }
        this.LLIZ = viewOnAttachStateChangeListenerC20631115oD;
        int size = items.size();
        ArrayList arrayList = new ArrayList();
        List<String> stayDurations = carouselV2DO2.getStayDurations();
        if (stayDurations != null) {
            Iterator<String> it2 = stayDurations.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(it2.next());
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 3000;
                }
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        while (arrayList.size() < size) {
            arrayList.add(3000L);
        }
        this.LLILZLL = arrayList;
        C1720760usc c1720760usc = this.LL;
        if (c1720760usc != null && (lifecycleOwner = c1720760usc.LIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.stellar.base.card.carousel.CarouselV2Card$registerLifecycleObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    int i = C08C9.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.LL.LJII();
                                return;
                            }
                            return;
                        } else {
                            C1721130utD c1721130utD = this.LL;
                            c1721130utD.LLILZIL.removeCallbacks(c1721130utD.LLJILLL);
                            return;
                        }
                    }
                    C1721130utD c1721130utD2 = this.LL;
                    c1721130utD2.LLILZIL.removeCallbacks(c1721130utD2.LLJILLL);
                    C1194810hCJ c1194810hCJ = this.LL.LLJILJILJ;
                    if (c1194810hCJ != null) {
                        c1194810hCJ.LIZJ();
                    }
                    this.LL.LLJILJILJ = null;
                }
            });
        }
        if (items.isEmpty()) {
            LJIIIIZZ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, carouselV2DO2, items.size());
            return;
        }
        viewOnAttachStateChangeListenerC20631115oD.setUserInputEnabled(true);
        Iterator<CardDO> it3 = items.iterator();
        while (it3.hasNext()) {
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState(), new CarouselFragmentData(C1697810uHb.LJIILJJIL(it3.next()), true));
        }
        LJIIIIZZ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, carouselV2DO2, items.size());
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS34S0400000_26(viewOnAttachStateChangeListenerC20631115oD, this, items, carouselV2DO2, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public final void LJI(float f, int i, int i2) {
        float fLIZLLL;
        ?? arrayList;
        C1721420utg c1721420utg;
        List<String> progressCardIdList;
        if (this.LLJILJIL != null) {
            if (i <= 1) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = C13LZ.LIZLLL((i2 + f) / (i - 1), 0.0f, 1.0f);
            }
            CarouselV2DO carouselV2DO = (CarouselV2DO) this.LLILLL;
            if (carouselV2DO != null && (progressCardIdList = carouselV2DO.getProgressCardIdList()) != null) {
                arrayList = new ArrayList();
                for (String str : progressCardIdList) {
                    if (str.length() > 0) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C00AC c00ac = new C00AC(fLIZLLL, i2, arrayList);
            Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
            if (!arrayList.isEmpty()) {
                C19719612Di.LJJIII(((LinkedHashMap) C1720940usu.LIZ).entrySet(), AFwS231S0000000_3.get$arr$(161), true);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Reference reference = (Reference) ((LinkedHashMap) C1720940usu.LIZ).get(it2.next());
                    if (reference != null && (c1721420utg = (C1721420utg) reference.get()) != null) {
                        float fLIZLLL2 = C13LZ.LIZLLL(C13LZ.LIZLLL(c00ac.LIZIZ, 0.0f, 1.0f), 0.0f, 1.0f);
                        c1721420utg.LLJ = Float.valueOf(fLIZLLL2);
                        c1721420utg.LLJI.LIZ();
                        C1390410mHn c1390410mHn = c1721420utg.LLILZIL;
                        if (c1390410mHn != null) {
                            c1390410mHn.LIZLLL();
                        }
                        C337180DJs.LIZ(c1721420utg.LLILZIL);
                        C1295960jpS c1295960jpS = c1721420utg.LLILZ;
                        if (c1295960jpS != null) {
                            c1295960jpS.pauseAnimation();
                        }
                        C1295960jpS c1295960jpS2 = c1721420utg.LLILZ;
                        if (c1295960jpS2 != null) {
                            c1295960jpS2.setProgress(fLIZLLL2);
                        }
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(C1846060y8i c1846060y8i, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, final CarouselV2DO carouselV2DO, int i) {
        Integer showProgressBar;
        C1194810hCJ c1194810hCJ = this.LLJILJILJ;
        if (c1194810hCJ != null) {
            c1194810hCJ.LIZJ();
        }
        this.LLJILJILJ = null;
        c1846060y8i.LJIIJJI();
        if (i > 0 && (showProgressBar = carouselV2DO.getShowProgressBar()) != null && showProgressBar.intValue() == 1) {
            C786410Ut5.LLZLI(c1846060y8i, 0);
            c1846060y8i.setTabVariant(0);
            c1846060y8i.setLayoutVariant(0);
            c1846060y8i.LJIJJLI(true);
            C1194810hCJ c1194810hCJ2 = new C1194810hCJ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, false, new InterfaceC1194840hCM() { // from class: X.0utF
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i2) {
                    String str;
                    List<String> titles = carouselV2DO.getTitles();
                    if (titles == null || (str = (String) C13LP.LJJJLZIJ(i2, titles)) == null) {
                        str = "";
                    }
                    c1845940y8W.LIZIZ(str);
                }
            });
            c1194810hCJ2.LIZ();
            this.LLJILJILJ = c1194810hCJ2;
            return;
        }
        C786410Ut5.LLZLI(c1846060y8i, 8);
    }
}
