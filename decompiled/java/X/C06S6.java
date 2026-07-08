package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl;

/* JADX INFO: renamed from: X.06S6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl", f = "InternalShareMethodBridgeImpl.kt", l = {61}, m = "loadSortDataWithParams")
public final class C06S6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InternalShareMethodBridgeImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06S6(InternalShareMethodBridgeImpl internalShareMethodBridgeImpl, InterfaceC1364105Vn<? super C06S6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = internalShareMethodBridgeImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalShareMethodBridgeImpl@76b5.loadSortDataWithParams$3");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(0, false, false, false, 0, false, false, null, false, this);
        C1C7U.LIZIZ("InternalShareMethodBridgeImpl@76b5.loadSortDataWithParams$3");
        return objLIZLLL;
    }
}
