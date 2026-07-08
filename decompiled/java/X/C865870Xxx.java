package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.service.InternalService$insertOrUpdateConversationKv$$inlined$blockingResult$1", f = "InternalService.kt", l = {131}, m = "invokeSuspend")
public final class C865870Xxx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ C0YNW LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865870Xxx(InterfaceC1364105Vn interfaceC1364105Vn, C0YNW c0ynw, String str, String str2, String str3) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ynw;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865870Xxx(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalService@b35f.insertOrUpdateConversationKv$$inlined$blockingResult$1");
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
            InterfaceC865850Xxv interfaceC865850XxvLJIIIZ = this.LLILLJJLI.LIZ.LIZIZ().LJIIIZ();
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            C865830Xxt c865830Xxt = new C865830Xxt(this.LLILZIL);
            this.LL = 1;
            obj = interfaceC865850XxvLJIIIZ.LIZLLL(str, str2, c865830Xxt, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InternalService@b35f.insertOrUpdateConversationKv$$inlined$blockingResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("InternalService@b35f.insertOrUpdateConversationKv$$inlined$blockingResult$1");
        return obj;
    }
}
