package X;

import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel$handleStartNoiseDetectTask$2", f = "NoiseSuppressionViewModel.kt", l = {78}, m = "invokeSuspend")
public final class C754300TiO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NoiseSuppressionViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754300TiO(NoiseSuppressionViewModel noiseSuppressionViewModel, InterfaceC1364105Vn<? super C754300TiO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = noiseSuppressionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754300TiO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoiseSuppressionViewModel@722f.handleStartNoiseDetectTask$2");
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
            long j = ((long) this.LLILLJJLI.LLJIJIL.startDelayDuration) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("NoiseSuppressionViewModel@722f.handleStartNoiseDetectTask$2");
                return objLJFF;
            }
        }
        NoiseSuppressionViewModel noiseSuppressionViewModel = this.LLILLJJLI;
        noiseSuppressionViewModel.LLIZ = null;
        noiseSuppressionViewModel.BQ2("broadcast 2 min");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoiseSuppressionViewModel@722f.handleStartNoiseDetectTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
