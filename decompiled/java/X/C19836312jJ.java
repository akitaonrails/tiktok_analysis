package X;

import X.InterfaceC19836812jO;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: X.12jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19836312jJ<T extends Context & InterfaceC19836812jO> {
    public final T LIZ;

    public final void LIZ() {
        C19804712eD.LIZIZ(this.LIZ, null, null).LJIILJJIL().LJIILIIL.LIZJ("Local AppMeasurementService is starting up");
    }

    public final C19806212eS LIZJ() {
        return C19804712eD.LIZIZ(this.LIZ, null, null).LJIILJJIL();
    }

    public C19836312jJ(T t) {
        C0W3J.LJIIIIZZ(t);
        this.LIZ = t;
    }

    public final void LIZIZ(Intent intent) {
        if (intent == null) {
            LIZJ().LJFF.LIZJ("onRebind called with null intent");
        } else {
            LIZJ().LJIILIIL.LIZ(intent.getAction(), "onRebind called. action");
        }
    }

    public final void LIZLLL(Intent intent) {
        if (intent == null) {
            LIZJ().LJFF.LIZJ("onUnbind called with null intent");
        } else {
            LIZJ().LJIILIIL.LIZ(intent.getAction(), "onUnbind called for intent. action");
        }
    }
}
