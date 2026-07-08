package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;

/* JADX INFO: renamed from: X.0CyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel", f = "VerifySchoolViewModel.kt", l = {116, 148}, m = "verifyEmail")
public final class C331000CyI extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VerifySchoolViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331000CyI(VerifySchoolViewModel verifySchoolViewModel, InterfaceC1364105Vn<? super C331000CyI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = verifySchoolViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifySchoolViewModel@f573.verifyEmail$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZ.AQ2(null, this);
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.verifyEmail$1");
        return objAQ2;
    }
}
