package X;

import android.nfc.NfcAdapter;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722550uvV implements InterfaceC902903fv {
    public final LifecycleOwner LIZ;
    public final C19EG LIZIZ;
    public final InterfaceC1722540uvU LIZJ;
    public boolean LJ;
    public final boolean LIZLLL = false;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1454));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1455));

    @Override // X.InterfaceC902903fv
    public final void LIZ() {
        if (this.LJ) {
            this.LJ = false;
            this.LIZIZ.removeOnNewIntentListener((C092O) this.LJFF.getValue());
            this.LIZ.getLifecycle().removeObserver((LifecycleObserver) this.LJI.getValue());
        }
    }

    public final void LIZIZ() {
        if (this.LJ || NfcAdapter.getDefaultAdapter(this.LIZIZ) == null) {
            return;
        }
        this.LJ = true;
        this.LIZ.getLifecycle().addObserver((LifecycleObserver) this.LJI.getValue());
    }

    public C1722550uvV(C19EG c19eg, LifecycleOwner lifecycleOwner, C1722530uvT c1722530uvT) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c19eg;
        this.LIZJ = c1722530uvT;
    }
}
