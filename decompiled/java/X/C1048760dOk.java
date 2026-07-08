package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1", f = "AdFollowUpAceSurveyView.kt", l = {251}, m = "invokeSuspend")
public final class C1048760dOk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1048750dOj LLILLJJLI;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048760dOk(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, C1048750dOj c1048750dOj, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1048750dOj;
        this.LLILLL = adFollowUpAceSurveyVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048760dOk(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyView@4e80.buildState$1");
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
            C1048750dOj c1048750dOj = this.LLILLJJLI;
            LifecycleOwner lifecycleOwner = c1048750dOj.LLJJIJIL;
            if (lifecycleOwner != null) {
                Lifecycle.State state = Lifecycle.State.STARTED;
                C1048790dOn c1048790dOn = new C1048790dOn(this.LLILLL, c1048750dOj, null);
                this.LL = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c1048790dOn, this) == objLJFF) {
                    C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
