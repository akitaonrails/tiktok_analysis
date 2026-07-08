package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348360DlC {
    public static final int LIZ(NLEModel nLEModel) {
        try {
            String extra = nLEModel.getExtra("Canvas_Width");
            if (extra != null) {
                return CastIntegerProtector.parseInt(extra);
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
