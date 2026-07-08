package X;

import Y.ARunnableS125S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.0sLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623200sLG implements InterfaceC1623210sLH {
    public final InterfaceC1623210sLH LIZ;
    public final InterfaceC1648570t0B LIZIZ;
    public final SafeHandler LIZJ;
    public final ARunnableS125S0100000_25 LIZLLL;

    @Override // X.InterfaceC1623210sLH
    public final void onResult(String[] strArr) {
        this.LIZJ.removeCallbacks(this.LIZLLL);
        this.LIZ.onResult(strArr);
    }

    public C1623200sLG(C1622950sKr c1622950sKr, InterfaceC1648570t0B interfaceC1648570t0B, SafeHandler safeHandler) {
        this.LIZ = c1622950sKr;
        this.LIZIZ = interfaceC1648570t0B;
        this.LIZJ = safeHandler;
        ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 6);
        this.LIZLLL = aRunnableS125S0100000_25;
        safeHandler.postDelayed(aRunnableS125S0100000_25, 1000L);
    }
}
