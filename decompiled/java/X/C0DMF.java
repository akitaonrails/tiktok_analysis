package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;

/* JADX INFO: renamed from: X.0DMF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel", f = "CampusFlowViewModel.kt", l = {431, 444}, m = "createSchool")
public final class C0DMF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CampusFlowViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DMF(CampusFlowViewModel campusFlowViewModel, InterfaceC1364105Vn<? super C0DMF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = campusFlowViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusFlowViewModel@b7a5.createSchool$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZIL.xQ2(null, null, null, this);
        C1C7U.LIZIZ("CampusFlowViewModel@b7a5.createSchool$1");
        return objXQ2;
    }
}
