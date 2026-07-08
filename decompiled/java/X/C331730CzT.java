package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0CzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331730CzT {
    public static final C331920Czm LJII = new C331920Czm();
    public static volatile C331730CzT LJIIIIZZ;
    public final InterfaceC331650CzL LIZ;
    public final InterfaceC331650CzL LIZIZ;
    public final InterfaceC331650CzL LIZJ;
    public final InterfaceC331560CzC LIZLLL;
    public final C0D0E LJ;
    public final InterfaceC331700CzQ LJFF;
    public final ConcurrentHashMap<String, InterfaceC383701eN> LJI = new ConcurrentHashMap<>();

    public final InterfaceC331650CzL LJIIIZ(int i) {
        if (i == 1) {
            return this.LIZIZ;
        }
        if (C0D1H.LIZ(Integer.valueOf(i))) {
            return this.LIZJ;
        }
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r6, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C331750CzV
            if (r0 == 0) goto L37
            r4 = r7
            X.0CzV r4 = (X.C331750CzV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0D0E r0 = r5.LJ
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LIZLLL(r6, r4)
            if (r0 != r2) goto L28
            return r2
        L37:
            X.0CzV r4 = new X.0CzV
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LIZIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C331680CzO
            if (r0 == 0) goto L5b
            r10 = r14
            X.0CzO r10 = (X.C331680CzO) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L61
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            r0 = 2
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "channel_name"
            r1.<init>(r0, r12)
            r0 = 0
            r4[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "cursor"
            r1.<init>(r0, r13)
            r4[r2] = r1
            java.util.Map r6 = X.C2097608Jq.LJIIIIZZ(r4)
            X.062l r4 = X.C15433062l.LIZ
            java.lang.String r5 = "/api/ad/v1/landingpage/comments"
            r7 = 10000(0x2710, double:4.9407E-320)
            X.0CzB r9 = new X.0CzB
            r0 = 0
            r9.<init>(r11, r12, r13, r0)
            r10.LLILLL = r2
            java.lang.Object r0 = r4.LIZLLL(r5, r6, r7, r9, r10)
            if (r0 != r3) goto L28
            return r3
        L5b:
            X.0CzO r10 = new X.0CzO
            r10.<init>(r11, r14)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LJII(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Map LIZ(int i, String str, String str2, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_UID, str), new Pair("shop_domain", str2), new Pair("protocol_type", String.valueOf(i)));
        for (Map.Entry entry : map.entrySet()) {
            String strLIZIZ = (String) entry.getKey();
            Object value = entry.getValue();
            if (!u.LJJIIJZLJL(strLIZIZ, "option.", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("option.");
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            mapLJIIJ.put(strLIZIZ, value);
        }
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C331770CzX
            if (r0 == 0) goto L3d
            r4 = r11
            X.0CzX r4 = (X.C331770CzX) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0CzM r5 = new X.0CzM
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0CzX r4 = new X.0CzX
            r4.<init>(r6, r11)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LIZJ(int, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r13, java.lang.String r14, java.lang.String r15, java.util.Map r16, X.InterfaceC1364105Vn r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C331720CzS
            r6 = r12
            if (r0 == 0) goto L45
            r4 = r3
            X.0CzS r4 = (X.C331720CzS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r3)
        L25:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0CzJ r5 = new X.0CzJ
            r11 = 0
            r10 = r16
            r8 = r15
            r9 = r14
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L25
            return r2
        L45:
            X.0CzS r4 = new X.0CzS
            r4.<init>(r6, r3)
            goto L15
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LIZLLL(int, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C331760CzW
            if (r0 == 0) goto L3b
            r8 = r14
            X.0CzW r8 = (X.C331760CzW) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L41
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0D0E r3 = r9.LJ
            r8.LLILLL = r0
            r7 = r13
            r6 = r12
            r5 = r11
            r4 = r10
            java.lang.Object r0 = r3.LJI(r4, r5, r6, r7, r8)
            if (r0 != r2) goto L28
            return r2
        L3b:
            X.0CzW r8 = new X.0CzW
            r8.<init>(r9, r14)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LJ(java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData r15, int r16, X.InterfaceC1364105Vn<? super X.C189200o6<X.C0D3K>> r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C331710CzR
            r9 = r12
            if (r0 == 0) goto L45
            r4 = r3
            X.0CzR r4 = (X.C331710CzR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r3)
        L25:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0CzP r5 = new X.0CzP
            r11 = 0
            r7 = r16
            r10 = r15
            r8 = r14
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L25
            return r2
        L45:
            X.0CzR r4 = new X.0CzR
            r4.<init>(r9, r3)
            goto L15
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LJFF(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC331650CzL r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>>, ? extends java.lang.Object> r15, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C331670CzN
            if (r0 == 0) goto L58
            r10 = r3
            X.0CzN r10 = (X.C331670CzN) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r10.LLILLL = r2
        L14:
            java.lang.Object r4 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L66
            if (r0 != r2) goto L5e
            X.C155000ia.LIZIZ(r4)
        L27:
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
            return r0
        L2e:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = r12.LJ()
            if (r0 == 0) goto L4f
            X.0CzF r9 = new X.0CzF
            r0 = 0
            r9.<init>(r15, r0)
            r10.LLILLL = r1
            X.062l r4 = X.C15433062l.LIZ
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r14
            r5 = r13
            java.lang.Object r0 = r4.LIZLLL(r5, r6, r7, r9, r10)
            if (r0 != r3) goto L6f
            return r3
        L4f:
            r10.LLILLL = r2
            java.lang.Object r4 = r15.invoke(r10)
            if (r4 != r3) goto L27
            return r3
        L58:
            X.0CzN r10 = new X.0CzN
            r10.<init>(r11, r3)
            goto L14
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L66:
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LJIIIIZZ(X.0CzL, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public C331730CzT(C0D0J c0d0j, C0D16 c0d16, C0D1E c0d1e, C331930Czn c331930Czn, C0D0E c0d0e, InterfaceC331700CzQ interfaceC331700CzQ) {
        this.LIZ = c0d0j;
        this.LIZIZ = c0d16;
        this.LIZJ = c0d1e;
        this.LIZLLL = c331930Czn;
        this.LJ = c0d0e;
        this.LJFF = interfaceC331700CzQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC331650CzL r23, java.lang.String r24, java.lang.String r25, java.util.Map<java.lang.String, java.lang.String> r26, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>>, ? extends java.lang.Object> r27, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>> r28) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331730CzT.LJI(X.0CzL, java.lang.String, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
