package X;

import Y.ARunnableS53S0300000_20;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0kgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328820kgS extends AbstractC1328990kgj<C1328680kgE> {
    public final int LIZ;
    public final ExecutorService LIZIZ = C786410Ut5.d4(3);

    public C1328820kgS(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1328710kgH
    public final void LIZ(C1328680kgE c1328680kgE, final C1328510kfx c1328510kfx) {
        final Future<?> futureSubmit = this.LIZIZ.submit(new ARunnableS53S0300000_20(c1328680kgE, c1328510kfx, this, 46));
        c1328680kgE.LIZIZ.LJ(new C1330860kjk() { // from class: X.0kh7
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                if (futureSubmit.cancel(false)) {
                    ((C1328510kfx) c1328510kfx).LIZ();
                }
            }
        });
    }

    @Override // X.InterfaceC1328710kgH
    public final C1328680kgE LIZJ(InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        return new C1328680kgE(interfaceC1328020kfA, interfaceC1327930kf1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection LJFF(android.net.Uri r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328820kgS.LJFF(android.net.Uri, int):java.net.HttpURLConnection");
    }
}
