package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;

/* JADX INFO: renamed from: X.0DLP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel", f = "CampusFlowViewModel.kt", l = {381}, m = "performAction")
public final class C0DLP extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CampusFlowViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DLP(CampusFlowViewModel campusFlowViewModel, InterfaceC1364105Vn<? super C0DLP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = campusFlowViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusFlowViewModel@b7a5.performAction$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objFQ2 = this.LLILLL.FQ2(null, this);
        C1C7U.LIZIZ("CampusFlowViewModel@b7a5.performAction$1");
        return objFQ2;
    }
}
