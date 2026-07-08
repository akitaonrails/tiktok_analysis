package X;

import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel$notifyShowNoiseCapsule$1", f = "NoiseSuppressionViewModel.kt", l = {264}, m = "invokeSuspend")
public final class C754280TiM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NoiseSuppressionViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754280TiM(NoiseSuppressionViewModel noiseSuppressionViewModel, InterfaceC1364105Vn<? super C754280TiM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = noiseSuppressionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754280TiM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoiseSuppressionViewModel@722f.notifyShowNoiseCapsule$1");
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
            NoiseSuppressionViewModel noiseSuppressionViewModel = this.LLILLJJLI;
            C768310UBx c768310UBx = noiseSuppressionViewModel.LLJILJIL;
            if (c768310UBx == null) {
                synchronized (noiseSuppressionViewModel) {
                    c768310UBx = noiseSuppressionViewModel.LLJILJIL;
                    if (c768310UBx == null) {
                        c768310UBx = new C768310UBx();
                        noiseSuppressionViewModel.LLJILJIL = c768310UBx;
                    }
                }
            }
            this.LL = 1;
            if (c768310UBx.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("NoiseSuppressionViewModel@722f.notifyShowNoiseCapsule$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoiseSuppressionViewModel@722f.notifyShowNoiseCapsule$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
