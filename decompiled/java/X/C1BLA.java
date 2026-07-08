package X;

import Y.ACallableS257S0200000_34;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1BLA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLA implements InterfaceC2192641Are {
    public final /* synthetic */ C1BLG LIZ;

    public C1BLA(C1BLG c1blg) {
        this.LIZ = c1blg;
    }

    @Override // X.InterfaceC2192641Are
    public final void LIZ(C1BLM c1blm) {
        C1BLC c1blc = this.LIZ.LJFF;
        if (c1blc != null && TextUtils.equals(c1blc.LIZIZ, c1blm.LIZ)) {
            if (c1blm.LIZJ == 5 && !c1blc.LIZLLL()) {
                c1blm.LIZJ = 6;
                c1blm.LJI = 2;
            }
            C15O7.LIZJ(new ACallableS257S0200000_34(this.LIZ, c1blm, 3)).LIZLLL(new C20749016Hg(c1blm, 6));
        }
    }
}
