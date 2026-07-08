package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.13Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20009713Qx implements C13SE {
    public static final /* synthetic */ int LJFF = 0;
    public final C20008813Qo LIZ;
    public final EnumC20009313Qt LIZIZ;
    public byte[] LIZJ;
    public int LIZLLL;
    public int LJ;

    public final boolean LIZ() throws Exception {
        byte[] bArr = this.LIZJ;
        if (bArr == null) {
            throw new Exception("buf is null!");
        }
        int iLIZIZ = this.LIZ.LIZIZ(bArr, bArr.length);
        if (iLIZIZ <= 0) {
            return false;
        }
        this.LIZLLL = 0;
        this.LJ = iLIZIZ;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r9 = this;
            byte[] r4 = r9.LIZJ
            r8 = 0
            if (r4 != 0) goto L6
            return r8
        L6:
            int r1 = r9.LIZLLL
            int r0 = r9.LJ
            if (r1 < r0) goto L13
            boolean r0 = r9.LIZ()
            if (r0 != 0) goto L13
            return r8
        L13:
            int r7 = r9.LIZLLL
            int r1 = r9.LJ
        L17:
            r6 = 1
            r5 = 10
            if (r7 >= r1) goto L4d
            r0 = r4[r7]
            if (r0 != r5) goto L4a
            int r3 = r9.LIZLLL
            if (r7 == r3) goto L48
            int r2 = r7 + (-1)
            r1 = r4[r2]
            r0 = 13
            if (r1 != r0) goto L48
        L2c:
            int r2 = r2 - r3
            X.13Qt r0 = r9.LIZIZ
            int[] r1 = X.C20009513Qv.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r6) goto L45
            java.nio.charset.Charset r0 = kotlin.text.Charsets.LIZIZ
        L3b:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4, r3, r2, r0)
            int r0 = r7 + 1
            r9.LIZLLL = r0
            return r1
        L45:
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            goto L3b
        L48:
            r2 = r7
            goto L2c
        L4a:
            int r7 = r7 + 1
            goto L17
        L4d:
            int r1 = r9.LJ
            int r0 = r9.LIZLLL
            int r1 = r1 - r0
            int r0 = r1 + 80
            X.13Qw r3 = new X.13Qw
            r3.<init>(r0)
        L59:
            int r1 = r9.LIZLLL
            int r0 = r9.LJ
            int r0 = r0 - r1
            r3.LIZ(r4, r1, r0)
            r0 = -1
            r9.LJ = r0
            boolean r0 = r9.LIZ()
            if (r0 != 0) goto L6b
            return r8
        L6b:
            int r2 = r9.LIZLLL
            int r1 = r9.LJ
        L6f:
            if (r2 >= r1) goto L59
            r0 = r4[r2]
            if (r0 != r5) goto L87
            int r1 = r9.LIZLLL
            if (r2 == r1) goto L7e
            int r0 = r2 - r1
            r3.LIZ(r4, r1, r0)
        L7e:
            int r0 = r2 + 1
            r9.LIZLLL = r0
            java.lang.String r0 = r3.toString()
            return r0
        L87:
            int r2 = r2 + 1
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20009713Qx.LIZIZ():java.lang.String");
    }

    @Override // X.C13SE
    public final void close() throws IOException {
        this.LIZ.close();
        this.LIZJ = null;
    }

    public C20009713Qx(C20008813Qo c20008813Qo, EnumC20009313Qt enumC20009313Qt) {
        this.LIZ = c20008813Qo;
        this.LIZIZ = enumC20009313Qt;
        if (enumC20009313Qt == EnumC20009313Qt.Ascii) {
            this.LIZJ = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding!");
    }
}
