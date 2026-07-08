package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2$fillBackgroundColor$2$1", f = "LiveSurveyWidgetV2.kt", l = {}, m = "invokeSuspend")
public final class C2439009h6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ LiveSurveyWidgetV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439009h6(Integer num, Function0<Unit> function0, LiveSurveyWidgetV2 liveSurveyWidgetV2, InterfaceC1364105Vn<? super C2439009h6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = function0;
        this.LLILLL = liveSurveyWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2439009h6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL;
        if (num != null) {
            LiveSurveyWidgetV2 liveSurveyWidgetV2 = this.LLILLL;
            int iIntValue = num.intValue();
            AbstractC484810Izn abstractC484810Izn = liveSurveyWidgetV2.LLJJJ;
            if (abstractC484810Izn != null) {
                abstractC484810Izn.h0(iIntValue);
            }
        }
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
