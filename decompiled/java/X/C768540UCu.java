package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.LiveEffectPreviewHelper$startPreview$2", f = "LiveEffectPreviewHelper.kt", l = {142}, m = "invokeSuspend")
public final class C768540UCu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C768560UCw LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C768540UCu(C768560UCw c768560UCw, Function0<Unit> function0, InterfaceC1364105Vn<? super C768540UCu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c768560UCw;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C768540UCu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectPreviewHelper@7d76.startPreview$2");
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
            this.LLILLJJLI.LIZJ = C0UA1.LIZ().createEffectTrack();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C768580UCy c768580UCy = new C768580UCy(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c768580UCy) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectPreviewHelper@7d76.startPreview$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEffectPreviewHelper@7d76.startPreview$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
