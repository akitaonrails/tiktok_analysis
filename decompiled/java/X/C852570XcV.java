package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.routing.CommonFlowRouteAction$callSafeEnv$1$2", f = "CommonFlowRouteAction.kt", l = {}, m = "invokeSuspend")
public final class C852570XcV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SafeEnvV2Response LLILLJJLI;
    public final /* synthetic */ Bundle LLILLL;
    public final /* synthetic */ Function1<SafeEnvData, Unit> LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C852570XcV(SafeEnvV2Response safeEnvV2Response, Bundle bundle, Function1<? super SafeEnvData, Unit> function1, Activity activity, InterfaceC1364105Vn<? super C852570XcV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = safeEnvV2Response;
        this.LLILLL = bundle;
        this.LLILZ = function1;
        this.LLILZIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C852570XcV c852570XcV = new C852570XcV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c852570XcV.LL = obj;
        return c852570XcV;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonFlowRouteAction@d4c5.callSafeEnv$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SafeEnvData safeEnvData = this.LLILLJJLI.data;
        if (safeEnvData != null) {
            Bundle bundle = this.LLILLL;
            Function1<SafeEnvData, Unit> function1 = this.LLILZ;
            C786410Ut5.LJJJI("passport_ticket", safeEnvData.passportTicket, bundle);
            function1.invoke(safeEnvData);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZIL);
            c1389890mGx.LJIIIZ(2131849520);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonFlowRouteAction@d4c5.callSafeEnv$1$2");
        return unit;
    }
}
