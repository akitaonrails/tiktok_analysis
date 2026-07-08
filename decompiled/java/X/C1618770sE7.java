package X;

import Y.ACListenerS117S0200000_14;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS68S0500000_6;

/* JADX INFO: renamed from: X.0sE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618770sE7 {
    public static final int LIZ(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, ActivityStack.getTopActivity());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(boolean r3) {
        /*
            boolean r0 = X.C1906580ziK.LIZ()
            r2 = 0
            if (r0 == 0) goto L3e
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L3e
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L3e
            X.19EG r1 = X.C1388190mED.LIZIZ(r0)
            if (r1 == 0) goto L3e
            boolean r0 = X.C296200BjG.LIZ()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1058560deY.LIZ(r1)
        L23:
            if (r3 == 0) goto L2c
            if (r0 == 0) goto L2b
            java.lang.String r2 = r0.uP1()
        L2b:
            return r2
        L2c:
            if (r0 == 0) goto L2b
            java.lang.String r2 = r0.getEnterFrom()
            return r2
        L33:
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r1)
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1058560deY.LIZIZ(r0)
            goto L23
        L3e:
            r0 = r2
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1618770sE7.LIZIZ(boolean):java.lang.String");
    }

    public static final String LIZJ(int i) {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(i);
    }

    public static final void LJ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("Creators_Inbox", str);
    }

    public static final void LJFF(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxMode, ", str);
    }

    public static final String LJII(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        if (i > 9949) {
            return "9.9k+";
        }
        boolean z = true;
        double dDoubleValue = new BigDecimal(String.valueOf(i)).divide(new BigDecimal("1000"), 1, RoundingMode.HALF_UP).doubleValue();
        if (dDoubleValue % 1.0d != 0.0d) {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((int) dDoubleValue);
            sbLIZ.append('k');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(dDoubleValue);
        sbLIZ2.append('k');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJIIIIZZ(int i) {
        int i2;
        if (i < 1000) {
            return String.valueOf(i);
        }
        if (i > 98499) {
            return "99k";
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(i));
        BigDecimal bigDecimal2 = new BigDecimal("1000");
        boolean z = true;
        if (i < 10000) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        double dDoubleValue = bigDecimal.divide(bigDecimal2, i2, RoundingMode.HALF_UP).doubleValue();
        if (dDoubleValue % 1.0d != 0.0d) {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((int) dDoubleValue);
            sbLIZ.append('k');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(dDoubleValue);
        sbLIZ2.append('k');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJIIIZ(int i) {
        C889930Yvf.LIZ.getClass();
        if (C890080Yvu.LIZIZ.LIZJ(false) && C890270YwD.LIZIZ.LIZJ(false)) {
            return LJIIIIZZ(i);
        }
        if (i <= 0) {
            return "";
        }
        if (i > 99) {
            return "99+";
        }
        return String.valueOf(i);
    }

    public static final String LIZLLL(int i, Object... objArr) {
        try {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get string fail: ");
            sbLIZ.append(i);
            C1647306ch.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public static final void LJI(View view, Function0<Unit> function0) {
        C786410Ut5.I7(new ACListenerS117S0200000_14(view, function0, 25), view);
    }

    public static void LJIIJ(View view, Integer num) {
        AwS68S0500000_6 awS68S0500000_6 = new AwS68S0500000_6(view, (Integer) null, (Integer) null, (Integer) null, num, 3);
        if (C889930Yvf.LIZ.LJIIJJI()) {
            awS68S0500000_6.invoke();
        }
    }
}
