package X;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: renamed from: X.0khS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329440khS {
    public final InterfaceC1329600khi LIZ;
    public final int LIZIZ;
    public C1323050kX9<Bitmap> LIZJ;
    public List<C1323050kX9<Bitmap>> LIZLLL;
    public String LJ;
    public final boolean LJFF;

    public final synchronized void LIZ() {
        C1323050kX9.LJII(this.LIZJ);
        this.LIZJ = null;
        C1323050kX9.LJI(this.LIZLLL);
        this.LIZLLL = null;
    }

    public C1329440khS(C1329460khU c1329460khU) {
        InterfaceC1329600khi interfaceC1329600khi = c1329460khU.LIZ;
        interfaceC1329600khi.getClass();
        this.LIZ = interfaceC1329600khi;
        this.LIZIZ = c1329460khU.LIZLLL;
        this.LIZJ = C1323050kX9.LJFF(c1329460khU.LIZIZ);
        this.LIZLLL = C1323050kX9.LIZIZ(c1329460khU.LIZJ);
        this.LJFF = c1329460khU.LJ;
    }

    public final synchronized C1323050kX9<Bitmap> LIZIZ(int i) {
        List<C1323050kX9<Bitmap>> list = this.LIZLLL;
        if (list != null) {
            return C1323050kX9.LJFF(list.get(i));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZJ(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<X.0kX9<android.graphics.Bitmap>> r0 = r1.LIZLLL     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1329440khS.LIZJ(int):boolean");
    }

    public C1329440khS(InterfaceC1329600khi interfaceC1329600khi) {
        interfaceC1329600khi.getClass();
        this.LIZ = interfaceC1329600khi;
        this.LIZIZ = 0;
    }
}
