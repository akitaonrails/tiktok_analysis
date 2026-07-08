package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ChP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237251ChP {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.InterfaceC2237281ChS r3, X.InterfaceC625970Ogt r4, java.lang.String r5, java.lang.String r6, kotlin.jvm.functions.Function0 r7) {
        /*
            java.lang.String r1 = r3.LIZ(r4, r5, r6)
            java.lang.Object r2 = r7.invoke()
            if (r2 == 0) goto L48
            java.lang.String r0 = "String"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L1d
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
        L19:
            r3.LJII(r1, r0)
            return r2
        L1d:
            java.lang.String r0 = "StringSet"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L2e
            java.util.Set r0 = X.C19719512Dh.LIZLLL(r2)
            int r0 = r0.size()
            goto L19
        L2e:
            java.lang.String r0 = "Array"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L3b
            r0 = r2
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            goto L19
        L3b:
            java.lang.String r0 = "ByteArray"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L48
            r0 = r2
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            goto L19
        L48:
            r0 = -1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2237251ChP.LIZ(X.1ChS, X.0Ogt, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static void LIZIZ(InterfaceC2237281ChS interfaceC2237281ChS, InterfaceC625970Ogt interfaceC625970Ogt, String str, String str2, Object obj, int i, Function0 function0) {
        String strLJ = interfaceC2237281ChS.LJ(interfaceC625970Ogt, str, str2);
        function0.invoke();
        interfaceC2237281ChS.LIZIZ(strLJ, i);
    }
}
