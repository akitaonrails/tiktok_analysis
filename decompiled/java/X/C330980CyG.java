package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel$correctSchool$response$1", f = "VerifySchoolViewModel.kt", l = {236}, m = "invokeSuspend")
public final class C330980CyG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VerifyEmailResponse>, Object> {
    public int LL;
    public final /* synthetic */ VerifySchoolViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C331430Cyz LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330980CyG(VerifySchoolViewModel verifySchoolViewModel, String str, C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super C330980CyG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = verifySchoolViewModel;
        this.LLILLL = str;
        this.LLILZ = c331430Cyz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330980CyG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifySchoolViewModel@f573.correctSchool$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            VerifySchoolViewModel verifySchoolViewModel = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ.LLILLJJLI;
            this.LL = 1;
            obj = verifySchoolViewModel.zQ2(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VerifySchoolViewModel@f573.correctSchool$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.correctSchool$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VerifyEmailResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
