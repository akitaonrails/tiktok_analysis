package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266720j4I {
    public final WeakReference<C1269160j8E> LIZ;
    public final HashMap<String, int[]> LIZIZ = new HashMap<>();
    public final HashMap<String, Float> LIZJ = new HashMap<>();
    public final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public final HashMap<String, Integer> LJ = new HashMap<>();

    public final synchronized int LIZLLL() {
        int i;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        int iIntValue = Integer.MAX_VALUE;
        boolean z = false;
        for (String str2 : this.LJ.keySet()) {
            if (!str2.equals("lastFpsForEncode")) {
                Integer num = this.LJ.get(str2);
                if (num != null && num.intValue() < iIntValue) {
                    iIntValue = num.intValue();
                    z = true;
                    str = str2;
                }
                try {
                    jSONObject.put(str2, num);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        i = z ? iIntValue : 0;
        try {
            jSONObject.put("selected", str);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Integer num2 = this.LJ.get("lastFpsForEncode");
        if (num2 == null || num2.intValue() != i) {
            AVLog.iow("getFpsForEncode", C786410Ut5.J3(jSONObject));
            this.LJ.put("lastFpsForEncode", Integer.valueOf(i));
        }
        return i;
    }

    public final synchronized int LJ() {
        JSONObject jSONObjectOptJSONObject;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        int iOptInt = Integer.MAX_VALUE;
        boolean z = false;
        for (String str2 : this.LIZLLL.keySet()) {
            Integer num = this.LIZLLL.get(str2);
            if (num != null && num.intValue() < iOptInt) {
                iOptInt = num.intValue();
                str = str2;
                z = true;
            }
            try {
                jSONObject.put(str2, num);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1269160j8E c1269160j8E = this.LIZ.get();
        if (z || c1269160j8E == null || c1269160j8E.LJJ() == null || (jSONObjectOptJSONObject = c1269160j8E.LJJ().optJSONObject("PushBase")) == null || !jSONObjectOptJSONObject.has("fps")) {
            try {
                jSONObject.put("selected", str);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (z || c1269160j8E.LIZ.mPushBase.LJJ() == iOptInt) {
                return -1;
            }
            AVLog.iow("getFpsForUpdate", C786410Ut5.J3(jSONObject));
            return iOptInt;
        }
        iOptInt = jSONObjectOptJSONObject.optInt("fps");
        if (iOptInt > 0) {
            str = "sdkParams";
            z = true;
        }
        try {
            jSONObject.put("sdkParams", iOptInt);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        jSONObject.put("selected", str);
        if (z) {
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00e9 A[EXC_TOP_SPLITTER, PHI: r3 r4 r6 r8 r10
      0x00e9: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v4 int), (r3v4 int) binds: [B:31:0x0081, B:32:0x0083, B:37:0x0097, B:39:0x009f, B:41:0x00a7, B:43:0x00af, B:52:0x00e6, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v4 int), (r4v4 int) binds: [B:31:0x0081, B:32:0x0083, B:37:0x0097, B:39:0x009f, B:41:0x00a7, B:43:0x00af, B:52:0x00e6, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r6v2 boolean) = 
      (r6v1 boolean)
      (r6v1 boolean)
      (r6v1 boolean)
      (r6v1 boolean)
      (r6v1 boolean)
      (r6v1 boolean)
      (r6v7 boolean)
      (r6v7 boolean)
     binds: [B:31:0x0081, B:32:0x0083, B:37:0x0097, B:39:0x009f, B:41:0x00a7, B:43:0x00af, B:52:0x00e6, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r8v2 java.lang.String) = 
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v4 java.lang.String)
      (r8v4 java.lang.String)
     binds: [B:31:0x0081, B:32:0x0083, B:37:0x0097, B:39:0x009f, B:41:0x00a7, B:43:0x00af, B:52:0x00e6, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int), (r10v3 int) binds: [B:31:0x0081, B:32:0x0083, B:37:0x0097, B:39:0x009f, B:41:0x00a7, B:43:0x00af, B:52:0x00e6, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int[] LIZJ() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266720j4I.LIZJ():int[]");
    }

    public C1266720j4I(C1269160j8E c1269160j8E) {
        this.LIZ = new WeakReference<>(c1269160j8E);
    }

    public final synchronized void LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Integer num = this.LIZLLL.get(str);
        if (i <= 0) {
            if (num != null) {
                this.LIZLLL.remove(str);
            }
        } else if (num == null || num.intValue() != i) {
            this.LIZLLL.put(str, Integer.valueOf(i));
        }
    }

    public final synchronized void LIZ(int i, int i2, int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int[] iArr = this.LIZIZ.get(str);
        if (i > 0 && i2 > 0 && i3 > 0) {
            if (iArr == null || iArr.length < 3 || iArr[0] != i || iArr[1] != i2 || iArr[2] != i3) {
                this.LIZIZ.put(str, new int[]{i, i2, i3});
            }
        } else if (iArr != null) {
            this.LIZIZ.remove(str);
        }
    }
}
