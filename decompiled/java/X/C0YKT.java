package X;

import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YKT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageBatchAckUseCase$onNewMessageSaved$1", f = "MessageBatchAckUseCase.kt", l = {54}, m = "invokeSuspend")
public final class C0YKT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C0YKO> LLILLJJLI;
    public final /* synthetic */ C0YKU LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YKT(List<C0YKO> list, C0YKU c0yku, int i, boolean z, InterfaceC1364105Vn<? super C0YKT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c0yku;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YKT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageBatchAckUseCase@4aa.onNewMessageSaved$1");
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
            ArrayList arrayList = new ArrayList();
            try {
                for (C0YKO c0yko : this.LLILLJJLI) {
                    AckMessage ackMessageLIZ = this.LLILLL.LIZ(c0yko.LIZ, this.LLILZ, this.LLILZIL, c0yko.LIZIZ);
                    if (ackMessageLIZ != null) {
                        Boolean.valueOf(arrayList.add(ackMessageLIZ));
                    }
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!arrayList.isEmpty()) {
                C0YKU c0yku = this.LLILLL;
                int i2 = this.LLILZ;
                this.LL = 1;
                if (c0yku.LJFF(i2, arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageBatchAckUseCase@4aa.onNewMessageSaved$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageBatchAckUseCase@4aa.onNewMessageSaved$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
