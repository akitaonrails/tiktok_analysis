package X;

import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14l2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20356614l2 {
    public static final /* synthetic */ int LIZ = 0;

    public static ConditionData LIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return (ConditionData) C19748512Ol.LIZIZ.LJII(str, ConditionData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
