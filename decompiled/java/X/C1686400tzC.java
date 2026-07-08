package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686400tzC extends AbstractC20055413dY implements InterfaceC20051913cz {
    public Function1<? super AbstractC1686410tzD, Unit> LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        this.LLJJ.invoke(C1686420tzE.LIZ);
        this.LLJJI = false;
    }

    public C1686400tzC(Function1<? super AbstractC1686410tzD, Unit> function1) {
        this.LLJJ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    @Override // X.InterfaceC20051913cz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIII(p2.j1 r11) {
        /*
            r10 = this;
            X.0ttv r5 = X.C1692940u9k.LIZJ(r11)
            boolean r0 = r10.LLJILLL
            if (r0 == 0) goto L65
            float r2 = r5.LIZJ
            float r1 = r5.LIZ
            float r0 = r2 - r1
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L65
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L1b
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L65
        L1b:
            float r2 = r5.LIZLLL
            float r1 = r5.LIZIZ
            float r0 = r2 - r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L65
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L2d
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L65
        L2d:
            r3 = 1
        L2e:
            boolean r0 = r10.LLJJI
            if (r0 == r3) goto L5c
            long r6 = r11.LLILLL
            float r8 = r5.LIZJ
            float r0 = r5.LIZ
            float r8 = r8 - r0
            r0 = 32
            long r0 = r6 >> r0
            int r2 = (int) r0
            float r0 = (float) r2
            float r8 = r8 / r0
            float r9 = r5.LIZLLL
            float r0 = r5.LIZIZ
            float r9 = r9 - r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r2 = (int) r0
            float r0 = (float) r2
            float r9 = r9 / r0
            if (r3 == 0) goto L5d
            kotlin.jvm.functions.Function1<? super X.0tzD, kotlin.Unit> r0 = r10.LLJJ
            X.0tzB r4 = new X.0tzB
            r4.<init>(r5, r6, r8, r9)
            r0.invoke(r4)
        L5a:
            r10.LLJJI = r3
        L5c:
            return
        L5d:
            kotlin.jvm.functions.Function1<? super X.0tzD, kotlin.Unit> r1 = r10.LLJJ
            X.0tzE r0 = X.C1686420tzE.LIZ
            r1.invoke(r0)
            goto L5a
        L65:
            r3 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686400tzC.LLIIII(p2.j1):void");
    }
}
