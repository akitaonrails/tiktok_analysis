package X;

import android.view.accessibility.AccessibilityManager;
import com.lynx.base.log.LynxLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310300kCa {
    public final AccessibilityManager LIZ;
    public final AccessibilityManagerAccessibilityStateChangeListenerC1310310kCb LIZIZ;
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1310320kCc LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kCb, android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kCc, android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener] */
    public C1310300kCa(AccessibilityManager accessibilityManager, final InterfaceC1310350kCf interfaceC1310350kCf) {
        if (accessibilityManager != 0 && interfaceC1310350kCf != null) {
            this.LIZ = accessibilityManager;
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            interfaceC1310350kCf.LIZIZ(zIsEnabled);
            interfaceC1310350kCf.LIZ(zIsTouchExplorationEnabled);
            ?? r0 = new AccessibilityManager.AccessibilityStateChangeListener(interfaceC1310350kCf) { // from class: X.0kCb
                public final WeakReference<InterfaceC1310350kCf> LIZ;

                {
                    this.LIZ = new WeakReference<>(interfaceC1310350kCf);
                }

                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onAccessibilityStateChanged: ");
                    sbLIZ.append(z);
                    LynxLog.i("LynxAccessibilityStateHelper", C2188811AlT.LIZIZ(sbLIZ));
                    WeakReference<InterfaceC1310350kCf> weakReference = this.LIZ;
                    if (weakReference != null && weakReference.get() != null) {
                        this.LIZ.get().LIZIZ(z);
                    }
                }
            };
            this.LIZIZ = r0;
            accessibilityManager.addAccessibilityStateChangeListener(r0);
            ?? r02 = new AccessibilityManager.TouchExplorationStateChangeListener(interfaceC1310350kCf) { // from class: X.0kCc
                public final WeakReference<InterfaceC1310350kCf> LIZ;

                {
                    this.LIZ = new WeakReference<>(interfaceC1310350kCf);
                }

                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onTouchExplorationStateChanged: ");
                    sbLIZ.append(z);
                    LynxLog.i("LynxAccessibilityStateHelper", C2188811AlT.LIZIZ(sbLIZ));
                    WeakReference<InterfaceC1310350kCf> weakReference = this.LIZ;
                    if (weakReference != null && weakReference.get() != null) {
                        this.LIZ.get().LIZ(z);
                    }
                }
            };
            this.LIZJ = r02;
            accessibilityManager.addTouchExplorationStateChangeListener(r02);
        }
    }
}
