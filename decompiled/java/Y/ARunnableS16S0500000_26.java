package Y;

import X.AbstractC712240Rwk;
import X.C08CA;
import X.C1092580eXQ;
import X.C118300cf;
import X.C13LP;
import X.C1548870qPN;
import X.C1697810uHb;
import X.C16G0;
import X.C16G1;
import X.C1707440uX8;
import X.C1708910uZV;
import X.C1709050uZj;
import X.C1709070uZl;
import X.C1709220ua0;
import X.C1709570uaZ;
import X.C1720760usc;
import X.C1721140utE;
import X.C1721220utM;
import X.C1721230utN;
import X.C1749280vcc;
import X.C1C7U;
import X.C2095008Iq;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C450740Hlw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1720960usw;
import X.InterfaceC960503pD;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.card.carousel.CarouselFragmentData;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselDO;
import com.bytedance.pipo.stellar.base.model.CarouselItem;
import com.bytedance.pipo.stellar.base.model.ColorDO;
import com.bytedance.pipo.stellar.base.model.CornerDO;
import com.bytedance.pipo.stellar.base.model.prop.CarouselPageChangeContent;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeBubble;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS16S0500000_26 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewGroup viewGroup;
        if (((View) this.l0).getParent() == null) {
            return;
        }
        CommerceAiPdpFragment commerceAiPdpFragment = (CommerceAiPdpFragment) this.l1;
        View view = (View) this.l0;
        FrameLayout frameLayout = (FrameLayout) this.l2;
        commerceAiPdpFragment.LLILLL = frameLayout;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof C16G0) {
                commerceAiPdpFragment.LLILZ = (C16G0) parent;
                break;
            }
            parent = parent.getParent();
        }
        C16G0 c16g0 = commerceAiPdpFragment.LLILZ;
        if (c16g0 != null) {
            View viewFindViewById = c16g0.findViewById(R.id.fpl);
            if (viewFindViewById != null) {
                viewFindViewById.setElevation(0.0f);
            }
            frameLayout.setElevation(1.0f);
            ViewParent parent2 = frameLayout.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
            }
            C16G1 c16g1 = new C16G1(-1, -2);
            c16g1.LIZJ = 80;
            c16g0.addView(frameLayout, c16g1);
            frameLayout.bringToFront();
        }
        C786410Ut5.LLLZLZ((C1749280vcc) this.l3, 8);
        C786410Ut5.LLIZLLLIL((RecyclerView) this.l4, 0);
        C786410Ut5.LJZ(0, (FrameLayout) this.l2);
    }

    public final void LIZ$1() {
        if (!Intrinsics.LJFF(((CarouselDO) this.l0).getRepeatable(), "1") || ((C1721140utE) this.l1).LLILZIL < 2) {
            ((ViewOnAttachStateChangeListenerC20631115oD) this.l2).setCurrentItem(0, false);
            ((C1721140utE) this.l1).LLILZ = 0;
        } else {
            ((ViewOnAttachStateChangeListenerC20631115oD) this.l2).setCurrentItem(1, false);
            ((C1721140utE) this.l1).LLILZ = 1;
        }
        ((C1721220utM) this.l3).LIZ(0, Intrinsics.LJFF(((CarouselDO) this.l0).getAutoPlay(), "1"), ((Boolean) ListProtector.get(((C1721140utE) this.l1).LLIZ, 0)).booleanValue());
        final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) this.l2;
        final C1721140utE c1721140utE = (C1721140utE) this.l1;
        final CarouselDO carouselDO = (CarouselDO) this.l0;
        final C118300cf c118300cf = (C118300cf) this.l4;
        final C1721220utM c1721220utM = (C1721220utM) this.l3;
        viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0utB
            @Override // X.AbstractC712240Rwk
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                InterfaceC1720050urT interfaceC1720050urT;
                BaseWidgetDO baseWidgetDO;
                Map<String, Object> trackingParams;
                Function0<Map<String, Object>> function0;
                Map<String, Object> mapInvoke;
                int i2 = i;
                c1721140utE.LLILZ = i2;
                if (Intrinsics.LJFF(carouselDO.getRepeatable(), "1")) {
                    C1721140utE c1721140utE2 = c1721140utE;
                    if (c1721140utE2.LLILZIL >= 2) {
                        if (i2 == 0) {
                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = viewOnAttachStateChangeListenerC20631115oD;
                            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20631115oD2, new ARunnableS81S0200000_12(c1721140utE2, viewOnAttachStateChangeListenerC20631115oD2, 129), 300L);
                            i2 = c1721140utE.LLILZIL;
                        } else if (i2 == c1721140utE2.LLILZLL - 1) {
                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = viewOnAttachStateChangeListenerC20631115oD;
                            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS112S0100000_12(viewOnAttachStateChangeListenerC20631115oD3, 383), 300L);
                            i2 = 0;
                        }
                        i2--;
                    }
                }
                if (c118300cf.element != i2) {
                    c1721220utM.LIZ(i2, Intrinsics.LJFF(carouselDO.getAutoPlay(), "1"), ((Boolean) ListProtector.get(c1721140utE.LLIZ, i2)).booleanValue());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1720760usc c1720760usc = c1721140utE.LL;
                    if (c1720760usc != null && (function0 = c1720760usc.LIZJ) != null && (mapInvoke = function0.invoke()) != null) {
                        linkedHashMap.putAll(mapInvoke);
                    }
                    List<CarouselItem> items = carouselDO.getItems();
                    if (items != null && (baseWidgetDO = (BaseWidgetDO) ListProtector.get(items, i2)) != null && (trackingParams = baseWidgetDO.getTrackingParams()) != null) {
                        linkedHashMap.putAll(trackingParams);
                    }
                    int i3 = i2 + 1;
                    linkedHashMap.put("shuffling_order", Integer.valueOf(i3));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                    }
                    C1716310ulR.LIZ.getClass();
                    C1716310ulR.LIZLLL("pipo_module_show", linkedHashMap2);
                    C1720760usc c1720760usc2 = c1721140utE.LL;
                    if (c1720760usc2 != null && (interfaceC1720050urT = c1720760usc2.LIZIZ) != null) {
                        interfaceC1720050urT.bL(new StellarActionDO(Integer.valueOf(EnumC1720490usB.CAROUSEL_PAGE_CHANGE.getValue()), null, null, null, null, null, null, new CarouselPageChangeContent(Integer.valueOf(i3)), null, null), null, null);
                    }
                }
                c118300cf.element = i2;
            }
        });
    }

    public final void LIZ$2() {
        CarouselItem carouselItem;
        boolean z;
        CarouselItem carouselItem2;
        Lifecycle lifecycle;
        Long lLJIILIIL;
        String stayDuration;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) ((View) this.l0).findViewById(R.id.view_pager);
        ArrayList arrayList = new ArrayList();
        List<String> stayDurations = ((CarouselDO) this.l1).getStayDurations();
        if (stayDurations != null) {
            CarouselDO carouselDO = (CarouselDO) this.l1;
            Iterator<String> it2 = stayDurations.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(it2.next());
                arrayList.add(Long.valueOf((lLJIILIIL2 == null && ((stayDuration = carouselDO.getStayDuration()) == null || (lLJIILIIL2 = C2095008Iq.LJIILIIL(stayDuration)) == null)) ? 3000L : lLJIILIIL2.longValue()));
            }
        }
        int size = arrayList.size();
        List<CarouselItem> items = ((CarouselDO) this.l1).getItems();
        if (size < (items != null ? items.size() : 0)) {
            List<CarouselItem> items2 = ((CarouselDO) this.l1).getItems();
            int size2 = (items2 != null ? items2.size() : 0) - arrayList.size();
            for (int i = 0; i < size2; i++) {
                String stayDuration2 = ((CarouselDO) this.l1).getStayDuration();
                arrayList.add(Long.valueOf((stayDuration2 == null || (lLJIILIIL = C2095008Iq.LJIILIIL(stayDuration2)) == null) ? 3000L : lLJIILIIL.longValue()));
            }
        }
        final C1721220utM c1721220utM = (C1721220utM) this.l2;
        C1720760usc c1720760usc = ((C1721140utE) this.l3).LL;
        LifecycleOwner lifecycleOwner = c1720760usc != null ? c1720760usc.LIZ : null;
        List<CarouselItem> items3 = ((CarouselDO) this.l1).getItems();
        int size3 = items3 != null ? items3.size() : 0;
        ColorDO barForegroundColor = ((CarouselDO) this.l1).getBarForegroundColor();
        ColorDO barBackgroundColor = ((CarouselDO) this.l1).getBarBackgroundColor();
        AwS270S0300000_26 awS270S0300000_26 = new AwS270S0300000_26((C1721140utE) this.l3, (CarouselDO) this.l1, viewOnAttachStateChangeListenerC20631115oD, 128);
        c1721220utM.getClass();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1721220utM, null);
        c1721220utM.removeAllViews();
        ((ArrayList) c1721220utM.LL).clear();
        int width = (int) ((c1721220utM.getWidth() - ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) * size3) - 1)) / size3);
        int i2 = 0;
        while (i2 < size3) {
            C1721230utN c1721230utN = new C1721230utN(c1721220utM.getContext());
            if (i2 == 0) {
                i2 = 0;
                c1721230utN.LIZ(width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), new BackgroundDO(new CornerDO(0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, null), null, barForegroundColor, null, null, null), new BackgroundDO(new CornerDO(0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, null), null, barBackgroundColor, null, null, null), ((Number) ListProtector.get(arrayList, 0)).longValue(), awS270S0300000_26);
            } else if (i2 == size3 - 1) {
                c1721230utN.LIZ(width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), new BackgroundDO(new CornerDO(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null), null, barForegroundColor, null, null, null), new BackgroundDO(new CornerDO(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null), null, barBackgroundColor, null, null, null), ((Number) ListProtector.get(arrayList, i2)).longValue(), awS270S0300000_26);
                C426750GoL.LJIIIZ(c1721230utN, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
            } else {
                c1721230utN.LIZ(width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), new BackgroundDO(new CornerDO(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null), null, barForegroundColor, null, null, null), new BackgroundDO(new CornerDO(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null), null, barBackgroundColor, null, null, null), ((Number) ListProtector.get(arrayList, i2)).longValue(), awS270S0300000_26);
                C426750GoL.LJIIIZ(c1721230utN, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
            }
            c1721220utM.addView(c1721230utN);
            ((ArrayList) c1721220utM.LL).add(c1721230utN);
            i2++;
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.stellar.base.card.carousel.TabView$initData$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ValueAnimator valueAnimator;
                    ValueAnimator valueAnimator2;
                    int i3 = C08CA.LIZ[event.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                C1721220utM c1721220utM2 = c1721220utM;
                                C1721230utN c1721230utN2 = (C1721230utN) ListProtector.get(c1721220utM2.LL, c1721220utM2.LLILLJJLI);
                                ValueAnimator valueAnimator3 = c1721230utN2.LL;
                                if (valueAnimator3 != null && valueAnimator3.isPaused() && (valueAnimator2 = c1721230utN2.LL) != null) {
                                    valueAnimator2.resume();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C1721220utM c1721220utM3 = c1721220utM;
                        C1721230utN c1721230utN3 = (C1721230utN) ListProtector.get(c1721220utM3.LL, c1721220utM3.LLILLJJLI);
                        ValueAnimator valueAnimator4 = c1721230utN3.LL;
                        if (valueAnimator4 == null || !valueAnimator4.isRunning() || (valueAnimator = c1721230utN3.LL) == null) {
                            return;
                        }
                        valueAnimator.pause();
                        return;
                    }
                    for (C1721230utN c1721230utN4 : (ArrayList) c1721220utM.LL) {
                        ValueAnimator valueAnimator5 = c1721230utN4.LL;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                        }
                        c1721230utN4.LLILZIL = null;
                    }
                    C1092580eXQ.LIZJ("MSG_TYPE_LOTTIE_STATUS_UPDATE", c1721220utM);
                }
            });
        }
        viewOnAttachStateChangeListenerC20631115oD.setUserInputEnabled(true);
        C1721140utE c1721140utE = (C1721140utE) this.l3;
        List<CarouselItem> items4 = ((CarouselDO) this.l1).getItems();
        c1721140utE.LLILZIL = items4 != null ? items4.size() : 0;
        C1721140utE c1721140utE2 = (C1721140utE) this.l3;
        List<CarouselItem> items5 = ((CarouselDO) this.l1).getItems();
        c1721140utE2.LLILZLL = (items5 != null ? items5.size() : 0) + 2;
        ArrayList arrayList2 = new ArrayList();
        if (Intrinsics.LJFF(((CarouselDO) this.l1).getRepeatable(), "1") && ((C1721140utE) this.l3).LLILZIL >= 2) {
            List<CarouselItem> items6 = ((CarouselDO) this.l1).getItems();
            arrayList2.add(new CarouselFragmentData((items6 == null || (carouselItem2 = (CarouselItem) C13LP.LJJLIIIJJI(items6)) == null) ? null : carouselItem2.getCardList(), false));
        }
        List<CarouselItem> items7 = ((CarouselDO) this.l1).getItems();
        if (items7 != null) {
            C1721140utE c1721140utE3 = (C1721140utE) this.l3;
            int i3 = 0;
            for (CarouselItem carouselItem3 : items7) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                CarouselItem carouselItem4 = carouselItem3;
                arrayList2.add(new CarouselFragmentData(carouselItem4.getCardList(), false));
                List<Boolean> list = c1721140utE3.LLIZ;
                List<CardDO> cardList = carouselItem4.getCardList();
                if (cardList != null) {
                    Iterator<CardDO> it3 = cardList.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().getType(), EnumC1720960usw.CARD_LOTTIE.getValue())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                ListProtector.add(list, i3, Boolean.valueOf(z));
                i3 = i4;
            }
        }
        if (Intrinsics.LJFF(((CarouselDO) this.l1).getRepeatable(), "1") && ((C1721140utE) this.l3).LLILZIL >= 2) {
            List<CarouselItem> items8 = ((CarouselDO) this.l1).getItems();
            arrayList2.add(new CarouselFragmentData((items8 == null || (carouselItem = (CarouselItem) C13LP.LJJJJZI(items8)) == null) ? null : carouselItem.getCardList(), false));
        }
        viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState().LIZLLL(arrayList2, null);
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS16S0500000_26((CarouselDO) this.l1, (C1721140utE) this.l3, viewOnAttachStateChangeListenerC20631115oD, (C1721220utM) this.l2, (C118300cf) this.l4, 1));
    }

    public final void LIZ$3() {
        C1709570uaZ c1709570uaZ = (C1709570uaZ) this.l0;
        c1709570uaZ.LJJIFFI = ((CashierKey) this.l1).payRequestId;
        C1709070uZl c1709070uZl = ((C1708910uZV) this.l2).LJFF;
        c1709570uaZ.LJJLIIIJILLIZJL(c1709070uZl.LJFF, c1709070uZl.LJI, c1709070uZl.LJII);
        if (!((C1708910uZV) this.l2).LJFF.LJII) {
            ((C1709570uaZ) this.l0).LJIILL(((C1709050uZj) this.l3).LIZ);
        }
        ((C1709050uZj) this.l3).LIZIZ();
        ((C1709050uZj) this.l3).LIZ((C1709570uaZ) this.l0, (C1708910uZV) this.l2, (CashierKey) this.l1, (C1709220ua0) this.l4);
    }

    public static final void run$0(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceAiPdpFragment@c1d1.setupLoadingAndVisibility$1");
        try {
            aRunnableS16S0500000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceAiPdpFragment@c1d1.setupLoadingAndVisibility$1");
    }

    public static final void run$1(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselCard@cad.onBindView$1$1$4");
        try {
            aRunnableS16S0500000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselCard@cad.onBindView$1$1$4");
    }

    public static final void run$2(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselCard@cad.onBindView$1$1");
        try {
            aRunnableS16S0500000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselCard@cad.onBindView$1$1");
    }

    public static final void run$3(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("AfterPaymentBindRetainCoordinator@d1e8.bindAfterPaymentRetain$1");
        try {
            C1707440uX8.LIZ((AtomicBoolean) aRunnableS16S0500000_26.l0, (C259800zU) aRunnableS16S0500000_26.l1, (C259800zU) aRunnableS16S0500000_26.l2, (Function1) aRunnableS16S0500000_26.l3, (C1548870qPN) aRunnableS16S0500000_26.l4, false, "action_timeout");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AfterPaymentBindRetainCoordinator@d1e8.bindAfterPaymentRetain$1");
    }

    public static final void run$4(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$callback$1$invoke$$inlined$runInMainThread$1");
        try {
            aRunnableS16S0500000_26.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$callback$1$invoke$$inlined$runInMainThread$1");
    }

    public static final void run$5(ARunnableS16S0500000_26 aRunnableS16S0500000_26) {
        boolean zLIZ;
        C1C7U.LIZ("AddressEditFragment@d406.initSubscribe$14$1");
        try {
            ((InterfaceC960503pD) aRunnableS16S0500000_26.l0).withState(((AddressEditFragment) aRunnableS16S0500000_26.l1).mS(), new AwS235S0300000_26((List) aRunnableS16S0500000_26.l2, (List<NoticeBubble>) aRunnableS16S0500000_26.l3, (C450740Hlw) aRunnableS16S0500000_26.l4, (Context) 59));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddressEditFragment@d406.initSubscribe$14$1");
    }

    public ARunnableS16S0500000_26(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
