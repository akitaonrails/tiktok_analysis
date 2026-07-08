package X;

import Y.ARunnableS18S0301000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212071Bht {
    public static volatile C2212071Bht LIZ;

    public static boolean LIZLLL(C2212201Bi6 c2212201Bi6, long[][] jArr) {
        if (c2212201Bi6 == null) {
            return false;
        }
        long jLJI = c2212201Bi6.LJI();
        long jLJFF = c2212201Bi6.LJFF();
        for (long[] jArr2 : jArr) {
            if (jArr2.length >= 2) {
                long j = jArr2[0];
                if (jLJI <= jArr2[1] && jLJFF >= j) {
                    c2212201Bi6.LLIZ = 10016;
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(long[] jArr, long[][] jArr2) {
        synchronized (C2212181Bi4.class) {
            try {
                LIZIZ(C2212061Bhs.LIZIZ().LIZ, jArr, jArr2);
                LIZIZ(C2212061Bhs.LIZIZ().LIZIZ, jArr, jArr2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2212231Bi9.LJFF.execute(new ARunnableS18S0301000_34(this, jArr, jArr2, 3));
    }

    public static void LIZIZ(List list, long[] jArr, long[][] jArr2) {
        if (!C2212081Bhu.LIZ(list)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2212201Bi6 c2212201Bi6 = (C2212201Bi6) it2.next();
                if (jArr != null) {
                    for (long j : jArr) {
                        if (c2212201Bi6 != null) {
                            if (c2212201Bi6.LLJI == j) {
                                c2212201Bi6.LLIZ = 10016;
                                break;
                            } else if (!C2212081Bhu.LIZ(c2212201Bi6.LLJJJJLIIL)) {
                                for (C2212201Bi6 c2212201Bi62 : (ArrayList) c2212201Bi6.LLJJJJLIIL) {
                                    if (c2212201Bi62 != null && c2212201Bi62.LLJI == j) {
                                        c2212201Bi62.LLIZ = 10016;
                                    }
                                }
                            }
                        }
                    }
                }
                if (jArr2 != null && !LIZLLL(c2212201Bi6, jArr2) && c2212201Bi6 != null && !C2212081Bhu.LIZ(c2212201Bi6.LLJJJJLIIL)) {
                    Iterator it3 = ((ArrayList) c2212201Bi6.LLJJJJLIIL).iterator();
                    while (it3.hasNext()) {
                        LIZLLL((C2212201Bi6) it3.next(), jArr2);
                    }
                }
            }
        }
    }

    public static boolean LJ(JSONObject jSONObject, long[][] jArr, int i) {
        boolean z = false;
        if (jSONObject == null) {
            return false;
        }
        long jOptLong = jSONObject.optLong("model_fetch_time") + (jSONObject.optLong("display_after") * 1000);
        long jOptLong2 = (jSONObject.optLong("expire_seconds") * 1000) + jOptLong;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            long[] jArr2 = jArr[i2];
            if (jArr2.length >= 2) {
                long j = jArr2[0];
                if (jOptLong <= jArr2[1] && jOptLong2 >= j) {
                    try {
                        jSONObject.putOpt("callback_code", Integer.valueOf(i));
                        z = true;
                        return true;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return z;
                    }
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[PHI: r20
      0x0068: PHI (r20v3 boolean) = (r20v2 boolean), (r20v2 boolean), (r20v9 boolean) binds: [B:9:0x0023, B:10:0x0025, B:31:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r20, long[] r21, long[][] r22, boolean r23, int r24) throws java.lang.Throwable {
        /*
            java.lang.String r7 = "id"
            r1 = r20
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lb9
            r6.<init>(r1)     // Catch: java.lang.Exception -> Lb9
            int r5 = r6.length()     // Catch: java.lang.Exception -> Lb9
            r4 = 0
            r20 = 0
        L17:
            if (r4 >= r5) goto L93
            org.json.JSONObject r13 = r6.optJSONObject(r4)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r12 = "interval_creative"
            r8 = r24
            r14 = r21
            if (r14 == 0) goto L68
            if (r13 == 0) goto L68
            int r11 = r14.length     // Catch: java.lang.Exception -> Lb9
            r10 = 0
        L29:
            if (r10 >= r11) goto L63
            r18 = r14[r10]     // Catch: java.lang.Exception -> Lb9
            long r2 = r13.optLong(r7)     // Catch: java.lang.Exception -> Lb9
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            r0 = 1
            java.lang.String r9 = "callback_code"
            if (r1 != 0) goto L39
            goto L5f
        L39:
            org.json.JSONArray r3 = r13.optJSONArray(r12)     // Catch: java.lang.Exception -> Lb9
            if (r3 == 0) goto L5c
            int r2 = r3.length()     // Catch: java.lang.Exception -> Lb9
            r1 = 0
        L44:
            if (r1 >= r2) goto L5c
            org.json.JSONObject r0 = r3.optJSONObject(r1)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L59
            long r16 = r0.optLong(r7)     // Catch: java.lang.Exception -> Lb9
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 != 0) goto L59
            r0.put(r9, r8)     // Catch: java.lang.Exception -> Lb9
            r20 = 1
        L59:
            int r1 = r1 + 1
            goto L44
        L5c:
            int r10 = r10 + 1
            goto L29
        L5f:
            r13.put(r9, r8)     // Catch: java.lang.Exception -> Lb9
            goto L64
        L63:
            r0 = 0
        L64:
            r20 = r20 | r0
            if (r0 != 0) goto L90
        L68:
            r9 = r22
            if (r9 == 0) goto L90
            boolean r0 = LJ(r13, r9, r8)     // Catch: java.lang.Exception -> Lb9
            r20 = r20 | r0
            if (r0 != 0) goto L90
            if (r13 == 0) goto L90
            org.json.JSONArray r3 = r13.optJSONArray(r12)     // Catch: java.lang.Exception -> Lb9
            if (r3 == 0) goto L90
            int r2 = r3.length()     // Catch: java.lang.Exception -> Lb9
            r1 = 0
        L81:
            if (r1 >= r2) goto L90
            org.json.JSONObject r0 = r3.optJSONObject(r1)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = LJ(r0, r9, r8)     // Catch: java.lang.Exception -> Lb9
            r20 = r20 | r0
            int r1 = r1 + 1
            goto L81
        L90:
            int r4 = r4 + 1
            goto L17
        L93:
            if (r20 == 0) goto Lb8
            if (r23 == 0) goto Laa
            X.1Bi0 r3 = X.C2212141Bi0.LJIIIIZZ()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Exception -> Lb9
            X.1Bhy r1 = r3.LIZJ     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = "splash_ad_first_show_data"
            r1.LJI(r0, r2)     // Catch: java.lang.Exception -> Lb9
            r3.LIZJ()     // Catch: java.lang.Exception -> Lb9
            return
        Laa:
            X.1Bi0 r1 = X.C2212141Bi0.LJIIIIZZ()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> Lb9
            r1.LJIIZILJ(r0)     // Catch: java.lang.Exception -> Lb9
            r1.LIZJ()     // Catch: java.lang.Exception -> Lb9
        Lb8:
            return
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212071Bht.LIZJ(java.lang.String, long[], long[][], boolean, int):void");
    }
}
