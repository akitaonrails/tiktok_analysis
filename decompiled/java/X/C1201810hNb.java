package X;

import com.ss.android.ugc.nearby.roaming.NearbyRegionSearchV1Response;
import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;

/* JADX INFO: renamed from: X.0hNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.roaming.RegionSearchViewModel", f = "RegionSearchViewModel.kt", l = {76}, m = "requestRegionItems")
public final class C1201810hNb extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public NearbyRegionSearchV1Response LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ RegionSearchViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201810hNb(RegionSearchViewModel regionSearchViewModel, InterfaceC1364105Vn<? super C1201810hNb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = regionSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionSearchViewModel@e768.requestRegionItems$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZIL.xQ2(null, this);
        C1C7U.LIZIZ("RegionSearchViewModel@e768.requestRegionItems$1");
        return objXQ2;
    }
}
