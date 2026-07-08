package com.bytedance.android.live.ai.impl.pitaya;

import X.C1101460elk;
import X.C1101480elm;
import X.C157U;
import X.C157W;
import X.C1ATJ;
import X.C20441214yg;
import X.C204585153n;
import X.C787090UuB;
import X.InterfaceC1148660fzs;
import X.InterfaceC1284120jWM;
import X.InterfaceC2787016b;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class LiveClientAIServiceImpl implements ILiveClientAIService {
    public C1ATJ LL;

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final int Sg2() {
        try {
            boolean zLJ = C157W.LIZ().LJ();
            boolean zIsEnable = C157W.LIZ().isEnable();
            if (!zLJ || !zIsEnable) {
                return 0;
            }
            int iLIZLLL = C157W.LIZ().LIZLLL();
            if (iLIZLLL < 0) {
                return 0;
            }
            return iLIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return 0;
        }
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void cQ0() {
        C1ATJ.LJIIJ = new InterfaceC1284120jWM() { // from class: X.0jWL
            @Override // X.InterfaceC1284120jWM
            public final IPitayaCore LIZ() {
                if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    return null;
                }
                final IPitayaCore core = PitayaCoreFactory.getCore("1728");
                return (IPitayaCore) Proxy.newProxyInstance(IPitayaCore.class.getClassLoader(), new Class[]{IPitayaCore.class}, new InvocationHandler() { // from class: X.0jVT
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("create ");
                        sbLIZ.append(method.getName());
                        C20441214yg.LIZIZ("LiveDebugToolPitayaCoreProxy", C2188811AlT.LIZIZ(sbLIZ));
                        return ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).hJ0(core, method, objArr);
                    }
                });
            }
        };
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final C1ATJ hU0() {
        if (this.LL == null) {
            this.LL = new C1ATJ();
        }
        return this.LL;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final List<InterfaceC2787016b> jQ0() {
        InterfaceC1148660fzs interfaceC1148660fzsLIZ = C787090UuB.LIZ();
        if (interfaceC1148660fzsLIZ != null) {
            return interfaceC1148660fzsLIZ.getFeaturesProducerList();
        }
        return null;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void Dy2() {
        C204585153n c204585153n = C204585153n.LIZ;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void IM0() {
        List<String> list = C1101480elm.LIZ;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void jQ() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void pQ1() {
        C1101460elk c1101460elk = C1101460elk.LIZ;
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void tE0() {
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService
    public final void uR() {
        C157U c157u = C157U.LIZ;
    }
}
