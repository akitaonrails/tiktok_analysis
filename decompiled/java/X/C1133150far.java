package X;

import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0far, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133150far {
    public static GiftConfigInfo.RoleConfig LIZ;

    public static int LIZ(String str) {
        if (str != null && str.length() > 0) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return -1;
    }
}
