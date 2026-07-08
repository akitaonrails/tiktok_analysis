package X;

import com.ss.android.ugc.aweme.localservice.optimistic.PoiCollectService;

/* JADX INFO: renamed from: X.0O9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.PoiCollectService", f = "PoiCollectService.kt", l = {38}, m = "request")
public final class C614820O9o extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiCollectService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614820O9o(PoiCollectService poiCollectService, InterfaceC1364105Vn<? super C614820O9o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiCollectService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCollectService@e723.request$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(null, this);
        C1C7U.LIZIZ("PoiCollectService@e723.request$1");
        return objLJIIIZ;
    }
}
