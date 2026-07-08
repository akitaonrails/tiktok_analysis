package X;

import fyo.e;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1471290oOF implements InterfaceC1468830oKH {
    public final WeakReference<C1471550oOf> LIZ;

    @Override // X.InterfaceC1468830oKH
    public final void LIZ(e eVar) {
    }

    @Override // X.InterfaceC1468830oKH
    public final void onLog(String str) {
    }

    public C1471290oOF(C1471550oOf c1471550oOf) {
        this.LIZ = new WeakReference<>(c1471550oOf);
    }

    @Override // X.InterfaceC1468830oKH
    public final void LIZIZ(int i, String str) {
        C1471550oOf c1471550oOf = this.LIZ.get();
        if (c1471550oOf == null) {
            return;
        }
        if (i != 0 && i != 10) {
            new e("kTTVideoErrorDomainFetchingInfo", -7996);
            c1471550oOf.getClass();
        }
        c1471550oOf.getClass();
    }

    @Override // X.InterfaceC1468830oKH
    public final void LIZJ(C1470240oMY c1470240oMY, e eVar) {
        C1471550oOf c1471550oOf = this.LIZ.get();
        if (c1471550oOf == null) {
            return;
        }
        c1471550oOf.LIZIZ = c1470240oMY;
        c1471550oOf.getClass();
        c1471550oOf.getClass();
    }
}
