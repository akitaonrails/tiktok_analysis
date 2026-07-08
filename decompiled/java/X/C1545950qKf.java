package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.Window;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545950qKf {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZJ(Integer... numArr) {
        for (Integer num : numArr) {
            if (num != null && num.intValue() > 0) {
                return num;
            }
        }
        return null;
    }

    public static boolean LIZLLL(Context context, int i, boolean z) {
        InterfaceC1545990qKj interfaceC1545990qKjLIZ;
        String strLJII;
        if (!z || (interfaceC1545990qKjLIZ = C1542190qEb.LIZ()) == null || !interfaceC1545990qKjLIZ.LIZ()) {
            return false;
        }
        InterfaceC1545990qKj interfaceC1545990qKjLIZ2 = C1542190qEb.LIZ();
        if (interfaceC1545990qKjLIZ2 == null || (strLJII = interfaceC1545990qKjLIZ2.LJII(i)) == null) {
            strLJII = "Compact";
        }
        if (!(!Intrinsics.LJFF(strLJII, "Compact"))) {
            return false;
        }
        return true;
    }

    public static C1542090qER LJ(Context context, Configuration configuration, Window window) {
        int i;
        int i2;
        int iLJIIL;
        int iLJIIL2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(context, 215);
        AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23(context, window, 43);
        int i3 = 0;
        if (configuration != null) {
            i = configuration.screenWidthDp;
            i2 = configuration.screenHeightDp;
        } else {
            i = 0;
            i2 = 0;
        }
        int iIntValue5 = ((Number) awS567S0100000_23.invoke()).intValue();
        if (iIntValue5 < 0) {
            iIntValue5 = 0;
        }
        int iIntValue6 = ((Number) awS424S0200000_23.invoke()).intValue();
        if (iIntValue6 < 0) {
            iIntValue6 = 0;
        }
        if (context == null) {
            iLJIIL = 0;
            iLJIIL2 = 0;
        } else {
            C1546210qL5.LIZ.getClass();
            iLJIIL = C1546210qL5.LJIIL(iIntValue5, context);
            C1546210qL5.LIZ.getClass();
            iLJIIL2 = C1546210qL5.LJIIL(iIntValue6, context);
        }
        Integer numLIZJ = LIZJ(Integer.valueOf(iLJIIL), Integer.valueOf(i));
        if (numLIZJ == null || (iIntValue = numLIZJ.intValue()) < 0) {
            iIntValue = 0;
        }
        Integer numLIZJ2 = LIZJ(Integer.valueOf(iLJIIL2), Integer.valueOf(i2));
        if (numLIZJ2 == null || (iIntValue2 = numLIZJ2.intValue()) < 0) {
            iIntValue2 = 0;
        }
        Integer[] numArr = new Integer[2];
        numArr[0] = Integer.valueOf(iIntValue5);
        if (iIntValue > 0 && context != null && (iIntValue5 = C416070GTd.LIZ(iIntValue, context)) < 0) {
            iIntValue5 = 0;
        }
        numArr[1] = Integer.valueOf(iIntValue5);
        Integer numLIZJ3 = LIZJ(numArr);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer[] numArr2 = new Integer[2];
        numArr2[0] = Integer.valueOf(iIntValue6);
        if (iIntValue2 > 0 && context != null && (iIntValue6 = C416070GTd.LIZ(iIntValue2, context)) < 0) {
            iIntValue6 = 0;
        }
        numArr2[1] = Integer.valueOf(iIntValue6);
        Integer numLIZJ4 = LIZJ(numArr2);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        if (configuration != null) {
            i3 = configuration.orientation;
        }
        return new C1542090qER(iIntValue, iIntValue2, iIntValue3, iIntValue4, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(android.content.Context r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545950qKf.LIZ(android.content.Context, int, int, int, int):java.util.Map");
    }

    public static void LIZIZ(Context context, InterfaceC1541990qEH interfaceC1541990qEH, int i, int i2, int i3, int i4, String str) throws JSONException {
        if (interfaceC1541990qEH == null) {
            return;
        }
        Map<String, ? extends Object> mapLIZ = LIZ(context, i, i2, i3, i4);
        interfaceC1541990qEH.U0(mapLIZ);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        interfaceC1541990qEH.LIZ(str, jSONObject);
    }
}
