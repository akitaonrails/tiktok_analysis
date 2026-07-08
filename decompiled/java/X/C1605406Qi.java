package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BotChatRoomViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BotChatRoomViewModel$updateStateWithDebounce$1", f = "BotChatRoomViewModel.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1605406Qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BotChatRoomViewModel LLILLJJLI;
    public final /* synthetic */ C1702406la LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605406Qi(BotChatRoomViewModel botChatRoomViewModel, C1702406la c1702406la, InterfaceC1364105Vn<? super C1605406Qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = botChatRoomViewModel;
        this.LLILLL = c1702406la;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605406Qi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotChatRoomViewModel@9070.updateStateWithDebounce$1");
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
                C1C7U.LIZIZ("BotChatRoomViewModel@9070.updateStateWithDebounce$1");
                return objLJFF;
            }
        }
        BotChatRoomViewModel botChatRoomViewModel = this.LLILLJJLI;
        botChatRoomViewModel.setState(new AwS368S0200000_2(botChatRoomViewModel, this.LLILLL, 84));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotChatRoomViewModel@9070.updateStateWithDebounce$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
