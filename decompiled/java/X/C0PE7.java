package X;

import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PE7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM$storeSearchItem$1", f = "InboxSearchDefaultVM.kt", l = {86}, m = "invokeSuspend")
public final class C0PE7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxSearchDefaultVM LLILLJJLI;
    public final /* synthetic */ InboxSearchRecentStoreItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PE7(InboxSearchDefaultVM inboxSearchDefaultVM, InboxSearchRecentStoreItem inboxSearchRecentStoreItem, InterfaceC1364105Vn<? super C0PE7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchDefaultVM;
        this.LLILLL = inboxSearchRecentStoreItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PE7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchDefaultVM@600.storeSearchItem$1");
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
            C0PEG c0peg = this.LLILLJJLI.LLILZIL;
            InboxSearchRecentStoreItem inboxSearchRecentStoreItem = this.LLILLL;
            c0peg.getClass();
            C23250099c.LIZLLL(C0PEG.LIZIZ, null, null, new C0PEF(inboxSearchRecentStoreItem, null), 3);
            InboxSearchDefaultVM inboxSearchDefaultVM = this.LLILLJJLI;
            this.LL = 1;
            if (inboxSearchDefaultVM.xQ2(this) == objLJFF) {
                C1C7U.LIZIZ("InboxSearchDefaultVM@600.storeSearchItem$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchDefaultVM@600.storeSearchItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
