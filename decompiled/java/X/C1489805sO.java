package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$reportTotalConversationCount$1", f = "ChatListConversationDataSource.kt", l = {553}, m = "invokeSuspend")
public final class C1489805sO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489805sO(int i, String str, InterfaceC1364105Vn<? super C1489805sO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1489805sO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.reportTotalConversationCount$1");
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
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListConversationDataSource@6f28.reportTotalConversationCount$1");
                return objLJFF;
            }
        }
        C885310YoD c885310YoD = C885310YoD.LIZ;
        long jLJIILL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIILL();
        int i2 = this.LLILLJJLI;
        String str = this.LLILLL;
        C0I0B.LJFF.LIZIZ();
        c885310YoD.getClass();
        C20684815ws.LJIILLIIL("dm_inbox_conversations_count", C2097608Jq.LJIIIIZZ(new Pair("db_conversations_count", String.valueOf(jLJIILL)), new Pair("filtered_conversations_count", String.valueOf(i2)), new Pair("inbox_tab", str)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.reportTotalConversationCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
