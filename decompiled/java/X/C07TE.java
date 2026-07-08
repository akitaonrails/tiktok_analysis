package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07TE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TE {
    public static final int LIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            i = CastIntegerProtector.parseInt(str);
            return i;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }
}
