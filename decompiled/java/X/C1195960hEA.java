package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0hEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195960hEA {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:6:0x000c, B:8:0x0016, B:10:0x001e, B:11:0x0022, B:13:0x002a, B:14:0x002e, B:16:0x0036, B:17:0x003a, B:19:0x0042, B:20:0x004a, B:22:0x0052, B:37:0x006c, B:39:0x0078, B:40:0x007c, B:42:0x0084, B:43:0x0088, B:45:0x0090, B:46:0x0094, B:48:0x009c, B:49:0x00a0, B:51:0x00a8, B:52:0x00ac, B:54:0x00b2, B:55:0x00b6, B:57:0x00c0, B:58:0x00c4, B:60:0x00cc, B:61:0x00d0, B:63:0x00d8, B:64:0x00dc, B:66:0x00e4, B:67:0x00e8), top: B:83:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:6:0x000c, B:8:0x0016, B:10:0x001e, B:11:0x0022, B:13:0x002a, B:14:0x002e, B:16:0x0036, B:17:0x003a, B:19:0x0042, B:20:0x004a, B:22:0x0052, B:37:0x006c, B:39:0x0078, B:40:0x007c, B:42:0x0084, B:43:0x0088, B:45:0x0090, B:46:0x0094, B:48:0x009c, B:49:0x00a0, B:51:0x00a8, B:52:0x00ac, B:54:0x00b2, B:55:0x00b6, B:57:0x00c0, B:58:0x00c4, B:60:0x00cc, B:61:0x00d0, B:63:0x00d8, B:64:0x00dc, B:66:0x00e4, B:67:0x00e8), top: B:83:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:6:0x000c, B:8:0x0016, B:10:0x001e, B:11:0x0022, B:13:0x002a, B:14:0x002e, B:16:0x0036, B:17:0x003a, B:19:0x0042, B:20:0x004a, B:22:0x0052, B:37:0x006c, B:39:0x0078, B:40:0x007c, B:42:0x0084, B:43:0x0088, B:45:0x0090, B:46:0x0094, B:48:0x009c, B:49:0x00a0, B:51:0x00a8, B:52:0x00ac, B:54:0x00b2, B:55:0x00b6, B:57:0x00c0, B:58:0x00c4, B:60:0x00cc, B:61:0x00d0, B:63:0x00d8, B:64:0x00dc, B:66:0x00e4, B:67:0x00e8), top: B:83:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[PHI: r0 r30 r31
      0x0065: PHI (r0v8 com.google.gson.n) = (r0v7 com.google.gson.n), (r0v13 com.google.gson.n) binds: [B:30:0x0062, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r30v1 java.lang.String) = (r30v0 java.lang.String), (r30v6 java.lang.String) binds: [B:30:0x0062, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r31v2 java.lang.String) = (r31v1 java.lang.String), (r31v7 java.lang.String) binds: [B:30:0x0062, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r0 r4 r30 r31
      0x0069: PHI (r0v9 com.google.gson.n) = (r0v8 com.google.gson.n), (r0v12 com.google.gson.n) binds: [B:33:0x0066, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r4v2 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v4 java.lang.Integer) binds: [B:33:0x0066, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r30v2 java.lang.String) = (r30v1 java.lang.String), (r30v5 java.lang.String) binds: [B:33:0x0066, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r31v3 java.lang.String) = (r31v2 java.lang.String), (r31v6 java.lang.String) binds: [B:33:0x0066, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:6:0x000c, B:8:0x0016, B:10:0x001e, B:11:0x0022, B:13:0x002a, B:14:0x002e, B:16:0x0036, B:17:0x003a, B:19:0x0042, B:20:0x004a, B:22:0x0052, B:37:0x006c, B:39:0x0078, B:40:0x007c, B:42:0x0084, B:43:0x0088, B:45:0x0090, B:46:0x0094, B:48:0x009c, B:49:0x00a0, B:51:0x00a8, B:52:0x00ac, B:54:0x00b2, B:55:0x00b6, B:57:0x00c0, B:58:0x00c4, B:60:0x00cc, B:61:0x00d0, B:63:0x00d8, B:64:0x00dc, B:66:0x00e4, B:67:0x00e8), top: B:83:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C443120HZe<com.ss.android.ugc.aweme.poi.PoiData, java.lang.Integer, java.lang.String> LIZ(java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195960hEA.LIZ(java.lang.String):X.0HZe");
    }

    public static final HashMap<String, String> LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (HashMap) C09C2.LIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.0hEB
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final PoiData LIZJ(String str, String str2, String str3, String str4, String str5, HashMap<String, String> map) {
        String strLJIL;
        String strLJIL2;
        double dLJIIIZ;
        String strLJIL3;
        String strLJIL4;
        String strLJIL5;
        String strLJIL6;
        String string;
        Integer numValueOf;
        if (str == null) {
            return null;
        }
        try {
            n nVar = (n) C09C2.LIZ().LJII(str, n.class);
            if (nVar == null) {
                return null;
            }
            k kVarLJJIIZ = nVar.LJJIIZ("poi_id");
            if (kVarLJJIIZ != null) {
                strLJIL = kVarLJJIIZ.LJIL();
            } else {
                strLJIL = null;
            }
            k kVarLJJIIZ2 = nVar.LJJIIZ("name");
            if (kVarLJJIIZ2 != null) {
                strLJIL2 = kVarLJJIIZ2.LJIL();
            } else {
                strLJIL2 = null;
            }
            k kVarLJJIIZ3 = nVar.LJJIIZ("latitude");
            double dLJIIIZ2 = 0.0d;
            if (kVarLJJIIZ3 != null) {
                dLJIIIZ = kVarLJJIIZ3.LJIIIZ();
            } else {
                dLJIIIZ = 0.0d;
            }
            k kVarLJJIIZ4 = nVar.LJJIIZ("longitude");
            if (kVarLJJIIZ4 != null) {
                dLJIIIZ2 = kVarLJJIIZ4.LJIIIZ();
            }
            k kVarLJJIIZ5 = nVar.LJJIIZ("address");
            if (kVarLJJIIZ5 != null) {
                strLJIL3 = kVarLJJIIZ5.LJIL();
            } else {
                strLJIL3 = null;
            }
            k kVarLJJIIZ6 = nVar.LJJIIZ("address");
            if (kVarLJJIIZ6 != null) {
                strLJIL4 = kVarLJJIIZ6.LJIL();
            } else {
                strLJIL4 = null;
            }
            k kVarLJJIIZ7 = nVar.LJJIIZ("distance");
            if (kVarLJJIIZ7 != null) {
                strLJIL5 = kVarLJJIIZ7.LJIL();
            } else {
                strLJIL5 = null;
            }
            k kVarLJJIIZ8 = nVar.LJJIIZ("poi_id");
            if (kVarLJJIIZ8 != null) {
                strLJIL6 = kVarLJJIIZ8.LJIL();
            } else {
                strLJIL6 = null;
            }
            k kVarLJJIIZ9 = nVar.LJJIIZ("details");
            if (kVarLJJIIZ9 != null) {
                string = kVarLJJIIZ9.toString();
            } else {
                string = null;
            }
            PoiMobParam poiMobParam = new PoiMobParam(null, null, str2, str4, str3, null, null, "", false, 0, null, null, null, null);
            if (str5 == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str5));
            }
            return new PoiData(strLJIL, strLJIL2, dLJIIIZ, dLJIIIZ2, null, strLJIL3, null, null, null, null, strLJIL4, null, strLJIL5, strLJIL6, string, null, poiMobParam, null, null, null, null, null, numValueOf, map, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
