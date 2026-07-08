package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Chb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.model.conversation.ConversationModel$updateMessageLocal$1", f = "ConversationModel.kt", l = {106}, m = "invokeSuspend")
public final class C320650Chb extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C320640Cha LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320650Chb(C320640Cha c320640Cha, Message message, boolean z, InterfaceC1364105Vn<? super C320650Chb> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c320640Cha;
        this.LLILLL = message;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320650Chb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationModel@a73.updateMessageLocal$1");
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
            C320640Cha c320640Cha = this.LLILLJJLI;
            C320830Cht c320830Cht = c320640Cha.LJFF;
            C321020CiC c321020CiC = new C321020CiC(1003, this.LLILLL, 0, null, c320640Cha, null, null, null, null, C2097608Jq.LJIIJ(new Pair("lock_local_data", String.valueOf(this.LLILZ))), false, 4161276);
            this.LL = 1;
            if (c320830Cht.LIZIZ(c321020CiC, this) == objLJFF) {
                C1C7U.LIZIZ("ConversationModel@a73.updateMessageLocal$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModel@a73.updateMessageLocal$1");
        return unit;
    }
}
