package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ForwardSyncData;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ForwardSyncMetaInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.ByteSyncCommandReceiver$onDataUpdate$1", f = "ByteSyncCommandReceiver.kt", l = {73}, m = "invokeSuspend")
public final class C596840Nb0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<AgentCommandRequest, InterfaceC596800Naw, C596790Nav, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ C596870Nb3 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596840Nb0(String str, InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, C596870Nb3 c596870Nb3, InterfaceC1364105Vn<? super C596840Nb0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = c596870Nb3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596840Nb0 c596840Nb0 = new C596840Nb0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c596840Nb0.LLILLJJLI = obj;
        return c596840Nb0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("ByteSyncCommandReceiver@801b.onDataUpdate$1");
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
                String str = this.LLILLL;
                InterfaceC1631630sYr<AgentCommandRequest, InterfaceC596800Naw, C596790Nav, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631630sYr = this.LLILZ;
                C596870Nb3 c596870Nb3 = this.LLILZIL;
                ForwardSyncData forwardSyncData = (ForwardSyncData) C597040NbK.LIZ().LJII(str, ForwardSyncData.class);
                if (forwardSyncData.forwardData.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (forwardSyncData.forwardSyncMetaInfo.forwardTIme > 0 && Math.abs(((long) C0XK4.LIZ()) - forwardSyncData.forwardSyncMetaInfo.forwardTIme) > 5) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ByteSyncCommandReceiver@801b.onDataUpdate$1");
                        return unit;
                    }
                    AgentCommandRequest agentCommandRequest = (AgentCommandRequest) C597040NbK.LIZ().LJII(forwardSyncData.forwardData, AgentCommandRequest.class);
                    ForwardSyncMetaInfo forwardSyncMetaInfo = forwardSyncData.forwardSyncMetaInfo;
                    C596790Nav c596790Nav = new C596790Nav(forwardSyncMetaInfo.scenario, forwardSyncMetaInfo.upstreamLogId);
                    this.LL = 1;
                    if (interfaceC1631630sYr.invoke(agentCommandRequest, c596870Nb3, c596790Nav, this) == objLJFF) {
                        C1C7U.LIZIZ("ByteSyncCommandReceiver@801b.onDataUpdate$1");
                        return objLJFF;
                    }
                } else {
                    throw new IllegalArgumentException("forward data is empty");
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ByteSyncCommandReceiver@801b.onDataUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
