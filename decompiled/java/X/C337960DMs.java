package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;

/* JADX INFO: renamed from: X.0DMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel", f = "CampusFlowViewModel.kt", l = {475, 488}, m = "editSchool")
public final class C337960DMs extends AbstractC23140094w {
    public boolean LL;
    public C338000DMw LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CampusFlowViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337960DMs(CampusFlowViewModel campusFlowViewModel, InterfaceC1364105Vn<? super C337960DMs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = campusFlowViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusFlowViewModel@b7a5.editSchool$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZ.AQ2(false, this);
        C1C7U.LIZIZ("CampusFlowViewModel@b7a5.editSchool$1");
        return objAQ2;
    }
}
