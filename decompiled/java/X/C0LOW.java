package X;

import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor$loadAwemeById$aweme$1", f = "AIRemixRouterInterceptor.kt", l = {138}, m = "invokeSuspend")
public final class C0LOW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOW(String str, InterfaceC1364105Vn<? super C0LOW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixRouterInterceptor@ee11.loadAwemeById$aweme$1");
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
            C547860LeC.LIZ.getClass();
            AITaskService aITaskServiceLJII = C547860LeC.LJII();
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = aITaskServiceLJII.LJFF(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.loadAwemeById$aweme$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.loadAwemeById$aweme$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
