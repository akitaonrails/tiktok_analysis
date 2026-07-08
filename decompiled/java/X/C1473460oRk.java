package X;

import android.text.TextUtils;
import android.util.SparseArray;

/* JADX INFO: renamed from: X.0oRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473460oRk {
    public static EnumC2281151EQn LIZ(String str) {
        for (EnumC2281151EQn enumC2281151EQn : EnumC2281151EQn.values()) {
            if (TextUtils.equals(str, enumC2281151EQn.toString(0))) {
                return enumC2281151EQn;
            }
        }
        return EnumC2281151EQn.Standard;
    }

    public static SparseArray<C1474520oTS> LIZIZ(C1473400oRe c1473400oRe) {
        int index;
        SparseArray<C1474520oTS> sparseArray = new SparseArray<>();
        if (c1473400oRe != null && c1473400oRe.LJIIJ() != null) {
            for (C1474520oTS c1474520oTS : c1473400oRe.LJIIJ()) {
                if (c1474520oTS == null) {
                    index = EnumC2281151EQn.Undefine.getIndex();
                } else {
                    String strLIZ = c1474520oTS.LIZ(7);
                    EnumC2281151EQn[] allResolutions = EnumC2281151EQn.getAllResolutions();
                    int length = allResolutions.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            EnumC2281151EQn enumC2281151EQn = allResolutions[i];
                            if (enumC2281151EQn.toString(0).equals(strLIZ)) {
                                index = enumC2281151EQn.getIndex();
                                break;
                            }
                            i++;
                        } else {
                            index = EnumC2281151EQn.Undefine.getIndex();
                            break;
                        }
                    }
                }
                if (index >= 0) {
                    sparseArray.put(index, c1474520oTS);
                }
            }
        }
        return sparseArray;
    }
}
