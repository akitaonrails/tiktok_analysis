package X;

import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel;

/* JADX INFO: renamed from: X.0hzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel", f = "SchoolListViewModel.kt", l = {92, 104}, m = "onLoadMore")
public final class C1225550hzt extends AbstractC23140094w {
    public C1225580hzw LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SchoolListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225550hzt(SchoolListViewModel schoolListViewModel, InterfaceC1364105Vn<? super C1225550hzt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = schoolListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolListViewModel@252b.onLoadMore$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.onLoadMore(null, this);
        C1C7U.LIZIZ("SchoolListViewModel@252b.onLoadMore$1");
        return objWQ2;
    }
}
