package X;

import com.bytedance.android.btm.api.config.LoggerBackupAddBtm;
import com.bytedance.android.btm.api.config.ParamKV;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21244518Bv {
    public static final C21244518Bv LIZ = new C21244518Bv();
    public static Map<String, ? extends List<ParamKV>> LIZIZ;

    public static LoggerBackupAddBtm LIZ() {
        int[] iArr = C21244618Bw.LIZ;
        if (C21244618Bw.LIZIZ.getSwitch() != 0) {
            return C21244618Bw.LIZIZ.getLoggerBackupAddBtm();
        }
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.loggerBackupAddBtm, "logger_backup_add_btm");
        return featureModelLIZJ.loggerBackupAddBtm;
    }
}
