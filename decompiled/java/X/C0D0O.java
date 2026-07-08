package X;

import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D0O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0O {
    public static final C0D0O LIZ = new C0D0O();

    public static void LIZ(C0D0E c0d0e, C0D0R c0d0r) {
        int iIntValue;
        String str;
        Integer numLJIIJJI;
        String str2 = c0d0r.LIZLLL.get("protocol_type");
        if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            str = "";
        } else {
            str = c0d0r.LJ;
            if (str == null) {
                str = c0d0r.LIZIZ;
            }
        }
        String str3 = c0d0r.LIZ;
        String str4 = null;
        if (!(!a0.LJJJIL(str3))) {
            str3 = null;
        }
        String str5 = c0d0r.LIZJ;
        if (true ^ a0.LJJJIL(str5)) {
            str4 = str5;
        }
        Map<String, String> map = c0d0r.LIZLLL;
        c0d0e.getClass();
        C15433062l.LJ("/api/ad/v1/ac/related_product", C0D0E.LIZ(str, str3, str4, map).toQueryMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0D0E r12, X.C0D0R r13, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C0D0P
            if (r0 == 0) goto L65
            r10 = r14
            X.0D0P r10 = (X.C0D0P) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto Lbc
            if (r0 != r4) goto L6b
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L2b:
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = r13.LIZIZ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            r5 = r12
            if (r0 != 0) goto L79
            java.lang.String r0 = r13.LJ
            if (r0 == 0) goto L44
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L79
        L44:
            java.lang.String r0 = r13.LIZ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L79
            java.lang.String r0 = r13.LIZJ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L73
            java.lang.String r1 = r13.LIZJ
            java.util.Map<java.lang.String, java.lang.String> r0 = r13.LIZLLL
            r10.LLILLL = r4
            java.lang.Object r0 = r5.LJII(r1, r0, r10)
            if (r0 != r2) goto L2b
            return r2
        L65:
            X.0D0P r10 = new X.0D0P
            r10.<init>(r11, r14)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L73:
            X.13BV r0 = X.C13BV.INSTANCE
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L79:
            java.util.Map<java.lang.String, java.lang.String> r1 = r13.LIZLLL
            java.lang.String r0 = "protocol_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb5
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto Lb5
            int r0 = r0.intValue()
            if (r0 != r3) goto Lb5
            java.lang.String r6 = ""
        L93:
            java.lang.String r7 = r13.LIZ
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            r0 = r0 ^ 1
            r8 = 0
            if (r0 != 0) goto L9f
            r7 = r8
        L9f:
            java.lang.String r1 = r13.LIZJ
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto Laa
            r8 = r1
        Laa:
            java.util.Map<java.lang.String, java.lang.String> r9 = r13.LIZLLL
            r10.LLILLL = r3
            java.lang.Object r0 = r5.LJI(r6, r7, r8, r9, r10)
            if (r0 != r2) goto Lc5
            return r2
        Lb5:
            java.lang.String r6 = r13.LJ
            if (r6 != 0) goto L93
            java.lang.String r6 = r13.LIZIZ
            goto L93
        Lbc:
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0O.LIZIZ(X.0D0E, X.0D0R, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C0D0E r10, X.C0D0R r11, kotlin.jvm.functions.Function2<? super java.util.List<? extends X.AbstractC331870Czh>, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r12, X.InterfaceC1364105Vn<? super X.C0D0T> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0O.LIZJ(X.0D0E, X.0D0R, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
