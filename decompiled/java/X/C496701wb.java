package X;

import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$onGuideRealShow$1", f = "SlideGuideViewModel.kt", l = {210}, m = "invokeSuspend")
public final class C496701wb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SlideGuideViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496701wb(SlideGuideViewModel slideGuideViewModel, InterfaceC1364105Vn<? super C496701wb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = slideGuideViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496701wb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlideGuideViewModel@6464.onGuideRealShow$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("SlideGuideViewModel@6464.onGuideRealShow$1");
                return objLJFF;
            }
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("SlideGuide", "auto dismiss!!");
        this.LLILLJJLI.setVisible(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideGuideViewModel@6464.onGuideRealShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
