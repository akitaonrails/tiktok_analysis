package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.0tJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660630tJd implements InterfaceC2219671Bu9 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C560530Lyd LIZIZ;
    public final /* synthetic */ C2254071DKj LIZJ;

    @Override // X.InterfaceC2219671Bu9
    public final void LIZJ() {
    }

    @Override // X.InterfaceC2219671Bu9
    public final void LIZ(String str) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraLogicComponent detectLuma onInfo: msg = ");
        sbLIZ.append(str);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1660630tJd(C2254071DKj c2254071DKj, boolean z, C560530Lyd c560530Lyd) {
        this.LIZJ = c2254071DKj;
        this.LIZ = z;
        this.LIZIZ = c560530Lyd;
    }

    @Override // X.InterfaceC2219671Bu9
    public final void onSuccess(int i, final float f, int i2) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraLogicComponent detectLuma onSuccess: result = ");
        sbLIZ.append(f);
        sbLIZ.append(" flag = ");
        sbLIZ.append(i);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        if (i != 27) {
            return;
        }
        SafeHandler safeHandler = this.LIZJ.LLLIZZ;
        final boolean z = this.LIZ;
        final C560530Lyd c560530Lyd = this.LIZIZ;
        safeHandler.post(new Runnable() { // from class: X.0tJc
            @Override // java.lang.Runnable
            public final void run() {
                C1660630tJd c1660630tJd = this.LL;
                float f2 = f;
                boolean z2 = z;
                C560530Lyd c560530Lyd2 = c560530Lyd;
                if (f2 == 0.0f) {
                    c1660630tJd.LIZJ.Na();
                } else {
                    c1660630tJd.getClass();
                }
                if (z2) {
                    c560530Lyd2.LJIIJ(new C1656320tCg());
                }
            }
        });
    }
}
