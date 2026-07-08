package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierAgentBridgeService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335270DCj {
    public InterfaceC335280DCk LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public FrameLayout LJ;
    public C2217421BqW LJFF;
    public final Function0<IPIPOCashierAgentBridgeService> LIZ = AFwS190S0000000_4.get$arr$(2916);
    public final C335380DCu LJI = new C335380DCu(new AwS548S0100000_4(this, 423));

    public C335270DCj(Object obj) {
    }

    public final AbstractC334960DBe LIZIZ(Context context, Fragment fragment) {
        Object c098200Yq;
        AbstractC334960DBe c334970DBf;
        View view;
        ViewGroup viewGroup;
        Object c098200Yq2;
        FrameLayout frameLayout = this.LJ;
        if (frameLayout == null) {
            return C334980DBg.LIZ;
        }
        InterfaceC335280DCk interfaceC335280DCk = this.LIZIZ;
        String str = "Bind cashier view failed.";
        if (interfaceC335280DCk == null) {
            c334970DBf = new C334970DBf("Cashier bridge is unavailable.");
        } else {
            try {
                if (this.LIZJ == null) {
                    this.LIZJ = interfaceC335280DCk.LJII(frameLayout);
                }
                view = this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView(view);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl == null) {
                    c334970DBf = C334990DBh.LIZ;
                } else {
                    C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: attach view failed", thM5exceptionOrNullimpl);
                    String message = thM5exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Bind cashier view failed.";
                    }
                    c334970DBf = new C334970DBf(message);
                }
            } else {
                throw new IllegalStateException("Cashier view is unavailable.");
            }
        }
        if (c334970DBf instanceof C334970DBf) {
            return c334970DBf;
        }
        if (this.LIZLLL) {
            return C334990DBh.LIZ;
        }
        InterfaceC335280DCk interfaceC335280DCk2 = this.LIZIZ;
        if (interfaceC335280DCk2 == null) {
            return new C334970DBf("Cashier bridge is unavailable.");
        }
        if (this.LJ == null) {
            return C334980DBg.LIZ;
        }
        View view2 = this.LIZJ;
        if (view2 == null) {
            return new C334970DBf("Cashier view is unavailable.");
        }
        try {
            interfaceC335280DCk2.LIZJ(context, view2, fragment);
            this.LIZLLL = true;
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 == null) {
            return C334990DBh.LIZ;
        }
        C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: bind view failed", thM5exceptionOrNullimpl2);
        this.LIZLLL = false;
        String message2 = thM5exceptionOrNullimpl2.getMessage();
        if (message2 != null) {
            str = message2;
        }
        return new C334970DBf(str);
    }

    public final AbstractC334960DBe LIZJ(Context context, Fragment fragment) {
        Object c098200Yq;
        if (this.LIZIZ != null) {
            return LIZIZ(context, fragment);
        }
        IPIPOCashierAgentBridgeService iPIPOCashierAgentBridgeServiceInvoke = this.LIZ.invoke();
        if (iPIPOCashierAgentBridgeServiceInvoke == null) {
            return new C334970DBf("IPIPOCashierAgentBridgeService is unavailable.");
        }
        try {
            C1712870uft c1712870uftLIZ = iPIPOCashierAgentBridgeServiceInvoke.LIZ(context);
            if (c1712870uftLIZ != null) {
                C335380DCu c335380DCu = this.LJI;
                c335380DCu.getClass();
                c1712870uftLIZ.LJIILLIIL = c335380DCu;
            } else {
                c1712870uftLIZ = null;
            }
            this.LIZIZ = c1712870uftLIZ;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return LIZIZ(context, fragment);
        }
        C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: create bridge failed", thM5exceptionOrNullimpl);
        String message = thM5exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "Create cashier bridge failed.";
        }
        return new C334970DBf(message);
    }

    public final void LIZ(Function1 function1, Function1 function12, boolean z) {
        Object c098200Yq;
        EnumC335980DFc enumC335980DFc;
        String strName;
        String string;
        InterfaceC335280DCk interfaceC335280DCk = this.LIZIZ;
        if (interfaceC335280DCk == null) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: buildToken blocked, bridge null", null);
            function12.invoke(new C0DD1("Cashier bridge is unavailable."));
            return;
        }
        C335850DEp c335850DEpLIZLLL = interfaceC335280DCk.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cashier: readyForPay status=");
        sbLIZ.append(c335850DEpLIZLLL.LIZ);
        sbLIZ.append(" err=");
        String str = c335850DEpLIZLLL.LIZIZ;
        String strLIZIZ = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c335850DEpLIZLLL.LIZ != EnumC1709470uaP.SUCCESS) {
            String str2 = c335850DEpLIZLLL.LIZIZ;
            if (str2 != null && (string = a0.LJLIIIL(str2).toString()) != null) {
                strLIZIZ = string;
            }
            if (a0.LJJJIL(strLIZIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ReadyForPayCode=");
                sbLIZ2.append(c335850DEpLIZLLL.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            function12.invoke(new C0DD2(strLIZIZ));
            return;
        }
        C335760DEg c335760DEgLIZIZ = interfaceC335280DCk.LIZIZ();
        if (c335760DEgLIZIZ != null && (enumC335980DFc = c335760DEgLIZIZ.LIZIZ) != null && (strName = enumC335980DFc.name()) != null) {
            strLIZIZ = strName;
        }
        function1.invoke(strLIZIZ);
        try {
            c098200Yq = Boolean.valueOf(interfaceC335280DCk.LIZ(new C335430DCz(function12, this, z)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: buildToken threw", thM5exceptionOrNullimpl);
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Build payment token threw an exception.";
            }
            function12.invoke(new C0DD1(message));
        }
    }

    public final void LIZLLL(Context context, Fragment fragment, C0D9Y c0d9y, Function1<? super AbstractC335340DCq, Unit> function1) {
        Map mapLJ;
        C1712960ug2 c1712960ug2;
        Object c098200Yq;
        InterfaceC335280DCk interfaceC335280DCk = this.LIZIZ;
        if (interfaceC335280DCk == null) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: refresh blocked, bridge null", null);
            function1.invoke(new C335290DCl("Cashier bridge is unavailable."));
            return;
        }
        AbstractC334960DBe abstractC334960DBeLIZIZ = LIZIZ(context, fragment);
        if (abstractC334960DBeLIZIZ instanceof C334970DBf) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: refresh blocked, view not ready", null);
            function1.invoke(new C335290DCl(((C334970DBf) abstractC334960DBeLIZIZ).LIZ));
            return;
        }
        if (abstractC334960DBeLIZIZ instanceof C334980DBg) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: refresh blocked, container not ready", null);
            function1.invoke(new C335290DCl("Cashier view container is not ready."));
            return;
        }
        if (!c0d9y.LJIIJJI) {
            mapLJ = C2097608Jq.LJ();
        } else {
            LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("catalog_vendor", "stripe_acp"));
            String str = c0d9y.LJIIJ;
            mapLJ = linkedHashMapLJII;
            mapLJ = linkedHashMapLJII;
            if ((true ^ a0.LJJJIL(str)) && str != null) {
                linkedHashMapLJII.put("checkout_id", str);
                mapLJ = linkedHashMapLJII;
            }
        }
        String str2 = "1";
        if (c0d9y.LJIIJJI) {
            String str3 = c0d9y.LIZ;
            String str4 = c0d9y.LIZLLL;
            String str5 = c0d9y.LJ;
            String str6 = c0d9y.LIZJ;
            String str7 = c0d9y.LIZIZ;
            String str8 = c0d9y.LJFF;
            String str9 = c0d9y.LJI;
            String str10 = c0d9y.LJII;
            if (!c0d9y.LJIIIIZZ) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1712960ug2 = new C1712960ug2(str3, str4, str5, str6, str7, str8, str9, str10, str2, c0d9y.LJIIIZ, mapLJ, 1024);
        } else {
            String str11 = c0d9y.LIZ;
            String str12 = c0d9y.LIZLLL;
            String str13 = c0d9y.LJ;
            String str14 = c0d9y.LIZJ;
            String str15 = c0d9y.LIZIZ;
            String str16 = c0d9y.LJFF;
            String str17 = c0d9y.LJI;
            String str18 = c0d9y.LJII;
            if (!c0d9y.LJIIIIZZ) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1712960ug2 = new C1712960ug2(str11, str12, str13, str14, str15, str16, str17, str18, str2, c0d9y.LJIIIZ, mapLJ, 5120);
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cashier: refresh start host=");
            sbLIZ.append(c0d9y.LIZ);
            sbLIZ.append(" merchantId=");
            sbLIZ.append(c0d9y.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC335280DCk.LJIIIIZZ(c1712960ug2, new AwS583S0100000_4(function1, (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 222));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0DAV.LIZ("CheckoutCashierBridgeProxy", "cashier: refresh threw", thM5exceptionOrNullimpl);
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Cashier refresh threw an exception.";
            }
            function1.invoke(new C335290DCl(message));
        }
    }
}
