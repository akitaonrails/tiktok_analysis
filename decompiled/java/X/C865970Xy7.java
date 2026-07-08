package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationListModelImpl$getConversationStatistic$$inlined$blockingResult$1", f = "ConversationListModelImpl.kt", l = {131}, m = "invokeSuspend")
public final class C865970Xy7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C878750Ydd>>, Object> {
    public int LL;
    public final /* synthetic */ C866710XzJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865970Xy7(InterfaceC1364105Vn interfaceC1364105Vn, C866710XzJ c866710XzJ) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c866710XzJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865970Xy7(interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C878750Ydd>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationListModelImpl@8f5d.getConversationStatistic$$inlined$blockingResult$1");
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
            InterfaceC866310Xyf interfaceC866310XyfLIZIZ = this.LLILLJJLI.LIZIZ.LIZIZ();
            this.LL = 1;
            obj = interfaceC866310XyfLIZIZ.LJIILLIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ConversationListModelImpl@8f5d.getConversationStatistic$$inlined$blockingResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ConversationListModelImpl@8f5d.getConversationStatistic$$inlined$blockingResult$1");
        return obj;
    }
}
