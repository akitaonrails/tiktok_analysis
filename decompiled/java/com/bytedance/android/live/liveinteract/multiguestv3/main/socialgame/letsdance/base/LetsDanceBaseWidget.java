package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C452501pT;
import X.C480460Ism;
import X.C924790aAn;
import X.C930540aK4;
import X.C941700ac4;
import X.C946980aka;
import X.C947420alI;
import X.EnumC947440alK;
import X.InterfaceC926960aEI;
import X.InterfaceC934710aQn;
import X.InterfaceC940910aan;
import X.InterfaceC941870acL;
import X.InterfaceC946970akZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.api.ILetsDanceServerApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameQuitReq;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LetsDanceBaseWidget<VM extends LetsDanceBaseViewModel> extends LiveWidget implements InterfaceC941870acL {
    public VM LL;
    public C946980aka LLILLL;
    public boolean LLILZLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(111));
    public String LLILZ = "";
    public String LLILZIL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(41));

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "lets_dance";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract Class<VM> y1();

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        InterfaceC946970akZ interfaceC946970akZXQ2;
        C947420alI c947420alILJII;
        VM vm = this.LL;
        return (vm == null || (interfaceC946970akZXQ2 = vm.xQ2()) == null || (c947420alILJII = interfaceC946970akZXQ2.LJII()) == null || c947420alILJII.LIZJ == EnumC947440alK.NONE) ? false : true;
    }

    public final InterfaceC946970akZ x1() {
        return (InterfaceC946970akZ) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
        Object c098200Yq;
        C947420alI c947420alILJII;
        try {
            C480460Ism.LIZ().getClass();
            ILetsDanceServerApi iLetsDanceServerApi = (ILetsDanceServerApi) C480460Ism.LIZLLL(ILetsDanceServerApi.class);
            GameQuitReq gameQuitReq = new GameQuitReq();
            Long lLJIIJ = C930540aK4.LJIIJ();
            long j = 0;
            gameQuitReq.roomId = lLJIIJ != null ? lLJIIJ.longValue() : 0L;
            InterfaceC946970akZ interfaceC946970akZX1 = x1();
            if (interfaceC946970akZX1 != null && (c947420alILJII = interfaceC946970akZX1.LJII()) != null) {
                j = c947420alILJII.LIZIZ;
            }
            gameQuitReq.gameSessionId = j;
            c098200Yq = iLetsDanceServerApi.quitGame(gameQuitReq).LJJLL(new C09JN() { // from class: X.0T7V
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LetsDanceBaseWidget@ed92.end$1$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LetsDanceBaseWidget quitGame success ");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("LetsDanceBaseWidget", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("LetsDanceBaseWidget@ed92.end$1$2");
                }
            }, new C09JN() { // from class: X.0T7W
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LetsDanceBaseWidget@ed92.end$1$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LetsDanceBaseWidget quitGame error ");
                    sbLIZ.append(obj);
                    C20441214yg.LJ("LetsDanceBaseWidget", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("LetsDanceBaseWidget@ed92.end$1$3");
                }
            });
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LetsDanceBaseWidget quitGame error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LJ("LetsDanceBaseWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget.onCreate():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        VM vm;
        super.onDestroy();
        C20441214yg.LIZIZ("LetsDanceBaseWidget", "LetsDanceBaseWidget onDestroy");
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.LJIIIIZZ(this);
        }
        InterfaceC934710aQn.Nc.LJFF(Boolean.FALSE);
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && 2 == num.intValue() && (vm = this.LL) != null) {
            vm.MQ2(false);
        }
        InterfaceC946970akZ interfaceC946970akZX1 = x1();
        if (interfaceC946970akZX1 != null) {
            interfaceC946970akZX1.LIZLLL();
        }
        InterfaceC946970akZ interfaceC946970akZX12 = x1();
        if (interfaceC946970akZX12 != null) {
            interfaceC946970akZX12.LJIILL();
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            vm2.PQ2();
        }
        VM vm3 = this.LL;
        if (vm3 != null) {
            vm3.IQ2();
        }
        C946980aka c946980aka = this.LLILLL;
        if (c946980aka != null) {
            if (c946980aka.LLILLJJLI.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                Lifecycle.State currentState = c946980aka.LLILLJJLI.getCurrentState();
                Lifecycle.State state = Lifecycle.State.DESTROYED;
                if (currentState != state) {
                    c946980aka.LLILLJJLI.setCurrentState(state);
                }
            }
            InterfaceC940910aan interfaceC940910aan = c946980aka.LLILZIL;
            if (interfaceC940910aan != null) {
                interfaceC940910aan.unsubscribe();
            }
            InterfaceC940910aan interfaceC940910aan2 = c946980aka.LLILZLL;
            if (interfaceC940910aan2 != null) {
                interfaceC940910aan2.unsubscribe();
            }
            c946980aka.LLIZ = null;
            C1295960jpS c1295960jpS = c946980aka.LLILLL;
            if (c1295960jpS != null) {
                c1295960jpS.clearAnimation();
            }
            C1295960jpS c1295960jpS2 = c946980aka.LLILLL;
            if (c1295960jpS2 != null) {
                C439101nJ.LJI(c1295960jpS2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(X.C770110UIv r9) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget.z1(X.0UIv):void");
    }

    public void A1(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2) {
        if (enumC947440alK2 == EnumC947440alK.PREPARING) {
            this.LLILZLL = false;
        }
        if (enumC947440alK == null || enumC947440alK == EnumC947440alK.NONE) {
            if (enumC947440alK2 != EnumC947440alK.NONE) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).pauseBGM(Boolean.FALSE);
                return;
            } else if (enumC947440alK == null) {
                return;
            }
        }
        EnumC947440alK enumC947440alK3 = EnumC947440alK.NONE;
        if (enumC947440alK == enumC947440alK3 || enumC947440alK2 != enumC947440alK3) {
            return;
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).resumeBGM();
    }
}
