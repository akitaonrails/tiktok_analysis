package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$dataSourceObserver$2$1$onQueryResult$3", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884630Yn7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884630Yn7(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C884630Yn7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884630Yn7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onQueryResult$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884270YmX c884270YmX = this.LL.LJIIZILJ().get(this.LLILLJJLI);
        if (c884270YmX == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onQueryResult$3");
            return unit;
        }
        InterfaceC884870YnV interfaceC884870YnV = c884270YmX.LJI;
        if (interfaceC884870YnV != null) {
            interfaceC884870YnV.LIZJ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.dataSourceObserver$2$1$onQueryResult$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
