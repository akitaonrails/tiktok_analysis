package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel$onPrepared$1", f = "MessageListFooterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1535205zi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageListFooterViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535205zi(MessageListFooterViewModel messageListFooterViewModel, InterfaceC1364105Vn<? super C1535205zi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageListFooterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1535205zi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        C1C7U.LIZ("MessageListFooterViewModel@60fe.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MessageListFooterViewModel messageListFooterViewModel = this.LL;
        if (!messageListFooterViewModel.LLILZ) {
            messageListFooterViewModel.LLILZ = true;
            if (!messageListFooterViewModel.vQ2() && (c457780HxI = (C457780HxI) messageListFooterViewModel.LL.getValue()) != null && (sessionInfo = c457780HxI.LL) != null) {
                C23250099c.LIZLLL(messageListFooterViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C1706606mG(sessionInfo.getConversationId(), messageListFooterViewModel, sessionInfo, null), 2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListFooterViewModel@60fe.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
