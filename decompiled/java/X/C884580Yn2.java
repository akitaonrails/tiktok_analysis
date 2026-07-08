package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$notifyAfterFilterUpdaterDataChange$1", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884580Yn2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884270YmX LL;
    public final /* synthetic */ ChatListEngine LLILLJJLI;
    public final /* synthetic */ Collection<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C884580Yn2(C884270YmX c884270YmX, ChatListEngine chatListEngine, Collection<? extends C879540Yeu<?>> collection, String str, InterfaceC1364105Vn<? super C884580Yn2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884270YmX;
        this.LLILLJJLI = chatListEngine;
        this.LLILLL = collection;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884580Yn2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<InterfaceC882100Yj2> list;
        C1C7U.LIZ("ChatListEngine@4c4f.notifyAfterFilterUpdaterDataChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884270YmX c884270YmX = this.LL;
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH != null && (list = c884730YnH.LIZLLL) != null) {
            ChatListEngine chatListEngine = this.LLILLJJLI;
            Collection<C879540Yeu<?>> collection = this.LLILLL;
            String str = this.LLILZ;
            for (InterfaceC882100Yj2 interfaceC882100Yj2 : list) {
                InterfaceC1517005wm interfaceC1517005wmLIZLLL = interfaceC882100Yj2.LIZLLL();
                if (!(interfaceC1517005wmLIZLLL instanceof C1517705wt) || !C13LP.LJJL(chatListEngine.LJIIIZ(), ((C1517705wt) interfaceC1517005wmLIZLLL).LIZ).isEmpty()) {
                    InterfaceC879010Ye3 key = c884270YmX.LIZ.getKey();
                    chatListEngine.getClass();
                    interfaceC882100Yj2.LJIJI(key, collection, str, ChatListEngine.LJIJ(c884270YmX, str));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.notifyAfterFilterUpdaterDataChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
