package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05ON, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.privacy.setting.impl.PrivacySettingAPIServices$refreshData$3", f = "PrivacySettingAPIServices.kt", l = {158}, m = "invokeSuspend")
public final class C05ON extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05ON(InterfaceC1364105Vn<? super C05ON> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ON(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrivacySettingAPIServices@1619.refreshData$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            this.LL = 1;
            if (c1888220zEi.LJIIIZ(this) == objLJFF) {
                C1C7U.LIZIZ("PrivacySettingAPIServices@1619.refreshData$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PrivacySettingAPIServices@1619.refreshData$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05ON(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
