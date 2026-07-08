package Y;

import X.AbstractC1720840usk;
import X.AbstractC712240Rwk;
import X.C1697810uHb;
import X.C1720920uss;
import X.C1720940usu;
import X.C1721130utD;
import X.C1721300utU;
import X.C1721420utg;
import X.C1C7U;
import X.C426750GoL;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselV2DO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.LayoutParamDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.CarouselPageChangeContent;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS34S0400000_26 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LinearLayout linearLayout;
        int iLJJIII;
        View view;
        int iIntValue;
        if (((HorizontalScrollView) this.l0).getParent() == null || ((View) this.l1).getParent() == null || (linearLayout = (LinearLayout) ((View) this.l1).findViewById(R.id.u32)) == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        LayoutParamDO layoutParam = ((ContainerCardDO) this.l2).getLayoutParam();
        int i = 0;
        if (layoutParam != null) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.l0;
            View view2 = (View) this.l1;
            Integer num = layoutParam.columnCount;
            if (num == null || (iIntValue = num.intValue()) <= 0 || !Intrinsics.LJFF(layoutParam.cardWidthType, "flexible")) {
                iLJJIII = 0;
            } else {
                int width = horizontalScrollView.getWidth();
                C1721300utU c1721300utU = C1721300utU.LIZ;
                String str = layoutParam.itemSpaceHorizontal;
                Context context = view2.getContext();
                c1721300utU.getClass();
                iLJJIII = (width - (C1721300utU.LJJIII(context, str) * (iIntValue - 1))) / iIntValue;
            }
            if ((view2 instanceof ViewGroup) && view2 != null) {
                C1721300utU c1721300utU2 = C1721300utU.LIZ;
                MarginDO marginDO = layoutParam.padding;
                String str2 = marginDO != null ? marginDO.start : null;
                Context context2 = view2.getContext();
                c1721300utU2.getClass();
                int iLJJIII2 = C1721300utU.LJJIII(context2, str2);
                MarginDO marginDO2 = layoutParam.padding;
                int iLJIILLIIL = C1721300utU.LJIILLIIL(view2.getContext(), marginDO2 != null ? marginDO2.top : null);
                MarginDO marginDO3 = layoutParam.padding;
                int iLJJIII3 = C1721300utU.LJJIII(view2.getContext(), marginDO3 != null ? marginDO3.end : null);
                MarginDO marginDO4 = layoutParam.padding;
                view2.setPadding(iLJJIII2, iLJIILLIIL, iLJJIII3, C1721300utU.LJIILLIIL(view2.getContext(), marginDO4 != null ? marginDO4.bottom : null));
            }
        } else {
            iLJJIII = 0;
        }
        List<CardDO> cardList = ((ContainerCardDO) this.l2).getCardList();
        if (cardList != null) {
            ArrayList arrayList = new ArrayList();
            for (CardDO cardDO : cardList) {
                if (Intrinsics.LJFF(cardDO.getCardShow(), "1")) {
                    arrayList.add(cardDO);
                }
            }
            View view3 = (View) this.l1;
            C1720920uss c1720920uss = (C1720920uss) this.l3;
            ContainerCardDO containerCardDO = (ContainerCardDO) this.l2;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
                AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(view3.getContext(), c1720920uss.LL, (CardDO) obj, null);
                if (abstractC1720840uskLIZ != null && (view = abstractC1720840uskLIZ.LLILLJJLI) != null) {
                    if (iLJJIII != 0) {
                        C1721300utU.LIZ.getClass();
                        C1721300utU.LJIIJ(view, iLJJIII);
                    }
                    if (i != 0) {
                        C1721300utU c1721300utU3 = C1721300utU.LIZ;
                        LayoutParamDO layoutParam2 = containerCardDO.getLayoutParam();
                        String str3 = layoutParam2 != null ? layoutParam2.itemSpaceHorizontal : null;
                        Context context3 = view3.getContext();
                        c1721300utU3.getClass();
                        C426750GoL.LJIIIZ(view, Integer.valueOf(C1721300utU.LJJIII(context3, str3)), null, null, null, false, 30);
                    }
                    linearLayout.addView(view);
                }
                i = i2;
            }
        }
    }

    public final void LIZ$1() {
        ((ViewOnAttachStateChangeListenerC20631115oD) this.l0).setCurrentItem(0, false);
        C1721130utD c1721130utD = (C1721130utD) this.l1;
        c1721130utD.LLILZ = 0;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) this.l0;
        c1721130utD.getClass();
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS95S0200000_26(c1721130utD, viewOnAttachStateChangeListenerC20631115oD, 38));
        final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = (ViewOnAttachStateChangeListenerC20631115oD) this.l0;
        final C1721130utD c1721130utD2 = (C1721130utD) this.l1;
        final List list = (List) this.l2;
        final CarouselV2DO carouselV2DO = (CarouselV2DO) this.l3;
        viewOnAttachStateChangeListenerC20631115oD2.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0utC
            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                if (i != 0) {
                    if (i == 1) {
                        C1721130utD c1721130utD3 = c1721130utD2;
                        c1721130utD3.LLJI = true;
                        c1721130utD3.LLJIJIL = c1721130utD3.LLILZ;
                        c1721130utD3.LLJ = true;
                        c1721130utD3.LLILZIL.removeCallbacks(c1721130utD3.LLJILLL);
                        return;
                    }
                    return;
                }
                C1721130utD c1721130utD4 = c1721130utD2;
                c1721130utD4.LLJI = false;
                c1721130utD4.LLJIJIL = -1;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                int iLJ;
                InterfaceC1720050urT interfaceC1720050urT;
                BaseWidgetDO baseWidgetDO;
                Map<String, Object> trackingParams;
                Function0<Map<String, Object>> function0;
                Map<String, Object> mapInvoke;
                C1721130utD c1721130utD3 = c1721130utD2;
                int size = list.size();
                int i2 = c1721130utD3.LLJIJIL;
                if (c1721130utD3.LLJI && i2 != -1 && size > 0) {
                    int i3 = i2 - 1;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    int i4 = i2 + 1;
                    int i5 = size - 1;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                    iLJ = C13LZ.LJ(i, i3, i4);
                } else {
                    iLJ = i;
                }
                if (iLJ != i) {
                    viewOnAttachStateChangeListenerC20631115oD2.setCurrentItem(iLJ, false);
                    return;
                }
                C1721130utD c1721130utD4 = c1721130utD2;
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = viewOnAttachStateChangeListenerC20631115oD2;
                c1721130utD4.getClass();
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS95S0200000_26(c1721130utD4, viewOnAttachStateChangeListenerC20631115oD3, 38));
                c1721130utD2.LLILZ = i;
                if (i >= C1697810uHb.LJIIJ(list)) {
                    c1721130utD2.LLIZLLLIL = true;
                }
                c1721130utD2.LJI(0.0f, list.size(), i);
                c1721130utD2.LJII();
                C1721130utD c1721130utD5 = c1721130utD2;
                CarouselV2DO carouselV2DO2 = carouselV2DO;
                c1721130utD5.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1720760usc c1720760usc = c1721130utD5.LL;
                if (c1720760usc != null && (function0 = c1720760usc.LIZJ) != null && (mapInvoke = function0.invoke()) != null) {
                    linkedHashMap.putAll(mapInvoke);
                }
                List<CardDO> items = carouselV2DO2.getItems();
                if (items != null && (baseWidgetDO = (BaseWidgetDO) C13LP.LJJJLZIJ(i, items)) != null && (trackingParams = baseWidgetDO.getTrackingParams()) != null) {
                    linkedHashMap.putAll(trackingParams);
                }
                int i6 = i + 1;
                linkedHashMap.put("shuffling_order", Integer.valueOf(i6));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                C1716310ulR.LIZ.getClass();
                C1716310ulR.LIZLLL("pipo_module_show", linkedHashMap2);
                C1720760usc c1720760usc2 = c1721130utD5.LL;
                if (c1720760usc2 != null && (interfaceC1720050urT = c1720760usc2.LIZIZ) != null) {
                    interfaceC1720050urT.bL(new StellarActionDO(Integer.valueOf(EnumC1720490usB.CAROUSEL_PAGE_CHANGE.getValue()), null, null, null, null, null, null, new CarouselPageChangeContent(Integer.valueOf(i6)), null, null), null, null);
                }
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrolled(int i, float f, int i2) {
                C1721130utD c1721130utD3 = c1721130utD2;
                if (c1721130utD3.LLJI) {
                    c1721130utD3.LJI(f, list.size(), i);
                }
            }
        });
        ((C1721130utD) this.l1).LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[Catch: all -> 0x0031, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, all -> 0x0031, blocks: (B:5:0x0017, B:8:0x001e, B:10:0x0026), top: B:23:0x0017, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS34S0400000_26 r5) {
        /*
            java.lang.String r4 = "SeaPdpFypAnchorBatchPreload@3a9.batchPreload$apiPrefetchTask$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r0 = r5.l0     // Catch: java.lang.Throwable -> L3b
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = r5.l1     // Catch: java.lang.Throwable -> L3b
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r5.l2     // Catch: java.lang.Throwable -> L3b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload) r2     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r5.l3     // Catch: java.lang.Throwable -> L3b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1e
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L36
            if (r0 != 0) goto L1e
            goto L46
        L1e:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L36
            r0 = r0 ^ 1
            if (r0 == 0) goto L46
            int[] r0 = X.C1742080vR0.LJ(r1)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L36
            r2.getClass()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L36
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L36
            goto L46
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            goto L46
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L46
            throw r1
        L46:
            X.C1C7U.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS34S0400000_26.run$0(Y.ARunnableS34S0400000_26):void");
    }

    public static final void run$1(ARunnableS34S0400000_26 aRunnableS34S0400000_26) {
        boolean zLIZ;
        C1C7U.LIZ("LineContainerCard@9d.onBindView$1");
        try {
            aRunnableS34S0400000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LineContainerCard@9d.onBindView$1");
    }

    public static final void run$2(ARunnableS34S0400000_26 aRunnableS34S0400000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselV2Card@1bab.setupViewPager$2");
        try {
            aRunnableS34S0400000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselV2Card@1bab.setupViewPager$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS34S0400000_26(Object obj, View view, List<String> list, SeaPdpFypAnchorBatchPreload seaPdpFypAnchorBatchPreload, Aweme aweme) {
        this.$t = aweme;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = list;
        this.l3 = seaPdpFypAnchorBatchPreload;
    }
}
