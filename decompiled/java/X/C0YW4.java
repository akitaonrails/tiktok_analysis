package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YW4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.entrance.messagerequest.ChatListMessageRequestEntranceDataSource$MessageRequestDataObserver$onMessageRequestDataUpdate$1", f = "ChatListMessageRequestEntranceDataSource.kt", l = {}, m = "invokeSuspend")
public final class C0YW4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878780Ydg LL;
    public final /* synthetic */ C876610YaB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YW4(C878780Ydg c878780Ydg, C876610YaB c876610YaB, InterfaceC1364105Vn<? super C0YW4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878780Ydg;
        this.LLILLJJLI = c876610YaB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YW4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListMessageRequestEntranceDataSource$MessageRequestDataObserver@ce92.onMessageRequestDataUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListMessageRequestEntranceDataSource$MessageRequestDataObserver@ce92.onMessageRequestDataUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
