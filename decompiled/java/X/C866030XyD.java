package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationListModelImpl$updateConversationInfo$1", f = "ConversationListModelImpl.kt", l = {321}, m = "invokeSuspend")
public final class C866030XyD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C866710XzJ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866030XyD(InterfaceC1364105Vn interfaceC1364105Vn, C866710XzJ c866710XzJ, String str) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c866710XzJ;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866030XyD(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationListModelImpl@8f5d.updateConversationInfo$1");
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
            C00ES c00es = new C00ES(this.LLILLL);
            this.LL = 1;
            if (interfaceC866310XyfLIZIZ.LIZJ(c00es, this) == objLJFF) {
                C1C7U.LIZIZ("ConversationListModelImpl@8f5d.updateConversationInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationListModelImpl@8f5d.updateConversationInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
