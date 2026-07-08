package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1725506pJ {
    public static final C1725506pJ LIZ = new C1725506pJ();
    public static final Keva LIZIZ = Keva.getRepo("user_feature_settings");
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public static final C1DEV LJFF = C2191201ApK.LIZ();
    public static final ConcurrentHashMap<String, Object> LJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJII = new ConcurrentHashMap<>();
    public static final C054G LJIIIIZZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public static void LIZIZ(List list) {
        for (Object obj : list) {
            LIZ.getClass();
            InterfaceC2044707zh<EnumC1725606pK> entries = EnumC1725606pK.getEntries();
            ArrayList<EnumC1725606pK> arrayList = new ArrayList();
            for (EnumC1725606pK enumC1725606pK : entries) {
                if (enumC1725606pK.getClearCacheScenes().contains(obj)) {
                    arrayList.add(enumC1725606pK);
                }
            }
            for (EnumC1725606pK enumC1725606pK2 : arrayList) {
                LIZ.getClass();
                LIZ(enumC1725606pK2, true);
            }
        }
    }

    public static ConcurrentHashMap LIZLLL(String str) {
        ConcurrentHashMap<Integer, Object> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> concurrentHashMap = LIZJ;
        ConcurrentHashMap<Integer, Object> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        return concurrentHashMap2;
    }

    public static void LIZ(EnumC1725606pK enumC1725606pK, boolean z) {
        Iterator<T> it2 = LIZJ.values().iterator();
        while (it2.hasNext()) {
            ((ConcurrentHashMap) it2.next()).remove(Integer.valueOf(enumC1725606pK.getValue()));
        }
        Iterator<T> it3 = LIZLLL.values().iterator();
        while (it3.hasNext()) {
            ((ConcurrentHashMap) it3.next()).remove(Integer.valueOf(enumC1725606pK.getValue()));
        }
        if (z) {
            C23250099c.LIZLLL(LJIIIIZZ, null, null, new C05G9(enumC1725606pK, null), 3);
        }
    }

    public static String LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJII(String str, EnumC1725606pK enumC1725606pK, Object obj) {
        ConcurrentHashMap<Integer, Object> concurrentHashMapPutIfAbsent;
        LIZLLL(str).put(Integer.valueOf(enumC1725606pK.getValue()), obj);
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> concurrentHashMap = LIZLLL;
        ConcurrentHashMap<Integer, Object> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(Integer.valueOf(enumC1725606pK.getValue()), obj);
        if (enumC1725606pK.isStoredToKeva()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(enumC1725606pK.getValue());
            try {
                LIZIZ.storeString(C2188811AlT.LIZIZ(sbLIZ), C09EF.LIZ.LJIILLIIL(obj, enumC1725606pK.getDataType()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to update Keva for feature ");
                sbLIZ2.append(enumC1725606pK.name());
                C2188811AlT.LIZIZ(sbLIZ2);
                C1AF0.LJFF(e, "IMUserFeatureInfoHelper: Failed to update Keva");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136 A[Catch: Exception -> 0x0159, all -> 0x0163, LOOP:0: B:46:0x0130->B:48:0x0136, LOOP_END, TryCatch #1 {Exception -> 0x0159, blocks: (B:44:0x010f, B:45:0x0112, B:46:0x0130, B:48:0x0136, B:49:0x014f, B:28:0x0098, B:30:0x00a5, B:32:0x00ad, B:33:0x00b0, B:34:0x00b3, B:36:0x00b9, B:37:0x00c4, B:38:0x00d3, B:40:0x00d9, B:41:0x00eb), top: B:58:0x001f, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.01eN, X.05Vn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725506pJ.LJI(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJIIIIZZ(X.EnumC1725606pK r8, T r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1725806pM
            if (r0 == 0) goto L28
            r6 = r10
            X.06pM r6 = (X.C1725806pM) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r1 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L2e
            java.lang.Object r3 = r6.LLILLL
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r9 = r6.LLILLJJLI
            X.06pK r8 = r6.LL
            goto L64
        L28:
            X.06pM r6 = new X.06pM
            r6.<init>(r7, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r3 = X.C461720I8s.LIZIZ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureValueData r2 = X.C1725906pN.LIZ(r8, r9)     // Catch: java.lang.Exception -> L77
            if (r2 == 0) goto L7e
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureRequestBody r1 = new com.ss.android.ugc.aweme.im.contacts.api.model.IMUserFeatureRequestBody     // Catch: java.lang.Exception -> L77
            int r0 = r8.getValue()     // Catch: java.lang.Exception -> L77
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L77
            X.06pD r0 = com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi.LIZ     // Catch: java.lang.Exception -> L77
            r0.getClass()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi r0 = X.C1724906pD.LIZ()     // Catch: java.lang.Exception -> L77
            r6.LL = r8     // Catch: java.lang.Exception -> L77
            r6.LLILLJJLI = r9     // Catch: java.lang.Exception -> L77
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L77
            r6.LLILZLL = r4     // Catch: java.lang.Exception -> L77
            java.lang.Object r0 = r0.updateUserFeature(r1, r6)     // Catch: java.lang.Exception -> L77
            if (r0 != r5) goto L67
            return r5
        L64:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L75
        L67:
            X.06pJ r0 = X.C1725506pJ.LIZ     // Catch: java.lang.Exception -> L75
            r0.getClass()     // Catch: java.lang.Exception -> L75
            r0 = 0
            java.lang.String r0 = LIZJ(r3, r0)     // Catch: java.lang.Exception -> L75
            LJII(r0, r8, r9)     // Catch: java.lang.Exception -> L75
            goto L7f
        L75:
            r0 = move-exception
            goto L78
        L77:
            r0 = move-exception
        L78:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8.name()
        L7e:
            r4 = 0
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725506pJ.LJIIIIZZ(X.06pK, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:33:0x00c9, B:34:0x00cc, B:38:0x00f7), top: B:46:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJ(X.EnumC1725606pK r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super T> r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725506pJ.LJ(X.06pK, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJFF(EnumC1725606pK enumC1725606pK, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        Object objPutIfAbsent;
        ConcurrentHashMap<Integer, Object> concurrentHashMapPutIfAbsent;
        if (str == null) {
            str = C461720I8s.LIZIZ();
        }
        String strLIZJ = LIZJ(str, str2);
        int value = enumC1725606pK.getValue();
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> concurrentHashMap = LIZLLL;
        ConcurrentHashMap<Integer, Object> concurrentHashMap2 = concurrentHashMap.get(strLIZJ);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZJ, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        Object obj = concurrentHashMap2.get(Integer.valueOf(value));
        if (obj == null) {
            obj = null;
        }
        if (obj == null && z && enumC1725606pK.isStoredToKeva()) {
            ConcurrentHashMap concurrentHashMapLIZLLL = LIZLLL(strLIZJ);
            Object obj2 = concurrentHashMapLIZLLL.get(Integer.valueOf(enumC1725606pK.getValue()));
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap3 = LJII;
                Boolean bool = concurrentHashMap3.get(strLIZJ);
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    ConcurrentHashMap<String, Object> concurrentHashMap4 = LJI;
                    Object obj3 = concurrentHashMap4.get(strLIZJ);
                    if (obj3 == null && (objPutIfAbsent = concurrentHashMap4.putIfAbsent(strLIZJ, (obj3 = new Object()))) != null) {
                        obj3 = objPutIfAbsent;
                    }
                    synchronized (obj3) {
                        try {
                            if (!Intrinsics.LJFF(concurrentHashMap3.get(strLIZJ), bool2)) {
                                LIZ.getClass();
                                ConcurrentHashMap concurrentHashMapLIZLLL2 = LIZLLL(strLIZJ);
                                for (EnumC1725606pK enumC1725606pK2 : EnumC1725606pK.values()) {
                                    if (enumC1725606pK2.isStoredToKeva()) {
                                        LIZ.getClass();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(strLIZJ);
                                        sbLIZ.append('_');
                                        sbLIZ.append(enumC1725606pK2.getValue());
                                        String string = LIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                                        if (string == null || string.length() == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            try {
                                                concurrentHashMapLIZLLL2.put(Integer.valueOf(enumC1725606pK2.getValue()), C09EF.LIZ.LJIIIIZZ(string, enumC1725606pK2.getDataType()));
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("Failed to deserialize feature ");
                                                sbLIZ2.append(enumC1725606pK2.name());
                                                sbLIZ2.append(" from Keva");
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                            }
                                        }
                                    }
                                }
                                LJII.put(strLIZJ, Boolean.TRUE);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                obj2 = concurrentHashMapLIZLLL.get(Integer.valueOf(enumC1725606pK.getValue()));
                if (obj2 == null) {
                    obj2 = null;
                }
            }
            if (obj2 != null) {
                C1243290iSV.LJ(C1243290iSV.LIZ, enumC1725606pK.name(), "keva_hit");
            } else {
                C1243290iSV.LJ(C1243290iSV.LIZ, enumC1725606pK.name(), "miss");
            }
            if (obj2 == null && z2) {
                C23250099c.LIZLLL(LJIIIIZZ, null, null, new C05GA(enumC1725606pK, str, str2, null), 3);
            }
            return obj2;
        }
        if (obj != null) {
            C1243290iSV.LJ(C1243290iSV.LIZ, enumC1725606pK.name(), "memory_hit");
        }
        return obj;
    }
}
