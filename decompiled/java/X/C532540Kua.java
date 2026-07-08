package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Kua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532540Kua<FLOW_CONTEXT> {
    public final String LIZ;
    public final List<C532440KuQ<FLOW_CONTEXT, ?, ?>> LIZIZ;
    public final Map<String, C532440KuQ<FLOW_CONTEXT, ?, ?>> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C532540Kua(String str, List<? extends C532440KuQ<FLOW_CONTEXT, ?, ?>> list) {
        this.LIZ = str;
        this.LIZIZ = list;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (Object obj : list) {
            linkedHashMap.put(((C532440KuQ) obj).LIZIZ(), obj);
        }
        this.LIZJ = linkedHashMap;
        if (this.LIZIZ.size() == linkedHashMap.size()) {
            return;
        }
        final List<C532440KuQ<FLOW_CONTEXT, ?, ?>> list2 = this.LIZIZ;
        Map mapLIZ = C08SO.LIZ(new C08SN<C532440KuQ<FLOW_CONTEXT, ?, ?>, String>() { // from class: X.0Kug
            @Override // X.C08SN
            public final Iterator<C532440KuQ<FLOW_CONTEXT, ?, ?>> LIZ() {
                return list2.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(C532440KuQ<FLOW_CONTEXT, ?, ?> c532440KuQ) {
                return c532440KuQ.LIZIZ();
            }
        });
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mapLIZ.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlowGraph[");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("] duplicate node names: ");
        sbLIZ.append(setKeySet);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:24:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0102 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(FLOW_CONTEXT r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532540Kua.LIZIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0049 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(FLOW_CONTEXT r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C532580Kue
            if (r0 == 0) goto Laa
            r7 = r11
            X.0Kue r7 = (X.C532580Kue) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r0 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZLL
            r8 = 1
            r5 = 2
            if (r1 == 0) goto L28
            if (r1 == r8) goto L4c
            if (r1 != r5) goto Lb1
            X.C155000ia.LIZIZ(r0)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r0)
            java.util.List<X.0KuQ<FLOW_CONTEXT, ?, ?>> r0 = r9.LIZIZ
            java.util.Iterator r4 = r0.iterator()
        L31:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r2 = r4.next()
            X.0KuQ r2 = (X.C532440KuQ) r2
            r7.LL = r10
            r7.LLILLJJLI = r4
            r7.LLILLL = r2
            r7.LLILZLL = r8
            java.lang.Object r0 = r2.LIZ(r10, r7)
            if (r0 != r6) goto L57
            return r6
        L4c:
            X.0KuQ r2 = r7.LLILLL
            java.lang.Object r4 = r7.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r10 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L57:
            java.util.Set r0 = (java.util.Set) r0
            java.util.Map<java.lang.String, X.0KuQ<FLOW_CONTEXT, ?, ?>> r1 = r9.LIZJ
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.util.Set r1 = r1.keySet()
            java.util.Set r3 = X.C15442062u.LJII(r0, r1)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L31
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FlowGraph["
            r1.append(r0)
            java.lang.String r0 = r9.LIZ
            r1.append(r0)
            java.lang.String r0 = "] node '"
            r1.append(r0)
            java.lang.String r0 = r2.LIZIZ()
            r1.append(r0)
            java.lang.String r0 = "' depends on unknown nodes: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            r0 = 0
            r7.LL = r0
            r7.LLILLJJLI = r0
            r7.LLILLL = r0
            r7.LLILZLL = r5
            java.lang.Object r0 = r9.LIZIZ(r10, r7)
            if (r0 != r6) goto L25
            return r6
        Laa:
            X.0Kue r7 = new X.0Kue
            r7.<init>(r9, r11)
            goto L12
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532540Kua.LJ(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009c -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Set<java.lang.String> r11, java.util.Map<java.lang.String, ? extends X.C05XL<X.InterfaceC532390KuL<java.lang.Object>>> r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C532590Kuf
            if (r0 == 0) goto L9f
            r8 = r13
            X.0Kuf r8 = (X.C532590Kuf) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r2 = r8.LLILLJJLI
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r7 = 1
            if (r0 == 0) goto L39
            if (r0 != r7) goto La6
            java.lang.Object r6 = r8.LL
            java.util.List r6 = (java.util.List) r6
            X.C155000ia.LIZIZ(r2)
        L26:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r1 = r2.getFirst()
            java.lang.Object r0 = r2.getSecond()
            boolean r0 = r0 instanceof X.C532410KuN
            if (r0 == 0) goto L62
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L39:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L47
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L47:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r11.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = X.C2097608Jq.LJFF(r0, r12)
            r6.add(r0)
            goto L50
        L62:
            r6.remove(r1)
        L65:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lae
            X.1DE8 r5 = new X.1DE8
            kotlin.coroutines.CoroutineContext r0 = r8.getContext()
            r5.<init>(r0)
            java.util.Iterator r4 = r6.iterator()
        L7a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r3 = r4.next()
            X.05XL r3 = (X.C05XL) r3
            X.1ArU r2 = r3.LLIIIJ()
            X.0D2b r1 = new X.0D2b
            r0 = 0
            r1.<init>(r3, r0)
            r5.LIZJ(r2, r1)
            goto L7a
        L94:
            r8.LL = r6
            r8.LLILZ = r7
            java.lang.Object r2 = r5.LJII(r8)
            if (r2 != r9) goto L26
            return r9
        L9f:
            X.0Kuf r8 = new X.0Kuf
            r8.<init>(r10, r13)
            goto L12
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532540Kua.LIZ(java.util.Set, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e A[LOOP:0: B:48:0x0158->B:50:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6 A[LOOP:3: B:64:0x01b0->B:66:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(FLOW_CONTEXT r20, X.InterfaceC532530KuZ r21, X.C532520KuY r22, X.InterfaceC1364105Vn<? super X.C532260Ku8> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532540Kua.LIZJ(java.lang.Object, X.0KuZ, X.0KuY, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:9:0x0025, B:35:0x00ba], limit reached: 152 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0249 A[Catch: all -> 0x026b, CancellationException -> 0x028f, TryCatch #2 {all -> 0x026b, blocks: (B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250), top: B:137:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[Catch: all -> 0x0273, CancellationException -> 0x028f, LOOP:3: B:41:0x00e1->B:43:0x00e7, LOOP_END, TryCatch #5 {CancellationException -> 0x028f, blocks: (B:16:0x003c, B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250, B:20:0x0059, B:87:0x0206, B:89:0x020e, B:91:0x021d, B:24:0x0075, B:80:0x01c8, B:81:0x01d7, B:83:0x01dd, B:84:0x01eb, B:28:0x009b, B:54:0x013f, B:48:0x0110, B:50:0x0116, B:58:0x014a, B:60:0x0152, B:71:0x0176, B:73:0x0185, B:74:0x018d, B:76:0x0193, B:77:0x01a9, B:63:0x015c, B:64:0x0160, B:66:0x0166, B:32:0x00b3, B:40:0x00d2, B:41:0x00e1, B:43:0x00e7, B:44:0x00f5, B:47:0x0109, B:36:0x00bd, B:37:0x00c7), top: B:142:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x0271, CancellationException -> 0x028f, TryCatch #5 {CancellationException -> 0x028f, blocks: (B:16:0x003c, B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250, B:20:0x0059, B:87:0x0206, B:89:0x020e, B:91:0x021d, B:24:0x0075, B:80:0x01c8, B:81:0x01d7, B:83:0x01dd, B:84:0x01eb, B:28:0x009b, B:54:0x013f, B:48:0x0110, B:50:0x0116, B:58:0x014a, B:60:0x0152, B:71:0x0176, B:73:0x0185, B:74:0x018d, B:76:0x0193, B:77:0x01a9, B:63:0x015c, B:64:0x0160, B:66:0x0166, B:32:0x00b3, B:40:0x00d2, B:41:0x00e1, B:43:0x00e7, B:44:0x00f5, B:47:0x0109, B:36:0x00bd, B:37:0x00c7), top: B:142:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a A[Catch: all -> 0x0271, CancellationException -> 0x028f, TRY_ENTER, TryCatch #5 {CancellationException -> 0x028f, blocks: (B:16:0x003c, B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250, B:20:0x0059, B:87:0x0206, B:89:0x020e, B:91:0x021d, B:24:0x0075, B:80:0x01c8, B:81:0x01d7, B:83:0x01dd, B:84:0x01eb, B:28:0x009b, B:54:0x013f, B:48:0x0110, B:50:0x0116, B:58:0x014a, B:60:0x0152, B:71:0x0176, B:73:0x0185, B:74:0x018d, B:76:0x0193, B:77:0x01a9, B:63:0x015c, B:64:0x0160, B:66:0x0166, B:32:0x00b3, B:40:0x00d2, B:41:0x00e1, B:43:0x00e7, B:44:0x00f5, B:47:0x0109, B:36:0x00bd, B:37:0x00c7), top: B:142:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd A[Catch: all -> 0x026f, CancellationException -> 0x028f, LOOP:0: B:81:0x01d7->B:83:0x01dd, LOOP_END, TryCatch #4 {all -> 0x026f, blocks: (B:80:0x01c8, B:81:0x01d7, B:83:0x01dd, B:84:0x01eb), top: B:140:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e A[Catch: all -> 0x026d, CancellationException -> 0x028f, TryCatch #3 {all -> 0x026d, blocks: (B:87:0x0206, B:89:0x020e, B:91:0x021d), top: B:139:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021d A[Catch: all -> 0x026d, CancellationException -> 0x028f, TryCatch #3 {all -> 0x026d, blocks: (B:87:0x0206, B:89:0x020e, B:91:0x021d), top: B:139:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f A[Catch: all -> 0x026b, CancellationException -> 0x028f, TryCatch #2 {all -> 0x026b, blocks: (B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250), top: B:137:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0245 A[Catch: all -> 0x026b, CancellationException -> 0x028f, TryCatch #2 {all -> 0x026b, blocks: (B:94:0x0239, B:96:0x023f, B:97:0x0241, B:99:0x0245, B:108:0x0259, B:110:0x025d, B:111:0x0261, B:100:0x0249, B:102:0x024d, B:103:0x0250), top: B:137:0x0239 }] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x013e -> B:135:0x013f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C532440KuQ<FLOW_CONTEXT, ?, ?> r11, FLOW_CONTEXT r12, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.InterfaceC532390KuL<java.lang.Object>> r13, java.util.Map<java.lang.String, ? extends X.C05XL<X.InterfaceC532390KuL<java.lang.Object>>> r14, X.InterfaceC532530KuZ r15, X.InterfaceC1364105Vn<? super X.InterfaceC532390KuL<? extends java.lang.Object>> r16) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532540Kua.LIZLLL(X.0KuQ, java.lang.Object, java.util.concurrent.ConcurrentHashMap, java.util.Map, X.0KuZ, X.05Vn):java.lang.Object");
    }
}
