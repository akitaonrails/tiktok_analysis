package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.StrangerConversationAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.StrangerConversationAssem$onParentSet$1$1", f = "StrangerConversationAssem.kt", l = {56}, m = "invokeSuspend")
public final class C0NZV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NZW LLILLJJLI;
    public final /* synthetic */ StrangerConversationAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZV(C0NZW c0nzw, StrangerConversationAssem strangerConversationAssem, InterfaceC1364105Vn<? super C0NZV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nzw;
        this.LLILLL = strangerConversationAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrangerConversationAssem@cc16.onParentSet$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDrMz2 = this.LLILLJJLI.mz2();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLL, 12);
            this.LL = 1;
            c2252331DDrMz2.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrMz2, agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("StrangerConversationAssem@cc16.onParentSet$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
