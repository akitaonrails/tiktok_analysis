package X;

import com.ss.android.ugc.nearby.container.repo.INearbyApi;

/* JADX INFO: renamed from: X.0hQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.repo.NearbyRepository$operator$1", f = "NearbyRepository.kt", l = {101}, m = "fetchPreloadNearbyData")
public final class C1203830hQr extends AbstractC23140094w {
    public long LL;
    public INearbyApi.UnimpressVideos LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1203810hQp LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203830hQr(C1203810hQp c1203810hQp, InterfaceC1364105Vn<? super C1203830hQr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1203810hQp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyRepository@94f4.operator$1$fetchPreloadNearbyData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJLZ = this.LLILZ.LJLZ(null, this);
        C1C7U.LIZIZ("NearbyRepository@94f4.operator$1$fetchPreloadNearbyData$1");
        return objLJLZ;
    }
}
