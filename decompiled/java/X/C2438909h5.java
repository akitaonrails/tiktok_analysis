package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2$fillBackgroundColor$2", f = "LiveSurveyWidgetV2.kt", l = {560, 573}, m = "invokeSuspend")
public final class C2438909h5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSurveyWidgetV2 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438909h5(LiveSurveyWidgetV2 liveSurveyWidgetV2, int i, int i2, int i3, int i4, Function0<Unit> function0, InterfaceC1364105Vn<? super C2438909h5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSurveyWidgetV2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2438909h5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapLJIJI;
        C1C7U.LIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLILLJJLI.LLJL.getValue();
            if (livePreviewPlayerVM != null) {
                bitmapLJIJI = livePreviewPlayerVM.LLJLLIL.LJIJI(false);
            } else {
                bitmapLJIJI = null;
            }
            C2438809h4 c2438809h4 = new C2438809h4(bitmapLJIJI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            obj = C099A.LIZJ(100L, c2438809h4, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2439009h6 c2439009h6 = new C2439009h6((Integer) obj, this.LLIZ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2439009h6) == objLJFF) {
            C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
