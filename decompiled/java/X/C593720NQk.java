package X;

import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.DigitalWellbeingResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.DigitalWellbeingProtectionApiManager$getDigitalWellbeingSetting$observable$1", f = "DigitalWellbeingSettingsApi.kt", l = {44}, m = "invokeSuspend")
public final class C593720NQk extends C09AX implements Function1<InterfaceC1364105Vn<? super DigitalWellbeingResponse>, Object> {
    public int LL;

    public C593720NQk(InterfaceC1364105Vn<? super C593720NQk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593720NQk(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super DigitalWellbeingResponse> interfaceC1364105Vn) {
        return new C593720NQk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$observable$1");
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
            InterfaceC593730NQl interfaceC593730NQl = (InterfaceC593730NQl) C593710NQj.LIZIZ.getValue();
            this.LL = 1;
            obj = interfaceC593730NQl.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$observable$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DigitalWellbeingProtectionApiManager@d01b.getDigitalWellbeingSetting$observable$1");
        return obj;
    }
}
