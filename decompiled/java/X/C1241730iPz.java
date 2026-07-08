package X;

import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultListVM$refresh$1", f = "InboxSearchResultListVM.kt", l = {223}, m = "invokeSuspend")
public final class C1241730iPz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxSearchResultListVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241730iPz(InboxSearchResultListVM inboxSearchResultListVM, InterfaceC1364105Vn<? super C1241730iPz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchResultListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1241730iPz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchResultListVM@1c63.refresh$1");
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
            InboxSearchTabProtocol inboxSearchTabProtocol = this.LLILLJJLI.LL;
            if (inboxSearchTabProtocol != null) {
                long jLIZJ = inboxSearchTabProtocol.LIZJ();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLIZJ, this) == objLJFF) {
                    C1C7U.LIZIZ("InboxSearchResultListVM@1c63.refresh$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchResultListVM@1c63.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
