package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304420BwW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4743));

    public static void LIZ() {
        C01GW c01gw = LIZ;
        if (((Keva) c01gw.getValue()).contains("is_toast_displayed")) {
            return;
        }
        ((Keva) c01gw.getValue()).storeBoolean("is_toast_displayed", true);
    }
}
