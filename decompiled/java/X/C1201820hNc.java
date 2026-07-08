package X;

import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;

/* JADX INFO: renamed from: X.0hNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.roaming.RegionSearchViewModel", f = "RegionSearchViewModel.kt", l = {53}, m = "onRefresh")
public final class C1201820hNc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RegionSearchViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201820hNc(RegionSearchViewModel regionSearchViewModel, InterfaceC1364105Vn<? super C1201820hNc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = regionSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionSearchViewModel@e768.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("RegionSearchViewModel@e768.onRefresh$1");
        return objOnRefresh;
    }
}
