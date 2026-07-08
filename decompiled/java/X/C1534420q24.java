package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0q24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1534420q24 extends AbstractC1534220q1k<InputStream> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public final void LIZJ() throws IOException {
        ((InputStream) this.LIZLLL).close();
    }

    public C1534420q24(InputStream inputStream) {
        super(inputStream, InputStream.class, null, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC1534220q1k<java.io.InputStream> LIZ(X.C1533790q13 r6) {
        /*
            r5 = this;
            Type r1 = r5.LIZLLL
            boolean r0 = r1 instanceof X.C1534040q1S
            r4 = 0
            if (r0 == 0) goto L22
            r0 = r1
            X.0q1S r0 = (X.C1534040q1S) r0
            if (r0 == 0) goto L22
            X.0q1P r3 = r0.LL
            if (r3 == 0) goto L22
            r2 = r4
        L11:
            r0 = 0
            java.io.InputStream r1 = r3.LJJJJJL(r6, r0)
            if (r1 == 0) goto L49
            boolean r0 = r1 instanceof X.C1534040q1S
            if (r0 == 0) goto L38
            X.0q24 r0 = new X.0q24
            r0.<init>(r1)
            return r0
        L22:
            boolean r0 = r1 instanceof X.C1534050q1T
            if (r0 == 0) goto L37
            X.0q1T r1 = (X.C1534050q1T) r1
            if (r1 == 0) goto L37
            r1.LIZIZ()
            X.0q1O r2 = r1.LLILZLL
            if (r2 == 0) goto L37
            X.0q1P r3 = r2.LIZLLL()
            if (r3 != 0) goto L11
        L37:
            return r4
        L38:
            X.0q24 r4 = new X.0q24
            X.0q1T r0 = new X.0q1T
            if (r2 != 0) goto L43
            X.0q1O r2 = new X.0q1O
            r2.<init>(r3)
        L43:
            r0.<init>(r6, r1, r2)
            r4.<init>(r0)
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534420q24.LIZ(X.0q13):X.0q1k");
    }
}
