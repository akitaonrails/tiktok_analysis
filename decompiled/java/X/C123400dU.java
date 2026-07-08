package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00dU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123400dU {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(String str) {
        ArrayList arrayList;
        int length;
        boolean z;
        String strLIZIZ;
        int i;
        boolean z2;
        Integer numValueOf;
        Integer numValueOf2;
        try {
            arrayList = new ArrayList();
            length = str.length();
            z = false;
            strLIZIZ = "";
            i = 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '.') {
                if (strLIZIZ.length() <= 0) {
                    z3 = false;
                }
                if (z3) {
                    try {
                        numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(strLIZIZ));
                    } catch (NumberFormatException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        arrayList.add(numValueOf2);
                    }
                    strLIZIZ = "";
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(cCharAt);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            i++;
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        if (strLIZIZ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strLIZIZ));
            } catch (NumberFormatException e3) {
                TryCatchGuardChecker.doCheck(e3);
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        int size = arrayList.size();
        if (2 <= size && size < 4) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return arrayList;
    }

    public static int LIZ(List list, List list2) {
        int iIntValue;
        int iIntValue2;
        int size = list.size();
        int size2 = list2.size();
        if (size < size2) {
            size = size2;
        }
        for (int i = 0; i < size; i++) {
            if (i < list.size()) {
                iIntValue = ((Number) ListProtector.get(list, i)).intValue();
            } else {
                iIntValue = 0;
            }
            if (i < list2.size()) {
                iIntValue2 = ((Number) ListProtector.get(list2, i)).intValue();
            } else {
                iIntValue2 = 0;
            }
            int iLJI = Intrinsics.LJI(iIntValue, iIntValue2);
            if (iLJI != 0) {
                return iLJI;
            }
        }
        return 0;
    }
}
