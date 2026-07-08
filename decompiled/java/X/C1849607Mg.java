package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.experiment.TTImageHeaderModel;

/* JADX INFO: renamed from: X.07Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1849607Mg {
    public static final TTImageHeaderModel LIZ = new TTImageHeaderModel(Boolean.FALSE, null, null, null, null, null, null, null, null, null, null);

    public static final TTImageHeaderModel LIZ() {
        try {
            return (TTImageHeaderModel) SettingsManager.LIZLLL().LJIIIIZZ("TT_Image_Header", TTImageHeaderModel.class, LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
