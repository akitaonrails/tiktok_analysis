package X;

import com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01a9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher$requestApi$1$response$1", f = "Fetcher.kt", l = {41}, m = "invokeSuspend")
public final class C357501a9 extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<n>>, Object> {
    public int LL;
    public final /* synthetic */ Fetcher LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357501a9(Fetcher fetcher, String str, InterfaceC1364105Vn<? super C357501a9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = fetcher;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C357501a9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Fetcher@eed5.requestApi$1$response$1");
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
            Fetcher.FetcherService fetcherService = (Fetcher.FetcherService) this.LLILLJJLI.LIZJ.getValue();
            String str = this.LLILLL;
            this.LL = 1;
            obj = fetcherService.get(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Fetcher@eed5.requestApi$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("Fetcher@eed5.requestApi$1$response$1");
        return obj;
    }
}
