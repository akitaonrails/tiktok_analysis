package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.stablemode.DowngradeDecision;
import com.bytedance.android.live.broadcast.stablemode.DowngradeInfo;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastNewStableModeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.stablemode.LiveStableModeStrategy$registerDecisionWithLive$1$actionResult$1", f = "LiveStableModeStrategy.kt", l = {}, m = "invokeSuspend")
public final class C775920UcA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC805220ViK LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775920UcA(InterfaceC805220ViK interfaceC805220ViK, String str, InterfaceC1364105Vn<? super C775920UcA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC805220ViK;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C775920UcA c775920UcA = new C775920UcA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c775920UcA.LL = obj;
        return c775920UcA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String levelName;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        Gson gsonLIZ;
        Object objLIZJ;
        HashMap map;
        C1C7U.LIZ("LiveStableModeStrategy@c0f2.registerDecisionWithLive$1$actionResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result Strategy is ");
        sbLIZ.append(this.LLILLJJLI.LIZLLL().LIZIZ);
        C20441214yg.LIZIZ("LiveDowngradeStrategy", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI.LIZIZ() == EnumC1910390zoT.CelResult) {
            InterfaceC805220ViK interfaceC805220ViK = this.LLILLJJLI;
            try {
                gsonLIZ = C293501Bt.LIZ();
                objLIZJ = interfaceC805220ViK.LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if ((objLIZJ instanceof HashMap) && (map = (HashMap) objLIZJ) != null && !map.isEmpty()) {
                String strLJIILL = gsonLIZ.LJIILL(map);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("result  is ");
                sbLIZ2.append(strLJIILL);
                C20441214yg.LIZIZ("LiveDowngradeStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                c098200Yq = (DowngradeDecision) gsonLIZ.LJII(strLJIILL, DowngradeDecision.class);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    DowngradeDecision downgradeDecision = (DowngradeDecision) c098200Yq;
                    C2252331DDr c2252331DDr = C775900Uc8.LIZ;
                    if (BroadcastNewStableModeSetting.INSTANCE.enable() && (lifecycleOwner = C775900Uc8.LIZJ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                        C01KE.LIZIZ(lifecycleScope, new C775880Uc6(downgradeDecision, null));
                    }
                    C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                    DowngradeInfo downgradeInfo = downgradeDecision.downgradeInfo;
                    if (downgradeInfo == null || (levelName = downgradeInfo.level) == null) {
                        levelName = EnumC775860Uc4.NONE.getLevelName();
                    }
                    c1276840jKc.getClass();
                    C1276840jKc.LJIIL.put("current_downgrade_level", levelName);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("parse result error is ");
                    sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
                    C20441214yg.LIZIZ("LiveDowngradeStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                throw new IllegalArgumentException("resultValue is empty");
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("registerDecisionWithLive sceneKey:");
            sbLIZ4.append(this.LLILLL);
            sbLIZ4.append(" stateCode is ");
            sbLIZ4.append(this.LLILLJJLI.LIZIZ());
            C20441214yg.LIZIZ("LiveDowngradeStrategy", C2188811AlT.LIZIZ(sbLIZ4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveStableModeStrategy@c0f2.registerDecisionWithLive$1$actionResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
