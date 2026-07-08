package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06n8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.chatlabel.ChatListChatLabelUpdater$observeDataChangeAfterFilter$1$1", f = "ChatListChatLabelUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1712006n8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1711806n6 LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1491305sd> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1712006n8(C1711806n6 c1711806n6, InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends InterfaceC1491305sd> list, InterfaceC1364105Vn<? super C1712006n8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1711806n6;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712006n8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListChatLabelUpdater@1680.observeDataChangeAfterFilter$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1711806n6 c1711806n6 = this.LL;
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayList = c1711806n6.LLIZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
        List<InterfaceC1491305sd> list = this.LLILLL;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye3, list, c1711806n6.LLILZ, "ChatListChatLabelUpdater");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListChatLabelUpdater@1680.observeDataChangeAfterFilter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
