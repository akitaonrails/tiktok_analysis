package X;

import Y.AComparatorS37S0000000_18;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0wXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784440wXK {
    public static final C1784440wXK LIZ = new C1784440wXK();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new C1864950ydB(CoroutineExceptionHandler.LJJLIL, 1)));
    public static final C1DEV LIZJ = C2191201ApK.LIZ();
    public static Map<String, C1784480wXO> LIZLLL = C2097608Jq.LJ();
    public static boolean LJ;

    public static List LJFF() {
        return C13LP.LLIIII(LIZLLL.values());
    }

    public static long LJII() {
        return C19267610Zm.LIZ.now().toEpochMilliseconds();
    }

    public static boolean LIZIZ(InterfaceC1784430wXJ interfaceC1784430wXJ) {
        if (LJ) {
            return false;
        }
        LIZLLL = LIZLLL(LJI(LJFF(), interfaceC1784430wXJ.LIZIZ()));
        LJ = true;
        return true;
    }

    public static Map LIZLLL(List list) {
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : list) {
            C1784480wXO c1784480wXO = (C1784480wXO) obj;
            C1784440wXK c1784440wXK = LIZ;
            String str = c1784480wXO.LIZ;
            int i = c1784480wXO.LIZIZ;
            c1784440wXK.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(i);
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), obj);
        }
        return linkedHashMap;
    }

    public static List LJ(long j, List list) {
        long jLJII = (LJII() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - (j * ((long) 60));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C1784480wXO) obj).LJIIJJI >= jLJII) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJLLLL(new AComparatorS37S0000000_18(9), arrayList);
    }

    public static List LJI(List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1784480wXO c1784480wXO : C13LP.LJLLLL(new AComparatorS37S0000000_18(7), C13LP.LJLIL(list2, list))) {
            C1784440wXK c1784440wXK = LIZ;
            String str = c1784480wXO.LIZ;
            int i = c1784480wXO.LIZIZ;
            c1784440wXK.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1784480wXO c1784480wXO2 = (C1784480wXO) linkedHashMap.get(strLIZIZ);
            if (c1784480wXO2 == null || c1784480wXO.LJIIJJI > c1784480wXO2.LJIIJJI) {
                linkedHashMap.put(strLIZIZ, c1784480wXO);
            }
        }
        return C13LP.LJLLLL(new AComparatorS37S0000000_18(8), linkedHashMap.values());
    }

    public static List LIZ(int i, long j, List list) {
        List listLJ = LJ(j, list);
        if (listLJ.size() <= i) {
            return listLJ;
        }
        C20684815ws.LJIILLIIL("share_prop_record_maxout", C2097608Jq.LJI(new Pair("count", String.valueOf(listLJ.size() - i))));
        return C13LP.LL(listLJ, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1784430wXJ r8, long r9, int r11, long r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof X.C1784450wXL
            if (r0 == 0) goto L2e
            r6 = r14
            X.0wXL r6 = (X.C1784450wXL) r6
            int r2 = r6.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r6.LLIZLLLIL = r2
        L12:
            java.lang.Object r5 = r6.LLILZLL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLIZLLLIL
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L3c
            if (r0 != r2) goto L34
            long r12 = r6.LLILZ
            int r11 = r6.LLILZIL
            long r9 = r6.LLILLL
            X.1DEV r3 = r6.LLILLJJLI
            X.0wXJ r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L54
        L2e:
            X.0wXL r6 = new X.0wXL
            r6.<init>(r7, r14)
            goto L12
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r3 = X.C1784440wXK.LIZJ
            r6.LL = r8
            r6.LLILLJJLI = r3
            r6.LLILLL = r9
            r6.LLILZIL = r11
            r6.LLILZ = r12
            r6.LLIZLLLIL = r2
            java.lang.Object r0 = r3.LIZLLL(r4, r6)
            if (r0 != r1) goto L54
            return r1
        L54:
            X.0wXK r0 = X.C1784440wXK.LIZ     // Catch: java.lang.Throwable -> L91
            r0.getClass()     // Catch: java.lang.Throwable -> L91
            LIZIZ(r8)     // Catch: java.lang.Throwable -> L91
            java.util.List r0 = LJFF()     // Catch: java.lang.Throwable -> L91
            java.util.List r1 = LIZ(r11, r9, r0)     // Catch: java.lang.Throwable -> L91
            java.util.Map r0 = LIZLLL(r1)     // Catch: java.lang.Throwable -> L91
            X.C1784440wXK.LIZLLL = r0     // Catch: java.lang.Throwable -> L91
            r8.LIZ(r1)     // Catch: java.lang.Throwable -> L91
            long r0 = LJII()     // Catch: java.lang.Throwable -> L91
            long r0 = r0 - r12
            kotlin.Pair[] r5 = new kotlin.Pair[r2]     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L91
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "duration"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L91
            r0 = 0
            r5[r0] = r1     // Catch: java.lang.Throwable -> L91
            java.util.HashMap r1 = X.C2097608Jq.LJI(r5)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "share_prop_storage_diff"
            X.C20684815ws.LJIILLIIL(r0, r1)     // Catch: java.lang.Throwable -> L91
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L91
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1784440wXK.LIZJ(X.0wXJ, long, int, long, X.05Vn):java.lang.Object");
    }
}
