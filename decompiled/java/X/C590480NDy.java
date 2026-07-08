package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localcache.DBUidExtBundle;
import defpackage.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590480NDy {
    public static volatile DBUidExtBundle LIZLLL;
    public static volatile boolean LJFF;
    public static final C590480NDy LIZ = new C590480NDy();
    public static final List<String> LIZIZ = new CopyOnWriteArrayList();
    public static volatile String LIZJ = "_logout_";
    public static final HashMap<String, DBUidExtBundle> LJ = new HashMap<>();
    public static final Object LJI = new Object();

    public static void LIZ() {
        C590420NDs.LIZ.getClass();
        if (C590420NDs.LJIIL().length() == 0) {
            return;
        }
        String strLJIIL = C590420NDs.LJIIL();
        x0 x0Var = x0.LIZ;
        String strLJIIL2 = C590420NDs.LJIIL();
        String strLJIILIIL = C590420NDs.LJIILIIL();
        x0Var.getClass();
        C590420NDs.LJI().storeString("key_video_group_ctg", x0.LIZLLL(strLJIIL2, strLJIILIIL));
        TextUtils.equals(strLJIIL, C590420NDs.LJIIL());
    }

    public static void LIZJ() {
        Object c098200Yq;
        if (LJFF) {
            return;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "_logout_";
        }
        LIZJ = curUserId;
        C590420NDs.LIZ.getClass();
        Iterator it2 = a0.LJJLIIIJILLIZJL(C590420NDs.LIZLLL(), new String[]{","}, 0, 6).iterator();
        while (true) {
            if (!it2.hasNext()) {
                LIZLLL = LJ.get(LIZJ);
                LJFF = true;
                C593360NPa.LIZ(AFwS195S0000000_9.get$arr$(580));
                return;
            }
            String str = (String) it2.next();
            if (str.length() > 0) {
                HashMap<String, DBUidExtBundle> map = LJ;
                if (!map.containsKey(str)) {
                    C590420NDs.LIZ.getClass();
                    Keva kevaLJI = C590420NDs.LJI();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("db_uid_ext_bundle_");
                    sbLIZ.append(str);
                    String string = kevaLJI.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                    String str2 = string != null ? string : "";
                    Object obj = null;
                    if (!(str2.length() == 0)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            c098200Yq = (DBUidExtBundle) C1227904rF.LJ().LJII(str2, DBUidExtBundle.class);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                            obj = c098200Yq;
                        }
                    }
                    map.put(str, (DBUidExtBundle) obj);
                }
            }
        }
    }

    public static DBUidExtBundle LIZLLL() {
        LIZJ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "_logout_";
        }
        if (!Intrinsics.LJFF(LIZJ, curUserId)) {
            LIZJ = curUserId;
            LIZLLL = LJ.get(LIZJ);
        } else if (LIZLLL == null) {
            LIZLLL = LJ.get(LIZJ);
        }
        return LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ() {
        /*
            boolean r0 = X.C294330BgF.LIZ()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.Object r1 = X.C590480NDy.LJI
            monitor-enter(r1)
            X.0NDy r0 = X.C590480NDy.LIZ     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.localcache.DBUidExtBundle r0 = LIZLLL()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.coldCacheAids     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590480NDy.LJ():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF() {
        /*
            boolean r0 = X.C294330BgF.LIZ()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.Object r1 = X.C590480NDy.LJI
            monitor-enter(r1)
            X.0NDy r0 = X.C590480NDy.LIZ     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.localcache.DBUidExtBundle r0 = LIZLLL()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.eliminateAids     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590480NDy.LJFF():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI() {
        /*
            boolean r0 = X.C294330BgF.LIZ()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.Object r1 = X.C590480NDy.LJI
            monitor-enter(r1)
            X.0NDy r0 = X.C590480NDy.LIZ     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.localcache.DBUidExtBundle r0 = LIZLLL()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.forOtherAids     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590480NDy.LJI():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII() {
        /*
            boolean r0 = X.C294330BgF.LIZ()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.Object r1 = X.C590480NDy.LJI
            monitor-enter(r1)
            X.0NDy r0 = X.C590480NDy.LIZ     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.localcache.DBUidExtBundle r0 = LIZLLL()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.curUidAllAids     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590480NDy.LJII():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ() {
        /*
            boolean r0 = X.C294330BgF.LIZ()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.Object r1 = X.C590480NDy.LJI
            monitor-enter(r1)
            X.0NDy r0 = X.C590480NDy.LIZ     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.ugc.aweme.localcache.DBUidExtBundle r0 = LIZLLL()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.unconsumedCacheAids     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590480NDy.LJIIIIZZ():java.lang.String");
    }

    public static String LJIIIZ() {
        String strLIZIZ;
        if (!C294330BgF.LIZ()) {
            return "";
        }
        synchronized (LJI) {
            try {
                LIZ.getClass();
                LIZJ();
                strLIZIZ = "";
                for (DBUidExtBundle dBUidExtBundle : LJ.values()) {
                    if (dBUidExtBundle != null) {
                        if (!(dBUidExtBundle.curUidAllAids.length() == 0)) {
                            C590480NDy c590480NDy = LIZ;
                            String str = dBUidExtBundle.curUidAllAids;
                            c590480NDy.getClass();
                            strLIZIZ = LIZIZ(strLIZIZ, str);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strLIZIZ;
    }

    public static Pair LJIIJJI(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Pair(Boolean.TRUE, "");
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static String LIZIZ(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        if (str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(",");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static Pair LJIIL(String str, String str2) {
        x0.LIZ.getClass();
        String strLIZLLL = x0.LIZLLL(str, str2);
        if (!Intrinsics.LJFF(strLIZLLL, str)) {
            return new Pair(Boolean.TRUE, strLIZLLL);
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static Pair LJIILIIL(String str, String str2) {
        x0.LIZ.getClass();
        String strLIZJ = x0.LIZJ(str2, str);
        if (!Intrinsics.LJFF(strLIZJ, str2)) {
            return new Pair(Boolean.TRUE, strLIZJ);
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static Pair LJIILJJIL(String str, String str2) {
        if (!Intrinsics.LJFF(str, str2)) {
            return new Pair(Boolean.TRUE, str);
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static void LJIILL(String str, C0NE1 c0ne1) {
        if (!C294330BgF.LIZ()) {
            return;
        }
        synchronized (LJI) {
            try {
                LIZ.getClass();
                DBUidExtBundle dBUidExtBundleLIZLLL = LIZLLL();
                if (dBUidExtBundleLIZLLL == null) {
                    dBUidExtBundleLIZLLL = new DBUidExtBundle(1, "", "", "", "", "", "");
                }
                Pair pair = new Pair(Boolean.FALSE, "");
                int i = C590490NDz.LIZ[c0ne1.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 5) {
                                throw new C1954807lC();
                            }
                        } else {
                            pair = LJIILJJIL(str, dBUidExtBundleLIZLLL.curUidAllAids);
                        }
                    } else {
                        pair = LJIILIIL(str, dBUidExtBundleLIZLLL.curUidAllAids);
                    }
                }
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    dBUidExtBundleLIZLLL.curUidAllAids = (String) pair.getSecond();
                    LJIL(dBUidExtBundleLIZLLL, C0NE0.CUR_UID_ALL_AIDS, c0ne1);
                    LJIJJ(LIZJ, dBUidExtBundleLIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILLIIL(String str, C0NE1 c0ne1) {
        Pair pairLJIIJ;
        if (!C294330BgF.LIZ()) {
            return;
        }
        synchronized (LJI) {
            try {
                LIZ.getClass();
                DBUidExtBundle dBUidExtBundleLIZLLL = LIZLLL();
                if (dBUidExtBundleLIZLLL == null) {
                    dBUidExtBundleLIZLLL = new DBUidExtBundle(1, "", "", "", "", "", "");
                }
                new Pair(Boolean.FALSE, "");
                int i = C590490NDz.LIZ[c0ne1.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new C1954807lC();
                                }
                                pairLJIIJ = LJIIL(dBUidExtBundleLIZLLL.coldCacheAids, str);
                            } else {
                                pairLJIIJ = LJIIJJI(dBUidExtBundleLIZLLL.coldCacheAids);
                            }
                        } else {
                            pairLJIIJ = LJIILJJIL(str, dBUidExtBundleLIZLLL.coldCacheAids);
                        }
                    } else {
                        pairLJIIJ = LJIILIIL(str, dBUidExtBundleLIZLLL.coldCacheAids);
                    }
                } else {
                    pairLJIIJ = LJIIJ(str, dBUidExtBundleLIZLLL.coldCacheAids, true);
                }
                if (((Boolean) pairLJIIJ.getFirst()).booleanValue()) {
                    dBUidExtBundleLIZLLL.coldCacheAids = (String) pairLJIIJ.getSecond();
                    LJIL(dBUidExtBundleLIZLLL, C0NE0.COLD_CACHE_AIDS, c0ne1);
                    LJIJJ(LIZJ, dBUidExtBundleLIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIZILJ(String str, C0NE1 c0ne1) {
        if (!C294330BgF.LIZ()) {
            return;
        }
        synchronized (LJI) {
            try {
                LIZ.getClass();
                DBUidExtBundle dBUidExtBundleLIZLLL = LIZLLL();
                if (dBUidExtBundleLIZLLL == null) {
                    dBUidExtBundleLIZLLL = new DBUidExtBundle(1, "", "", "", "", "", "");
                }
                Pair pair = new Pair(Boolean.FALSE, "");
                int i = C590490NDz.LIZ[c0ne1.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 5) {
                                throw new C1954807lC();
                            }
                        } else {
                            pair = LJIILJJIL(str, dBUidExtBundleLIZLLL.forOtherAids);
                        }
                    } else {
                        C0NE1 c0ne12 = C0NE1.REMOVE;
                        LJIILLIIL(str, c0ne12);
                        LJIJ(str, c0ne12);
                    }
                }
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    dBUidExtBundleLIZLLL.forOtherAids = (String) pair.getSecond();
                    LJIL(dBUidExtBundleLIZLLL, C0NE0.FOR_OTHER_AIDS, c0ne1);
                    LJIJJ(LIZJ, dBUidExtBundleLIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJ(String str, C0NE1 c0ne1) {
        Pair pairLJIIJ;
        if (!C294330BgF.LIZ()) {
            return;
        }
        synchronized (LJI) {
            try {
                LIZ.getClass();
                DBUidExtBundle dBUidExtBundleLIZLLL = LIZLLL();
                if (dBUidExtBundleLIZLLL == null) {
                    dBUidExtBundleLIZLLL = new DBUidExtBundle(1, "", "", "", "", "", "");
                }
                new Pair(Boolean.FALSE, "");
                int i = C590490NDz.LIZ[c0ne1.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new C1954807lC();
                                }
                                pairLJIIJ = LJIIL(dBUidExtBundleLIZLLL.unconsumedCacheAids, str);
                            } else {
                                pairLJIIJ = LJIIJJI(dBUidExtBundleLIZLLL.unconsumedCacheAids);
                            }
                        } else {
                            pairLJIIJ = LJIILJJIL(str, dBUidExtBundleLIZLLL.unconsumedCacheAids);
                        }
                    } else {
                        pairLJIIJ = LJIILIIL(str, dBUidExtBundleLIZLLL.unconsumedCacheAids);
                    }
                } else {
                    pairLJIIJ = LJIIJ(str, dBUidExtBundleLIZLLL.unconsumedCacheAids, false);
                }
                if (((Boolean) pairLJIIJ.getFirst()).booleanValue()) {
                    dBUidExtBundleLIZLLL.unconsumedCacheAids = (String) pairLJIIJ.getSecond();
                    LJIL(dBUidExtBundleLIZLLL, C0NE0.UNCONSUMED_CACHE_AIDS, c0ne1);
                    LJIJJ(LIZJ, dBUidExtBundleLIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJJ(String str, DBUidExtBundle dBUidExtBundle) {
        C590420NDs.LIZ.getClass();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590420NDs.LIZLLL(), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.contains(str)) {
            C590420NDs c590420NDs = C590420NDs.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(",");
            c590420NDs.getClass();
            sbLIZ.append(C590420NDs.LIZLLL());
            C590420NDs.LJI().storeString("db_bundle_uid_index", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!Intrinsics.LJFF(dBUidExtBundle.uid, str)) {
            dBUidExtBundle.uid = str;
        }
        if (Intrinsics.LJFF(str, LIZJ)) {
            LIZLLL = dBUidExtBundle;
        }
        LJ.put(str, dBUidExtBundle);
        C590420NDs.LIZ.getClass();
        try {
            Keva kevaLJI = C590420NDs.LJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("db_uid_ext_bundle_");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C1227904rF.LIZ.getClass();
            kevaLJI.storeString(strLIZIZ, C1227904rF.LJ().LJIILL(dBUidExtBundle));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (C797930VRv.LIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("persistCurrentBundle bundle=");
            sbLIZ3.append(dBUidExtBundle);
            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static void LJIJJLI(String str, String str2) {
        DBUidExtBundle dBUidExtBundle = LJ.get(str);
        if (dBUidExtBundle == null) {
            return;
        }
        Pair pairLJIILIIL = LJIILIIL(str2, dBUidExtBundle.curUidAllAids);
        if (!((Boolean) pairLJIILIIL.getFirst()).booleanValue()) {
            return;
        }
        dBUidExtBundle.curUidAllAids = (String) pairLJIILIIL.getSecond();
        LJIL(dBUidExtBundle, C0NE0.CUR_UID_ALL_AIDS, C0NE1.REMOVE);
        LJIJJ(str, dBUidExtBundle);
    }

    public static Pair LJIIJ(String str, String str2, boolean z) {
        x0.LIZ.getClass();
        String strLIZJ = x0.LIZJ(str, str2);
        if (strLIZJ.length() > 0) {
            if (z) {
                return new Pair(Boolean.TRUE, LIZIZ(strLIZJ, str2));
            }
            return new Pair(Boolean.TRUE, LIZIZ(str2, strLIZJ));
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static String LJIJI(String str, String str2, boolean z) {
        x0.LIZ.getClass();
        String strLIZLLL = x0.LIZLLL(str, str2);
        String strLIZJ = x0.LIZJ(str2, str);
        if (z) {
            return LIZIZ(strLIZJ, strLIZLLL);
        }
        return LIZIZ(strLIZLLL, strLIZJ);
    }

    public static void LJIL(DBUidExtBundle dBUidExtBundle, C0NE0 c0ne0, C0NE1 c0ne1) {
        int i = C590490NDz.LIZIZ[c0ne0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            dBUidExtBundle.forOtherAids = LJIJI(dBUidExtBundle.forOtherAids, LIZIZ(dBUidExtBundle.eliminateAids, dBUidExtBundle.unconsumedCacheAids), true);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    dBUidExtBundle.curUidAllAids = LJIJI(dBUidExtBundle.curUidAllAids, LIZIZ(dBUidExtBundle.coldCacheAids, dBUidExtBundle.unconsumedCacheAids), false);
                    x0 x0Var = x0.LIZ;
                    String str = dBUidExtBundle.eliminateAids;
                    String strLIZIZ = LIZIZ(dBUidExtBundle.coldCacheAids, dBUidExtBundle.unconsumedCacheAids);
                    x0Var.getClass();
                    String strLIZLLL = x0.LIZLLL(str, strLIZIZ);
                    dBUidExtBundle.eliminateAids = strLIZLLL;
                    dBUidExtBundle.forOtherAids = LJIJI(dBUidExtBundle.forOtherAids, LIZIZ(strLIZLLL, dBUidExtBundle.unconsumedCacheAids), true);
                    return;
                }
                x0 x0Var2 = x0.LIZ;
                String str2 = dBUidExtBundle.eliminateAids;
                String strLIZIZ2 = LIZIZ(dBUidExtBundle.coldCacheAids, dBUidExtBundle.unconsumedCacheAids);
                x0Var2.getClass();
                dBUidExtBundle.eliminateAids = x0.LIZLLL(str2, strLIZIZ2);
                if (c0ne1 == C0NE1.REPLACE) {
                    dBUidExtBundle.curUidAllAids = LIZIZ(dBUidExtBundle.coldCacheAids, dBUidExtBundle.unconsumedCacheAids);
                } else {
                    dBUidExtBundle.curUidAllAids = LJIJI(dBUidExtBundle.curUidAllAids, LIZIZ(dBUidExtBundle.coldCacheAids, dBUidExtBundle.unconsumedCacheAids), true);
                }
                dBUidExtBundle.forOtherAids = LJIJI(dBUidExtBundle.forOtherAids, LIZIZ(dBUidExtBundle.eliminateAids, dBUidExtBundle.unconsumedCacheAids), true);
                return;
            }
            return;
        }
        x0 x0Var3 = x0.LIZ;
        String str3 = dBUidExtBundle.forOtherAids;
        String str4 = dBUidExtBundle.curUidAllAids;
        x0Var3.getClass();
        dBUidExtBundle.forOtherAids = x0.LIZLLL(str3, str4);
        dBUidExtBundle.coldCacheAids = x0.LIZLLL(dBUidExtBundle.curUidAllAids, dBUidExtBundle.coldCacheAids);
        dBUidExtBundle.unconsumedCacheAids = x0.LIZLLL(dBUidExtBundle.curUidAllAids, dBUidExtBundle.unconsumedCacheAids);
        dBUidExtBundle.eliminateAids = x0.LIZLLL(dBUidExtBundle.curUidAllAids, dBUidExtBundle.eliminateAids);
    }
}
