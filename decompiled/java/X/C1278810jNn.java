package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278810jNn {
    public final C1277590jLp LIZ;
    public final HashMap<String, int[]> LIZIZ = new HashMap<>();
    public final HashMap<String, Float> LIZJ = new HashMap<>();
    public final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public final HashMap<String, Integer> LJ = new HashMap<>();

    public final synchronized int LIZLLL() {
        int i;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        int iIntValue = -1;
        for (String str2 : this.LIZLLL.keySet()) {
            Integer num = this.LIZLLL.get(str2);
            if (num != null && num.intValue() < iIntValue) {
                iIntValue = num.intValue();
                str = str2;
                z = true;
            }
            try {
                jSONObject.put(str2, num);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        PushBase pushBase = this.LIZ.LJI.mPushBase;
        if (!z && (i = pushBase.fps) > 0) {
            str = "sdkParams";
            iIntValue = i;
            z = true;
        }
        try {
            jSONObject.put("sdkParams", iIntValue);
            jSONObject.put("selected", str);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!z || this.LIZ.LJI.mPushBase.fps == iIntValue) {
            return -1;
        }
        AVLog.iow("getFpsForUpdate", C786410Ut5.J3(jSONObject));
        return iIntValue;
    }

    public final synchronized int[] LIZJ() {
        int i;
        PushBase pushBase = this.LIZ.LJI.mPushBase;
        int i2 = pushBase.defaultBitrate;
        int i3 = pushBase.minBitrate;
        int i4 = pushBase.maxBitrate;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        for (String str2 : this.LIZIZ.keySet()) {
            int[] iArr = this.LIZIZ.get(str2);
            if (iArr != null && iArr.length >= 3 && ((i = iArr[2]) < i4 || ((i == i4 && iArr[1] < i3) || (i == i4 && iArr[1] == i3 && iArr[0] < i2)))) {
                i2 = iArr[0];
                i3 = iArr[1];
                if (i2 > 0 && i3 > 0 && i > 0) {
                    str = str2;
                    z = true;
                }
                try {
                    jSONObject.put(str2, new JSONArray().put(i2).put(i3).put(i));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i4 = i;
            }
        }
        if (!z && pushBase.defaultBitrate > 0 && pushBase.maxBitrate > 0 && pushBase.minBitrate > 0) {
            str = "sdkParams";
            z = true;
        }
        try {
            jSONObject.put("selected", str);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!z) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        float f = 1.0f;
        for (String str3 : this.LIZJ.keySet()) {
            Float f2 = this.LIZJ.get(str3);
            if (f2 != null && f2.floatValue() > 1.0E-7f) {
                float fFloatValue = f2.floatValue() * f;
                try {
                    jSONArray.put(new JSONObject().put(str3, f2));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                f = fFloatValue;
            }
        }
        int iRound = Math.round(i2 * f);
        int iRound2 = Math.round(i3 * f);
        int iRound3 = Math.round(i4 * f);
        int iMin = Math.min(Math.max(iRound, iRound2), iRound3);
        if (pushBase.defaultBitrate == iMin && pushBase.minBitrate == iRound2 && pushBase.maxBitrate == iRound3) {
            return null;
        }
        try {
            AVLog.iow("getBitrateRangeForUpdate", C786410Ut5.J3(new JSONObject().put("result", new JSONArray().put(iMin).put(iRound2).put(iRound3)).put("range", jSONObject).put("ratios", jSONArray)));
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        return new int[]{iMin, iRound2, iRound3};
    }

    public C1278810jNn(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp;
        c1278910jNx.getClass();
        c1278910jNx.LJIILL = new WeakReference<>(this);
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
