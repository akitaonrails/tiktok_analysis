package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0PEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {1061, 435}, m = "updateActiveStatusData")
public final class C641650PEt extends AbstractC23140094w {
    public SkylightListViewModel LL;
    public InterfaceC383701eN LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SkylightListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641650PEt(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C641650PEt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListViewModel@8bc2.updateActiveStatusData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objPQ2 = this.LLILZ.PQ2(this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.updateActiveStatusData$1");
        return objPQ2;
    }
}
