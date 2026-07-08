package X;

import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS76S1300000_8;

/* JADX INFO: renamed from: X.0LrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556060LrQ {
    public static final C556060LrQ LIZ = new C556060LrQ();

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C552940LmO r7, X.InterfaceC1364105Vn<? super X.InterfaceC556470Ls5> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C556070LrR
            if (r0 == 0) goto L6f
            r5 = r8
            X.0LrR r5 = (X.C556070LrR) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 1
            if (r0 == 0) goto L55
            if (r0 != r2) goto L7b
            X.0LrB r3 = r5.LLILLJJLI
            X.0LmO r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.util.Map<java.lang.String, X.0LmJ<?, ?, ?, ?>> r0 = r7.LIZLLL
            java.util.Set r2 = r0.keySet()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L3e
            r1 = 16
        L3e:
            r4.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r2.next()
            X.05es r0 = X.C1406005es.LIZ
            r4.put(r1, r0)
            goto L45
        L55:
            X.C155000ia.LIZIZ(r1)
            X.0LrB r3 = new X.0LrB
            r0 = 0
            r3.<init>(r0)
            java.lang.String r1 = r7.LIZ
            java.util.Map<java.lang.String, X.05et> r0 = r7.LIZJ
            r5.LL = r7
            r5.LLILLJJLI = r3
            r5.LLILZIL = r2
            java.lang.Object r0 = r3.LIZJ(r1, r0, r5)
            if (r0 != r4) goto L26
            return r4
        L6f:
            X.0LrR r5 = new X.0LrR
            r5.<init>(r6, r8)
            goto L12
        L75:
            r0 = 0
            X.0LrN r0 = LIZJ(r7, r3, r0, r4)
            return r0
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556060LrQ.LIZ(X.0LmO, X.05Vn):java.lang.Object");
    }

    public static C556030LrN LIZIZ(C552940LmO c552940LmO, C555910LrB c555910LrB, C1346605Ou c1346605Ou) {
        Map<String, AbstractC1406905f1> mapLJ;
        Map<String, AbstractC1406905f1> map;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c1346605Ou != null && (map = c1346605Ou.LIZ) != null) {
            for (Map.Entry<String, AbstractC1406905f1> entry : map.entrySet()) {
                String key = entry.getKey();
                AbstractC1406905f1 value = entry.getValue();
                if ((value instanceof C1406405ew) || (value instanceof C1407105f3)) {
                    linkedHashSet.add(key);
                }
            }
        }
        Set setLJII = C15442062u.LJII(c552940LmO.LIZLLL.keySet(), linkedHashSet);
        Map<String, C552890LmJ<?, ?, ?, ?>> map2 = c552940LmO.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C552890LmJ<?, ?, ?, ?>> entry2 : map2.entrySet()) {
            if (setLJII.contains(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        List<C551510Lk5> list = c552940LmO.LJ;
        ArrayList arrayList = new ArrayList();
        for (C551510Lk5 c551510Lk5 : list) {
            C551510Lk5 c551510Lk52 = c551510Lk5;
            if (setLJII.contains(c551510Lk52.LIZ) && setLJII.contains(c551510Lk52.LIZIZ)) {
                arrayList.add(c551510Lk5);
            }
        }
        C552940LmO c552940LmO2 = new C552940LmO(c552940LmO.LIZ, c552940LmO.LIZIZ, c552940LmO.LIZJ, linkedHashMap, arrayList, c552940LmO.LJFF, c552940LmO.LJI, c552940LmO.LJII);
        int size = c552940LmO.LIZLLL.size() - linkedHashMap.size();
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Compiled subgraph: ");
        sbLIZ.append(c552940LmO.LIZ);
        sbLIZ.append(", resumed from ");
        sbLIZ.append(size);
        sbLIZ.append(" completed nodes");
        C201955140j.LIZLLL(c0lx3, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ));
        if (c1346605Ou == null || (mapLJ = c1346605Ou.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return LIZJ(c552940LmO2, c555910LrB, c552940LmO, mapLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v98, types: [X.1D82[]] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.1D82] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.List<X.0Lk5>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.13BV] */
    public static C556030LrN LIZJ(C552940LmO c552940LmO, C555910LrB c555910LrB, C552940LmO c552940LmO2, Map map) {
        boolean z;
        Collection collectionLLIIII;
        C552940LmO c552940LmO3 = c552940LmO;
        List listLLIIII = C13LP.LLIIII(c552940LmO3.LIZLLL.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C552890LmJ<?, ?, ?, ?>> entry : c552940LmO3.LIZLLL.entrySet()) {
            String key = entry.getKey();
            C552890LmJ<?, ?, ?, ?> value = entry.getValue();
            AwS76S1300000_8 awS76S1300000_8 = new AwS76S1300000_8(key, (String) value, (C552890LmJ<?, ?, ?, ?>) c555910LrB, (C555910LrB) c552940LmO3, (C552940LmO) 3);
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(320);
            C556270Lrl c556270Lrl = new C556270Lrl(awS76S1300000_8, key);
            aFwS239S0000000_8.invoke(c556270Lrl);
            C1D82 c1d82 = new C1D82(awS76S1300000_8, key);
            c1d82.LIZLLL = c556270Lrl.LIZ;
            c1d82.LIZIZ = c556270Lrl.LIZIZ;
            c1d82.LJIIJ = c556270Lrl.LIZJ;
            linkedHashMap.put(key, c1d82);
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Compiled node: ");
            sbLIZ.append(key);
            sbLIZ.append(" (");
            sbLIZ.append(value.LIZLLL.getNodeName());
            sbLIZ.append(')');
            C201955140j.LIZLLL(c0lx3, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ));
        }
        ?? arrayList = c552940LmO3.LJ;
        if (arrayList.isEmpty()) {
            C0LX3 c0lx32 = C0LX3.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No explicit links, auto-chaining ");
            sbLIZ2.append(listLLIIII.size());
            sbLIZ2.append(" nodes sequentially");
            C201955140j.LIZLLL(c0lx32, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ2));
            Iterator it2 = listLLIIII.iterator();
            if (!it2.hasNext()) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Object next = it2.next();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    arrayList.add(new C551510Lk5((String) next, (String) next2));
                    next = next2;
                }
            }
        }
        for (C551510Lk5 c551510Lk5 : arrayList) {
            Object obj = linkedHashMap.get(c551510Lk5.LIZ);
            ?? r1 = (C1D82) linkedHashMap.get(c551510Lk5.LIZIZ);
            if (obj != null && r1 != 0) {
                r1.LIZ(new C1D82[]{obj});
                C0LX3 c0lx33 = C0LX3.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Link: ");
                sbLIZ3.append(c551510Lk5.LIZ);
                sbLIZ3.append(" -> ");
                sbLIZ3.append(c551510Lk5.LIZIZ);
                C201955140j.LIZLLL(c0lx33, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                C0LX3 c0lx34 = C0LX3.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Skipping invalid link: ");
                sbLIZ4.append(c551510Lk5.LIZ);
                sbLIZ4.append(" -> ");
                sbLIZ4.append(c551510Lk5.LIZIZ);
                C201955140j.LJIJJ(c0lx34, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C551510Lk5) it3.next()).LIZIZ);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLLIIII) {
            if (!setLLIIJI.contains(obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object obj3 = linkedHashMap.get(it4.next());
            if (obj3 != null) {
                arrayList4.add(obj3);
            }
        }
        C1D82[] c1d82Arr = (C1D82[]) arrayList4.toArray(new C1D82[0]);
        C0LX3 c0lx35 = C0LX3.LIZIZ;
        StringBuilder sb = new StringBuilder("Start nodes: ");
        ArrayList arrayList5 = new ArrayList(c1d82Arr.length);
        for (C1D82 c1d822 : c1d82Arr) {
            arrayList5.add(c1d822.LJIIL);
        }
        sb.append(arrayList5);
        C201955140j.LIZLLL(c0lx35, "AIGCGraphCompiler", sb.toString());
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            Iterator it5 = collectionValues.iterator();
            while (it5.hasNext()) {
                if (!(it5.next() instanceof C1406005es)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        Set<String> setKeySet = c552940LmO3.LIZLLL.keySet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : setKeySet) {
            if (map.get(obj4) == null || (map.get(obj4) instanceof C1406005es)) {
                arrayList6.add(obj4);
            }
        }
        Set setLLIIJI2 = C13LP.LLIIJI(arrayList6);
        C00BF c00bf = new C00BF(z, setLLIIJI2);
        C0LX3 c0lx36 = C0LX3.LIZIZ;
        StringBuilder sb2 = new StringBuilder("compile: workflowId=");
        sb2.append(c552940LmO3.LIZ);
        sb2.append(", isRestore=");
        sb2.append(z);
        sb2.append(", firstRunNodeIds=");
        sb2.append(setLLIIJI2);
        sb2.append(", initialNodeStates=");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().getClass().getSimpleName());
        }
        sb2.append(linkedHashMap2);
        C201955140j.LJIILL(c0lx36, "lydiaTest", sb2.toString());
        String str = c552940LmO3.LIZ;
        Map<String, C552890LmJ<?, ?, ?, ?>> map2 = c552940LmO3.LIZLLL;
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c555910LrB, 1007);
        C556080LrS c556080LrS = new C556080LrS(str, map2, awS552S0100000_8, c00bf);
        C553220Lmq c553220Lmq = new C553220Lmq(str, c552940LmO3.LIZIZ, awS552S0100000_8);
        Set services = ServiceManager.get().getServices(IAIGCWorkflowPlugin.class, true);
        if (services == null || (collectionLLIIII = C13LP.LLIIII(services)) == null) {
            collectionLLIIII = C13BV.INSTANCE;
        }
        List listLJLIL = C13LP.LJLIL(C13LP.LLIIII(C1093404Pk.LIZ.values()), collectionLLIIII);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : (ArrayList) listLJLIL) {
            if (hashSet.add(obj5.getClass().getName())) {
                arrayList7.add(obj5);
            }
        }
        ArrayList<IAIGCWorkflowPlugin> arrayList8 = new ArrayList();
        for (Object obj6 : arrayList7) {
            if (((IAIGCWorkflowPlugin) obj6).LIZJ(c553220Lmq)) {
                arrayList8.add(obj6);
            }
        }
        C0LX3 c0lx37 = C0LX3.LIZIZ;
        StringBuilder sb3 = new StringBuilder("Discovered ");
        sb3.append(arrayList7.size());
        sb3.append(" plugin(s), ");
        sb3.append(arrayList8.size());
        sb3.append(" registered: ");
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            arrayList9.add(it6.next().getClass().getSimpleName());
        }
        sb3.append(arrayList9);
        C201955140j.LJIILL(c0lx37, "AIGCWorkflowEventHub", sb3.toString());
        for (IAIGCWorkflowPlugin iAIGCWorkflowPlugin : arrayList8) {
            C23250099c.LIZLLL(c556080LrS.LJIIJJI, iAIGCWorkflowPlugin.LJJJLL(), null, new C23078092m(new C095D(new C094S(c556080LrS.LJIIIZ, new C2217808mW(c553220Lmq, null), null)), iAIGCWorkflowPlugin, c556080LrS, null), 2);
        }
        C1440550naf c1440550naf = new C1440550naf(c552940LmO3.LIZ, (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length));
        c1440550naf.LIZJ = true;
        c1440550naf.LIZ = true;
        C1D80 c1d80LIZ = c1440550naf.LIZ();
        c1d80LIZ.LIZ(c556080LrS);
        C0LX3 c0lx38 = C0LX3.LIZIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Compiled workflow: ");
        sbLIZ5.append(c552940LmO3.LIZ);
        C201955140j.LJIILL(c0lx38, "AIGCGraphCompiler", C2188811AlT.LIZIZ(sbLIZ5));
        if (c552940LmO2 != null) {
            c552940LmO3 = c552940LmO2;
        }
        return new C556030LrN(c552940LmO3, c555910LrB, c1d80LIZ, c556080LrS, map);
    }
}
