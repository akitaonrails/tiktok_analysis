package X;

import Y.ARunnableS99S0200000_30;
import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13kA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20096413kA {
    public static void LIZ(Context context, String str) {
        LIZIZ(0L, context, str, false);
    }

    public static void LIZIZ(long j, Context context, String str, boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C786410Ut5.H2(context, "accessibility");
        if (accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.getText().add(str);
            try {
                if (z) {
                    C786410Ut5.LJLIIL(j, new BPEAHandler(), new ARunnableS99S0200000_30(accessibilityManager, accessibilityEventObtain, 18));
                } else {
                    accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
