package X;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0hhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214130hhT {
    public ViewOnClickListenerC1238510iKn LIZ;

    public final void LIZ() {
        ViewOnClickListenerC1238510iKn viewOnClickListenerC1238510iKn = this.LIZ;
        if (viewOnClickListenerC1238510iKn != null) {
            C786410Ut5.B1(viewOnClickListenerC1238510iKn, 8);
            ViewParent parent = viewOnClickListenerC1238510iKn.getParent();
            if (parent != null) {
                C786410Ut5.LJJJLZIJ(viewOnClickListenerC1238510iKn, (ViewGroup) parent);
            }
        }
        this.LIZ = null;
    }
}
