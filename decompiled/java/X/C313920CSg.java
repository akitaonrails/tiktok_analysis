package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.game.GameLiveScanner$startScanVE$1$1", f = "GameLiveScanner.kt", l = {}, m = "invokeSuspend")
public final class C313920CSg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19287310cx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313920CSg(C19287310cx c19287310cx, InterfaceC1364105Vn<? super C313920CSg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19287310cx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313920CSg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameLiveScanner@fe17.startScanVE$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19287310cx c19287310cx = this.LL;
        if (c19287310cx.LIZIZ != null) {
            synchronized (c19287310cx) {
                try {
                    C20441214yg.LIZIZ("GameLiveScanner", "startScanVE");
                    IQRCodeScanner iQRCodeScanner = c19287310cx.LIZIZ;
                    if (iQRCodeScanner != null) {
                        iQRCodeScanner.startScanVE();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameLiveScanner@fe17.startScanVE$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
