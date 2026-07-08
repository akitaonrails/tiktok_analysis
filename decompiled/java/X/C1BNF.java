package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BNF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNF {
    public static Keva LIZ;
    public static Keva LIZIZ;
    public static long LIZLLL;
    public static final Gson LIZJ = GsonUtils.LIZ();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static final Keva LIZIZ(Uri uri) {
        String strLIZJ;
        if (!C2203961BNq.LIZ().isCacheEnabled || uri == null || (strLIZJ = C1953107kv.LIZJ(uri, null)) == null || strLIZJ.length() == 0) {
            return null;
        }
        return LIZJ(strLIZJ);
    }

    public static final Keva LIZJ(String str) {
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva = LIZ;
        if (keva == null) {
            keva = null;
        }
        if (keva.contains(str)) {
            Keva keva2 = LIZ;
            if (keva2 == null) {
                keva2 = null;
            }
            String string = keva2.getString(str, "");
            if (string.length() > 0) {
                return Keva.getRepo(string);
            }
        }
        return null;
    }

    public static final IPiaCacheProvider.CacheConfig LJI(n nVar) {
        Object c098200Yq;
        if (nVar == null) {
            return null;
        }
        try {
            c098200Yq = (IPiaCacheProvider.CacheConfig) GsonUtils.LIZ().LJII(nVar.LJJIJ("cache").toString(), IPiaCacheProvider.CacheConfig.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IPiaCacheProvider.CacheConfig cacheConfig = (IPiaCacheProvider.CacheConfig) c098200Yq;
        if (cacheConfig == null || TextUtils.isEmpty(cacheConfig.version)) {
            return null;
        }
        return cacheConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[PHI: r4
      0x0095: PHI (r4v7 X.1BNJ) = (r4v5 X.1BNJ), (r4v4 X.1BNJ) binds: [B:40:0x0093, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1BNJ LJII(android.net.Uri r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BNF.LJII(android.net.Uri):X.1BNJ");
    }

    public static final String LJIIIIZZ(String str) {
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva = LIZIZ;
        if (keva == null) {
            keva = null;
        }
        if (!keva.contains(str)) {
            return null;
        }
        Keva keva2 = LIZIZ;
        if (keva2 == null) {
            keva2 = null;
        }
        String string = keva2.getString(str, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    public static void LJIIJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PIACacheManager] Remove ALL Cache. (URL: ");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ), null);
        Keva kevaLIZJ = LIZJ(str);
        if (kevaLIZJ != null) {
            Iterator<Map.Entry<String, ?>> it2 = kevaLIZJ.getAll().entrySet().iterator();
            while (it2.hasNext()) {
                LIZ(kevaLIZJ, it2.next().getKey());
            }
            kevaLIZJ.clear();
        }
        LJIIL(str);
    }

    public static void LJIIL(String str) {
        Keva keva = LIZ;
        Keva keva2 = null;
        if (keva == null) {
            keva = null;
        }
        keva.erase(str);
        Keva keva3 = LIZ;
        if (keva3 != null) {
            keva2 = keva3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_extraVary");
        keva2.erase(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final boolean LIZ(Keva keva, String str) {
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get() || !LJFF(keva, str)) {
            return false;
        }
        keva.erase(str);
        Keva keva2 = LIZIZ;
        Keva keva3 = null;
        if (keva2 == null) {
            keva2 = null;
        }
        keva2.erase(str);
        Keva keva4 = LIZIZ;
        if (keva4 != null) {
            keva3 = keva4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_headers");
        keva3.erase(C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public static void LIZLLL(String str, List list) {
        Keva keva = LIZ;
        Keva keva2 = null;
        if (keva == null) {
            keva = null;
        }
        keva.storeString(str, UUID.randomUUID().toString());
        if (list != null) {
            Keva keva3 = LIZ;
            if (keva3 != null) {
                keva2 = keva3;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_extraVary");
            keva2.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), (String[]) list.toArray(new String[0]));
        }
    }

    public static boolean LJFF(Keva keva, String str) {
        if (keva.contains(str)) {
            Keva keva2 = LIZIZ;
            if (keva2 == null) {
                keva2 = null;
            }
            if (keva2.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final IPiaCacheProvider.CacheConfig LJIIIZ(Keva keva, String str) {
        Object objLIZJ;
        Object c098200Yq;
        n nVar;
        String string;
        Object c098200Yq2;
        Object obj = null;
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva2 = LIZIZ;
        if (keva2 == null) {
            keva2 = null;
        }
        if (!keva2.contains(str)) {
            return null;
        }
        if (keva != null) {
            if (!keva.contains(str) || (string = keva.getString(str, "")) == null || string.length() == 0) {
                return null;
            }
            try {
                c098200Yq2 = (IPiaCacheProvider.CacheConfig) LIZJ.LJII(string, IPiaCacheProvider.CacheConfig.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
        } else {
            Keva keva3 = LIZIZ;
            if (keva3 == null) {
                keva3 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_headers");
            String string2 = keva3.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            try {
                GsonUtils.LIZIZ.getClass();
                k kVarLIZJ = p.LIZJ(string2);
                if ((kVarLIZJ instanceof n) && (nVar = (n) kVarLIZJ) != null) {
                    objLIZJ = LIZJ.LIZJ(nVar, IPiaCacheProvider.CacheConfig.class);
                    obj = Unit.LIZ;
                } else {
                    objLIZJ = null;
                }
            } catch (Throwable th2) {
                th = th2;
                objLIZJ = obj;
            }
            try {
                C189200o6.m2constructorimpl(obj);
                c098200Yq = obj;
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            obj = objLIZJ;
            C189200o6.m1boximpl(c098200Yq);
        }
        return (IPiaCacheProvider.CacheConfig) obj;
    }

    public static final C1BNJ LJIIJ(Keva keva, String str) {
        IPiaCacheProvider.CacheConfig cacheConfigLJIIIZ;
        String strLJIIIIZZ;
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get() || !LJFF(keva, str) || (cacheConfigLJIIIZ = LJIIIZ(keva, str)) == null || (strLJIIIIZZ = LJIIIIZZ(str)) == null) {
            return null;
        }
        return new C1BNJ(str, strLJIIIIZZ, cacheConfigLJIIIZ);
    }

    public static void LJ(Uri uri, IPiaCacheProvider iPiaCacheProvider, boolean z) {
        Keva kevaLIZIZ;
        if (iPiaCacheProvider != null && (kevaLIZIZ = LIZIZ(uri)) != null && LJFF(kevaLIZIZ, iPiaCacheProvider.LIZ())) {
            iPiaCacheProvider.LIZIZ().marked = Boolean.valueOf(z);
            LJIILJJIL(iPiaCacheProvider.LIZ(), iPiaCacheProvider.LIZIZ().LIZ(), iPiaCacheProvider.LIZJ(), kevaLIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[PIACacheManager] Finish Cache Mark. (URL: ");
            sbLIZ.append(iPiaCacheProvider.LIZ());
            sbLIZ.append(", CacheConfig: ");
            sbLIZ.append(iPiaCacheProvider.LIZIZ());
            sbLIZ.append(')');
            C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIILIIL(android.net.Uri r9, java.lang.String r10, com.google.gson.n r11, java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BNF.LJIILIIL(android.net.Uri, java.lang.String, com.google.gson.n, java.util.List):boolean");
    }

    public static void LJIILJJIL(String str, n nVar, String str2, Keva keva) {
        Keva keva2 = LIZIZ;
        if (keva2 == null) {
            keva2 = null;
        }
        synchronized (keva2) {
            try {
                keva.storeString(str, nVar.toString());
                Keva keva3 = LIZIZ;
                if (keva3 == null) {
                    keva3 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_headers");
                keva3.storeString(C2188811AlT.LIZIZ(sbLIZ), nVar.toString());
                Keva keva4 = LIZIZ;
                if (keva4 == null) {
                    keva4 = null;
                }
                keva4.storeString(str, str2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[PIACacheManager] Save Cache Success. (URL = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", CacheConfig: ");
                sbLIZ2.append(nVar);
                sbLIZ2.append(')');
                C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ2), null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LJIILL(final Uri uri, final IPiaCacheProvider iPiaCacheProvider, final n nVar, final String str) {
        if (!C2203961BNq.LIZ().isCacheEnabled || !LJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PIACacheManager] Begin to Validate Cache. (URL: ");
        sbLIZ.append(uri);
        sbLIZ.append(')');
        C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ), null);
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNG
            /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x0096, PHI: r0
              0x0041: PHI (r0v14 com.bytedance.pia.core.cache.IPiaCacheProvider) = (r0v13 com.bytedance.pia.core.cache.IPiaCacheProvider), (r0v20 com.bytedance.pia.core.cache.IPiaCacheProvider) binds: [B:19:0x003c, B:21:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000f, B:6:0x0015, B:10:0x001e, B:13:0x0025, B:16:0x0032, B:18:0x0038, B:22:0x0041, B:24:0x0047, B:26:0x004b, B:28:0x0051, B:31:0x0090, B:29:0x006b, B:30:0x006e), top: B:39:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000f, B:6:0x0015, B:10:0x001e, B:13:0x0025, B:16:0x0032, B:18:0x0038, B:22:0x0041, B:24:0x0047, B:26:0x004b, B:28:0x0051, B:31:0x0090, B:29:0x006b, B:30:0x006e), top: B:39:0x000f }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 202
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BNG.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PIACacheManager@be5d.update$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PIACacheManager@be5d.update$1");
            }
        });
    }
}
