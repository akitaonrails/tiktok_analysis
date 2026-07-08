package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Z3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl$subscribeToStreams$3$2$1", f = "MessageListSubmitListAbilityImpl.kt", l = {}, m = "invokeSuspend")
public final class C06Z3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMessageEventProtocol LLILLJJLI;
    public final /* synthetic */ InterfaceC904740ZeS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Z3(IMessageEventProtocol iMessageEventProtocol, InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super C06Z3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMessageEventProtocol;
        this.LLILLL = interfaceC904740ZeS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06Z3 c06z3 = new C06Z3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c06z3.LL = obj;
        return c06z3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            this.LLILLJJLI.df1(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
