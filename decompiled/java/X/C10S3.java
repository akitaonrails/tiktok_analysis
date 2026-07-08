package X;

import defpackage.f9;

/* JADX INFO: renamed from: X.10S3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10S3 {
    public final C10QU LIZ;
    public final C10VJ LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x017a, code lost:
    
        r5 = new kotlin.Pair("", r4.LIZLLL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10S3.LIZ(java.lang.String):java.lang.String");
    }

    public C10S3(C10QU c10qu, boolean z) {
        C10UO c10uoLIZ;
        C10VJ c10vj;
        this.LIZ = c10qu;
        if (z) {
            c10uoLIZ = C10UL.LIZIZ(c10qu.getDefaultJson(), c10qu);
        } else {
            int id = c10qu.getId();
            f9.LIZ.getClass();
            c10uoLIZ = C10UL.LIZ(f9.LIZIZ(id), c10qu);
            if (C10QW.LIZ[c10qu.getType().ordinal()] != 1 || !(c10uoLIZ instanceof C10VJ) || (c10vj = (C10VJ) c10uoLIZ) == null || !(!c10vj.LIZIZ.isEmpty())) {
                c10uoLIZ = C10UL.LIZIZ(c10qu.getDefaultJson(), c10qu);
            }
        }
        this.LIZIZ = c10uoLIZ instanceof C10VJ ? (C10VJ) c10uoLIZ : null;
    }
}
