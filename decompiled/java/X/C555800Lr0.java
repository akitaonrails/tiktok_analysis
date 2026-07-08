package X;

import com.ss.android.ugc.aweme.persistence.model.AIGCWorkflowCentralRegistryPersistenceItem;
import com.ss.android.ugc.aweme.persistence.model.AIGCWorkflowNodeStatesPersistence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Lr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555800Lr0 {
    public static final C555800Lr0 LIZ = new C555800Lr0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.13BV] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static X.C552940LmO LIZJ(X.C555820Lr2 r18) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555800Lr0.LIZJ(X.0Lr2):X.0LmO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000a A[PHI: r5
      0x000a: PHI (r5v3 java.util.Set) = (r5v0 java.util.Set), (r5v5 java.util.Set) binds: [B:6:0x0008, B:4:0x0004] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.C555910LrB r6) {
        /*
            if (r6 == 0) goto L6
            java.util.Set<java.lang.String> r5 = r6.LIZIZ
            if (r5 != 0) goto La
        L6:
            X.08CX r5 = X.C08CX.INSTANCE
            if (r6 == 0) goto L7d
        La:
            java.util.Map<java.lang.String, X.09Eo> r0 = r6.LIZ
            if (r0 == 0) goto L7d
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r5.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L1b
        L3f:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r4.size()
            r5.<init>(r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L50:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getValue()
            X.09Eo r2 = (X.C2339209Eo) r2
            com.ss.android.ugc.aweme.persistence.model.AIGCWorkflowCentralRegistryPersistenceItem r1 = new com.ss.android.ugc.aweme.persistence.model.AIGCWorkflowCentralRegistryPersistenceItem
            java.lang.String r0 = r2.LIZ
            if (r0 != 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Boolean> r0 = X.C2338909El.LIZ
            java.lang.Object r0 = r2.LIZIZ
            java.lang.String r0 = X.C2338909El.LIZJ(r0)
        L76:
            r1.<init>(r3, r0)
            r5.add(r1)
            goto L50
        L7d:
            X.13BV r5 = X.C13BV.INSTANCE
        L7f:
            java.lang.String r0 = X.C2338909El.LIZJ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555800Lr0.LIZLLL(X.0LrB):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static String LJ(Map map) {
        Object arrayList;
        C2339209Eo c2339209Eo;
        if (map != null) {
            arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                InterfaceC1406105et interfaceC1406105et = (InterfaceC1406105et) entry.getValue();
                if ((interfaceC1406105et instanceof C2339209Eo) && (c2339209Eo = (C2339209Eo) interfaceC1406105et) != null) {
                    String strLIZJ = c2339209Eo.LIZ;
                    if (strLIZJ == null) {
                        ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = C2338909El.LIZ;
                        strLIZJ = C2338909El.LIZJ(c2339209Eo.LIZIZ);
                    }
                    arrayList.add(new AIGCWorkflowCentralRegistryPersistenceItem(str, strLIZJ));
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return C2338909El.LIZJ(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static String LJFF(C1346605Ou c1346605Ou) {
        Object arrayList;
        Map<String, AbstractC1406905f1> map;
        AIGCWorkflowNodeStatesPersistence aIGCWorkflowNodeStatesPersistence;
        C2339209Eo c2339209Eo;
        Object obj;
        if (c1346605Ou != null && (map = c1346605Ou.LIZ) != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, AbstractC1406905f1> entry : map.entrySet()) {
                String key = entry.getKey();
                AbstractC1406905f1 value = entry.getValue();
                if (value instanceof C1406005es) {
                    aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(AIGCWorkflowNodeStatesPersistence.State.DEFAULT, null, null, null, null, null, null, null);
                } else {
                    String strLIZIZ = null;
                    if (value instanceof C1405905er) {
                        AIGCWorkflowNodeStatesPersistence.State state = AIGCWorkflowNodeStatesPersistence.State.RUNNING;
                        C1405905er c1405905er = (C1405905er) value;
                        Integer numValueOf = Integer.valueOf(c1405905er.LIZ);
                        Long lValueOf = Long.valueOf(c1405905er.LIZIZ);
                        InterfaceC1406105et interfaceC1406105et = c1405905er.LIZJ;
                        if (interfaceC1406105et != null) {
                            strLIZIZ = C2339409Eq.LIZIZ(interfaceC1406105et);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state, null, numValueOf, null, null, lValueOf, strLIZIZ, null);
                    } else if (value instanceof C1406305ev) {
                        AIGCWorkflowNodeStatesPersistence.State state2 = AIGCWorkflowNodeStatesPersistence.State.PAUSED;
                        C1406305ev c1406305ev = (C1406305ev) value;
                        Integer numValueOf2 = Integer.valueOf(c1406305ev.LIZ);
                        Long lValueOf2 = Long.valueOf(c1406305ev.LIZIZ);
                        InterfaceC1406105et interfaceC1406105et2 = c1406305ev.LIZJ;
                        if (interfaceC1406105et2 != null) {
                            strLIZIZ = C2339409Eq.LIZIZ(interfaceC1406105et2);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state2, null, numValueOf2, null, null, lValueOf2, strLIZIZ, null);
                    } else if (value instanceof C1407005f2) {
                        AIGCWorkflowNodeStatesPersistence.State state3 = AIGCWorkflowNodeStatesPersistence.State.CANCELLED;
                        InterfaceC1406105et interfaceC1406105et3 = ((C1407005f2) value).LIZ;
                        if (interfaceC1406105et3 != null) {
                            strLIZIZ = C2339409Eq.LIZIZ(interfaceC1406105et3);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state3, null, null, null, null, null, strLIZIZ, null);
                    } else if (value instanceof C1406605ey) {
                        AIGCWorkflowNodeStatesPersistence.State state4 = AIGCWorkflowNodeStatesPersistence.State.FAILED;
                        C1406605ey c1406605ey = (C1406605ey) value;
                        Integer numValueOf3 = Integer.valueOf(c1406605ey.LIZ);
                        String str = c1406605ey.LIZIZ;
                        InterfaceC1406105et interfaceC1406105et4 = c1406605ey.LIZJ;
                        if (interfaceC1406105et4 != null) {
                            strLIZIZ = C2339409Eq.LIZIZ(interfaceC1406105et4);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state4, null, null, numValueOf3, str, null, strLIZIZ, null);
                    } else if (value instanceof C1406405ew) {
                        AIGCWorkflowNodeStatesPersistence.State state5 = AIGCWorkflowNodeStatesPersistence.State.SUCCESS;
                        ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = C2338909El.LIZ;
                        Map<String, InterfaceC1406105et> map2 = ((C1406405ew) value).LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                        Iterator<T> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            Object key2 = entry2.getKey();
                            Object value2 = entry2.getValue();
                            if (value2 instanceof C2339209Eo) {
                                c2339209Eo = (C2339209Eo) value2;
                                if (c2339209Eo == null || (strLIZJ = c2339209Eo.LIZ) == null) {
                                }
                                linkedHashMap.put(key2, strLIZJ);
                            } else {
                                c2339209Eo = null;
                            }
                            ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap2 = C2338909El.LIZ;
                            if (c2339209Eo != null) {
                                obj = c2339209Eo.LIZIZ;
                            } else {
                                obj = null;
                            }
                            String strLIZJ = C2338909El.LIZJ(obj);
                            linkedHashMap.put(key2, strLIZJ);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state5, null, null, null, null, null, null, C2338909El.LIZJ(linkedHashMap));
                    } else if (value instanceof C1407105f3) {
                        AIGCWorkflowNodeStatesPersistence.State state6 = AIGCWorkflowNodeStatesPersistence.State.SKIP_FAILED;
                        C1407105f3 c1407105f3 = (C1407105f3) value;
                        Integer numValueOf4 = Integer.valueOf(c1407105f3.LIZ);
                        String str2 = c1407105f3.LIZIZ;
                        InterfaceC1406105et interfaceC1406105et5 = c1407105f3.LIZJ;
                        if (interfaceC1406105et5 != null) {
                            strLIZIZ = C2339409Eq.LIZIZ(interfaceC1406105et5);
                        }
                        aIGCWorkflowNodeStatesPersistence = new AIGCWorkflowNodeStatesPersistence(state6, null, null, numValueOf4, str2, null, strLIZIZ, null);
                    } else {
                        throw new C1954807lC();
                    }
                }
                aIGCWorkflowNodeStatesPersistence.mapKey = key;
                arrayList.add(aIGCWorkflowNodeStatesPersistence);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return C2338909El.LIZJ(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C555910LrB r6, X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C555850Lr5
            if (r0 == 0) goto L35
            r4 = r7
            X.0Lr5 r4 = (X.C555850Lr5) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L3b
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L26
        L24:
            java.lang.String r3 = ""
        L26:
            return r3
        L27:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L24
            r4.LLILLL = r0
            java.lang.Object r3 = X.C556540LsC.LIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L35:
            X.0Lr5 r4 = new X.0Lr5
            r4.<init>(r5, r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555800Lr0.LIZIZ(X.0LrB, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn<? super X.C555910LrB> r13) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555800Lr0.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C552940LmO r24, com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel r25, X.InterfaceC1364105Vn<? super X.C555820Lr2> r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555800Lr0.LJI(X.0LmO, com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel, X.05Vn):java.lang.Object");
    }
}
