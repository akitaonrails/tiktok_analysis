package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05GW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$flushPendingEvents$1", f = "MobClickConsentHelper.kt", l = {84, 89}, m = "invokeSuspend")
public final class C05GW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05GW(InterfaceC1364105Vn<? super C05GW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05GW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MobClickConsentHelper@eaa4.flushPendingEvents$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MobClickConsentHelper@eaa4.flushPendingEvents$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Keva keva = C05GY.LIZ;
            this.LL = 1;
            obj = C23250099c.LJI(this, C05GY.LIZJ, new C05GU(null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobClickConsentHelper@eaa4.flushPendingEvents$1");
                return objLJFF;
            }
        }
        for (C05GX c05gx : (List) obj) {
            C20684815ws.LJIILLIIL(c05gx.eventName, c05gx.params);
        }
        Keva keva2 = C05GY.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        this.LL = 2;
        Object objLJI = C23250099c.LJI(this, C05GY.LIZJ, new C05GT(c13bv, null));
        if (objLJI != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == objLJFF) {
            C1C7U.LIZIZ("MobClickConsentHelper@eaa4.flushPendingEvents$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MobClickConsentHelper@eaa4.flushPendingEvents$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05GW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
