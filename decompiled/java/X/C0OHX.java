package X;

import Y.AgS290S0100000_9;

/* JADX INFO: renamed from: X.0OHX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel$onPrepared$1$1", f = "BulletinListViewModel.kt", l = {184, 185}, m = "emit")
public final class C0OHX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS290S0100000_9<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OHX(AgS290S0100000_9<? super T> agS290S0100000_9, InterfaceC1364105Vn<? super C0OHX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS290S0100000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.onPrepared$1$1$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLJJLI.LIZ$0(null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.onPrepared$1$1$emit$1");
        return objLIZ$0;
    }
}
