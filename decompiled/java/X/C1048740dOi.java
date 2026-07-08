package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$onEvent$1$1", f = "AdFollowUpAceSurveyView.kt", l = {}, m = "invokeSuspend")
public final class C1048740dOi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C484220Iyq LL;
    public final /* synthetic */ C1048750dOj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048740dOi(C484220Iyq c484220Iyq, C1048750dOj c1048750dOj, InterfaceC1364105Vn<? super C1048740dOi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c484220Iyq;
        this.LLILLJJLI = c1048750dOj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048740dOi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyView@4e80.onEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (TextUtils.equals("card_rate_feedback_submit", JSONObjectProtectorUtils.getString(this.LL.LIZ, "eventName"))) {
            C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
            C1048720dOg c1048720dOgLIZ = C1048570dOR.LIZ();
            String strLIZJ = C1048600dOU.LIZJ(this.LLILLJJLI.LLIZ);
            if (strLIZJ == null) {
                c1048720dOgLIZ.getClass();
            } else {
                C603820NmG<String, C1048730dOh> c603820NmG = c1048720dOgLIZ.LIZIZ;
                if (c603820NmG != null) {
                    c603820NmG.LIZLLL(strLIZJ, new C1048730dOh(0, true, 3));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.onEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
