package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0rh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {310, 1061, 315}, m = "onRefresh")
public final class C1598300rh6 extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SkylightListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598300rh6(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C1598300rh6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListViewModel@8bc2.onRefresh$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILZ.onRefresh(this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.onRefresh$1");
        return objOnRefresh;
    }
}
