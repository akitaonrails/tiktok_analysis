package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor$track$2", f = "AccessibilityEventTrackingMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1305830k5N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305830k5N(Context context, boolean z, InterfaceC1364105Vn<? super C1305830k5N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305830k5N(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair<Boolean, Integer> pair;
        C1C7U.LIZ("AccessibilityEventTrackingMonitor@71c7.track$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (EnumC1305880k5S enumC1305880k5S : EnumC1305880k5S.values()) {
            try {
                pair = AccessibilityEventTrackingMonitor.INSTANCE.getSettingStatus(enumC1305880k5S, this.LL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                pair = new Pair<>(false, null);
            }
            if (pair.getFirst().booleanValue()) {
                if (this.LLILLJJLI) {
                    Long lLJFF = C2286608xc.LJFF(jElapsedRealtime);
                    AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor = AccessibilityEventTrackingMonitor.INSTANCE;
                    accessibilityEventTrackingMonitor.getStartTimeMapping().put(enumC1305880k5S, lLJFF);
                    accessibilityEventTrackingMonitor.logAccessibilityEvent(enumC1305880k5S, true, "app_start", jElapsedRealtime, pair.getSecond());
                    C1305840k5O c1305840k5O = C1305840k5O.LIZ;
                    Object second = pair.getSecond();
                    if (second == null) {
                        second = true;
                    }
                    c1305840k5O.getClass();
                    C1305840k5O.LIZIZ(enumC1305880k5S, second);
                } else {
                    AccessibilityEventTrackingMonitor.INSTANCE.logAccessibilityEvent(enumC1305880k5S, false, "app_pause", jElapsedRealtime, pair.getSecond());
                    C1305840k5O.LIZ.getClass();
                    C1305840k5O.LIZIZ(enumC1305880k5S, null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.track$2");
        return unit;
    }
}
