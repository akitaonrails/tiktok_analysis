package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$getPageListObserver$1$onQueryConversationWithCategory$1", f = "ChatListConversationDataSource.kt", l = {}, m = "invokeSuspend")
public final class C878400Yd4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878460YdA LL;
    public final /* synthetic */ C0Y6X LLILLJJLI;
    public final /* synthetic */ C878470YdB LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878400Yd4(C878460YdA c878460YdA, C0Y6X c0y6x, C878470YdB c878470YdB, InterfaceC1364105Vn<? super C878400Yd4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878460YdA;
        this.LLILLJJLI = c0y6x;
        this.LLILLL = c878470YdB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878400Yd4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C879540Yeu c879540YeuLJIILLIIL;
        C1C7U.LIZ("ChatListConversationDataSource@6f28.getPageListObserver$1$onQueryConversationWithCategory$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C878460YdA c878460YdA = this.LL;
        C0Y6X c0y6x = this.LLILLJJLI;
        C878470YdB c878470YdB = this.LLILLL;
        c878460YdA.getClass();
        List<C0Y8T> list = c0y6x.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C0Y8T c0y8t : list) {
            C878670YdV.LIZ.getClass();
            if (C878670YdV.LIZIZ(c0y8t) && (c879540YeuLJIILLIIL = C878460YdA.LJIILLIIL(c0y8t, c878470YdB.LIZ.LL)) != null) {
                arrayList.add(c879540YeuLJIILLIIL);
            }
        }
        String str = c878460YdA.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("solve all archive conversations queried for the archive entrance in personal inbox, query size: ");
        sbLIZ.append(c0y6x.LIZIZ.size());
        sbLIZ.append(", rawWrapper size: ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", tab=");
        sbLIZ.append(c878470YdB.LIZ.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = c878460YdA.LJIILL().get(c878470YdB);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC878540YdI> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(c878470YdB.LIZ, arrayList, arrayList, null, false, false, C878360Yd0.LIZIZ(c878460YdA.LIZ, "query_all_archive_for_entrance_info"));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.getPageListObserver$1$onQueryConversationWithCategory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
