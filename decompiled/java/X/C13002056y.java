package X;

import Y.AfS171S0100000_2;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.FrequencyControlAPI;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySceneConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.056y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13002056y {
    public static AnonymousClass0571 LIZLLL;
    public static volatile C11JF LJII;
    public static volatile String LJIIIIZZ;
    public static final C13002056y LIZ = new C13002056y();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1191));
    public static final Object LIZJ = new Object();
    public static volatile Map<String, FrequencySceneConfig> LJ = C2097608Jq.LJ();
    public static volatile long LJFF = -1;
    public static volatile long LJI = -1;

    static {
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.056x
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String str;
                if (!z) {
                    return;
                }
                if (i != 1) {
                    if (i == 3) {
                        C13002056y.LIZ.getClass();
                        C13003056z.LIZ.getClass();
                        C13003056z.LIZLLL();
                        C13000056w.LJI();
                        C12998056u.LIZJ();
                        C12985056h.LIZJ();
                        synchronized (C13002056y.LIZJ) {
                            try {
                                C11JF c11jf = C13002056y.LJII;
                                if (c11jf != null) {
                                    c11jf.dispose();
                                }
                                C13002056y.LJII = null;
                                C13002056y.LIZLLL = null;
                                C13002056y.LJIIIIZZ = null;
                                C13002056y.LJ = C2097608Jq.LJ();
                                C13002056y.LJFF = -1L;
                                C13002056y.LJI = -1L;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                }
                C13002056y c13002056y = C13002056y.LIZ;
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                c13002056y.getClass();
                if (curUserId.length() != 0) {
                    if (Intrinsics.LJFF(C13002056y.LJIIIIZZ, curUserId)) {
                        AnonymousClass0571 anonymousClass0571 = C13002056y.LIZLLL;
                        if (anonymousClass0571 != null) {
                            str = anonymousClass0571.LIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, curUserId)) {
                            return;
                        }
                    }
                    if (Intrinsics.LJFF(curUserId, null) && jCurrentTimeMillis - 0 < 3000) {
                        return;
                    }
                }
                C13002056y.LJ();
            }
        });
    }

    public static AnonymousClass0571 LIZIZ() {
        List list;
        Object c098200Yq;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        AnonymousClass0571 anonymousClass0571 = LIZLLL;
        if (anonymousClass0571 != null) {
            if (Intrinsics.LJFF(anonymousClass0571.LIZ, curUserId) && Intrinsics.LJFF(LJIIIIZZ, curUserId)) {
                return anonymousClass0571;
            }
            if (!Intrinsics.LJFF(anonymousClass0571.LIZ, curUserId)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ensureDataSourceLocked: uid drift old=");
                sbLIZ.append(anonymousClass0571.LIZ);
                sbLIZ.append(" new=");
                sbLIZ.append(curUserId);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        C11JF c11jf = LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJII = null;
        LJ = C2097608Jq.LJ();
        LJFF = -1L;
        LJI = -1L;
        if (anonymousClass0571 == null || !Intrinsics.LJFF(anonymousClass0571.LIZ, curUserId)) {
            anonymousClass0571 = new AnonymousClass0571(curUserId);
            LIZLLL = anonymousClass0571;
        }
        if (anonymousClass0571.LIZ().contains("scenes_json")) {
            String string = anonymousClass0571.LIZ().getString("scenes_json", "");
            if (string == null || string.length() == 0) {
                list = C13BV.INSTANCE;
            } else {
                try {
                    c098200Yq = (List) anonymousClass0571.LIZIZ.LJIIIIZZ(string, AnonymousClass0571.LIZLLL);
                    if (c098200Yq == null) {
                        c098200Yq = C13BV.INSTANCE;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getScenes: parse failed, clearing cache error_json=");
                    sbLIZ2.append(string);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    anonymousClass0571.LIZ().erase("scenes_json");
                }
                C13BV c13bv = C13BV.INSTANCE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = c13bv;
                }
                list = (List) c098200Yq;
            }
            LJIIJ(list, anonymousClass0571.LIZ().getLong("sync_interval", -1L), anonymousClass0571.LIZ().getLong("sync_conv_limit", -1L));
        }
        LJIIIIZZ = curUserId;
        LJ.size();
        return anonymousClass0571;
    }

    public static void LIZJ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (Intrinsics.LJFF(LJIIIIZZ, curUserId)) {
            AnonymousClass0571 anonymousClass0571 = LIZLLL;
            if (Intrinsics.LJFF(anonymousClass0571 != null ? anonymousClass0571.LIZ : null, curUserId)) {
                return;
            }
        }
        synchronized (LIZJ) {
            try {
                LIZ.getClass();
                LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0571] */
    public static void LJI() {
        C259800zU c259800zU = new C259800zU();
        Object obj = LIZJ;
        synchronized (obj) {
            try {
                LIZ.getClass();
                c259800zU.element = LIZIZ();
                C11JF c11jf = LJII;
                if (c11jf != null) {
                    if (!c11jf.isDisposed()) {
                        return;
                    }
                }
                InterfaceC420801kM interfaceC420801kMLJJLL = ((FrequencyControlAPI) LIZIZ.getValue()).configGet(null).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS171S0100000_2(c259800zU, 58), new C09JN() { // from class: X.0570
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("FrequencyControlConfigManager@3158.refreshAsync$disposable$2");
                        synchronized (C13002056y.LIZJ) {
                            try {
                                C13002056y.LJII = null;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C13003056z.LIZ.LIZJ(false);
                        C1C7U.LIZIZ("FrequencyControlConfigManager@3158.refreshAsync$disposable$2");
                    }
                });
                synchronized (obj) {
                    try {
                        LJII = (C11JF) interfaceC420801kMLJJLL;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static void LIZ() {
        if (!C143500gj.LIZ()) {
            C13000056w.LJI();
            return;
        }
        Set<String> setKeySet = LJ.keySet();
        synchronized (C12985056h.LIZ) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : setKeySet) {
                    C12996056s c12996056sLIZIZ = C12985056h.LIZIZ(str);
                    if (c12996056sLIZIZ != null) {
                        linkedHashMap.put(str, c12996056sLIZIZ);
                    }
                }
                C12985056h.LIZIZ = linkedHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C13000056w.LIZLLL();
    }

    public static void LJ() {
        if (!C143500gj.LIZ()) {
            C13000056w.LJI();
            C13003056z.LIZ.getClass();
            C13003056z.LIZLLL();
            return;
        }
        synchronized (LIZJ) {
            try {
                LIZ.getClass();
                LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C13003056z.LIZ.LIZJ(false);
        LJI();
    }

    public static long LIZLLL(String str) {
        boolean z;
        AnonymousClass0571 anonymousClass0571;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0L;
        }
        LIZJ();
        synchronized (LIZJ) {
            try {
                anonymousClass0571 = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (anonymousClass0571 == null || str.length() == 0) {
            return 0L;
        }
        Keva kevaLIZ = anonymousClass0571.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync_at_ms_");
        sbLIZ.append(str);
        return kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static boolean LJFF(String str, String str2) {
        AnonymousClass0571 anonymousClass0571;
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        LIZJ();
        synchronized (LIZJ) {
            try {
                anonymousClass0571 = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (anonymousClass0571 == null || str.length() == 0 || str2.length() == 0) {
            return false;
        }
        Keva kevaLIZ = anonymousClass0571.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync_migrate_done_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LJII(long j, String str) {
        AnonymousClass0571 anonymousClass0571;
        LIZJ();
        synchronized (LIZJ) {
            try {
                anonymousClass0571 = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (anonymousClass0571 == null) {
            return;
        }
        if (str != null && !Intrinsics.LJFF(anonymousClass0571.LIZ, str)) {
            return;
        }
        anonymousClass0571.LIZ().storeLong("last_full_batch_sync_ms", j);
    }

    public static void LJIIIZ(String str, String str2) {
        AnonymousClass0571 anonymousClass0571;
        if (str.length() != 0 && str2.length() != 0) {
            LIZJ();
            synchronized (LIZJ) {
                try {
                    anonymousClass0571 = LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (anonymousClass0571 != null && str.length() != 0 && str2.length() != 0) {
                Keva kevaLIZ = anonymousClass0571.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sync_migrate_done_");
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(str2);
                kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setSyncMigrateDone: identityId=");
                sbLIZ2.append(anonymousClass0571.LIZ);
                sbLIZ2.append(" scene=");
                sbLIZ2.append(str);
                sbLIZ2.append(" taskId=");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }

    public static void LJIIIIZZ(C13002056y c13002056y, String str, long j) {
        AnonymousClass0571 anonymousClass0571;
        c13002056y.getClass();
        if (str.length() != 0) {
            LIZJ();
            synchronized (LIZJ) {
                try {
                    anonymousClass0571 = LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (anonymousClass0571 != null && str.length() != 0) {
                Keva kevaLIZ = anonymousClass0571.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sync_at_ms_");
                sbLIZ.append(str);
                kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
            }
        }
    }

    public static void LJIIJ(List list, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((FrequencySceneConfig) obj).scene;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList) {
            String str2 = ((FrequencySceneConfig) obj2).scene;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str2, obj2);
        }
        LJ = linkedHashMap;
        LJFF = j;
        LJI = j2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMemoryCache: scenes=");
        sbLIZ.append(LJ.size());
        sbLIZ.append(" fullBatchSyncIntervalSec=");
        sbLIZ.append(j);
        sbLIZ.append(" syncConvLimit=");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
