package X;

import Y.AComparatorS22S0000000_3;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603760NmA implements InterfaceC894800Z8k {
    public static final C603760NmA LL = new C603760NmA();
    public static final long LLILLJJLI;
    public static final int LLILLL;
    public static final C603820NmG<String, LightInteractionExitBean> LLILZ;
    public static final C823170WQx<LightInteractionExitBean> LLILZIL;
    public static volatile Keva LLILZLL;
    public static volatile C09AE LLIZ;
    public static volatile AnonymousClass0956 LLIZLLLIL;

    static {
        C01GW c01gw = C603790NmD.LIZIZ;
        LLILLJJLI = ((C603780NmC) c01gw.getValue()).LIZ;
        int i = ((C603780NmC) c01gw.getValue()).LIZIZ;
        LLILLL = ((C603780NmC) c01gw.getValue()).LIZJ;
        LLILZ = new C603820NmG<>(i);
        LLILZIL = new C823170WQx<>();
    }

    public final void LIZJ() {
        if (C0ZMM.LIZ()) {
            synchronized (this) {
                try {
                    LLILZ.LJIIIZ(-1);
                    LLILZIL.clear();
                    C09AE c09ae = LLIZ;
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                    LLIZ = null;
                    LLILZLL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static LightInteractionExitBean LJFF(String str) {
        int i;
        Keva keva;
        String[] stringArray;
        C603820NmG<String, LightInteractionExitBean> c603820NmG = LLILZ;
        int iLJI = c603820NmG.LJI();
        synchronized (c603820NmG.LIZJ) {
            try {
                i = c603820NmG.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (iLJI == i && (keva = LLILZLL) != null && (stringArray = keva.getStringArray(str, null)) != null && stringArray.length == 2) {
            try {
                return (LightInteractionExitBean) C051M.LIZIZ(LightInteractionExitBean.class, stringArray[1]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Keva keva2 = LLILZLL;
                if (keva2 != null) {
                    keva2.erase(str);
                }
            }
        }
        return null;
    }

    public static void LJIIL(LightInteractionExitBean lightInteractionExitBean) {
        LLILZIL.add(lightInteractionExitBean);
        C09AE c09aeLIZLLL = LLIZ;
        if (c09aeLIZLLL == null) {
            c09aeLIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C603750Nm9(null), 3);
        }
        LLIZ = c09aeLIZLLL;
    }

    public final void LJIIIZ(String str) {
        if (!C0ZMM.LIZ() || Intrinsics.LJFF(null, str)) {
            return;
        }
        LIZJ();
        synchronized (this) {
            try {
                AnonymousClass0956 anonymousClass0956 = LLIZLLLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LLIZLLLIL = null;
                LLIZLLLIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2136608Yq(str, null), 3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZ(String str, EnumC1696906kh enumC1696906kh) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1696906kh.getExitLabel());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(Map map, Keva keva) {
        String[] strArr;
        if (map.size() > LLILLL) {
            Set<Map.Entry> setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                Object value = entry.getValue();
                if ((value instanceof String[]) && (strArr = (String[]) value) != null && strArr.length == 2) {
                    arrayList.add(new Pair(entry.getKey(), strArr));
                }
            }
            for (Pair pair : C13LP.LJLLLL(new AComparatorS22S0000000_3(39), arrayList).subList(0, map.size() - LLILLL)) {
                map.remove(pair.getFirst());
                keva.erase((String) pair.getFirst());
            }
        }
    }

    public static LightInteractionExitBean LJII(String str, EnumC1696906kh enumC1696906kh) {
        if (!C0ZMM.LIZ() || LLILZLL == null) {
            return null;
        }
        String strLIZ = LIZ(str, enumC1696906kh);
        C603820NmG<String, LightInteractionExitBean> c603820NmG = LLILZ;
        LightInteractionExitBean lightInteractionExitBeanLIZJ = c603820NmG.LIZJ(strLIZ);
        if (lightInteractionExitBeanLIZJ == null) {
            lightInteractionExitBeanLIZJ = LJFF(strLIZ);
            if (lightInteractionExitBeanLIZJ != null) {
                c603820NmG.LIZLLL(strLIZ, lightInteractionExitBeanLIZJ);
            } else {
                LightInteractionExitBean lightInteractionExitBean = new LightInteractionExitBean(strLIZ, null, null, null, new LinkedHashMap());
                c603820NmG.LIZLLL(strLIZ, lightInteractionExitBean);
                return lightInteractionExitBean;
            }
        }
        return lightInteractionExitBeanLIZJ;
    }

    public static List LJIIIIZZ(Map map, Keva keva) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String[]) {
                strArr = (String[]) value;
            } else {
                strArr = null;
            }
            if (strArr == null) {
                keva.erase(str);
            } else if (strArr.length != 2) {
                keva.erase(str);
            } else {
                try {
                    CastLongProtector.parseLong(strArr[0]);
                    arrayList.add(strArr);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    keva.erase(str);
                }
            }
        }
        return C13LP.LJLLLL(new Comparator() { // from class: X.08LI
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Long.valueOf(CastLongProtector.parseLong((String) C13LQ.LJIL((Object[]) t2))), Long.valueOf(CastLongProtector.parseLong((String) C13LQ.LJIL((Object[]) t))));
            }
        }, arrayList);
    }

    public static void LJIIJ(List list, C603820NmG c603820NmG) {
        int i;
        int size = list.size();
        synchronized (c603820NmG.LIZJ) {
            try {
                i = c603820NmG.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = C13LP.LJLJJLL(list.subList(0, Math.min(size, i))).iterator();
        while (it2.hasNext()) {
            try {
                LightInteractionExitBean lightInteractionExitBean = (LightInteractionExitBean) C051M.LIZIZ(LightInteractionExitBean.class, ((String[]) it2.next())[1]);
                if (lightInteractionExitBean != null) {
                    c603820NmG.LIZLLL(lightInteractionExitBean.key, lightInteractionExitBean);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJIILIIL(String str, EnumC1696906kh enumC1696906kh) {
        C0I0B.LJFF.LIZJ();
        if (!C894660Z7w.LIZLLL()) {
            return;
        }
        String strLIZ = LIZ(str, enumC1696906kh);
        LLILZ.LJ(strLIZ);
        Keva keva = LLILZLL;
        if (keva != null) {
            keva.erase(strLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // X.InterfaceC894800Z8k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(java.lang.String r13, X.EnumC1696906kh r14, long r15) {
        /*
            r12 = this;
            boolean r0 = X.C0ZMM.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r7 = LIZ(r13, r14)
            X.0NmG<java.lang.String, com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean> r0 = X.C603760NmA.LLILZ
            java.lang.Object r1 = r0.LIZJ(r7)
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean r1 = (com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean) r1
            if (r1 != 0) goto L19
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean r1 = LJFF(r7)
        L19:
            if (r1 == 0) goto L2d
            java.lang.Long r4 = java.lang.Long.valueOf(r15)
            java.lang.String r2 = r1.key
            java.lang.Long r3 = r1.updateTimingMs
            java.lang.Long r5 = r1.latestMessageCreateTime
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r6 = r1.exitLabelMap
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean r6 = r1.copy(r2, r3, r4, r5, r6)
            if (r6 != 0) goto L3d
        L2d:
            com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean r6 = new com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11)
        L3d:
            r0.LIZLLL(r7, r6)
            LJIIL(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C603760NmA.LJJII(java.lang.String, X.06kh, long):void");
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJJJZ(String str, EnumC1696906kh enumC1696906kh, C0C97 c0c97, String str2, long j) {
        LightInteractionExitBean lightInteractionExitBeanCopy;
        if (!C0ZMM.LIZ()) {
            return;
        }
        String strLIZ = LIZ(str, enumC1696906kh);
        C603820NmG<String, LightInteractionExitBean> c603820NmG = LLILZ;
        LightInteractionExitBean lightInteractionExitBeanLIZJ = c603820NmG.LIZJ(strLIZ);
        if (lightInteractionExitBeanLIZJ == null) {
            lightInteractionExitBeanLIZJ = LJFF(strLIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lightInteractionExitBeanLIZJ == null) {
            lightInteractionExitBeanCopy = new LightInteractionExitBean(strLIZ, Long.valueOf(jCurrentTimeMillis), null, null, C2097608Jq.LJIIJ(new Pair(c0c97.getLabel(), C2097608Jq.LJIIJ(new Pair(str2, Long.valueOf(j))))));
        } else {
            Map<String, Long> map = lightInteractionExitBeanLIZJ.exitLabelMap.get(c0c97.getLabel());
            if (map != null) {
                map.put(str2, Long.valueOf(j));
            } else {
                lightInteractionExitBeanLIZJ.exitLabelMap.put(c0c97.getLabel(), C2097608Jq.LJIIJ(new Pair(str2, Long.valueOf(j))));
            }
            lightInteractionExitBeanCopy = lightInteractionExitBeanLIZJ.copy(lightInteractionExitBeanLIZJ.key, Long.valueOf(jCurrentTimeMillis), lightInteractionExitBeanLIZJ.enterChatTimeSecond, lightInteractionExitBeanLIZJ.latestMessageCreateTime, lightInteractionExitBeanLIZJ.exitLabelMap);
        }
        c603820NmG.LIZLLL(strLIZ, lightInteractionExitBeanCopy);
        LJIIL(lightInteractionExitBeanCopy);
    }
}
