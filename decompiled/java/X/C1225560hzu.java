package X;

import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel;

/* JADX INFO: renamed from: X.0hzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolListViewModel", f = "SchoolListViewModel.kt", l = {136}, m = "getSchoolList")
public final class C1225560hzu extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SchoolListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225560hzu(SchoolListViewModel schoolListViewModel, InterfaceC1364105Vn<? super C1225560hzu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = schoolListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolListViewModel@252b.getSchoolList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("SchoolListViewModel@252b.getSchoolList$1");
        return objVQ2;
    }
}
