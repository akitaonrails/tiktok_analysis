package X;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS378S0200000_12;
import njp.a;

/* JADX INFO: renamed from: X.0zpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.provider.ScreenTimeBreaksTriggerProvider$onTriggered$1", f = "ScreenTimeBreaksTriggerProvider.kt", l = {}, m = "invokeSuspend")
public final class C1910930zpL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1910940zpM LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910930zpL(C1910940zpM c1910940zpM, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C1910930zpL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1910940zpM;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1910930zpL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ScreenTimeBreaksTriggerProvider@9250.onTriggered$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC20537615Xy enumC20537615XyLIZIZ = ComplianceServiceProvider.LJIIJJI().LIZIZ();
        EnumC20537615Xy enumC20537615Xy = EnumC20537615Xy.CHILD;
        if ((enumC20537615XyLIZIZ == enumC20537615Xy || ComplianceServiceProvider.LJIIJJI().LIZIZ() == EnumC20537615Xy.UNLINK_LOCKED) && ComplianceServiceProvider.LJIIJJI().LJIILL() > 0) {
            C1910940zpM c1910940zpM = this.LL;
            Function0<Unit> function0 = this.LLILLJJLI;
            Function0<Unit> function02 = this.LLILLL;
            c1910940zpM.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c2344009Gk.LIZJ(1, "is_fp_teen");
            C20684815ws.LJIILLIIL("screen_time_breaks_popup", c2344009Gk.LIZ);
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(validTopActivity);
                c1397580mTM.LJI(validTopActivity.getString(2131847038));
                String string = validTopActivity.getString(2131847037, Integer.valueOf(ComplianceServiceProvider.LJIL().LJIIIZ()));
                String string2 = validTopActivity.getString(2131834384);
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((CharSequence) "\n\n");
                int length = spannableStringBuilderAppend.length();
                spannableStringBuilderAppend.append((CharSequence) string2);
                C786410Ut5.q2(spannableStringBuilderAppend, new StyleSpan(0), length, spannableStringBuilderAppend.length(), 33);
                c1397580mTM.LIZIZ(spannableStringBuilderAppend);
                C985403tE.LIZ(c1397580mTM, new AwS236S0300000_27(validTopActivity, (Activity) function0, function02, (Function0<Unit>) 37));
                C0DQ0.LIZ.getClass();
                C340180DVg.LIZ(c1397580mTM, C0DQ0.LIZ(validTopActivity), 0, 6);
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        } else {
            C1910940zpM c1910940zpM2 = this.LL;
            Function0<Unit> function03 = this.LLILLJJLI;
            Function0<Unit> function04 = this.LLILLL;
            c1910940zpM2.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (ComplianceServiceProvider.LJIIJJI().LIZIZ() != enumC20537615Xy && ComplianceServiceProvider.LJIIJJI().LIZIZ() != EnumC20537615Xy.UNLINK_LOCKED) {
                i = 0;
            } else {
                i = 2;
            }
            c2344009Gk2.LIZJ(i, "is_fp_teen");
            C20684815ws.LJIILLIIL("screen_time_breaks_popup", c2344009Gk2.LIZ);
            Activity validTopActivity2 = ActivityStack.getValidTopActivity();
            if (validTopActivity2 != null) {
                C1397580mTM c1397580mTM2 = new C1397580mTM(validTopActivity2);
                c1397580mTM2.LJI(validTopActivity2.getString(2131847038));
                c1397580mTM2.LIZIZ(validTopActivity2.getString(2131847037, Integer.valueOf(ComplianceServiceProvider.LJIL().LJIIIZ())));
                C1391420mJQ c1391420mJQ = new C1391420mJQ(validTopActivity2);
                c1391420mJQ.LIZJ(true);
                c1391420mJQ.LIZLLL(validTopActivity2.getString(2131847034));
                c1391420mJQ.LJ(new AwS378S0200000_12(validTopActivity2, function03, 92));
                c1397580mTM2.LJIIJJI = c1391420mJQ;
                C985403tE.LIZ(c1397580mTM2, new AwS237S0300000_28(validTopActivity2, (Activity) function03, function04, (Function0<Unit>) 10));
                C0DQ0.LIZ.getClass();
                C340180DVg.LIZ(c1397580mTM2, C0DQ0.LIZ(validTopActivity2), 0, 6);
                c1397580mTM2.LIZLLL(AFwS271S0000000_28.get$arr$(391));
                c1397580mTM2.LJII = false;
                new C1397510mTF(c1397580mTM2).LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenTimeBreaksTriggerProvider@9250.onTriggered$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
