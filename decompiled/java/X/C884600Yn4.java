package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$dataSourceObserver$2$1$onRefresh$1", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884600Yn4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884600Yn4(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, String str, InterfaceC1364105Vn<? super C884600Yn4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884600Yn4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884270YmX c884270YmX = this.LL.LJIIZILJ().get(this.LLILLJJLI);
        if (c884270YmX != null && c884270YmX.LJII) {
            List<? extends C879540Yeu<?>> listLLIIII = C13LP.LLIIII(c884270YmX.LJIILIIL().values());
            ChatListEngine chatListEngine = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append("_refresh");
            chatListEngine.LJIILL(c884270YmX, listLLIIII, listLLIIII, false, C2188811AlT.LIZIZ(sbLIZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onRefresh$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onRefresh$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
