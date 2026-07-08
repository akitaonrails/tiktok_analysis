package X;

import com.bytedance.android.btm.impl.setting.FeatureModel;

/* JADX INFO: renamed from: X.18FN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FN {
    public static final boolean LIZ() {
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "aLog", Integer.valueOf(featureModelLIZJ.aLog));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : featureModelLIZJ.aLog;
        featureModelLIZJ.aLog = iIntValue;
        return iIntValue == 1;
    }
}
