package X;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.0WkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832070WkX implements InterfaceC832270Wkr {
    public final int LL;
    public final AbstractC831960WkM LLILLJJLI;
    public final InterfaceC832270Wkr LLILLL;
    public final /* synthetic */ C831950WkL LLILZ;

    public C832070WkX(C831950WkL c831950WkL, int i, C831920WkI c831920WkI, InterfaceC832270Wkr interfaceC832270Wkr) {
        this.LLILZ = c831950WkL;
        this.LL = i;
        this.LLILLJJLI = c831920WkI;
        this.LLILLL = interfaceC832270Wkr;
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
        String.valueOf(connectionResult);
        this.LLILZ.LJIIL(connectionResult, this.LL);
    }
}
