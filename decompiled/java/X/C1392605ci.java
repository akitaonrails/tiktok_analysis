package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS438S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {39}, m = "invokeSuspend")
public final class C1392605ci extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392605ci(float f, InterfaceC1677030tk5<Float> interfaceC1677030tk5, C817403Hg c817403Hg, InterfaceC1364105Vn<? super C1392605ci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = f;
        this.LLILZ = interfaceC1677030tk5;
        this.LLILZIL = c817403Hg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1392605ci c1392605ci = new C1392605ci(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1392605ci.LLILLJJLI = obj;
        return c1392605ci;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC1392705cj interfaceC1392705cj = (InterfaceC1392705cj) this.LLILLJJLI;
            float f = this.LLILLL;
            InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILZ;
            AwS438S0200000_2 awS438S0200000_2 = new AwS438S0200000_2(this.LLILZIL, interfaceC1392705cj, 22);
            this.LL = 1;
            if (C1677810tlL.LIZ(0.0f, f, 0.0f, interfaceC1677030tk5, awS438S0200000_2, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
