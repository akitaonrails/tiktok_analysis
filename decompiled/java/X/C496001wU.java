package X;

import com.ss.android.ugc.aweme.unifiedauth.api.PushServerIntelligentApi;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentResponse;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper$processServerIntelligentAsync$1$result$1", f = "PushServerIntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C496001wU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ServerIntelligentResponse>, Object> {
    public final /* synthetic */ ServerIntelligentRequest LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496001wU(ServerIntelligentRequest serverIntelligentRequest, InterfaceC1364105Vn<? super C496001wU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = serverIntelligentRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496001wU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request(");
        sbLIZ.append(C105700ad.LIZIZ(this.LL));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Dynamic-Text]");
        C496101wV c496101wV = PushServerIntelligentApi.LIZ;
        ServerIntelligentRequest serverIntelligentRequest = this.LL;
        c496101wV.getClass();
        T tLIZLLL = C496101wV.LIZIZ.requestServerIntelligent(serverIntelligentRequest).LJL(C11S5.LIZ()).LJLJI(C609600Nva.LIZ().timeoutInMs, TimeUnit.MILLISECONDS).LIZLLL();
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$result$1");
        return tLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ServerIntelligentResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
