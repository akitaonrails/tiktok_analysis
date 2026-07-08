package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2$getEmailConsentAgreementText$1", f = "InputCodeFragmentV2.kt", l = {643}, m = "invokeSuspend")
public final class C751070TdB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputCodeFragmentV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751070TdB(InputCodeFragmentV2 inputCodeFragmentV2, InterfaceC1364105Vn<? super C751070TdB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputCodeFragmentV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751070TdB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TuxTextView tuxTextView;
        C1C7U.LIZ("InputCodeFragmentV2@ae04.getEmailConsentAgreementText$1");
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
            Context context = this.LLILLJJLI.getContext();
            if (context != null) {
                C19295210eE c19295210eE = C19295210eE.LIZ;
                this.LL = 1;
                obj = c19295210eE.LIZ(context, "personal_info_page", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InputCodeFragmentV2@ae04.getEmailConsentAgreementText$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InputCodeFragmentV2@ae04.getEmailConsentAgreementText$1");
            return unit;
        }
        SpannableString spannableString = (SpannableString) obj;
        if (spannableString != null) {
            C19EG activity = this.LLILLJJLI.getActivity();
            if (activity != null && (tuxTextView = (TuxTextView) activity.findViewById(R.id.can)) != null) {
                tuxTextView.setText(spannableString);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setHighlightColor(0);
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", "personal_info_page");
                C20684815ws.LJIILLIIL("show_email_permission_learn_more_prompt", c0xgr.LIZ);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InputCodeFragmentV2@ae04.getEmailConsentAgreementText$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("InputCodeFragmentV2@ae04.getEmailConsentAgreementText$1");
        return unit3;
    }
}
