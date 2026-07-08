package X;

import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0LqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555520LqY {
    public static final String LIZIZ(int i) {
        if (i != -1 && i != 0) {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(i);
        }
        return "";
    }

    public static final String LIZJ(int i, Object... objArr) {
        try {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C823920WTu c823920WTu = C823920WTu.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get string fail: ");
            sbLIZ.append(i);
            C201955140j.LJIIJ(c823920WTu, C2188811AlT.LIZIZ(sbLIZ), e);
            return "";
        }
    }

    public static final String LIZ(C0C9P c0c9p, int i, String str, Object... objArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        Object[] objArr2 = {objArr};
        Map<String, String> config = c0c9p.getConfig();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("libra config: ");
        sbLIZ.append(c0c9p.getLibraKey());
        sbLIZ.append(" -> ");
        sbLIZ.append(config);
        C201955140j.LIZIZ("DynamicStringUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (config != null && !config.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String strJ4 = "";
        if (!z) {
            try {
                if (str.length() != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    C844470XAv.LIZ.getClass();
                    str = C844470XAv.LIZ().getResources().getResourceEntryName(i);
                }
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                str = "";
            }
            if (str != null && str.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str2 = (String) C08L9.LIZ(config, str, "");
                if (str2 != null && str2.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, 1);
                    strJ4 = C786410Ut5.j4(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }
            }
        }
        if (strJ4.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (objArr.length != 0) {
                z6 = false;
            }
            if (z6) {
                return C1383370m6R.LJIIJ(i);
            }
            return LIZJ(i, Arrays.copyOf(objArr, objArr.length));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("use dynamic string: ");
        sbLIZ2.append(c0c9p.getLibraKey());
        sbLIZ2.append(" -> ");
        sbLIZ2.append(strJ4);
        C201955140j.LIZIZ("DynamicStringUtils", C2188811AlT.LIZIZ(sbLIZ2));
        return strJ4;
    }
}
