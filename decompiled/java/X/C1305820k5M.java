package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor$trackTouchExplorationStateChange$2", f = "AccessibilityEventTrackingMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1305820k5M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305820k5M(boolean z, InterfaceC1364105Vn<? super C1305820k5M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305820k5M(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccessibilityEventTrackingMonitor@71c7.trackTouchExplorationStateChange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LL) {
            AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor = AccessibilityEventTrackingMonitor.INSTANCE;
            EnumC1305880k5S enumC1305880k5S = EnumC1305880k5S.TALKBACK;
            accessibilityEventTrackingMonitor.logAccessibilityEvent(enumC1305880k5S, true, "setting_update", jElapsedRealtime, null);
            EnumC1305880k5S enumC1305880k5S2 = EnumC1305880k5S.TOUCH_EXPLORATION;
            accessibilityEventTrackingMonitor.logAccessibilityEvent(enumC1305880k5S2, true, "setting_update", jElapsedRealtime, null);
            C1305840k5O.LIZ.getClass();
            C1305840k5O.LIZIZ(enumC1305880k5S, true);
            C1305840k5O.LIZIZ(enumC1305880k5S2, true);
        } else {
            AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor2 = AccessibilityEventTrackingMonitor.INSTANCE;
            EnumC1305880k5S enumC1305880k5S3 = EnumC1305880k5S.TALKBACK;
            accessibilityEventTrackingMonitor2.logAccessibilityEvent(enumC1305880k5S3, false, "setting_update", jElapsedRealtime, null);
            EnumC1305880k5S enumC1305880k5S4 = EnumC1305880k5S.TOUCH_EXPLORATION;
            accessibilityEventTrackingMonitor2.logAccessibilityEvent(enumC1305880k5S4, false, "setting_update", jElapsedRealtime, null);
            C1305840k5O.LIZ.getClass();
            C1305840k5O.LIZIZ(enumC1305880k5S3, null);
            C1305840k5O.LIZIZ(enumC1305880k5S4, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccessibilityEventTrackingMonitor@71c7.trackTouchExplorationStateChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
