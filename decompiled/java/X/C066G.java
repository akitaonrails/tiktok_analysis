package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.impl.monitor.LynxPanelDelayCallbackData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.LynxPanelDelayMonitor$receiveLynxPanelDelayCallbackData$1", f = "LynxPanelDelayMonitor.kt", l = {}, m = "invokeSuspend")
public final class C066G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066G(String str, InterfaceC1364105Vn<? super C066G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C066G c066g = new C066G(this.LLILLJJLI, interfaceC1364105Vn);
        c066g.LL = obj;
        return c066g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LynxPanelDelayMonitor@841d.receiveLynxPanelDelayCallbackData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c098200Yq = (LynxPanelDelayCallbackData) C051M.LIZIZ(LynxPanelDelayCallbackData.class, this.LLILLJJLI);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1459105nR.LJFF.LIZIZ();
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LynxPanelDelayCallbackData lynxPanelDelayCallbackData = (LynxPanelDelayCallbackData) c098200Yq;
        if (lynxPanelDelayCallbackData == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LynxPanelDelayMonitor@841d.receiveLynxPanelDelayCallbackData$1");
            return unit;
        }
        C066H c066hRemove = C1459105nR.LJ.remove(lynxPanelDelayCallbackData.uuid);
        if (c066hRemove == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LynxPanelDelayMonitor@841d.receiveLynxPanelDelayCallbackData$1");
            return unit2;
        }
        C1459105nR c1459105nR = C1459105nR.LIZIZ;
        C0I0B.LJFF.LIZIZ();
        c1459105nR.getClass();
        long j = lynxPanelDelayCallbackData.panelShowScreen;
        long j2 = c066hRemove.LIZJ;
        long j3 = j - j2;
        if (j3 <= 0) {
            j3 = -1;
        }
        long j4 = c066hRemove.LIZLLL - j2;
        if (j4 <= 0) {
            j4 = -1;
        }
        long j5 = lynxPanelDelayCallbackData.panelDismiss - j;
        if (j5 <= 0) {
            j5 = -1;
        }
        C20684815ws.LJIILLIIL("streak_lynx_latency", C2097608Jq.LJIIIIZZ(new Pair("conversation_id", c066hRemove.LIZ), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(c066hRemove.LIZ))), new Pair("click_to_open_panel", String.valueOf(j3)), new Pair("click_to_router", String.valueOf(j4)), new Pair("panel_show_to_panel_dismiss", String.valueOf(j5)), new Pair("panel_type", c066hRemove.LIZIZ), new Pair("enter_method", c066hRemove.LJ)));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LynxPanelDelayMonitor@841d.receiveLynxPanelDelayCallbackData$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
