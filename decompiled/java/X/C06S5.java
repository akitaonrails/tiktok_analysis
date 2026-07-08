package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl;

/* JADX INFO: renamed from: X.06S5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl", f = "InternalShareMethodBridgeImpl.kt", l = {37}, m = "loadSortDataWithParams")
public final class C06S5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InternalShareMethodBridgeImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06S5(InternalShareMethodBridgeImpl internalShareMethodBridgeImpl, InterfaceC1364105Vn<? super C06S5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = internalShareMethodBridgeImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalShareMethodBridgeImpl@76b5.loadSortDataWithParams$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(false, false, false, 0, false, false, null, false, this);
        C1C7U.LIZIZ("InternalShareMethodBridgeImpl@76b5.loadSortDataWithParams$1");
        return objLJFF;
    }
}
