package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0L0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536010L0l implements InterfaceC522520KeQ {
    public final C19EG LL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public C536010L0l(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        C198H c198hLC;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL);
        if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null && (c198hLC instanceof SelectMaterialScene)) {
            C01TT.LIZLLL(new AwS252S0300000_8(c198hLC, intent, this, 1));
        }
    }
}
