package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftDetailHeaderKt$HeaderProgressBar$1$1$2", f = "MusicGiftDetailHeader.kt", l = {375, 377}, m = "invokeSuspend")
public final class C05SU extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SU(C1677480tko<Float, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05SU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05SU c05su = new C05SU(this.LLILLL, interfaceC1364105Vn);
        c05su.LLILLJJLI = ((Number) obj).floatValue();
        return c05su;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            float f = this.LLILLJJLI;
            if (f < this.LLILLL.LIZLLL().floatValue()) {
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
                Float fLIZLLL = C2286608xc.LIZLLL(f);
                this.LL = 1;
                if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                    C1C7U.LIZIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1$2");
                    return objLJFF;
                }
            } else {
                C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLL;
                Float fLIZLLL2 = C2286608xc.LIZLLL(f);
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(250, 0, C05Y0.LIZLLL, 2);
                this.LL = 2;
                if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailHeaderKt@5c0c.HeaderProgressBar$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
