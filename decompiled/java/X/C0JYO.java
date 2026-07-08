package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;

/* JADX INFO: renamed from: X.0JYO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYO extends C09AY implements Function1<C0JYI, C0JYI> {
    public final /* synthetic */ GetSubOnlyLiveInfoResponse LL;
    public final /* synthetic */ C259800zU<C493830JYf> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYO(GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse, C259800zU<C493830JYf> c259800zU) {
        super(1);
        this.LL = getSubOnlyLiveInfoResponse;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JYI invoke(C0JYI c0jyi) {
        GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse = this.LL;
        C493830JYf c493830JYf = this.LLILLJJLI.element;
        c0jyi.getClass();
        return new C0JYI(getSubOnlyLiveInfoResponse, c493830JYf);
    }
}
