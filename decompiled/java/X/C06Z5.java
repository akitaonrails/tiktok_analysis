package X;

import Y.AgS203S0200000_14;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl$subscribeToSubmitList$1", f = "MessageListSubmitListAbilityImpl.kt", l = {224}, m = "invokeSuspend")
public final class C06Z5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageListSubmitListAbilityImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Z5(MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl, InterfaceC1364105Vn<? super C06Z5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = messageListSubmitListAbilityImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06Z5 c06z5 = new C06Z5(this.LLILLL, interfaceC1364105Vn);
        c06z5.LLILLJJLI = obj;
        return c06z5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToSubmitList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl = this.LLILLL;
            C2252331DDr c2252331DDr = messageListSubmitListAbilityImpl.LLJJJ;
            AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(messageListSubmitListAbilityImpl, interfaceC497601wk, 2);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS203S0200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToSubmitList$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
