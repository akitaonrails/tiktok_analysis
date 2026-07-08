package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IIMVoiceMessageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Hyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMVoiceMessageService$scheduleBindOnIo$1", f = "IMVoiceMessageService.kt", l = {}, m = "invokeSuspend")
public final class C458610Hyd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C458610Hyd(InterfaceC1364105Vn<? super C458610Hyd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458610Hyd(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMVoiceMessageService@4e77.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C458620Hye.LIZJ != null) {
                Unit unit = Unit.LIZ;
                C458620Hye.LJ = false;
                C1C7U.LIZIZ("IMVoiceMessageService@4e77.scheduleBindOnIo$1");
                return unit;
            }
            C458620Hye.LIZ.getClass();
            IIMVoiceMessageService iIMVoiceMessageServiceLJIIIIZZ = C458620Hye.LJIIIIZZ();
            if (iIMVoiceMessageServiceLJIIIIZZ != C458620Hye.LJIIJ()) {
                C458620Hye.LIZJ = iIMVoiceMessageServiceLJIIIIZZ;
            }
            C458620Hye.LJ = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMVoiceMessageService@4e77.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C458620Hye.LJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C458610Hyd(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
