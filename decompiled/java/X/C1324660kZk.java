package X;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* JADX INFO: renamed from: X.0kZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324660kZk implements InterfaceC1324680kZm {
    public final String LIZ;
    public final C1324630kZh LIZIZ;
    public final C1324670kZl LIZJ;
    public final C1329360khK LIZLLL;
    public final InterfaceC1324680kZm LJ;
    public final String LJFF;
    public final int LJI;
    public final Object LJII;

    @Override // X.InterfaceC1324680kZm
    public final int hashCode() {
        return C314750CVl.LIZ ? C908880Zl8.LIZ(Integer.valueOf(this.LJI), this.LIZIZ) : this.LJI;
    }

    @Override // X.InterfaceC1324680kZm
    public final String toString() {
        if (!C314750CVl.LIZ) {
            return C786410Ut5.k4(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, Integer.valueOf(this.LJI)});
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_uri_end");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resizeOption:");
        sbLIZ2.append(this.LIZIZ);
        return C786410Ut5.k4(null, "%s_%s_%s_%s_%s_%d_%s", new Object[]{C2188811AlT.LIZIZ(sbLIZ), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, Integer.valueOf(this.LJI), C2188811AlT.LIZIZ(sbLIZ2)});
    }

    @Override // X.InterfaceC1324680kZm
    public final String LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC1324680kZm LIZJ(X.InterfaceC1324680kZm r8) {
        /*
            r6 = 0
            boolean r0 = X.C314750CVl.LIZ     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L7a
            boolean r0 = r8 instanceof X.C1324660kZk     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L7a
            r0 = r8
            X.0kZk r0 = (X.C1324660kZk) r0     // Catch: java.lang.Throwable -> L61
            X.0kZh r4 = r0.LIZIZ     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L7a
            r5 = 0
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L61
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L61
            java.lang.String r0 = "resizeOption:"
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L61
            java.lang.String r1 = r2.substring(r5, r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L61
            goto L2c
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r8.LIZ()     // Catch: java.lang.Throwable -> L61
        L2c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = X.C314750CVl.LIZIZ     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L61
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L7a
            java.lang.String r0 = "x"
            java.lang.String[] r3 = r1.split(r0)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L7a
            int r1 = r3.length     // Catch: java.lang.Throwable -> L61
            r0 = 2
            if (r1 != r0) goto L7a
            r0 = r3[r5]     // Catch: java.lang.Throwable -> L61
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L61
            r0 = 1
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L61
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L61
            int r0 = r4.LIZ     // Catch: java.lang.Throwable -> L61
            if (r2 < r0) goto L7a
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L61
            if (r1 < r0) goto L7a
            X.0kZh r3 = new X.0kZh     // Catch: java.lang.Throwable -> L61
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L61
            goto L7b
        L61:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getOptReuseResizeOption: 111 Throwable = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "BitmapCacheUtil"
            X.C1328570kg3.LIZIZ(r0, r1)
        L7a:
            r3 = r6
        L7b:
            boolean r0 = r8 instanceof X.C1324660kZk
            if (r0 == 0) goto L95
            if (r3 == 0) goto L95
            X.0kZk r1 = new X.0kZk
            X.0kZk r8 = (X.C1324660kZk) r8
            java.lang.String r2 = r8.LIZ
            X.0kZl r4 = r8.LIZJ
            X.0khK r5 = r8.LIZLLL
            X.0kZm r6 = r8.LJ
            java.lang.String r7 = r8.LJFF
            java.lang.Object r8 = r8.LJII
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1324660kZk.LIZJ(X.0kZm):X.0kZm");
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean LIZIZ(Uri uri) {
        return this.LIZ.contains(uri.toString());
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1324660kZk)) {
            return false;
        }
        C1324660kZk c1324660kZk = (C1324660kZk) obj;
        if (this.LJI == c1324660kZk.LJI && this.LIZ.equals(c1324660kZk.LIZ) && C1320090kSN.LIZ(this.LIZIZ, c1324660kZk.LIZIZ)) {
            C1320090kSN.LIZ(this.LIZJ, c1324660kZk.LIZJ);
        }
        if (!C1320090kSN.LIZ(this.LIZLLL, c1324660kZk.LIZLLL) || !C1320090kSN.LIZ(this.LJ, c1324660kZk.LJ) || !C1320090kSN.LIZ(this.LJFF, c1324660kZk.LJFF)) {
            return false;
        }
        return true;
    }

    public C1324660kZk(String str, C1324630kZh c1324630kZh, C1324670kZl c1324670kZl, C1329360khK c1329360khK, InterfaceC1324680kZm interfaceC1324680kZm, String str2, Object obj) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        str.getClass();
        this.LIZ = str;
        this.LIZIZ = c1324630kZh;
        this.LIZJ = c1324670kZl;
        this.LIZLLL = c1329360khK;
        this.LJ = interfaceC1324680kZm;
        this.LJFF = str2;
        Integer numValueOf = Integer.valueOf(str.hashCode());
        if (c1324630kZh != null && !C314750CVl.LIZ) {
            iHashCode = c1324630kZh.hashCode();
        } else {
            iHashCode = 0;
        }
        Integer numValueOf2 = Integer.valueOf(iHashCode);
        if (c1324670kZl != null) {
            iHashCode2 = c1324670kZl.hashCode();
        } else {
            iHashCode2 = 0;
        }
        Integer numValueOf3 = Integer.valueOf(iHashCode2);
        if (numValueOf == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = numValueOf.hashCode();
        }
        if (numValueOf2 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = numValueOf2.hashCode();
        }
        if (numValueOf3 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = numValueOf3.hashCode();
        }
        if (c1329360khK == null) {
            iHashCode6 = 0;
        } else {
            iHashCode6 = c1329360khK.hashCode();
        }
        if (interfaceC1324680kZm == null) {
            iHashCode7 = 0;
        } else {
            iHashCode7 = interfaceC1324680kZm.hashCode();
        }
        this.LJI = ((((((((((iHashCode3 + 31) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.LJII = obj;
        RealtimeSinceBootClock.get().now();
    }
}
