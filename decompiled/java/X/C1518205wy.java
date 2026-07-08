package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM$initSubscribeToTypingEvents$1", f = "GroupChatTypingIndicatorBubbleVM.kt", l = {54}, m = "invokeSuspend")
public final class C1518205wy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupChatTypingIndicatorBubbleVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518205wy(GroupChatTypingIndicatorBubbleVM groupChatTypingIndicatorBubbleVM, InterfaceC1364105Vn<? super C1518205wy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatTypingIndicatorBubbleVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518205wy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa interfaceC346201WaLIZIZ;
        C1C7U.LIZ("GroupChatTypingIndicatorBubbleVM@6040.initSubscribeToTypingEvents$1");
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
            GroupChatTypingIndicatorBubbleVM groupChatTypingIndicatorBubbleVM = this.LLILLJJLI;
            groupChatTypingIndicatorBubbleVM.getClass();
            C1504005ug c1504005ug = C1504005ug.LL;
            String conversationId = groupChatTypingIndicatorBubbleVM.LLILLJJLI.getConversationId();
            EnumC1504205ui enumC1504205ui = EnumC1504205ui.GROUP;
            c1504005ug.getClass();
            InterfaceC1502705uT interfaceC1502705uTLIZIZ = C1504005ug.LIZIZ(conversationId, enumC1504205ui);
            if (C1666706fp.LIZ() != 2 && C1666706fp.LIZ() != 4) {
                if (C1666706fp.LIZ() != 1 && C1666706fp.LIZ() != 3) {
                    interfaceC346201WaLIZIZ = C1518305wz.LL;
                } else {
                    interfaceC346201WaLIZIZ = new C1768806wI(C09IC.LJIILL(new C1768806wI(interfaceC1502705uTLIZIZ.LIZIZ(), 22)), 23);
                }
            } else {
                interfaceC346201WaLIZIZ = interfaceC1502705uTLIZIZ.LIZIZ();
            }
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 101);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("GroupChatTypingIndicatorBubbleVM@6040.initSubscribeToTypingEvents$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatTypingIndicatorBubbleVM@6040.initSubscribeToTypingEvents$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
