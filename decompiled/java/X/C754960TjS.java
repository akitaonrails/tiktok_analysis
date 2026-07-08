package X;

import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.guide.NewAnchorGuidanceDetectHelper$startVolumeDetect$1", f = "NewAnchorGuidanceDetectHelper.kt", l = {117}, m = "invokeSuspend")
public final class C754960TjS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C754960TjS(InterfaceC1364105Vn<? super C754960TjS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754960TjS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0956 anonymousClass0956;
        long jVolumeDetectInterval;
        C1C7U.LIZ("NewAnchorGuidanceDetectHelper@a760.startVolumeDetect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    anonymousClass0956 = C769380UGa.LJIIIZ;
                    if (anonymousClass0956 != null) {
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NewAnchorGuidanceDetectHelper@a760.startVolumeDetect$1");
                    return unit;
                }
            } else {
                C155000ia.LIZIZ(obj);
            }
            do {
                List<Integer> list = C769380UGa.LJII;
                int size = ((ArrayList) list).size();
                TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting = TryModeGuidanceConfigSetting.INSTANCE;
                if (size < tryModeGuidanceConfigSetting.volumeDetectNumber()) {
                    ((ArrayList) list).add(C2286608xc.LJ(C769380UGa.LJFF));
                    jVolumeDetectInterval = tryModeGuidanceConfigSetting.volumeDetectInterval();
                    this.LL = 1;
                } else {
                    anonymousClass0956 = C769380UGa.LJIIIZ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("NewAnchorGuidanceDetectHelper@a760.startVolumeDetect$1");
                    return unit2;
                }
            } while (AnonymousClass0958.LIZIZ(jVolumeDetectInterval, this) != objLJFF);
            C1C7U.LIZIZ("NewAnchorGuidanceDetectHelper@a760.startVolumeDetect$1");
            return objLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0956 anonymousClass09562 = C769380UGa.LJIIIZ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C754960TjS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
