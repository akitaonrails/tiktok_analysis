package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;

/* JADX INFO: renamed from: X.0CyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel", f = "VerifySchoolViewModel.kt", l = {325, 327}, m = "verifyEmail")
public final class C330990CyH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VerifySchoolViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330990CyH(VerifySchoolViewModel verifySchoolViewModel, InterfaceC1364105Vn<? super C330990CyH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = verifySchoolViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifySchoolViewModel@f573.verifyEmail$12");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLJJLI.zQ2(null, null, this);
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.verifyEmail$12");
        return objZQ2;
    }
}
