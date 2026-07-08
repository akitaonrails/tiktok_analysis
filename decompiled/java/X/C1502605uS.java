package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.data.TypingStatusReceiverTimerV2$onGetMessage$1", f = "TypingStatusReceiverTimerV2.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1502605uS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1502605uS(List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1502605uS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1502605uS(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<C869590Y9l> it2;
        C1C7U.LIZ("TypingStatusReceiverTimerV2@e4f8.onGetMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = this.LLILLL.iterator();
        }
        while (it2.hasNext()) {
            C869590Y9l next = it2.next();
            C1504005ug.LL.getClass();
            InterfaceC1502705uT interfaceC1502705uT = C1504005ug.LLILLJJLI.get(next.getConversationId());
            if (interfaceC1502705uT != null) {
                String strValueOf = String.valueOf(next.getSender());
                long createdAt = next.getCreatedAt();
                this.LL = it2;
                this.LLILLJJLI = 1;
                if (interfaceC1502705uT.LIZ(createdAt, strValueOf, this) == objLJFF) {
                    C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetMessage$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingStatusReceiverTimerV2@e4f8.onGetMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
