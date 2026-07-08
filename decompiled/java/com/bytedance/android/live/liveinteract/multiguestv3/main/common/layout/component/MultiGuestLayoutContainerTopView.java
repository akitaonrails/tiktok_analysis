package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component;

import X.C1546210qL5;
import X.C786410Ut5;
import X.C915630Zw1;
import X.C915980Zwa;
import X.C921180a4y;
import X.C930540aK4;
import X.C933960aPa;
import X.C933970aPb;
import X.C940770aaZ;
import X.C942200acs;
import X.InterfaceC937900aVw;
import X.InterfaceC940760aaY;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.MultiGuestLayoutContainerTopView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixContainerTopParentSetting;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLayoutContainerTopView implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final FrameLayout LLILLJJLI;
    public final C933970aPb LLILLL;
    public final C933960aPa LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ;
        ViewGroup viewGroupLLILLIZIL;
        if (MultiGuestFixContainerTopParentSetting.INSTANCE.getValue() && (interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ())) != null && (viewGroupLLILLIZIL = interfaceC937900aVwLJIIIIZZ.LLILLIZIL()) != null) {
            C930540aK4.LJJIL(-1, this.LLILLJJLI, viewGroupLLILLIZIL);
        }
        this.LLILLJJLI.bringToFront();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C915980Zwa.LJIIIIZZ().VE2(this.LLILLL);
        C940770aaZ.LIZ().LJIIZILJ(this.LLILZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C915980Zwa.LJIIIIZZ().vq0(this.LLILLL);
        C940770aaZ.LIZ().LJJ(this.LLILZ);
        this.LL.getLifecycle().removeObserver(this);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0aPb] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0aPa] */
    public MultiGuestLayoutContainerTopView(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        C786410Ut5.a6(frameLayout2, layoutParams);
        if (!MultiGuestFixContainerTopParentSetting.INSTANCE.getValue()) {
            C930540aK4.LJJIL(-1, frameLayout2, frameLayout);
        } else {
            float f = C942200acs.LIZ;
            C1546210qL5.LIZ.getClass();
            frameLayout2.setZ(f + C1546210qL5.LIZ(1));
        }
        this.LLILLJJLI = frameLayout2;
        this.LLILLL = new C915630Zw1() { // from class: X.0aPb
            @Override // X.C915630Zw1, X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
                MultiGuestLayoutContainerTopView multiGuestLayoutContainerTopView = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLayoutSwitch switchType:");
                sbLIZ.append(i);
                sbLIZ.append(" businessType:");
                sbLIZ.append(interfaceC937820aVo.getLayoutBusinessType());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                multiGuestLayoutContainerTopView.getClass();
                C20441214yg.LIZIZ("MultiGuestFakeLayoutComponent", strLIZIZ);
                MultiGuestLayoutContainerTopView multiGuestLayoutContainerTopView2 = this.LL;
                multiGuestLayoutContainerTopView2.getClass();
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
                String layoutBusinessType = null;
                if (interfaceC937900aVwLJIIIIZZ != null) {
                    interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ();
                    if (interfaceC937820aVoLJJJJZ != null) {
                        layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
                    }
                } else {
                    interfaceC937820aVoLJJJJZ = null;
                }
                if (Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.GRID_FIX.getBusinessType())) {
                    Rect containerActualRange = interfaceC937820aVoLJJJJZ.getContainerActualRange();
                    FrameLayout frameLayout3 = multiGuestLayoutContainerTopView2.LLILLJJLI;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
                    layoutParams2.width = containerActualRange.width();
                    layoutParams2.height = containerActualRange.height();
                    layoutParams2.leftMargin = containerActualRange.left;
                    layoutParams2.topMargin = containerActualRange.top;
                    C786410Ut5.a6(frameLayout3, layoutParams2);
                    multiGuestLayoutContainerTopView2.LIZ();
                    InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
                    if (interfaceC938530aWxLIZ != null) {
                        interfaceC938530aWxLIZ.LIZJ(multiGuestLayoutContainerTopView2.LLILLJJLI);
                    }
                }
            }
        };
        this.LLILZ = new InterfaceC940760aaY() { // from class: X.0aPa
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                FrameLayout.LayoutParams layoutParams2;
                MultiGuestLayoutContainerTopView multiGuestLayoutContainerTopView = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLayoutRenderSuccessEnd ");
                sbLIZ.append(C940770aaZ.LIZ().getDataSource().LJII());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                multiGuestLayoutContainerTopView.getClass();
                C20441214yg.LIZIZ("MultiGuestFakeLayoutComponent", strLIZIZ);
                FrameLayout frameLayout3 = c942080acg.LIZ.LIZIZ;
                if (frameLayout3 == null) {
                    return;
                }
                if (C940770aaZ.LIZ().getDataSource().LJII() != 4) {
                    MultiGuestLayoutContainerTopView multiGuestLayoutContainerTopView2 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLayoutRenderSuccessEnd layoutStyle isn't grid_fixed:");
                    sbLIZ2.append(C940770aaZ.LIZ().getDataSource().LJII());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    multiGuestLayoutContainerTopView2.getClass();
                    C20441214yg.LIZIZ("MultiGuestFakeLayoutComponent", strLIZIZ2);
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    int i = layoutParams2.leftMargin;
                    int i2 = layoutParams2.topMargin;
                    Rect rect = new Rect(i, i2, layoutParams2.width + i, layoutParams2.height + i2);
                    FrameLayout frameLayout4 = this.LIZ.LLILLJJLI;
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout4.getLayoutParams();
                    layoutParams4.width = rect.width();
                    layoutParams4.height = rect.height();
                    layoutParams4.leftMargin = rect.left;
                    layoutParams4.topMargin = rect.top;
                    C786410Ut5.a6(frameLayout4, layoutParams4);
                    this.LIZ.LIZ();
                    InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
                    if (interfaceC938530aWxLIZ != null) {
                        interfaceC938530aWxLIZ.LIZJ(this.LIZ.LLILLJJLI);
                    }
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
