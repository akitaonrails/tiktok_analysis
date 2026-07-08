package X;

import Y.ACListenerS158S0100000_24;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import njp.a;

/* JADX INFO: renamed from: X.0sFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.logic.bottomstyle.CoinTabLogic$showToolTip$1", f = "CoinTabLogic.kt", l = {}, m = "invokeSuspend")
public final class C1619710sFd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1619460sFE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619710sFd(C1619460sFE c1619460sFE, InterfaceC1364105Vn<? super C1619710sFd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1619460sFE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1619710sFd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C446700HfQ c446700HfQ;
        String strLJIJJ;
        String str;
        InterfaceC20315114eL interfaceC20315114eLW4;
        InterfaceC1590960rVG interfaceC1590960rVGLIZ;
        C1C7U.LIZ("CoinTabLogic@62ed.showToolTip$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1619800sFm c1619800sFm = C1619800sFm.LIZIZ;
        if (c1619800sFm.LJIIIIZZ()) {
            C1619460sFE c1619460sFE = this.LL;
            if (!c1619460sFE.LLJJ && ((c446700HfQ = c1619460sFE.LLJJIJIIJIL) == null || !c446700HfQ.isShowing())) {
                c1619800sFm.LJIJ(true);
                C450720Hlu c450720Hlu = new C450720Hlu(this.LL.LL.getContext());
                C1592950rYT c1592950rYT = this.LL.LL;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = c1592950rYT;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c450720Hlu.LLILZ = c1592950rYT.getContext().getString(2131835089);
                long jLIZIZ = ((long) c1619800sFm.LIZIZ()) * 1000;
                C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                c1391600mJi2.LJII = jLIZIZ;
                c1391600mJi2.LJIJJ = false;
                c450720Hlu.LJIIIZ(true, new ACListenerS158S0100000_24(this.LL, 70));
                c450720Hlu.LIZJ(AFwS264S0000000_24.get$arr$(549));
                C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                C1905750zgz.LIZIZ.LJIIIZ(c0p0tLIZIZ, "pro_guide_rewards");
                c0p0tLIZIZ.show();
                C1894320zOY.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("touch_point_id", String.valueOf(9999));
                linkedHashMap.put("touch_point_name", "remind_bubble");
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                } else {
                    strLJIJJ = null;
                }
                linkedHashMap.put("region", strLJIJJ);
                linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
                if (C1894310zOX.LIZIZ()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_login", str);
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("touch_point_show", linkedHashMap);
                }
                this.LL.LLJJ = true;
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC20315114eLW4 = iLiveOuterService.W4()) != null && (interfaceC1590960rVGLIZ = interfaceC20315114eLW4.LIZ()) != null) {
                    interfaceC1590960rVGLIZ.LIZIZ();
                }
                c1619800sFm.LJII();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoinTabLogic@62ed.showToolTip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
