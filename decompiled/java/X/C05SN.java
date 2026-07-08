package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngineKt$ZoomableContainer$1$1$1$4", f = "MediaEngine.kt", l = {456}, m = "invokeSuspend")
public final class C05SN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C05P0<Float> LLILLL;
    public final /* synthetic */ C05P0<Float> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SN(C1677480tko<Float, C1677280tkU> c1677480tko, C05P0<Float> c05p0, C05P0<Float> c05p02, InterfaceC1364105Vn<? super C05SN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SN(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaEngineKt@d6df.ZoomableContainer$1$1$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Float fValueOf = Float.valueOf(0.0f);
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            Float fLIZLLL = C2286608xc.LIZLLL(1.0f);
            C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 200.0f, null, 5);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1676890tjrLIZJ, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("MediaEngineKt@d6df.ZoomableContainer$1$1$1$4");
                return objLJFF;
            }
        }
        this.LLILLL.setValue(fValueOf);
        this.LLILZ.setValue(fValueOf);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaEngineKt@d6df.ZoomableContainer$1$1$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
