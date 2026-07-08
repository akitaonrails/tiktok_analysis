package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ycv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$arrangePreloadAllTask$runnable$1$1", f = "ChatListConversationDataSource.kt", l = {}, m = "invokeSuspend")
public final class C878310Ycv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878470YdB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878310Ycv(C878470YdB c878470YdB, InterfaceC1364105Vn<? super C878310Ycv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878470YdB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878310Ycv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$runnable$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C0YM2 c0ym2 = this.LL.LIZ.LL;
        c0ysq.getClass();
        C0YSQ.LIZ(c0ym2).LJIIJ(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$runnable$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
