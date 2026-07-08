package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchUserFilterVM$refresh$1", f = "InboxSearchUserFilterVM.kt", l = {56}, m = "invokeSuspend")
public final class C06KT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxSearchUserFilterVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KT(InboxSearchUserFilterVM inboxSearchUserFilterVM, InterfaceC1364105Vn<? super C06KT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxSearchUserFilterVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchUserFilterVM@4309.refresh$1");
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
            if (this.LLILLJJLI.LL.length() > 0) {
                long j = this.LLILLJJLI.LLILLJJLI;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("InboxSearchUserFilterVM@4309.refresh$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchUserFilterVM@4309.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
