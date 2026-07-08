package X;

import android.content.Context;
import com.bytedance.android.live.effect.setting.OptLiveEffectArea;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769200UFi {
    public static String LIZ = "Single";
    public static String LIZIZ = "Preview";
    public static String LIZJ;

    public static final String LIZLLL(int i, int i2, Integer num, Integer num2, boolean z, boolean z2) {
        int iIntValue;
        int iIntValue2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 720;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 1280;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append(' ');
        sbLIZ.append(iIntValue2);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("getMultiAreaJsonStr", C2188811AlT.LIZIZ(sbLIZ));
        float f = iIntValue;
        float f2 = i;
        float f3 = f / f2;
        float f4 = iIntValue2;
        float f5 = i2;
        float f6 = f4 / f5;
        if (f6 <= f3) {
            f3 = f6;
        }
        float f7 = f2 * f3;
        float f8 = f5 * f3;
        if (OptLiveEffectArea.INSTANCE.getValue()) {
            float f9 = (f7 - f) / 2.0f;
            float f10 = (f8 - f4) / 2.0f;
            return LIZJ(z, z2, (int) f7, (int) f8, (int) f10, (int) f9, (int) (f4 + f10), (int) (f + f9));
        }
        float f11 = (f - f7) / 2.0f;
        float f12 = (f4 - f8) / 2.0f;
        return LIZJ(z, z2, (int) f7, (int) f8, (int) f12, (int) f11, (int) (f12 + f8), (int) (f11 + f7));
    }

    public static String LIZ(int i, int i2, int i3, int i4, boolean z, Context context, boolean z2) {
        boolean z3;
        int iLJIJ = i2;
        int iLJI = i;
        if (z) {
            iLJI = C14KS.LJI(context);
        }
        if (z2) {
            C769220UFk.LIZ.getClass();
            return LIZJ(true, z, C769220UFk.LIZIZ, C769220UFk.LIZJ, C769220UFk.LIZLLL, C769220UFk.LJ, C769220UFk.LIZJ + C769220UFk.LIZLLL, C769220UFk.LIZIZ + C769220UFk.LJ);
        }
        if (C497740JfY.LJIILLIIL() * 9 <= C497740JfY.LJIIZILJ() * 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z) {
                iLJIJ = C14KS.LJ(context);
            }
            float f = i4;
            int i5 = (int) ((f * (1 - (((iLJIJ * 1.0f) / f) * ((i3 * 1.0f) / iLJI)))) / 2);
            return LIZJ(true, z, iLJI, iLJIJ, i5, 0, i4 - i5, i3);
        }
        if (z) {
            iLJIJ = C497740JfY.LJIJ() + C14KS.LJ(context);
        }
        float f2 = i3;
        int i6 = (int) ((f2 * (1.0f - (((i4 * 1.0f) / iLJIJ) * ((iLJI * 1.0f) / f2)))) / 2);
        return LIZJ(true, z, iLJI, iLJIJ, 0, i6, i4, i3 - i6);
    }

    public static String LIZJ(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        String str2;
        if (z) {
            str = "Single";
        } else {
            str = "Multi";
        }
        if (z2) {
            str2 = "Preview";
        } else {
            str2 = "Broadcast";
        }
        if (OptLiveEffectArea.INSTANCE.getValue()) {
            String strLJ = LIZJ;
            if (strLJ == null || !Intrinsics.LJFF(str, "Single") || !Intrinsics.LJFF(LIZ, "Single") || !Intrinsics.LJFF(LIZIZ, str2)) {
                strLJ = LJ(i, str, str2, i2, i3, i4, i5, i6);
            }
            LIZ = str;
            LIZIZ = str2;
            LIZJ = strLJ;
            return strLJ;
        }
        return LJ(i, str, str2, i2, i3, i4, i5, i6);
    }

    public static String LJ(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("LiveScene", str2);
            jSONObject.put("top", i3);
            jSONObject.put("down", i5);
            jSONObject.put("left", i4);
            jSONObject.put("right", i6);
            if (i != 0 && i2 != 0) {
                JSONArray jSONArray = new JSONArray();
                float f = i;
                jSONArray.put(Float.valueOf((-i4) / f));
                float f2 = i2;
                jSONArray.put(Float.valueOf((-i3) / f2));
                jSONArray.put(Float.valueOf(((i4 * 2) + i) / f));
                jSONArray.put(Float.valueOf(((i3 * 2) + i2) / f2));
                jSONObject.put("rect", jSONArray);
            }
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
