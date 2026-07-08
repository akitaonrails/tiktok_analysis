package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874100YQu {
    public static final C874100YQu LIZ = new C874100YQu();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final Map<Long, AnonymousClass0957<Boolean>> LIZJ = new LinkedHashMap();
    public static final InterfaceC866310Xyf LIZLLL;

    static {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        LIZLLL = (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null || (c0yh4LJIIL = c0yhxLIZ.LJIIL()) == null) ? null : c0yh4LJIIL.LIZIZ();
    }

    public static void LIZJ(long j) {
        Map<Long, AnonymousClass0957<Boolean>> map = LIZJ;
        C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(Long.valueOf(j));
        if (c09ae != null && !c09ae.isCompleted()) {
            return;
        }
        map.put(Long.valueOf(j), C23250099c.LIZIZ(LIZIZ, null, null, new C05DZ(j, null), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874100YQu.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C874140YQy
            if (r0 == 0) goto L58
            r4 = r8
            X.0YQy r4 = (X.C874140YQy) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L5e
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.util.Map<java.lang.Long, X.0957<java.lang.Boolean>> r1 = X.C874100YQu.LIZJ
            java.lang.Long r0 = X.C2286608xc.LJFF(r6)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L41
            LIZJ(r6)
        L41:
            java.lang.Long r0 = X.C2286608xc.LJFF(r6)
            java.lang.Object r0 = r1.get(r0)
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L56
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LJLIIIL(r4)
            if (r1 != r3) goto L22
            return r3
        L56:
            r0 = 0
            goto L28
        L58:
            X.0YQy r4 = new X.0YQy
            r4.<init>(r5, r8)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874100YQu.LIZ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            r7 = r12
            boolean r0 = r14 instanceof X.C874130YQx
            if (r0 == 0) goto L77
            r3 = r14
            X.0YQx r3 = (X.C874130YQx) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r3.LLILZ = r2
        L13:
            java.lang.Object r5 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L3e
            if (r0 != r1) goto L99
            X.C155000ia.LIZIZ(r5)
        L26:
            X.0Y8T r5 = (X.C0Y8T) r5
            if (r5 != 0) goto L7d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L30:
            X.C155000ia.LIZIZ(r5)
            r3.LL = r7
            r3.LLILZ = r2
            java.lang.Object r0 = r11.LIZIZ(r3)
            if (r0 != r4) goto L43
            return r4
        L3e:
            long r7 = r3.LL
            X.C155000ia.LIZIZ(r5)
        L43:
            r3.LLILZ = r1
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r1.<init>(r2, r0)
            r1.LJIJJ()
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r5 = X.C0YSQ.LIZIZ(r0)
            java.lang.String r6 = java.lang.String.valueOf(r7)
            int r9 = X.AbstractC1711506n3.LIZIZ
            X.06wN r10 = new X.06wN
            r0 = 10
            r10.<init>(r1, r0)
            r5.LJJI(r6, r7, r9, r10)
            java.lang.Object r5 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r5 != r0) goto L74
            X.C099Q.LIZJ(r3)
        L74:
            if (r5 != r4) goto L26
            return r4
        L77:
            X.0YQx r3 = new X.0YQx
            r3.<init>(r11, r14)
            goto L13
        L7d:
            boolean r3 = r5.isMember()
            if (r3 != 0) goto L94
            java.lang.String r2 = r5.getConversationId()
            int r0 = r2.length()
            if (r0 == 0) goto L94
            java.lang.String r1 = "public_group_preview_conversation"
            java.lang.String r0 = "1"
            X.C0YNP.LJIIIIZZ(r2, r1, r0)
        L94:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874100YQu.LIZLLL(long, X.05Vn):java.lang.Object");
    }
}
