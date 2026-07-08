package X;

import Y.AgS300S0100000_19;

/* JADX INFO: renamed from: X.0iys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "UserCardListViewModel.kt", l = {225}, m = "emit")
public final class C1263360iys extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS300S0100000_19 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263360iys(AgS300S0100000_19 agS300S0100000_19, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS300S0100000_19;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.init$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("UserCardListViewModel@982.init$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        return objEmit;
    }
}
