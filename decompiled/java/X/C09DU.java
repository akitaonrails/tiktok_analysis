package X;

import java.lang.reflect.Field;
import njp.a;

/* JADX INFO: renamed from: X.09DU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DU {
    public static final C09DV LIZIZ(a aVar) {
        return (C09DV) aVar.getClass().getAnnotation(C09DV.class);
    }

    public static final int LIZJ(a aVar) {
        int iIntValue;
        Integer num;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return iIntValue - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement LIZLLL(a aVar) {
        int i;
        String strLIZIZ;
        C09DV c09dvLIZIZ = LIZIZ(aVar);
        if (c09dvLIZIZ == null) {
            return null;
        }
        LIZ(1, c09dvLIZIZ.v());
        int iLIZJ = LIZJ(aVar);
        if (iLIZJ < 0) {
            i = -1;
        } else {
            i = c09dvLIZIZ.l()[iLIZJ];
        }
        String strLIZIZ2 = C09DW.LIZ.LIZIZ(aVar);
        if (strLIZIZ2 == null) {
            strLIZIZ = c09dvLIZIZ.c();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ2);
            sbLIZ.append('/');
            sbLIZ.append(c09dvLIZIZ.c());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new StackTraceElement(strLIZIZ, c09dvLIZIZ.m(), c09dvLIZIZ.f(), i);
    }

    public static final void LIZ(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Debug metadata version mismatch. Expected: ");
        sbLIZ.append(i);
        sbLIZ.append(", got ");
        sbLIZ.append(i2);
        sbLIZ.append(". Please update the Kotlin standard library.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
