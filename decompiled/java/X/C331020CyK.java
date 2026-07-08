package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;

/* JADX INFO: renamed from: X.0CyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel", f = "VerifySchoolViewModel.kt", l = {277}, m = "resendCode")
public final class C331020CyK extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VerifySchoolViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331020CyK(VerifySchoolViewModel verifySchoolViewModel, InterfaceC1364105Vn<? super C331020CyK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = verifySchoolViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifySchoolViewModel@f573.resendCode$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.resendCode$1");
        return objYQ2;
    }
}
