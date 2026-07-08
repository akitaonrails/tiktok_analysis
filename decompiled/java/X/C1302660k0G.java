package X;

import android.os.OutcomeReceiver;
import android.telecom.CallException;

/* JADX INFO: renamed from: X.0k0G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302660k0G implements OutcomeReceiver<Void, CallException> {
    public final C05XL<AbstractC1302360jzm> LIZ;

    public C1302660k0G(C099F c099f) {
        this.LIZ = c099f;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        C05XL<AbstractC1302360jzm> c05xl = this.LIZ;
        C329820CwO c329820CwO = C329830CwP.Companion;
        int code = ((CallException) th).getCode();
        c329820CwO.getClass();
        int i = 2;
        if (code != 2) {
            i = 3;
            if (code != 3) {
                i = 4;
                if (code != 4) {
                    i = 5;
                    if (code != 5) {
                        i = 6;
                        if (code != 6) {
                            i = 1;
                        }
                    }
                }
            }
        }
        c05xl.LJIIZILJ(new C1302350jzl(i));
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Void r3) {
        this.LIZ.LJIIZILJ(new C1302340jzk());
    }
}
