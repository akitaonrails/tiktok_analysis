package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393590mMv extends C1393570mMt {
    public static final C1393650mN1 LIZLLL = new InterfaceC1583770rJf() { // from class: X.0mN1
        @Override // X.InterfaceC1583770rJf
        public final void A4(String str, String str2) {
            DialogC1393760mNC dialogC1393760mNC;
            try {
                if ((Intrinsics.LJFF(str2, "SHOP_MALL") || Intrinsics.LJFF(str2, "Shop")) && (dialogC1393760mNC = C1393590mMv.LJ) != null && dialogC1393760mNC.isShowing()) {
                    dialogC1393760mNC.dismiss();
                    C785410UrT.LIZ(dialogC1393760mNC);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
    };
    public static DialogC1393760mNC LJ;
    public DialogC1393760mNC LIZJ;

    @Override // X.C1393570mMt
    public final void LJIIJ() {
        DialogC1393760mNC dialogC1393760mNC = this.LIZJ;
        if (dialogC1393760mNC != null) {
            dialogC1393760mNC.dismiss();
            C785410UrT.LIZ(dialogC1393760mNC);
        }
    }

    public static boolean LJIIJJI(C712520RxC c712520RxC) {
        Aweme aweme;
        List<AnchorCommonStruct> anchors;
        if (c712520RxC == null || (aweme = c712520RxC.LIZIZ.LIZ) == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() != EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIIL(C712520RxC c712520RxC) {
        Aweme aweme;
        List<AnchorCommonStruct> anchors;
        if (c712520RxC == null || (aweme = c712520RxC.LIZIZ.LIZ) == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() != EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIILIIL(C712520RxC c712520RxC) {
        List<AnchorCommonStruct> anchors = c712520RxC.LIZIZ.LIZ.getAnchors();
        if ((anchors instanceof Collection) && anchors.isEmpty()) {
            return true;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (it2.hasNext()) {
            if (!((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJLL().contains(Integer.valueOf(it2.next().getType()))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1393570mMt
    public final void LIZJ(C712520RxC c712520RxC) {
        for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
            interfaceC1393560mMs.LLLIZZ(interfaceC1393560mMs.LJII().LJJLIIIJJIZ());
        }
    }

    @Override // X.C1393570mMt
    public final boolean LJI(C712520RxC c712520RxC) {
        if (c712520RxC.LJIIJ() > 1) {
            return true;
        }
        return false;
    }

    public static void LJIILL(InterfaceC705550Rlx interfaceC705550Rlx, C712520RxC c712520RxC) {
        View viewRootView = interfaceC705550Rlx.rootView();
        if (viewRootView != null) {
            C786410Ut5.LJLLLLLL(0, viewRootView);
        }
        TuxIconView tuxIconViewLJIILL = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL != null) {
            C786410Ut5.LLLLLLZZ(tuxIconViewLJIILL, 0);
        }
        View viewLJIILJJIL = interfaceC705550Rlx.LJIILJJIL();
        if (viewLJIILJJIL != null) {
            C786410Ut5.LJLLLLLL(8, viewLJIILJJIL);
        }
        TextView textViewLJIILIIL = interfaceC705550Rlx.LJIILIIL();
        if (textViewLJIILIIL != null) {
            C786410Ut5.LLIL(textViewLJIILIIL, 8);
        }
        TuxIconView tuxIconViewLJIILL2 = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL2 != null) {
            tuxIconViewLJIILL2.setIconRes(R.raw.icon_chevron_down_fill);
        }
        TuxIconView tuxIconViewLJIILL3 = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL3 != null) {
            C1744700vVE.LJIIL(tuxIconViewLJIILL3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        TuxIconView tuxIconViewLJIILL4 = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL4 != null) {
            C426750GoL.LJIIIZ(tuxIconViewLJIILL4, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
        }
        TuxIconView tuxIconViewLJIILL5 = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL5 != null) {
            tuxIconViewLJIILL5.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        TuxIconView tuxIconViewLJIILL6 = interfaceC705550Rlx.LJIILL();
        if (tuxIconViewLJIILL6 != null) {
            tuxIconViewLJIILL6.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        TextView textViewLJIILLIIL = interfaceC705550Rlx.LJIILLIIL();
        if (textViewLJIILLIIL != null) {
            C786410Ut5.LLIL(textViewLJIILLIIL, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(c712520RxC.LJIIJ());
            sbLIZ.append(')');
            textViewLJIILLIIL.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        View viewLJIJJ = interfaceC705550Rlx.LJIJJ();
        if (viewLJIJJ != null) {
            viewLJIJJ.setClickable(false);
        }
    }

    @Override // X.C1393570mMt
    public final void LIZLLL(InterfaceC705550Rlx interfaceC705550Rlx, C712520RxC c712520RxC) {
        super.LIZLLL(interfaceC705550Rlx, c712520RxC);
        try {
            if (c712520RxC.LJIIJ() < 2) {
                for (InterfaceC1393560mMs interfaceC1393560mMs : c712520RxC.LJIILL()) {
                    if (interfaceC1393560mMs instanceof ShopWindowAnchorMaker) {
                        ShopWindowAnchorMaker shopWindowAnchorMaker = (ShopWindowAnchorMaker) interfaceC1393560mMs;
                        InterfaceC1392640mLO interfaceC1392640mLO = ((ShopWindowAnchorMaker) interfaceC1393560mMs).LL;
                        if (interfaceC1392640mLO == null) {
                            interfaceC1392640mLO = null;
                        }
                        shopWindowAnchorMaker.It(interfaceC705550Rlx.LJIIL(), interfaceC1392640mLO.LJJLIIIJJIZ(), true);
                    }
                }
                return;
            }
            for (InterfaceC1393560mMs interfaceC1393560mMs2 : c712520RxC.LJIILL()) {
                interfaceC1393560mMs2.It(interfaceC705550Rlx.LJIIL(), interfaceC1393560mMs2.LJII().LJJLIIIJJIZ(), false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    @Override // X.C1393570mMt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.InterfaceC705550Rlx r17, final X.C712520RxC r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393590mMv.LJ(X.0Rlx, X.0RxC):void");
    }

    @Override // X.C1393570mMt
    public final void LIZ(C712520RxC c712520RxC, View view, C2344009Gk c2344009Gk) {
        String str;
        if (c712520RxC.LJIIJ() < 2) {
            str = "c20736.d0";
        } else {
            str = "c5134.d0";
        }
        c2344009Gk.LJ(C1104190eq9.LIZ(view, str), "btm_param_map_key");
    }

    public static final void LJIILJJIL(AbstractC707180Roa abstractC707180Roa, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1393560mMs interfaceC1393560mMs, C712520RxC c712520RxC, C1393590mMv c1393590mMv, InterfaceC1631620sYq interfaceC1631620sYq) {
        String strLIZIZ;
        c1393590mMv.getClass();
        boolean z = true;
        if (c712520RxC.LJIIJ() <= 1) {
            z = false;
        }
        C2344009Gk c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs, z);
        c2344009GkLIZIZ.LJFF("click_method", "click_list");
        HashMap<String, String> showContentInfo = abstractC707180Roa.getShowContentInfo();
        if (showContentInfo != null) {
            for (Map.Entry<String, String> entry : showContentInfo.entrySet()) {
                c2344009GkLIZIZ.LJFF(entry.getKey(), entry.getValue());
            }
        }
        c2344009GkLIZIZ.LJ(C1104190eq9.LIZ(interfaceC705550Rlx.rootView(), "c5134.d0"), "btm_param_map_key");
        interfaceC1393560mMs.LJFF(c2344009GkLIZIZ);
        c1393590mMv.LJIIIIZZ(interfaceC1393560mMs, AFwS259S0000000_21.get$arr$(352));
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        View viewRootView = interfaceC705550Rlx.rootView();
        if (viewRootView != null) {
            strLIZIZ = C1104190eq9.LIZIZ(viewRootView, "c5134.d0");
        } else {
            strLIZIZ = null;
        }
        interfaceC1631620sYq.invoke(bool, bool2, strLIZIZ);
    }
}
