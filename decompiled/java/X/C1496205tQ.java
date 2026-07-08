package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToCollapseOnTyping$1", f = "SingleTitleBarCenterAssem.kt", l = {496}, m = "invokeSuspend")
public final class C1496205tQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleTitleBarCenterAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496205tQ(SingleTitleBarCenterAssem singleTitleBarCenterAssem, InterfaceC1364105Vn<? super C1496205tQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleTitleBarCenterAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1496205tQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.subscribeToCollapseOnTyping$1");
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
            C909290Zln c909290ZlnLp = this.LLILLJJLI.lp();
            if (c909290ZlnLp == null || (conversationId = c909290ZlnLp.getConversationId()) == null) {
                conversationId = "";
            }
            EnumC1504205ui enumC1504205ui = EnumC1504205ui.SINGLE;
            c1504005ug.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1768806wI(C1504005ug.LIZIZ(conversationId, enumC1504205ui).LIZJ(), 14));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 71);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToCollapseOnTyping$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToCollapseOnTyping$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
