package X;

import Y.ARunnableS130S0100000_30;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.13ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088913ix extends AbstractC20089313j1 {
    public final int LIZLLL;
    public final Handler LJ;
    public long LJFF;
    public final ARunnableS130S0100000_30 LJI;

    @Override // X.AbstractC20089313j1
    public final void LIZ() {
        super.LIZ();
        this.LJFF = 0L;
        this.LJ.removeCallbacks(this.LJI);
    }

    @Override // X.AbstractC20089313j1
    public final void LJFF() {
        super.LJFF();
        this.LJFF = 0L;
        this.LJ.removeCallbacks(this.LJI);
    }

    public C20088913ix(int i, BPEAHandler bPEAHandler, C1776880wL8 c1776880wL8) {
        super(c1776880wL8);
        this.LIZLLL = i;
        this.LJ = bPEAHandler;
        this.LJI = new ARunnableS130S0100000_30(this, 9);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // X.AbstractC20089313j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1692950u9l r11, boolean r12, X.InterfaceC20090313jB r13) {
        /*
            r10 = this;
            r10.LIZJ = r13
            long r1 = r10.LJFF
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r8 = 1
            if (r0 <= 0) goto L68
            r7 = 1
        Lc:
            long r3 = java.lang.System.currentTimeMillis()
            int r9 = r10.LIZLLL
            if (r9 <= 0) goto L65
            long r1 = r10.LJFF
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L65
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L5d
            r10.LJFF = r3
            long r1 = (long) r9
        L21:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkExposure hasCountDown: "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = " delayTime: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " itemId: "
            r3.append(r0)
            X.0wL8 r0 = r10.LIZ
            java.lang.String r0 = r0.LIZ
            r3.append(r0)
            X.C2188811AlT.LIZIZ(r3)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6a
            if (r7 != 0) goto L5c
            android.os.Handler r3 = r10.LJ
            Y.ARunnableS130S0100000_30 r0 = r10.LJI
            r3.removeCallbacks(r0)
            android.os.Handler r6 = r10.LJ
            Y.ARunnableS130S0100000_30 r5 = r10.LJI
            r0 = 10
            long r3 = (long) r0
            long r1 = r1 + r3
            X.C786410Ut5.LJLIIL(r1, r6, r5)
        L5c:
            return
        L5d:
            long r3 = r3 - r1
            long r1 = (long) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L65
            long r1 = r1 - r3
            goto L21
        L65:
            r1 = 0
            goto L21
        L68:
            r7 = 0
            goto Lc
        L6a:
            if (r12 != 0) goto L71
            r10.LJ(r8)
            r10.LJFF = r5
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20088913ix.LIZIZ(X.0u9l, boolean, X.13jB):void");
    }
}
