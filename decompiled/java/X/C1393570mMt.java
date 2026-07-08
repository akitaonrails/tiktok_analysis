package X;

import Y.ARunnableS29S0400000_21;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0mMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1393570mMt implements InterfaceC1050330dRH {
    public AnchorEventCenter LIZ;
    public C1066900ds0 LIZIZ;

    public void LIZ(C712520RxC c712520RxC, View view, C2344009Gk c2344009Gk) {
        throw null;
    }

    public void LIZJ(C712520RxC c712520RxC) {
        throw null;
    }

    public boolean LJI(C712520RxC c712520RxC) {
        throw null;
    }

    public void LJIIJ() {
        throw null;
    }

    public final void LJIIIZ(InterfaceC1393560mMs interfaceC1393560mMs) {
        C1357600lQs c1357600lQsLIZ;
        AnchorEventCenter anchorEventCenter;
        if (C04UD.LIZ() && (c1357600lQsLIZ = C1361900lXo.LIZ("event_show")) != null && (anchorEventCenter = this.LIZ) != null) {
            anchorEventCenter.kF(c1357600lQsLIZ, interfaceC1393560mMs);
        }
    }

    public static void LIZIZ(C712520RxC c712520RxC, Function1 function1) {
        AnchorCustomData anchorCustomData = AwemeBizExtKt.getAnchorCustomData(c712520RxC.LIZIZ.LIZ);
        if (anchorCustomData != null && anchorCustomData.shouldOpen) {
            InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL = c712520RxC.LJIILLIIL();
            if (interfaceC1393560mMsLJIILLIIL != null) {
                function1.invoke(interfaceC1393560mMsLJIILLIIL);
            }
            anchorCustomData.setShouldOpen(false);
        }
    }

    public void LIZLLL(InterfaceC705550Rlx interfaceC705550Rlx, C712520RxC c712520RxC) {
        C2344009Gk c2344009GkLIZIZ;
        boolean zIsShown;
        C2344009Gk c2344009GkLIZIZ2;
        c712520RxC.LIZIZ.LIZ.getAid();
        new AwS555S0100000_11(interfaceC705550Rlx, 1384);
        InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL = c712520RxC.LJIILLIIL();
        if (interfaceC1393560mMsLJIILLIIL == null) {
            return;
        }
        C2344009Gk c2344009GkLIZIZ3 = (C2344009Gk) c712520RxC.LJI.LLILZLL.getValue();
        if (C04UD.LIZ()) {
            c2344009GkLIZIZ = c2344009GkLIZIZ3;
        } else {
            c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
        }
        boolean zLIZJ = interfaceC705550Rlx.LIZJ(c2344009GkLIZIZ);
        try {
            for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
                interfaceC1393560mMs.LJJLIIIJ(c712520RxC, interfaceC1393560mMs.getClass().getName(), zLIZJ);
                View viewLJIIL = interfaceC705550Rlx.LJIIL();
                if (viewLJIIL != null) {
                    zIsShown = viewLJIIL.isShown();
                } else {
                    zIsShown = false;
                }
                if (!zLIZJ) {
                    if (C04UD.LIZ()) {
                        c2344009GkLIZIZ2 = c2344009GkLIZIZ3;
                    } else {
                        c2344009GkLIZIZ2 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs, LJI(c712520RxC));
                    }
                    LIZ(c712520RxC, interfaceC705550Rlx.rootView(), c2344009GkLIZIZ2);
                    interfaceC1393560mMs.LJJJLZIJ(c2344009GkLIZIZ2, zIsShown);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!zLIZJ) {
            try {
                if (c712520RxC.LJIILL().size() == 1 && (interfaceC1393560mMsLJIILLIIL instanceof PoiAnchorMaker)) {
                    if (!((PoiAnchorMaker) interfaceC1393560mMsLJIILLIIL).LLJILJIL) {
                        C2344009Gk c2344009GkLIZIZ4 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
                        TextView textViewLJIIJJI = interfaceC705550Rlx.LJIIJJI();
                        if (textViewLJIIJJI != null) {
                            HandlerHook.viewPostDelay(textViewLJIIJJI, new ARunnableS29S0400000_21(c2344009GkLIZIZ4, interfaceC1393560mMsLJIILLIIL, interfaceC705550Rlx, this, 3), 500L);
                        }
                    } else {
                        PoiAnchorMaker poiAnchorMaker = (PoiAnchorMaker) interfaceC1393560mMsLJIILLIIL;
                        if (!C04UD.LIZ()) {
                            c2344009GkLIZIZ3 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
                        }
                        poiAnchorMaker.p1(c2344009GkLIZIZ3);
                        LJIIIZ(interfaceC1393560mMsLJIILLIIL);
                    }
                    View viewLJIIL2 = interfaceC705550Rlx.LJIIL();
                    if (viewLJIIL2 != null) {
                        C786410Ut5.LJLLLLLL(0, viewLJIIL2);
                    }
                } else {
                    if (!C04UD.LIZ()) {
                        c2344009GkLIZIZ3 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
                    }
                    interfaceC1393560mMsLJIILLIIL.p1(c2344009GkLIZIZ3);
                    LJIIIZ(interfaceC1393560mMsLJIILLIIL);
                    View viewLJIIL3 = interfaceC705550Rlx.LJIIL();
                    if (viewLJIIL3 != null) {
                        C786410Ut5.LJLLLLLL(0, viewLJIIL3);
                    }
                }
                C189200o6.m2constructorimpl(interfaceC1393560mMsLJIILLIIL);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            Iterator<InterfaceC1393560mMs> it2 = c712520RxC.LJIILL().iterator();
            while (it2.hasNext()) {
                it2.next().LJJJIL(c712520RxC, interfaceC705550Rlx, this);
            }
            return;
        }
        interfaceC705550Rlx.LIZIZ();
        InterfaceC1392640mLO interfaceC1392640mLOLJII = interfaceC1393560mMsLJIILLIIL.LJII();
        ArrayList<InterfaceC1393680mN4> arrayList = C1393500mMm.LLJ;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC1393680mN4> it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().LIZ(interfaceC1392640mLOLJII.LJJLIIIJJIZ(), (AnchorCommonStruct) ListProtector.get(interfaceC1392640mLOLJII.LJJLIIIJJIZ().getAnchors(), 0), true, interfaceC1393560mMsLJIILLIIL.type())) {
                    if (interfaceC1393560mMsLJIILLIIL instanceof ShopWindowAnchorMaker) {
                        AbstractC1066890drz abstractC1066890drz = (AbstractC1066890drz) interfaceC1393560mMsLJIILLIIL;
                        if (!C04UD.LIZ()) {
                            c2344009GkLIZIZ3 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
                        }
                        abstractC1066890drz.LJJIIJZLJL(c2344009GkLIZIZ3);
                    } else if (interfaceC1393560mMsLJIILLIIL.type() != EnumC1430380nKG.POI.getTYPE() && interfaceC1393560mMsLJIILLIIL.type() != EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                        if (!C04UD.LIZ()) {
                            c2344009GkLIZIZ3 = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMsLJIILLIIL, LJI(c712520RxC));
                        }
                        interfaceC1393560mMsLJIILLIIL.p1(c2344009GkLIZIZ3);
                    }
                }
            }
        }
        C1066900ds0 c1066900ds0 = this.LIZIZ;
        if (c1066900ds0 != null) {
            interfaceC1393560mMsLJIILLIIL = c1066900ds0;
        }
        LJIIIZ(interfaceC1393560mMsLJIILLIIL);
    }

    public void LJ(final InterfaceC705550Rlx interfaceC705550Rlx, final C712520RxC c712520RxC) {
        interfaceC705550Rlx.LJFF();
        final InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL = c712520RxC.LJIILLIIL();
        if (interfaceC1393560mMsLJIILLIIL != null) {
            SmartImageView smartImageViewLJJ = interfaceC705550Rlx.LJJ();
            if (smartImageViewLJJ != null) {
                interfaceC1393560mMsLJIILLIIL.LJJJI(smartImageViewLJJ);
            }
            View viewLJIIL = interfaceC705550Rlx.LJIIL();
            if (viewLJIIL != null) {
                C786410Ut5.LJLLLLLL(0, viewLJIIL);
            }
            InterfaceC1392640mLO interfaceC1392640mLOLJII = interfaceC1393560mMsLJIILLIIL.LJII();
            if (interfaceC1392640mLOLJII != null) {
                interfaceC1392640mLOLJII.LIZLLL();
            }
            View viewRootView = interfaceC705550Rlx.rootView();
            if (viewRootView != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC589820NBk() { // from class: X.0mN0
                    @Override // X.AbstractViewOnClickListenerC589820NBk
                    public final void LIZ(View view) {
                        if (view != null) {
                            InterfaceC1393560mMs interfaceC1393560mMs = interfaceC1393560mMsLJIILLIIL;
                            C712520RxC c712520RxC2 = c712520RxC;
                            C2344009Gk c2344009GkLIZ = C1392540mLE.LIZ(interfaceC1393560mMs, c712520RxC2, "click_list", this.LJI(c712520RxC2));
                            c2344009GkLIZ.LJ(C1104190eq9.LIZ(interfaceC705550Rlx.rootView(), "c20736.d0"), "btm_param_map_key");
                            interfaceC1393560mMs.LJFF(c2344009GkLIZ);
                            InterfaceC1393560mMs interfaceC1393560mMs2 = interfaceC1393560mMsLJIILLIIL;
                            C712520RxC c712520RxC3 = c712520RxC;
                            interfaceC1393560mMs2.LJJJLL(view, C1392540mLE.LIZJ(interfaceC1393560mMs2, c712520RxC3, "click_list", this.LJI(c712520RxC3)));
                        }
                    }
                }, viewRootView);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final X.InterfaceC705550Rlx r17, final X.C712520RxC r18) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393570mMt.LJFF(X.0Rlx, X.0RxC):void");
    }

    public final void LJII(InterfaceC1393560mMs interfaceC1393560mMs, Function1<? super C1361910lXp, Unit> function1) {
        C1357600lQs c1357600lQsLIZ;
        if (C04UD.LIZ() && (c1357600lQsLIZ = C1361900lXo.LIZ("event_enter_detail")) != null) {
            if (function1 != null) {
                function1.invoke(c1357600lQsLIZ);
            }
            AnchorEventCenter anchorEventCenter = this.LIZ;
            if (anchorEventCenter != null) {
                anchorEventCenter.kF(c1357600lQsLIZ, interfaceC1393560mMs);
            }
        }
    }

    public final void LJIIIIZZ(InterfaceC1393560mMs interfaceC1393560mMs, Function1<? super C1361920lXq, Unit> function1) {
        C1357600lQs c1357600lQsLIZ;
        if (C04UD.LIZ() && (c1357600lQsLIZ = C1361900lXo.LIZ("event_entrance_click")) != null) {
            if (function1 != null) {
                function1.invoke(c1357600lQsLIZ);
            }
            AnchorEventCenter anchorEventCenter = this.LIZ;
            if (anchorEventCenter != null) {
                anchorEventCenter.kF(c1357600lQsLIZ, interfaceC1393560mMs);
            }
        }
    }
}
