package X;

import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.DigitalWellbeingManagerV2$updateDigitalWellbeingData$1$1", f = "DigitalWellbeingManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C1702780uPc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DigitalWellbeingBean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702780uPc(DigitalWellbeingBean digitalWellbeingBean, InterfaceC1364105Vn<? super C1702780uPc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = digitalWellbeingBean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702780uPc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DigitalWellbeingManagerV2@ac05.updateDigitalWellbeingData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15Y6 c15y6 = C15Y6.LL;
        DigitalWellbeingBean digitalWellbeingBean = this.LL;
        c15y6.getClass();
        C15Y6.LLILZLL = digitalWellbeingBean;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DigitalWellbeingManagerV2@ac05.updateDigitalWellbeingData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
