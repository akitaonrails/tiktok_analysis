package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatRoomViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatRoomViewModel$updateStateWithDebounce$1", f = "AiReplySingleChatRoomViewModel.kt", l = {51}, m = "invokeSuspend")
public final class C1604906Qd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AiReplySingleChatRoomViewModel LLILLJJLI;
    public final /* synthetic */ C1702406la LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604906Qd(AiReplySingleChatRoomViewModel aiReplySingleChatRoomViewModel, C1702406la c1702406la, InterfaceC1364105Vn<? super C1604906Qd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiReplySingleChatRoomViewModel;
        this.LLILLL = c1702406la;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1604906Qd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiReplySingleChatRoomViewModel@e7d5.updateStateWithDebounce$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("AiReplySingleChatRoomViewModel@e7d5.updateStateWithDebounce$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setState(new AwS581S0100000_2(this.LLILLL, 416));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiReplySingleChatRoomViewModel@e7d5.updateStateWithDebounce$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
