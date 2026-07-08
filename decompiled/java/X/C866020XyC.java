package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationListModelImpl$getConversationListByIdSync$$inlined$blockingResult$1", f = "ConversationListModelImpl.kt", l = {131}, m = "invokeSuspend")
public final class C866020XyC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0Y8T>>>, Object> {
    public int LL;
    public final /* synthetic */ C866710XzJ LLILLJJLI;
    public final /* synthetic */ List LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866020XyC(InterfaceC1364105Vn interfaceC1364105Vn, C866710XzJ c866710XzJ, List list) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c866710XzJ;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866020XyC(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0Y8T>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationListModelImpl@8f5d.getConversationListByIdSync$$inlined$blockingResult$1");
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
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = interfaceC866310XyfLIZIZ.LJIL(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ConversationListModelImpl@8f5d.getConversationListByIdSync$$inlined$blockingResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ConversationListModelImpl@8f5d.getConversationListByIdSync$$inlined$blockingResult$1");
        return obj;
    }
}
