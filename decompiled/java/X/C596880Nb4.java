package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ForwardSyncData;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ForwardSyncMetaInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0Nb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.frontier.FrontierCommandReceiver$onReceivedWsMsg$1", f = "FrontierCommandReceiver.kt", l = {91}, m = "invokeSuspend")
public final class C596880Nb4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ WsChannelMsg LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<AgentCommandRequest, InterfaceC596800Naw, C596790Nav, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ C596900Nb6 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596880Nb4(WsChannelMsg wsChannelMsg, InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, C596900Nb6 c596900Nb6, InterfaceC1364105Vn<? super C596880Nb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = wsChannelMsg;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = c596900Nb6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596880Nb4 c596880Nb4 = new C596880Nb4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c596880Nb4.LLILLJJLI = obj;
        return c596880Nb4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("FrontierCommandReceiver@1afc.onReceivedWsMsg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                WsChannelMsg wsChannelMsg = this.LLILLL;
                InterfaceC1631630sYr<AgentCommandRequest, InterfaceC596800Naw, C596790Nav, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631630sYr = this.LLILZ;
                C596900Nb6 c596900Nb6 = this.LLILZIL;
                String str = new String(wsChannelMsg.LIZ(), Charsets.UTF_8);
                if (C07IC.LIZ()) {
                    C1930207hE.LIZ();
                }
                ForwardSyncData forwardSyncData = (ForwardSyncData) C597040NbK.LIZ().LJII(str, ForwardSyncData.class);
                if (forwardSyncData.forwardData.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FrontierCommandReceiver@1afc.onReceivedWsMsg$1");
                    return unit;
                }
                AgentCommandRequest agentCommandRequest = (AgentCommandRequest) C597040NbK.LIZ().LJII(forwardSyncData.forwardData, AgentCommandRequest.class);
                ForwardSyncMetaInfo forwardSyncMetaInfo = forwardSyncData.forwardSyncMetaInfo;
                C596790Nav c596790Nav = new C596790Nav(forwardSyncMetaInfo.scenario, forwardSyncMetaInfo.upstreamLogId);
                this.LL = 1;
                if (interfaceC1631630sYr.invoke(agentCommandRequest, c596900Nb6, c596790Nav, this) == objLJFF) {
                    C1C7U.LIZIZ("FrontierCommandReceiver@1afc.onReceivedWsMsg$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && C07IC.LIZ()) {
            C1930207hE.LIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FrontierCommandReceiver@1afc.onReceivedWsMsg$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
