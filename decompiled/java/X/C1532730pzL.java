package X;

import android.net.Uri;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532730pzL {
    public static C1532720pzK LIZ(String str, Uri uri, C1532720pzK c1532720pzK) {
        String strLJJLL = a0.LJJLL('?', str, str);
        return new C1532720pzK(str, a0.LJJJLL("/", a0.LJJZ(strLJJLL, "#", strLJJLL)), uri, c1532720pzK.LIZJ, c1532720pzK.LIZLLL, c1532720pzK.LJFF, c1532720pzK.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1532720pzK LIZIZ(java.lang.String r10, java.util.Set r11, java.util.Map r12, X.EnumC838370Wuh r13) {
        /*
            r7 = 0
            if (r12 == 0) goto L76
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L76
            boolean r0 = kotlin.text.a0.LJJJIL(r10)
            r0 = r0 ^ 1
            if (r0 == 0) goto L40
            if (r10 == 0) goto L40
            android.net.Uri r6 = com.bytedance.mt.protector.impl.UriProtector.parse(r10)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r6.isHierarchical()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L20
            r6 = r7
        L20:
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L24
            goto L30
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L30:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 == 0) goto L37
            r6 = r7
        L37:
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 == 0) goto L40
            android.net.Uri$Builder r7 = r6.buildUpon()
            goto L42
        L40:
            android.net.Uri r6 = X.C1532720pzK.LJIIIIZZ
        L42:
            if (r7 == 0) goto L72
            java.util.LinkedHashMap r3 = X.C1945807jk.LIZ(r6)
            r3.putAll(r12)
            r7.clearQuery()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r7.appendQueryParameter(r1, r0)
            goto L56
        L72:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = X.C1532720pzK.LJII
            r4 = r10
            goto L82
        L76:
            r4 = r10
            r6 = r7
            goto L82
        L79:
            android.net.Uri r6 = r7.build()
            java.lang.String r4 = r6.toString()
            r7 = r3
        L82:
            X.0pzK r3 = new X.0pzK
            r0 = 63
            java.lang.String r1 = kotlin.text.a0.LJJLL(r0, r10, r10)
            java.lang.String r0 = "#"
            java.lang.String r1 = kotlin.text.a0.LJJZ(r1, r0, r1)
            java.lang.String r0 = "/"
            java.lang.String r5 = kotlin.text.a0.LJJJLL(r0, r1)
            r10 = 0
            r9 = r13
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532730pzL.LIZIZ(java.lang.String, java.util.Set, java.util.Map, X.0Wuh):X.0pzK");
    }
}
