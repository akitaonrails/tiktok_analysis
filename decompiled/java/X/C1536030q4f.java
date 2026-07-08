package X;

import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536030q4f {
    public static final C1536030q4f LIZ = new C1536030q4f();
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final C01GW LIZLLL;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        LIZIZ = timeUnit.toMillis(7L);
        LIZJ = timeUnit.toMillis(1L);
        LIZLLL = C452501pT.LIZIZ(new C1536160q4s());
        C1532960pzi.LIZIZ(new Runnable() { // from class: X.0q4p
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JsCodeCacheMetadataStore@f6f4.<init>$1");
                try {
                    C1536030q4f.LIZ.getClass();
                    C1536030q4f.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JsCodeCacheMetadataStore@f6f4.<init>$1");
            }
        });
    }

    public static Keva LJ() {
        return (Keva) LIZLLL.getValue();
    }

    public static void LIZ() throws JSONException {
        Long lValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        Object c098200Yq = null;
        if (interfaceC1532860pzY == null || (lValueOf = Long.valueOf(interfaceC1532860pzY.getAppStartTime())) == null || jCurrentTimeMillis - lValueOf.longValue() < 30000) {
            C1532960pzi.LIZJ(180000L, new Runnable() { // from class: X.0q4q
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("JsCodeCacheMetadataStore@f6f4.cleanAndDoStatistics$1");
                    try {
                        C1536030q4f.LIZ.getClass();
                        C1536030q4f.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("JsCodeCacheMetadataStore@f6f4.cleanAndDoStatistics$1");
                }
            });
            return;
        }
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(C08QA.LJIIZILJ(new C0VSJ(C1529330ptr.LIZ(), "js_code_cache"))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (C1535630q41.LJJ > 0 && jCurrentTimeMillis - LJ().getLong("lynx_cache_deleted_time", 0L) > LIZIZ) {
            try {
                if (C08QA.LJIIZILJ(new C0VSJ(C1529330ptr.LIZ(), "quickjs_cache"))) {
                    LJ().storeLong("lynx_cache_deleted_time", jCurrentTimeMillis);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        File fileLIZIZ = AbstractC1536120q4o.LIZIZ.LIZIZ();
        if (fileLIZIZ.isDirectory()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            long[] jArr = new long[2];
            try {
                File[] fileArrListFiles = fileLIZIZ.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isDirectory()) {
                            if (Intrinsics.LJFF(file.getName(), "cdn")) {
                                LIZIZ(jCurrentTimeMillis, file, jSONObject, jSONArray2, jSONArray, jArr);
                            } else {
                                LIZJ(jCurrentTimeMillis, file, jSONObject, jSONArray2, jSONArray, jArr);
                            }
                        }
                    }
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1536180q4u.LIZJ.LIZIZ("JsCodeCacheMetadataStore", "cleanAndDoStatistics", "cleanup failed");
                jSONObject.put("error", thM5exceptionOrNullimpl.getMessage());
            }
            if (C19994513Lb.LIZIZ(jCurrentTimeMillis).nextFloat() > ForestExperiment.INSTANCE.getDeepCleanThreshold()) {
                jSONObject.put("deleted_entries", jSONArray);
                jSONObject.put("remained_entries", jSONArray2);
                jSONObject.put("occupied_size", jArr[0]);
                jSONObject.put("deleted_size", jArr[1]);
                C1536040q4g.LIZ(jSONObject, System.currentTimeMillis() - jCurrentTimeMillis);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : LJ().getAllKey()) {
                String strLJL = a0.LJL(str, "_", str);
                if (hashSet.contains(strLJL)) {
                    LIZ.getClass();
                    LJ().erase(str);
                } else if (!new C0VSJ(fileLIZIZ, strLJL).isDirectory()) {
                    hashSet.add(strLJL);
                    LIZ.getClass();
                    LJ().erase(str);
                }
            }
            jSONObject.put("deep_clean", true);
            jSONObject.put("occupied_size", jArr[0]);
            jSONObject.put("deleted_size", jArr[1]);
            jSONObject.put("deleted_entries", jSONArray);
            jSONObject.put("remained_entries", jSONArray2);
            C1536040q4g.LIZ(jSONObject, System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }

    public static void LJFF(AbstractC1536120q4o abstractC1536120q4o) {
        String strLIZIZ = abstractC1536120q4o.LIZIZ();
        Keva kevaLJ = LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("_url");
        kevaLJ.storeStringJustDisk(C2188811AlT.LIZIZ(sbLIZ), abstractC1536120q4o.LJ());
        Keva kevaLJ2 = LJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("_total");
        kevaLJ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        Keva kevaLJ3 = LJ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("_recent");
        kevaLJ3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
    }

    public static void LIZIZ(long j, File file, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, long[] jArr) throws JSONException {
        Object c098200Yq;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(C08QA.LJIIZILJ(file)));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (j - file2.lastModified() > 100000 && a0.LJJIIZI(name, "_tmp", false)) {
                C08QA.LJIIZILJ(file2);
            } else {
                try {
                    c098200Yq = new C0VSJ(C1529330ptr.LIZ(), name);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                File file3 = (File) c098200Yq;
                if (file3 != null) {
                    if (file3.isFile()) {
                        LIZ.getClass();
                        LIZLLL(file2, j, null, jSONObject, jSONArray, jSONArray2, name, jArr);
                    } else {
                        LIZ.getClass();
                        LIZLLL(file2, j, "raw file deleted", jSONObject, jSONArray, jSONArray2, name, jArr);
                    }
                }
            }
        }
    }

    public static void LIZJ(long j, File file, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, long[] jArr) throws JSONException {
        File file2;
        boolean z;
        File[] fileArrListFiles;
        String str;
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 == null) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(C08QA.LJIIZILJ(file)));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        boolean z2 = false;
        if (fileArrListFiles2.length > 1) {
            long j2 = 0;
            file2 = null;
            for (File file3 : fileArrListFiles2) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(file3.getName());
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    if (jLongValue > j2) {
                        file2 = file3;
                        j2 = jLongValue;
                    }
                }
            }
        } else {
            file2 = null;
        }
        int length = fileArrListFiles2.length;
        int i = 0;
        while (i < length) {
            File file4 = fileArrListFiles2[i];
            if (file4.isDirectory()) {
                if (file2 != null && file4 != file2) {
                    z = true;
                } else {
                    z = false;
                }
                File[] fileArrListFiles3 = file4.listFiles();
                if (fileArrListFiles3 == null) {
                    C08QA.LJIIZILJ(file4);
                } else {
                    int length2 = fileArrListFiles3.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        File file5 = fileArrListFiles3[i2];
                        String name = file5.getName();
                        if (j - file5.lastModified() > 100000 && a0.LJJIIZI(name, "_tmp", z2)) {
                            C08QA.LJIIZILJ(file5);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(file.getName());
                            String str2 = File.separator;
                            sbLIZ.append(str2);
                            sbLIZ.append(file4.getName());
                            sbLIZ.append(str2);
                            sbLIZ.append(name);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C1536030q4f c1536030q4f = LIZ;
                            if (z) {
                                str = "raw file expired";
                            } else {
                                str = null;
                            }
                            c1536030q4f.getClass();
                            LIZLLL(file5, j, str, jSONObject, jSONArray, jSONArray2, strLIZIZ, jArr);
                        }
                        i2++;
                        z2 = false;
                    }
                    if (z || (fileArrListFiles = file4.listFiles()) == null || fileArrListFiles.length == 0) {
                        try {
                            C189200o6.m2constructorimpl(Boolean.valueOf(file4.delete()));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                }
            }
            i++;
            z2 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca A[PHI: r7
      0x00ca: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:9:0x00c8, B:29:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.io.File r18, long r19, java.lang.String r21, org.json.JSONObject r22, org.json.JSONArray r23, org.json.JSONArray r24, java.lang.String r25, long[] r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536030q4f.LIZLLL(java.io.File, long, java.lang.String, org.json.JSONObject, org.json.JSONArray, org.json.JSONArray, java.lang.String, long[]):void");
    }
}
