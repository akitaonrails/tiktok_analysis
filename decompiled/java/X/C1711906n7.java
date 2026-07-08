package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.chatlabel.ChatListChatLabelUpdater$observeDataChangeAfterFilter$1", f = "ChatListChatLabelUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1711906n7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Pair<InterfaceC1491305sd, C885380YoK>> LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ C1711806n6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711906n7(C1711806n6 c1711806n6, InterfaceC879010Ye3 interfaceC879010Ye3, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = c1711806n6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<Pair<InterfaceC1491305sd, C885380YoK>> list = this.LL;
        return new C1711906n7(this.LLILLL, this.LLILLJJLI, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1712206nA interfaceC1712206nALJIILL;
        C1C7U.LIZ("ChatListChatLabelUpdater@1680.observeDataChangeAfterFilter$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<InterfaceC1491305sd, C885380YoK>> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (Pair<InterfaceC1491305sd, C885380YoK> pair : list) {
            InterfaceC1491305sd first = pair.getFirst();
            C885380YoK second = pair.getSecond();
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService != null && (interfaceC1712206nALJIILL = iIMBusinessChatService.LJIILL()) != null && interfaceC1712206nALJIILL.LIZIZ(second, true) != null && first != null) {
                arrayList.add(first);
            }
        }
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListChatLabelUpdater@1680.observeDataChangeAfterFilter$1");
            return unit;
        }
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
        C1729806q0.LIZ(interfaceC879010Ye3, new C1712006n8(this.LLILLL, interfaceC879010Ye3, arrayList, null));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListChatLabelUpdater@1680.observeDataChangeAfterFilter$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
