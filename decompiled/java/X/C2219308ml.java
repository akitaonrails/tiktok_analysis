package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.08ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2219308ml {
    public static final C2219308ml LIZ = new C2219308ml();

    public static boolean LIZ(InputStream inputStream) {
        byte[] bArr = new byte[64];
        int i = inputStream.read(bArr);
        if (i < 16 || bArr[0] != 82 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 70 || bArr[8] != 87 || bArr[9] != 69 || bArr[10] != 66 || bArr[11] != 80) {
            return false;
        }
        int i2 = i - 3;
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i3] == 65 && bArr[i3 + 1] == 78 && bArr[i3 + 2] == 73 && bArr[i3 + 3] == 77) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.io.InputStream> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C2219208mk
            if (r0 == 0) goto L8f
            r5 = r9
            X.08mk r5 = (X.C2219208mk) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L96
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.String r2 = (java.lang.String) r2
            X.0VSP r1 = new X.0VSP
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r2)
            r1.<init>(r0)
            return r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.lang.String r1 = r2.getScheme()
            if (r1 == 0) goto L9e
            int r0 = r1.hashCode()
            switch(r0) {
                case 3143036: goto L45;
                case 3213448: goto L5e;
                case 99617003: goto L67;
                case 951530617: goto L70;
                default: goto L43;
            }
        L43:
            r1 = 0
            return r1
        L45:
            java.lang.String r0 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
            java.lang.String r2 = r2.getPath()
            if (r2 == 0) goto L43
            X.0VSP r1 = new X.0VSP
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r2)
            r1.<init>(r0)
            return r1
        L5e:
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L81
            goto L43
        L67:
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L81
            goto L43
        L70:
            java.lang.String r0 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.io.InputStream r1 = X.C09NT.LJ(r0, r2)
            return r1
        L81:
            X.0HBV r0 = X.C0HBV.LIZ
            r5.LLILLL = r3
            r0.getClass()
            java.lang.Object r2 = X.C0HBV.LIZIZ(r8, r5)
            if (r2 != r4) goto L22
            return r4
        L8f:
            X.08mk r5 = new X.08mk
            r5.<init>(r6, r9)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            X.0VSP r1 = new X.0VSP
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r8)
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2219308ml.LIZIZ(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }
}
