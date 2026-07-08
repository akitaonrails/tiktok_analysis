package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolAPI;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel$resendCode$4", f = "VerifySchoolViewModel.kt", l = {289}, m = "invokeSuspend")
public final class C338070DNd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ VerifySchoolViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338070DNd(VerifySchoolViewModel verifySchoolViewModel, String str, String str2, InterfaceC1364105Vn<? super C338070DNd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = verifySchoolViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338070DNd(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        C1C7U.LIZ("VerifySchoolViewModel@f573.resendCode$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    str = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                str = this.LLILLL.getState().LLILLL;
                if (str != null) {
                    VerifySchoolAPI verifySchoolAPI = (VerifySchoolAPI) this.LLILLL.LL.getValue();
                    this.LL = str;
                    this.LLILLJJLI = 1;
                    if (verifySchoolAPI.resendCode(str, this) == objLJFF) {
                        C1C7U.LIZIZ("VerifySchoolViewModel@f573.resendCode$4");
                        return objLJFF;
                    }
                } else {
                    throw new IOException();
                }
            }
            this.LLILLL.setState(AFwS232S0000000_4.get$arr$(143));
            this.LLILLL.xQ2().LIZJ(this.LLILLL.wQ2(), this.LLILZ, this.LLILZIL, str);
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setState(new AwS583S0100000_4(e, 188));
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLL.setState(AFwS232S0000000_4.get$arr$(144));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VerifySchoolViewModel@f573.resendCode$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
