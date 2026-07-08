package X;

import Y.AgS162S0300000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.typing.ChatListTypingUpdater$onUpdateSingleChat$1$2$1", f = "ChatListTypingUpdater.kt", l = {152}, m = "invokeSuspend")
public final class C1516005wc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0617 LLILLJJLI;
    public final /* synthetic */ C1516305wf LLILLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516005wc(AnonymousClass0617 anonymousClass0617, C1516305wf c1516305wf, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C1516005wc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0617;
        this.LLILLL = c1516305wf;
        this.LLILZ = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1516005wc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListTypingUpdater@d1d6.onUpdateSingleChat$1$2$1");
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
            C1504005ug c1504005ug = C1504005ug.LL;
            String conversationId = this.LLILLJJLI.getConversationId();
            EnumC1504205ui enumC1504205ui = EnumC1504205ui.SINGLE;
            c1504005ug.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1768806wI(C1504005ug.LIZIZ(conversationId, enumC1504205ui).LIZJ(), 17));
            AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(this.LLILLL, this.LLILZ, this.LLILLJJLI, 8);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS162S0300000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateSingleChat$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateSingleChat$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
