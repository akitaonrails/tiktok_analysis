package X;

import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel$onCapsuleShow$1", f = "NoiseSuppressionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C754270TiL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NoiseSuppressionViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754270TiL(NoiseSuppressionViewModel noiseSuppressionViewModel, InterfaceC1364105Vn<? super C754270TiL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = noiseSuppressionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754270TiL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("NoiseSuppressionViewModel@722f.onCapsuleShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0JT6<Integer> c0jt6 = InterfaceC1106030et7.q9;
        Integer numLIZ = c0jt6.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        c0jt6.LIZJ(C2286608xc.LJ(iIntValue + 1));
        InterfaceC1106030et7.r9.LIZJ(C2286608xc.LJFF(System.currentTimeMillis()));
        this.LL.DQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoiseSuppressionViewModel@722f.onCapsuleShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
