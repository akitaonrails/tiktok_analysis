package X;

import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986450bmF {
    public static final C986450bmF LIZ = new C986450bmF();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bmG] */
    public static final C986460bmG LIZ(long j, AwS559S0100000_15 awS559S0100000_15) {
        final Handler handlerLIZ = C0IK5.LIZ();
        final ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6((Object) awS559S0100000_15, 253);
        C786410Ut5.LJLIIL(j, handlerLIZ, aRunnableS106S0100000_6);
        return new InterfaceC986480bmI() { // from class: X.0bmG
            @Override // X.InterfaceC986480bmI
            public final void cancel() {
                handlerLIZ.removeCallbacks(aRunnableS106S0100000_6);
            }
        };
    }
}
