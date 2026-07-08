package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0PEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {1061, 990}, m = "setNewWidgetState")
public final class C641670PEv extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SkylightListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641670PEv(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C641670PEv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = skylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SkylightListViewModel@8bc2.setNewWidgetState$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objNQ2 = this.LLILZIL.NQ2(null, null, this);
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.setNewWidgetState$1");
        return objNQ2;
    }
}
