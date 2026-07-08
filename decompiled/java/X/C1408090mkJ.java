package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.greenscreen.RecordGreenScreenUIComponent$showGreenScreenAndPortraitText$1", f = "RecordGreenScreenComponent.kt", l = {601}, m = "invokeSuspend")
public final class C1408090mkJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ e0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408090mkJ(e0 e0Var, InterfaceC1364105Vn<? super C1408090mkJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = e0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408090mkJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordGreenScreenUIComponent@2733.showGreenScreenAndPortraitText$1");
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
            if (AnonymousClass0958.LIZIZ(96L, this) == objLJFF) {
                C1C7U.LIZIZ("RecordGreenScreenUIComponent@2733.showGreenScreenAndPortraitText$1");
                return objLJFF;
            }
        }
        e0 e0Var = this.LLILLJJLI;
        e0.x5(e0Var, EnumC1651790t5N.GREEN_SCREEN, false, C1664590tQ1.LJIIIZ(e0Var).getString(2131828247), false, Mp4ScreenVideoLoadTimeout.CONTROL);
        e0 e0Var2 = this.LLILLJJLI;
        e0.x5(e0Var2, EnumC1651790t5N.PORTRAIT, false, C1664590tQ1.LJIIIZ(e0Var2).getString(2131828251), false, Mp4ScreenVideoLoadTimeout.CONTROL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordGreenScreenUIComponent@2733.showGreenScreenAndPortraitText$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
