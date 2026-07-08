package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.composition.SummaryCompositionTask$run$result$1", f = "SummaryCompositionTask.kt", l = {63}, m = "invokeSuspend")
public final class C539350LDh extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C539320LDe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539350LDh(C539320LDe c539320LDe, InterfaceC1364105Vn<? super C539350LDh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c539320LDe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C539350LDh c539350LDh = new C539350LDh(this.LLILLL, interfaceC1364105Vn);
        c539350LDh.LLILLJJLI = ((Number) obj).floatValue();
        return c539350LDh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SummaryCompositionTask@31ac.run$result$1");
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
            float f = this.LLILLJJLI;
            C539320LDe c539320LDe = this.LLILLL;
            C0LSZ c0lszLIZ = C0LSZ.LIZ(c539320LDe.LIZLLL, null, null, null, null, null, null, null, (int) (f * 100), null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435327);
            this.LL = 1;
            if (C0LTN.LJJJI(c539320LDe, c0lszLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("SummaryCompositionTask@31ac.run$result$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SummaryCompositionTask@31ac.run$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
