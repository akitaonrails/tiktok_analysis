package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.experiment.IMClickPushXSecConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMClickOutPushAnalytics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMClickOutPushAnalytics$logEnter$1", f = "IIMClickOutPushAnalytics.kt", l = {64}, m = "invokeSuspend")
public final class C892140YzE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C892140YzE(SessionInfo sessionInfo, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C892140YzE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892140YzE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMClickOutPushAnalytics@34e.logEnter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((long) ((IMClickPushXSecConfig) C892150YzF.LIZIZ.getValue()).xSec) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMClickOutPushAnalytics@34e.logEnter$1");
                return objLJFF;
            }
        }
        IMClickOutPushAnalytics.LJFF(IMClickOutPushAnalytics.LIZIZ, "x_sec", this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMClickOutPushAnalytics@34e.logEnter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
