package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.im.core.model.MessageRequestConversationModel$batchMarkRead$2", f = "MessageRequestConversationModel.kt", l = {234}, m = "invokeSuspend")
public final class C2207108kn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ C0Y9C this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2207108kn(C0Y9C c0y9c, InterfaceC1364105Vn<? super C2207108kn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c0y9c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2207108kn(this.this$0, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestConversationModel@5d9a.batchMarkRead$2");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.label = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestConversationModel@5d9a.batchMarkRead$2");
                return objLJFF;
            }
        }
        Iterator<C0Y9E> it2 = this.this$0.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestConversationModel@5d9a.batchMarkRead$2");
        return unit;
    }
}
