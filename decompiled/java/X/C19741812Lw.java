package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.12Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19741812Lw {
    public static boolean LIZ(InterfaceC19741212Lq interfaceC19741212Lq, Activity activity) {
        if (activity.checkSelfPermission(interfaceC19741212Lq.LIZIZ()) == -1 && !C786410Ut5.r4(activity, interfaceC19741212Lq.LIZIZ())) {
            return true;
        }
        return false;
    }
}
