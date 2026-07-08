package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.FilenameFilter;
import java.io.ObjectInputStream;
import java.util.Map;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802450Vdr {
    public static String LJ(long j, long j2) {
        float f = j2;
        float f2 = j;
        return f > 0.95f * f2 ? "(95% - 100%]" : f > 0.9f * f2 ? "(90% - 95%]" : f > 0.8f * f2 ? "(80% - 90%]" : f > 0.7f * f2 ? "(70% - 80%]" : f > 0.6f * f2 ? "(60% - 70%]" : f > f2 * 0.5f ? "(50% - 60%]" : "(0% - 50%]";
    }

    public static String LJII(long j) {
        return j < 0 ? "( - 0s)" : j < 60000 ? "(0s - 1m)" : j < 600000 ? "[1m - 10m)" : j < 3600000 ? "[10m - 1h)" : j < 10800000 ? "[1h - 3h)" : j < 43200000 ? "[3h - 12h)" : j < 86400000 ? "[12h - 1d)" : j < 259200000 ? "[1d - 3d)" : j < 604800000 ? "[3d - 7d)" : j < 1209600000 ? "[7d - 14d)" : j < 2592000000L ? "[14d - 30d)" : "[30d - )";
    }

    public static String LJFF(long j) {
        C802910Veb c802910Veb = new C802910Veb("MB");
        c802910Veb.LIZJ(new Long[]{0L, 1L, 64L, 128L, 256L, 384L, 512L, 768L, 1024L, 1536L});
        return c802910Veb.LIZ(j);
    }

    public static String LJI(String str) {
        try {
            long j = CastLongProtector.parseLong(str);
            if (j <= 0) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            if (j <= 30000) {
                return "0s < t <= 30s";
            }
            if (j <= 60000) {
                return "30s < t <= 1min";
            }
            if (j <= 120000) {
                return "1min < t <= 2min";
            }
            if (j <= 180000) {
                return "2min < t <= 3min";
            }
            if (j <= 240000) {
                return "3min < t <= 4min";
            }
            if (j <= 300000) {
                return "4min < t <= 5min";
            }
            return "t > 5min";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "none";
        }
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        String strReplaceAll;
        ObjectInputStream objectInputStream;
        String strOptString = jSONObject2.optString("process_name");
        final long jOptLong = jSONObject2.optLong("app_start_time");
        if (!TextUtils.isEmpty(strOptString) && jOptLong != 0) {
            if (C802270VdZ.LJFF(C0VX9.LJ(), strOptString)) {
                strReplaceAll = "main";
            } else {
                strReplaceAll = strOptString.replaceAll(":", e3.g);
            }
            File[] fileArrListFiles = new C0VSJ(new C0VSJ(C0VX9.LJFF(), "tags"), strReplaceAll).listFiles(new FilenameFilter() { // from class: X.08Aa
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (Math.abs(CastLongProtector.parseLong(str.split("_")[2].substring(0, r1.length() - 4)) - jOptLong) >= 1000) {
                        return false;
                    }
                    return true;
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length >= 1) {
                try {
                    objectInputStream = new ObjectInputStream(new C0VSP(fileArrListFiles[0]));
                    try {
                        Map map = (Map) objectInputStream.readObject();
                        if (map != null) {
                            C0VJO.LJII(jSONObject, map);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C798010VSd.LIZ(objectInputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
                C798010VSd.LIZ(objectInputStream);
            }
        }
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        long j;
        boolean z;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("app_memory_info");
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("max_memory");
                long jOptLong2 = jSONObjectOptJSONObject.optLong("free_memory");
                long jOptLong3 = jSONObjectOptJSONObject.optLong("total_memory");
                long j2 = jOptLong3 - jOptLong2;
                if (j2 > 0) {
                    C802910Veb c802910Veb = new C802910Veb("MB");
                    c802910Veb.LIZIZ(512L, 64L);
                    C0VJO.LIZIZ("java_heap_range", c802910Veb.LIZ(j2 / 1048576), jSONObject);
                    if (jOptLong > j2) {
                        C0VJO.LIZIZ("java_heap_alloc_usage", LJ(jOptLong3, j2), jSONObject);
                        C0VJO.LIZIZ("java_heap_usage", LJ(jOptLong, jOptLong3), jSONObject);
                    }
                    j = 0;
                } else {
                    j = 0;
                }
                if (jOptLong > j) {
                    C0VJO.LIZIZ("java_runtime_max_memory", String.valueOf(jOptLong / 1048576), jSONObject);
                }
                if (j2 > jOptLong * 0.95f) {
                    z = true;
                } else {
                    z = false;
                }
                C0VJO.LIZIZ("java_heap_leak", String.valueOf(z), jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        LIZJ(jSONObject, jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("app_memory_info");
        if (jSONObjectOptJSONObject != null) {
            long jOptLong = jSONObjectOptJSONObject.optLong("native_heap_size");
            C0VJO.LIZIZ("native_heap_range", LJFF(jOptLong), jSONObject);
            if (jOptLong > 0) {
                C0VJO.LIZIZ("native_heap_range", LJFF(jOptLong), jSONObject);
                boolean z2 = true;
                if (jOptLong > 268435456) {
                    z = true;
                } else {
                    z = false;
                }
                C0VJO.LIZJ(jSONObject, "native_heap_leak", Boolean.valueOf(z));
                long jOptLong2 = jSONObjectOptJSONObject.optLong("native_heap_alloc_size");
                if (jOptLong2 > 0) {
                    if (jOptLong2 <= 268435456) {
                        z2 = false;
                    }
                    C0VJO.LIZJ(jSONObject, "native_heap_alloc_leak", Boolean.valueOf(z2));
                    C0VJO.LIZIZ("native_heap_alloc_usage", LJ(jOptLong, jOptLong2), jSONObject);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("memory_info");
        if (jSONObjectOptJSONObject2 != null) {
            long jOptLong3 = jSONObjectOptJSONObject2.optLong("totalPss");
            if (jOptLong3 > 0) {
                C0VJO.LIZIZ("total_pss_range", LJFF(jOptLong3), jSONObject);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x07af A[Catch: all -> 0x0830, TryCatch #9 {all -> 0x0830, blocks: (B:283:0x0791, B:295:0x07ab, B:297:0x07af, B:298:0x07b1, B:300:0x07b5, B:301:0x07ba), top: B:384:0x0791 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07b5 A[Catch: all -> 0x0830, TryCatch #9 {all -> 0x0830, blocks: (B:283:0x0791, B:295:0x07ab, B:297:0x07af, B:298:0x07b1, B:300:0x07b5, B:301:0x07ba), top: B:384:0x0791 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07ba A[Catch: all -> 0x0830, TryCatch #9 {all -> 0x0830, blocks: (B:283:0x0791, B:295:0x07ab, B:297:0x07af, B:298:0x07b1, B:300:0x07b5, B:301:0x07ba), top: B:384:0x0791 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0803 A[Catch: all -> 0x082e, TryCatch #7 {all -> 0x082e, blocks: (B:308:0x07de, B:311:0x07f2, B:313:0x0803, B:314:0x0811), top: B:380:0x07de }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(org.json.JSONObject r24, org.json.JSONObject r25, java.io.File r26) {
        /*
            Method dump skipped, instruction units count: 2420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802450Vdr.LIZ(org.json.JSONObject, org.json.JSONObject, java.io.File):void");
    }

    public static boolean LJIIIIZZ(String str, File file, int i) {
        C0VSJ c0vsj = new C0VSJ(file, str);
        if (c0vsj.exists() && c0vsj.length() > i) {
            return true;
        }
        return false;
    }
}
