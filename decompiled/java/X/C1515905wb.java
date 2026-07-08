package X;

import Y.AgS162S0300000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.typing.ChatListTypingUpdater$onUpdateGroupChat$1$2$1", f = "ChatListTypingUpdater.kt", l = {183, 199}, m = "invokeSuspend")
public final class C1515905wb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1502705uT LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0617 LLILLL;
    public final /* synthetic */ C1516305wf LLILZ;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515905wb(AnonymousClass0617 anonymousClass0617, C1516305wf c1516305wf, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C1515905wb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0617;
        this.LLILZ = c1516305wf;
        this.LLILZIL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1515905wb(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            throw new C2197108jB();
        }
        C155000ia.LIZIZ(obj);
        C1504005ug c1504005ug = C1504005ug.LL;
        String conversationId = this.LLILLL.getConversationId();
        EnumC1504205ui enumC1504205ui = EnumC1504205ui.GROUP;
        c1504005ug.getClass();
        InterfaceC1502705uT interfaceC1502705uTLIZIZ = C1504005ug.LIZIZ(conversationId, enumC1504205ui);
        C1516305wf c1516305wf = this.LLILZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZIL;
        AnonymousClass0617 anonymousClass0617 = this.LLILLL;
        if (C1666706fp.LIZ() == 4) {
            C05YD<Integer> c05ydLIZJ = interfaceC1502705uTLIZIZ.LIZJ();
            AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(c1516305wf, interfaceC879010Ye3, anonymousClass0617, 6);
            this.LLILLJJLI = 1;
            if (c05ydLIZJ.collect(agS162S0300000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1");
                return objLJFF;
            }
            throw new C2197108jB();
        }
        if (C1666706fp.LIZ() == 3) {
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C414301jJ(interfaceC1502705uTLIZIZ.LIZIZ(), interfaceC1502705uTLIZIZ.LIZJ(), new C1515805wa(null)));
            AgS162S0300000_2 agS162S0300000_22 = new AgS162S0300000_2(c1516305wf, interfaceC879010Ye3, anonymousClass0617, 7);
            this.LL = interfaceC1502705uTLIZIZ;
            this.LLILLJJLI = 2;
            if (interfaceC346201WaLJIILL.collect(agS162S0300000_22, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
