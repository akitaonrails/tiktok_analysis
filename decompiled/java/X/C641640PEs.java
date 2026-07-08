package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0PEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {421, 424}, m = "onPartialUpdate")
public final class C641640PEs extends AbstractC23140094w {
    public EnumC1598330rh9 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SkylightListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641640PEs(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C641640PEs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListViewModel@8bc2.onPartialUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objKQ2 = this.LLILLL.KQ2(null, this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.onPartialUpdate$1");
        return objKQ2;
    }
}
