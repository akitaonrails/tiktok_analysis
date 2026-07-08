package X;

import com.bytedance.keva.Keva;
import com.ss.android.common.util.NetworkUtils;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15TL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(556));

    public static boolean LIZ() {
        long serverTimeMills = NetworkUtils.getServerTimeMills() / 86400000;
        C01GW c01gw = LIZ;
        if (serverTimeMills == ((Keva) c01gw.getValue()).getLong("last_enter_day_index", Long.MIN_VALUE)) {
            return false;
        }
        ((Keva) c01gw.getValue()).storeLong("last_enter_day_index", serverTimeMills);
        return true;
    }
}
