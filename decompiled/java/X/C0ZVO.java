package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.callroom.api.service.IIMCallRoomService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZVO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.callroom.api.service.IMCallRoomService$scheduleBindOnIo$1", f = "IMCallRoomService.kt", l = {}, m = "invokeSuspend")
public final class C0ZVO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0ZVO(InterfaceC1364105Vn<? super C0ZVO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZVO(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCallRoomService@bb6e.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C0ZVP.LIZLLL != null) {
                Unit unit = Unit.LIZ;
                C0ZVP.LJFF = false;
                C1C7U.LIZIZ("IMCallRoomService@bb6e.scheduleBindOnIo$1");
                return unit;
            }
            C0ZVP.LIZIZ.getClass();
            IIMCallRoomService iIMCallRoomServiceLJFF = C0ZVP.LJFF();
            if (iIMCallRoomServiceLJFF != C0ZVP.LJII()) {
                C0ZVP.LIZLLL = iIMCallRoomServiceLJFF;
            }
            C0ZVP.LJFF = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMCallRoomService@bb6e.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0ZVP.LJFF = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ZVO(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
