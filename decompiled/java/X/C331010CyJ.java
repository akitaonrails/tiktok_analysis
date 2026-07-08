package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;

/* JADX INFO: renamed from: X.0CyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel", f = "VerifySchoolViewModel.kt", l = {214, 235}, m = "correctSchool")
public final class C331010CyJ extends AbstractC23140094w {
    public C331430Cyz LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VerifySchoolViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331010CyJ(VerifySchoolViewModel verifySchoolViewModel, InterfaceC1364105Vn<? super C331010CyJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = verifySchoolViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifySchoolViewModel@f573.correctSchool$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, this);
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.correctSchool$1");
        return objVQ2;
    }
}
