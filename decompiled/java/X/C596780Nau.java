package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Nau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C596780Nau extends C2217421BqW implements InterfaceC1631630sYr<AgentCommandRequest, InterfaceC596800Naw, C596790Nav, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C596780Nau(Object obj) {
        super(4, obj, TakoClientAgentServiceImpl.class, "onCommandReceived", "onCommandReceived(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/AgentCommandRequest;Lcom/ss/android/ugc/aweme/tako/ccl/channel/CommandReceiver;Lcom/ss/android/ugc/aweme/tako/ccl/channel/CommandMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(AgentCommandRequest agentCommandRequest, InterfaceC596800Naw interfaceC596800Naw, C596790Nav c596790Nav, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        AgentCommandRequest agentCommandRequest2 = agentCommandRequest;
        InterfaceC596800Naw interfaceC596800Naw2 = interfaceC596800Naw;
        C596790Nav c596790Nav2 = c596790Nav;
        InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn2 = interfaceC1364105Vn;
        TakoClientAgentServiceImpl takoClientAgentServiceImpl = (TakoClientAgentServiceImpl) this.receiver;
        takoClientAgentServiceImpl.getClass();
        C596650Nah c596650Nah = new C596650Nah(agentCommandRequest2);
        ITakoDebugService iTakoDebugService = (ITakoDebugService) PluggableExtentionKt.pluggableSpi$default(ITakoDebugService.class, false, false, false, 14, null);
        if (iTakoDebugService != null) {
            iTakoDebugService.LJIIIIZZ();
        }
        C1302050jzH.LIZ.getClass();
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn2, c596650Nah, new C596760Nas(null, agentCommandRequest2, takoClientAgentServiceImpl, C1302050jzH.LIZ(), interfaceC596800Naw2, c596790Nav2, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }
}
