package X;

/* JADX INFO: renamed from: X.0CFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310640CFq {
    public static final int LIZ() {
        int iLIZ = C0C1C.LIZ();
        if (iLIZ <= 0) {
            iLIZ = 30;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewImportFps ; previewCompile ; fps : ");
        sbLIZ.append(iLIZ);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return iLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(int r2) {
        /*
            int r1 = X.C0C1C.LIZ()
            r0 = 30
            if (r1 <= 0) goto L22
            if (r2 <= r1) goto L1f
            r2 = r1
        Lb:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "PreviewImportFps ; previewParams ; fps : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C564000MAc.LIZJ(r0)
            return r2
        L1f:
            if (r2 <= r0) goto L22
            goto Lb
        L22:
            r2 = 30
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310640CFq.LIZIZ(int):int");
    }
}
