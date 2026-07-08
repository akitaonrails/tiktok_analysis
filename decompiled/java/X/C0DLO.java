package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;

/* JADX INFO: renamed from: X.0DLO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel", f = "CampusFlowViewModel.kt", l = {218}, m = "profileHeaderAddSchoolClick")
public final class C0DLO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CampusFlowViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DLO(CampusFlowViewModel campusFlowViewModel, InterfaceC1364105Vn<? super C0DLO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = campusFlowViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusFlowViewModel@b7a5.profileHeaderAddSchoolClick$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objGQ2 = this.LLILLJJLI.GQ2(this);
        C1C7U.LIZIZ("CampusFlowViewModel@b7a5.profileHeaderAddSchoolClick$1");
        return objGQ2;
    }
}
