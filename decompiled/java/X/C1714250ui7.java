package X;

import android.view.View;
import com.ss.android.ugc.aweme.verify.otp.OtpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ui7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.otp.OtpFragment$onValidateCode$1", f = "OtpFragment.kt", l = {688}, m = "invokeSuspend")
public final class C1714250ui7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OtpFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714250ui7(OtpFragment otpFragment, String str, InterfaceC1364105Vn<? super C1714250ui7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = otpFragment;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714250ui7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("OtpFragment@1dbf.onValidateCode$1");
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
            OtpFragment otpFragment = this.LLILLJJLI;
            View viewFindViewById = otpFragment.LLJJJ;
            if (viewFindViewById == null) {
                View view = otpFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.qiu);
                } else {
                    viewFindViewById = null;
                }
                otpFragment.LLJJJ = (C1390130mHL) viewFindViewById;
            }
            C1390130mHL c1390130mHL = (C1390130mHL) viewFindViewById;
            if (c1390130mHL != null) {
                C786410Ut5.LLZ(c1390130mHL, 0);
            }
            this.LLILLJJLI.sS();
            this.LLILLJJLI.nS();
            OtpFragment otpFragment2 = this.LLILLJJLI;
            if (otpFragment2.LLJZ) {
                str = "auto";
            } else {
                str = "manual";
            }
            C1713570uh1 c1713570uh1SR = otpFragment2.SR();
            if (c1713570uh1SR != null) {
                C1714170uhz.LIZ(c1713570uh1SR);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C1714220ui4 c1714220ui4 = new C1714220ui4(this.LLILLJJLI, this.LLILLL, str, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1714220ui4) == objLJFF) {
                C1C7U.LIZIZ("OtpFragment@1dbf.onValidateCode$1");
                return objLJFF;
            }
        }
        OtpFragment otpFragment3 = this.LLILLJJLI;
        View viewFindViewById2 = otpFragment3.LLJJJ;
        if (viewFindViewById2 == null) {
            View view2 = otpFragment3.getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.qiu);
            } else {
                viewFindViewById2 = null;
            }
            otpFragment3.LLJJJ = (C1390130mHL) viewFindViewById2;
        }
        C1390130mHL c1390130mHL2 = (C1390130mHL) viewFindViewById2;
        if (c1390130mHL2 != null) {
            C786410Ut5.LLZ(c1390130mHL2, 8);
        }
        OtpFragment otpFragment4 = this.LLILLJJLI;
        if (!otpFragment4.LLJJJJJIL) {
            otpFragment4.LLJJLIIIJLLLLLLLZ = null;
            otpFragment4.sS();
        }
        this.LLILLJJLI.nS();
        this.LLILLJJLI.LLJLIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OtpFragment@1dbf.onValidateCode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
