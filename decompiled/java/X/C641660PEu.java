package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0PEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {397, 1061, 401}, m = "onPartialRefresh")
public final class C641660PEu extends AbstractC23140094w {
    public Object LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SkylightListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641660PEu(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C641660PEu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListViewModel@8bc2.onPartialRefresh$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLILZ.JQ2(null, this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.onPartialRefresh$1");
        return objJQ2;
    }
}
